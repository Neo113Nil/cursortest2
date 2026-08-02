package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MinimumScaleFinder.java */
/* loaded from: classes17.dex */
public final class gs20 {
    public final PointF[] a = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final PointF[] b = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final float[] c = new float[8];
    public final Matrix d = new Matrix();

    public final float a(float f, float f2, float f3, float f4, float f5, boolean z) {
        PointF[] pointFArr;
        PointF[] pointFArr2 = this.a;
        PointF pointF = pointFArr2[0];
        float f6 = f4 / 2.0f;
        float f7 = 5000.0f - f6;
        pointF.x = f7;
        float f8 = f5 / 2.0f;
        float f9 = 5000.0f - f8;
        pointF.y = f9;
        PointF pointF2 = pointFArr2[1];
        float f10 = f6 + 5000.0f;
        pointF2.x = f10;
        pointF2.y = f9;
        PointF pointF3 = pointFArr2[2];
        pointF3.x = f10;
        float f11 = f8 + 5000.0f;
        pointF3.y = f11;
        PointF pointF4 = pointFArr2[3];
        pointF4.x = f7;
        pointF4.y = f11;
        if (z) {
            f3 = f2;
            f2 = f3;
        }
        float f12 = 0.001f;
        while (true) {
            pointFArr = this.b;
            if (f12 >= 20.0f) {
                f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                break;
            }
            b(f, f12, f2, f3);
            if (!bn10.g(pointFArr, pointFArr2)) {
                f12 += 0.1f;
            } else if (f12 >= 0.1f) {
                f12 -= 0.1f;
            }
        }
        float f13 = f12;
        while (true) {
            if (f13 >= 20.0f) {
                break;
            }
            b(f, f13, f2, f3);
            if (bn10.g(pointFArr, pointFArr2)) {
                f12 = f13 >= 0.01f ? f13 - 0.01f : f13;
            } else {
                f13 += 0.01f;
            }
        }
        while (f12 < 20.0f) {
            b(f, f12, f2, f3);
            if (bn10.g(pointFArr, pointFArr2)) {
                return f12 + 0.001f;
            }
            f12 += 0.001f;
        }
        return 1.0f;
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = f3 / 2.0f;
        float f6 = 5000.0f - f5;
        float[] fArr = this.c;
        fArr[0] = f6;
        float f7 = f4 / 2.0f;
        float f8 = 5000.0f - f7;
        fArr[1] = f8;
        float f9 = f5 + 5000.0f;
        fArr[2] = f9;
        fArr[3] = f8;
        fArr[4] = f9;
        float f10 = f7 + 5000.0f;
        fArr[5] = f10;
        fArr[6] = f6;
        fArr[7] = f10;
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postRotate(f, 5000.0f, 5000.0f);
        matrix.postScale(f2, f2, 5000.0f, 5000.0f);
        matrix.mapPoints(fArr);
        PointF[] pointFArr = this.b;
        PointF pointF = pointFArr[0];
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        PointF pointF2 = pointFArr[1];
        pointF2.x = fArr[2];
        pointF2.y = fArr[3];
        PointF pointF3 = pointFArr[2];
        pointF3.x = fArr[4];
        pointF3.y = fArr[5];
        PointF pointF4 = pointFArr[3];
        pointF4.x = fArr[6];
        pointF4.y = fArr[7];
    }
}
