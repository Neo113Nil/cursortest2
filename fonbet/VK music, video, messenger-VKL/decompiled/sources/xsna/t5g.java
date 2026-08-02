package xsna;

import android.graphics.Color;

/* compiled from: ColorCircle.java */
/* loaded from: classes12.dex */
public final class t5g {
    public float a;
    public float b;
    public float c;
    public float[] d;
    public float[] e;
    public int f;

    public final float[] a(float f) {
        float[] fArr = this.d;
        if (this.e == null) {
            this.e = (float[]) fArr.clone();
        }
        float[] fArr2 = this.e;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = f;
        return fArr2;
    }

    public final void b(float f, float f2, float f3, float[] fArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        float[] fArr2 = this.d;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.f = Color.HSVToColor(fArr2);
    }
}
