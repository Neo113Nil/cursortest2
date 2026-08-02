package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkTooltipGravityEdge.kt */
/* loaded from: classes17.dex */
public final class qtv0 implements izs<q5j, s3q0> {
    public static final qtv0 b = new qtv0();

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        m6j m6jVar = q5jVar2.d;
        s5j s5jVar = q5jVar2.c;
        jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.e, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        return s3q0.a;
    }
}
