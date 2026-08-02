package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import com.airbnb.lottie.animation.LPaint;
import defpackage.ti20;
import defpackage.zw21;

/* loaded from: classes.dex */
public class a {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e;

    public a(a aVar) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = null;
    }

    public final void a(int i, LPaint lPaint) {
        int alpha = Color.alpha(this.d);
        int c = ti20.c(i);
        Matrix matrix = zw21.a;
        int i2 = (int) ((((alpha / 255.0f) * c) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            lPaint.clearShadowLayer();
        } else {
            lPaint.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((ti20.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }

    public a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
    }
}
