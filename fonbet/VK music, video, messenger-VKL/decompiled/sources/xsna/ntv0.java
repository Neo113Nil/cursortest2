package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkTooltipGravityEdge.kt */
/* loaded from: classes17.dex */
public final class ntv0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;
    public final /* synthetic */ htv0 c;

    public ntv0(s5j s5jVar, htv0 htv0Var) {
        this.b = s5jVar;
        this.c = htv0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        s5j s5jVar = this.b;
        q5j.a(q5jVar2, s5jVar.d, s5jVar.f, this.c.a);
        jor0.a(q5jVar2.d, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        return s3q0.a;
    }
}
