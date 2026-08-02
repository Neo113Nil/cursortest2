package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: SelectGroupVerificationTypeItem.kt */
/* loaded from: classes18.dex */
public final class k8i0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;
    public final /* synthetic */ s5j c;

    public k8i0(s5j s5jVar, s5j s5jVar2) {
        this.b = s5jVar;
        this.c = s5jVar2;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        jcv.b(q5jVar2.e, q5jVar2.c.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        float f = 16;
        q5j.b(q5jVar2, this.b.e, this.c.c, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48);
        q5jVar2.c(new bzm("preferWrap"));
        q5jVar2.d(new bzm("spread"));
        return s3q0.a;
    }
}
