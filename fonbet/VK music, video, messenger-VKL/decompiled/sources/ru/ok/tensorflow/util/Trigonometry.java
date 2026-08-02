package ru.ok.tensorflow.util;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class Trigonometry {
    public static float getRotationDegrees(PointF pointF, PointF pointF2) {
        return getRotationDegrees(pointF2.x - pointF.x, -(pointF2.y - pointF.y));
    }

    public static boolean is0to360(float f) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 360.0f;
    }

    public static float l2(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static float make0to360(float f) {
        float f2 = f % 360.0f;
        return f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 + 360.0f : f2;
    }

    public static float meanAngleDegrees(float f, float f2) {
        double radians = Math.toRadians(f);
        double radians2 = Math.toRadians(f2);
        return (float) Math.toDegrees(Math.atan2((Math.sin(radians2) + Math.sin(radians)) / 2.0d, (Math.cos(radians2) + Math.cos(radians)) / 2.0d));
    }

    public static float getRotationDegrees(float f, float f2) {
        double d;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            d = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 4.71238898038469d : 1.5707963267948966d;
        } else {
            double atan = Math.atan(f2 / f);
            d = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 3.141592653589793d + atan : atan;
        }
        return make0to360((float) Math.toDegrees(d));
    }
}
