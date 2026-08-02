package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TabbarSuggestTopPanel.kt */
/* loaded from: classes6.dex */
public final class bxn0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;

    public bxn0(s5j s5jVar) {
        this.b = s5jVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        jcv.b(q5jVar2.e, this.b.f, 12, 4);
        m6j m6jVar = q5jVar2.d;
        s5j s5jVar = q5jVar2.c;
        jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        return s3q0.a;
    }
}
