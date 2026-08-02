package yads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class mi {
    public final float a;

    public mi(float f) {
        this.a = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.7777778f : f;
    }
}
