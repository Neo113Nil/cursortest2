package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: BackgroundPainter.kt */
/* loaded from: classes18.dex */
public final class ex5 extends lg90 {
    public final lg90 g;
    public final long h;

    public ex5(lg90 lg90Var, long j) {
        this.g = lg90Var;
        this.h = j;
    }

    @Override // xsna.lg90
    public final long i() {
        return this.g.i();
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        oio.P(oioVar, this.h, 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        lg90.h(this.g, oioVar, oioVar.d(), null, 6);
    }
}
