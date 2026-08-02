package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TabbarSuggestTopPanel.kt */
/* loaded from: classes6.dex */
public final class axn0 implements izs<q5j, s3q0> {
    public static final axn0 b = new axn0();

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.d, 16, 4);
        jor0.a(q5jVar2.d, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        q5jVar2.d(new bzm("wrap"));
        return s3q0.a;
    }
}
