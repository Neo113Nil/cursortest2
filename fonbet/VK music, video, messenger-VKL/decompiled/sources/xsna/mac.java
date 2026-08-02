package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ChipFadeExtensions.kt */
/* loaded from: classes4.dex */
public final class mac {
    public static final float a(float f, int i, int i2) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f2 = i2 - i;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        float f3 = f2 * 1.5f;
        return f3 > f ? f : f3;
    }
}
