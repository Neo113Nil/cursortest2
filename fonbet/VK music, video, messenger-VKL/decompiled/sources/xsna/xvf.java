package xsna;

import android.graphics.Bitmap;

/* compiled from: CloseableStaticBitmap.java */
/* loaded from: classes12.dex */
public interface xvf extends qvf {
    static lcl B2(uvf uvfVar, cpe0 cpe0Var, int i, int i2) {
        int i3 = lcl.j;
        return new lcl(uvfVar, cpe0Var, i, i2);
    }

    static lcl E1(Bitmap bitmap, op0 op0Var, gpw gpwVar) {
        return i2(bitmap, op0Var, gpwVar);
    }

    static lcl i2(Bitmap bitmap, zag0 zag0Var, cpe0 cpe0Var) {
        int i = lcl.j;
        return new lcl(bitmap, zag0Var, cpe0Var);
    }

    uvf<Bitmap> R();

    int getRotationAngle();

    int w0();
}
