package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ComposePodcastSliderVh.kt */
/* loaded from: classes16.dex */
public final class hqi extends lg90 {
    public final long g;

    public hqi(float f) {
        this.g = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    @Override // xsna.lg90
    public final long i() {
        return this.g;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.V1(oioVar, l5g.b, mxj0.c(oioVar.d()) / 2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }
}
