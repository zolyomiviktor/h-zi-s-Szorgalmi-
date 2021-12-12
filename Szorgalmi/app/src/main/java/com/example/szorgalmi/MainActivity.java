package com.example.szorgalmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView macska = findViewById(R.id.imgView);
        Button animate = findViewById(R.id.animate);
        animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim);
                macska.startAnimation(animation);
            }
        });
     Button stop= findViewById(R.id.stop);
     stop.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             macska.clearAnimation();
         }
     });
    }
}