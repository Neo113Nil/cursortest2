package yads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class ql {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ql.class == obj.getClass()) {
            if (Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + 16337;
    }
}
