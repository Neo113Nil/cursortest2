package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: SelectGroupVerificationTypeItem.kt */
/* loaded from: classes18.dex */
public final class j8i0 implements izs<q5j, s3q0> {
    public static final j8i0 b = new j8i0();

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        x5j x5jVar = q5jVar2.e;
        s5j s5jVar = q5jVar2.c;
        jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.d, s5jVar.c, 4, 4);
        return s3q0.a;
    }
}
