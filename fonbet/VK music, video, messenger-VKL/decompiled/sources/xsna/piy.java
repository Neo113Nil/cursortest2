package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class piy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ piy(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                oio oioVar = (oio) obj;
                oio.V1(oioVar, this.c, oioVar.I0(20), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return s3q0.a;
            default:
                io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) obj;
                long j = this.c;
                return j > 0 ? xVar.r(j, TimeUnit.MILLISECONDS) : xVar;
        }
    }
}
