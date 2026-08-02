package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkFullscreenOnboarding.kt */
/* loaded from: classes17.dex */
public final class pwu0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;

    public pwu0(s5j s5jVar) {
        this.b = s5jVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.d, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.g, this.b.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        q5jVar2.c(new bzm("spread"));
        return s3q0.a;
    }
}
