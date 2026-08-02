package yads;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public abstract class o23 {
    public static final float a(k23 k23Var, RectF rectF, RectF rectF2) {
        float height = rectF.height();
        float width = rectF.width();
        float height2 = rectF2.height();
        float width2 = rectF2.width();
        if (height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return Float.MAX_VALUE;
        }
        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
        float f = k23Var.c * min;
        if (width < ((int) f) || height < ((int) (k23Var.d * min))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - (k23Var.d * min)) + Math.abs(width - f);
    }
}
