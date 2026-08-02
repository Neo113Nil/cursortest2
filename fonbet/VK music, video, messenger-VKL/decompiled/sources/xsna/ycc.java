package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: TagsListView.kt */
/* loaded from: classes18.dex */
public final class ycc extends lg90 {
    public final long g;
    public final float h;
    public final long i = 9205357640488583168L;

    public ycc(long j, float f) {
        this.g = j;
        this.h = f;
    }

    @Override // xsna.lg90
    public final long i() {
        return this.i;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.V1(oioVar, this.g, (mxj0.c(oioVar.d()) / 2.0f) - oioVar.I0(this.h), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }
}
