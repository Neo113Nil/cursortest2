package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$VerticalAlignment;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public final class ydu0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;
    public final /* synthetic */ Banner$VerticalAlignment c;

    public ydu0(s5j s5jVar, Banner$VerticalAlignment banner$VerticalAlignment) {
        this.b = s5jVar;
        this.c = banner$VerticalAlignment;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        m6j m6jVar = q5jVar2.d;
        s5j s5jVar = q5jVar2.c;
        jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.e, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        m6j m6jVar2 = q5jVar2.f;
        s5j s5jVar2 = this.b;
        jor0.a(m6jVar2, s5jVar2.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        if (this.c == Banner$VerticalAlignment.Center) {
            jcv.b(q5jVar2.g, s5jVar2.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        }
        q5jVar2.d(new bzm("wrap"));
        q5jVar2.c(new bzm("wrap"));
        return s3q0.a;
    }
}
