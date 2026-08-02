package xsna;

import android.graphics.Matrix;

/* compiled from: MatrixTransformation.java */
/* loaded from: classes12.dex */
public interface un10 extends j0u {
    Matrix b();

    @Override // xsna.j0u
    default float[] c(long j) {
        float[] fArr = new float[9];
        b().getValues(fArr);
        float[] fArr2 = new float[16];
        fArr2[10] = 1.0f;
        int i = 0;
        while (i < 3) {
            int i2 = 0;
            while (i2 < 3) {
                fArr2[((i == 2 ? 3 : i) * 4) + (i2 == 2 ? 3 : i2)] = fArr[(i * 3) + i2];
                i2++;
            }
            i++;
        }
        float[] fArr3 = new float[16];
        android.opengl.Matrix.transposeM(fArr3, 0, fArr2, 0);
        return fArr3;
    }
}
