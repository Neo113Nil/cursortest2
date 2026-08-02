package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StickerSdkUtils.kt */
/* loaded from: classes6.dex */
public final class z5l0 {
    public static final bpn0 a = new bpn0(new e3c0(6));

    public static int a(float f, float f2) {
        if (Math.abs(f - f2) < 5.0E-4d) {
            return 0;
        }
        return f < f2 ? -1 : 1;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow(f2 - f4, 2.0d) + Math.pow(f - f3, 2.0d));
    }

    public static Matrix c(int i, int i2, int i3, int i4, Matrix matrix) {
        float f = i / i3;
        float f2 = i2 / i4;
        float max = Math.max(f2, f);
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix2.setScale(max, max);
        matrix2.postConcat(matrix);
        float[] fArr = new float[9];
        matrix2.getValues(fArr);
        fArr[2] = fArr[2] * f;
        fArr[5] = fArr[5] * f2;
        double d = fArr[1];
        if (-0.001d <= d && d <= 0.001d) {
            fArr[1] = 0.0f;
        }
        double d2 = fArr[3];
        if (-0.001d <= d2 && d2 <= 0.001d) {
            fArr[3] = 0.0f;
        }
        matrix2.setValues(fArr);
        return matrix2;
    }

    public static float d(int i, int i2, int i3, int i4) {
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        float f4 = i;
        float f5 = i2;
        float f6 = f4 / f5;
        float f7 = f3 < f6 ? f / f4 : f2 / f5;
        if (f(f6, f3)) {
            f7 *= Math.max(f6, f3) / Math.min(f6, f3);
        }
        if (f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return f7;
    }

    public static boolean e(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
        float f = pointF5.y;
        float f2 = pointF4.y;
        float f3 = f - f2;
        float f4 = pointF3.x;
        float f5 = pointF2.x;
        float f6 = f4 - f5;
        float f7 = pointF5.x;
        float f8 = pointF4.x;
        float f9 = f7 - f8;
        float f10 = pointF2.y;
        float f11 = f10 - f2;
        float f12 = f5 - f8;
        float f13 = pointF3.y - f10;
        float f14 = (f6 * f3) - (f9 * f13);
        boolean z = false;
        if (f14 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        float f15 = ((f9 * f11) - (f3 * f12)) / f14;
        float f16 = ((f11 * f6) - (f12 * f13)) / f14;
        if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f15 < 1.0f && f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f16 < 1.0f) {
            z = true;
        }
        if (pointF != null) {
            if (z) {
                pointF.x = (f6 * f15) + f5;
                pointF.y = (f15 * f13) + f10;
                return z;
            }
            pointF.x = -1.0f;
            pointF.y = -1.0f;
        }
        return z;
    }

    public static boolean f(float f, float f2) {
        return Math.abs(f - f2) <= 0.15f || Math.abs(f - 0.75f) < 0.05f;
    }
}
