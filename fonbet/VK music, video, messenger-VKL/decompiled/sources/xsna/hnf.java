package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hnf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ hnf(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                q500 q500Var = (q500) obj;
                long j = q500Var.c;
                long j2 = this.c;
                return Integer.valueOf(j2 > j ? -1 : j2 < q500Var.b ? 1 : 0);
            default:
                final long j3 = this.c;
                return ((kw8) obj).c(new izs() { // from class: xsna.u840
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        oio.V1((oio) obj2, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                        return s3q0.a;
                    }
                });
        }
    }
}
