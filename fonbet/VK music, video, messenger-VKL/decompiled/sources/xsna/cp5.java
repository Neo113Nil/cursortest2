package xsna;

import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AuxEffectInfo.java */
/* loaded from: classes12.dex */
public final class cp5 {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cp5.class != obj.getClass()) {
            return false;
        }
        return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + 16337;
    }
}
