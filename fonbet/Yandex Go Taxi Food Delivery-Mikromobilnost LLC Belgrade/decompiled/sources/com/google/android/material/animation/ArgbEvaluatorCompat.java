package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import defpackage.g8e;

/* loaded from: classes.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float b = g8e.b(f3, f2, f, f2);
        float b2 = g8e.b(pow4, pow, f, pow);
        float b3 = g8e.b(pow5, pow2, f, pow2);
        float b4 = g8e.b(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(b2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(b3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(b4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
