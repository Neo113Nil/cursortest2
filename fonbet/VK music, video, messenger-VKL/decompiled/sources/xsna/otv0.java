package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkTooltipGravityEdge.kt */
/* loaded from: classes17.dex */
public final class otv0 implements izs<q5j, s3q0> {
    public static final otv0 b = new otv0();

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        return s3q0.a;
    }
}
