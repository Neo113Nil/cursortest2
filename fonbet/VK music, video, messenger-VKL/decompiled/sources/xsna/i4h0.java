package xsna;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScaleAndRotateTransformation.java */
/* loaded from: classes12.dex */
public final class i4h0 implements un10 {
    public final float a;
    public final Matrix b;
    public Matrix c;

    public i4h0(float f) {
        this.a = f;
        Matrix matrix = new Matrix();
        this.b = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // xsna.un10
    public final Matrix b() {
        Matrix matrix = this.c;
        fxc0.t(matrix, "configure must be called first");
        return matrix;
    }

    @Override // xsna.j0u
    public final jxj0 e(int i, int i2) {
        fxc0.q(i > 0, "inputWidth must be positive");
        fxc0.q(i2 > 0, "inputHeight must be positive");
        Matrix matrix = this.b;
        this.c = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new jxj0(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.c.preScale(f3, 1.0f);
        this.c.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{-1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}};
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.c.mapPoints(fArr2);
            f5 = Math.min(f5, fArr2[0]);
            f4 = Math.max(f4, fArr2[0]);
            f6 = Math.min(f6, fArr2[1]);
            f7 = Math.max(f7, fArr2[1]);
        }
        float f8 = (f4 - f5) / 2.0f;
        float f9 = (f7 - f6) / 2.0f;
        this.c.postScale(1.0f / f8, 1.0f / f9);
        return new jxj0(Math.round(f * f8), Math.round(f2 * f9));
    }

    @Override // xsna.c0u
    public final boolean g(int i, int i2) {
        jxj0 e = e(i, i2);
        Matrix matrix = this.c;
        matrix.getClass();
        return matrix.isIdentity() && i == e.a && i2 == e.b;
    }
}
