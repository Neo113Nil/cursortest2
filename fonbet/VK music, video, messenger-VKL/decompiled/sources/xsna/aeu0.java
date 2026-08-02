package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public final class aeu0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;
    public final /* synthetic */ c16 c;

    public aeu0(c16 c16Var, s5j s5jVar) {
        this.b = s5jVar;
        this.c = c16Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        jor0.a(q5jVar2.d, this.b.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        q5jVar2.d(new bzm("wrap"));
        q5jVar2.c(new bzm("spread"));
        q5jVar2.j.setValue(q5jVar2, q5j.k[2], this.c != null ? q4u0.b : q4u0.c);
        return s3q0.a;
    }
}
