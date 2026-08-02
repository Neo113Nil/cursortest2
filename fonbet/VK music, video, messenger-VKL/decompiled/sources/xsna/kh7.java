package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: BlurWithFallback.kt */
/* loaded from: classes17.dex */
public final class kh7 {
    public static final q630 a(q630 q630Var, float f, final long j) {
        boolean a = gz80.a(31);
        q630.a aVar = q630.a.a;
        if (a) {
            q630Var = q630Var.g(jcr.c(aVar, f));
        }
        return !gz80.a(31) ? q630Var.g(bu00.f(aVar, new izs() { // from class: xsna.jh7
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.P(ggjVar, j, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            }
        })) : q630Var;
    }
}
