package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Stickers.kt */
/* loaded from: classes15.dex */
public interface blj extends nov {
    @Override // xsna.nov
    default float getMaxScaleLimit() {
        return 4.0f;
    }

    @Override // xsna.nov
    default float getMinScaleLimit() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
