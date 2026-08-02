package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkNotificationBanner.kt */
/* loaded from: classes17.dex */
public final class r6v0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;

    public r6v0(s5j s5jVar) {
        this.b = s5jVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        m6j m6jVar = q5jVar2.d;
        s5j s5jVar = this.b;
        jor0.a(m6jVar, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar2 = q5jVar2.c;
        jcv.b(x5jVar, s5jVar2.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        q5jVar2.d(new bzm("wrap"));
        q5jVar2.c(new bzm("spread"));
        return s3q0.a;
    }
}
