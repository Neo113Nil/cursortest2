package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$VerticalAlignment;

/* compiled from: VkNotificationBanner.kt */
/* loaded from: classes17.dex */
public final class q6v0 implements izs<q5j, s3q0> {
    public final /* synthetic */ s5j b;
    public final /* synthetic */ s5j c;
    public final /* synthetic */ Banner$VerticalAlignment d;
    public final /* synthetic */ s5j e;

    public q6v0(s5j s5jVar, s5j s5jVar2, Banner$VerticalAlignment banner$VerticalAlignment, s5j s5jVar3) {
        this.b = s5jVar;
        this.c = s5jVar2;
        this.d = banner$VerticalAlignment;
        this.e = s5jVar3;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        jor0.a(q5jVar2.d, this.b.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.e, q5jVar2.c.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, this.c.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        if (this.d == Banner$VerticalAlignment.Center) {
            jcv.b(q5jVar2.g, this.e.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        }
        q5jVar2.d(new bzm("spread"));
        q5jVar2.c(new bzm("wrap"));
        return s3q0.a;
    }
}
