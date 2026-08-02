package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkFullscreenOnboarding.kt */
/* loaded from: classes17.dex */
public final class qwu0 implements izs<q5j, s3q0> {
    public static final qwu0 b = new qwu0();

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        x5j x5jVar = q5jVar2.g;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.d, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        return s3q0.a;
    }
}
