package xsna;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MinimumScaleFinder.kt */
/* loaded from: classes4.dex */
public final class fs20 {
    public static final int e = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final PointF[] a = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final PointF[] b = {new PointF(), new PointF(), new PointF(), new PointF()};
    public final float[] c = new float[8];
    public final Matrix d = new Matrix();

    public final float a(float f, float f2, float f3, float f4, float f5, boolean z) {
        PointF[] pointFArr;
        int i;
        PointF[] pointFArr2 = this.a;
        int i2 = 0;
        PointF pointF = pointFArr2[0];
        float f6 = 2;
        float f7 = f4 / f6;
        float f8 = 5000.0f - f7;
        pointF.x = f8;
        float f9 = f5 / f6;
        float f10 = 5000.0f - f9;
        pointF.y = f10;
        PointF pointF2 = pointFArr2[1];
        float f11 = f7 + 5000.0f;
        pointF2.x = f11;
        pointF2.y = f10;
        PointF pointF3 = pointFArr2[2];
        pointF3.x = f11;
        float f12 = f9 + 5000.0f;
        pointF3.y = f12;
        PointF pointF4 = pointFArr2[3];
        pointF4.x = f8;
        pointF4.y = f12;
        if (z) {
            f3 = f2;
            f2 = f3;
        }
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (true) {
            pointFArr = this.b;
            i = e;
            if (i2 >= 2) {
                break;
            }
            i2++;
            float pow = 1.0f / ((float) Math.pow(10.0f, i2));
            float f14 = f13;
            while (true) {
                if (f14 < i) {
                    b(f, f14, f2, f3);
                    if (ine0.k(pointFArr, pointFArr2)) {
                        if (f14 >= pow) {
                            f14 -= pow;
                        }
                        f13 = f14;
                    } else {
                        f14 += pow;
                    }
                }
            }
        }
        while (f13 < i) {
            b(f, f13, f2, f3);
            if (ine0.k(pointFArr, pointFArr2)) {
                return f13 + 0.001f;
            }
            f13 += 0.001f;
        }
        return f13;
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = 2;
        float f6 = f3 / f5;
        float f7 = 5000.0f - f6;
        float[] fArr = this.c;
        fArr[0] = f7;
        float f8 = f4 / f5;
        float f9 = 5000.0f - f8;
        fArr[1] = f9;
        float f10 = f6 + 5000.0f;
        fArr[2] = f10;
        fArr[3] = f9;
        fArr[4] = f10;
        float f11 = f8 + 5000.0f;
        fArr[5] = f11;
        fArr[6] = f7;
        fArr[7] = f11;
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
