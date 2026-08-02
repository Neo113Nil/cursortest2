package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.banner.Banner$VerticalAlignment;
import xsna.y5j;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public final class zdu0 implements izs<q5j, s3q0> {
    public final /* synthetic */ c16 b;
    public final /* synthetic */ s5j c;
    public final /* synthetic */ s5j d;
    public final /* synthetic */ s5j e;
    public final /* synthetic */ Banner$VerticalAlignment f;
    public final /* synthetic */ s5j g;

    public zdu0(c16 c16Var, s5j s5jVar, s5j s5jVar2, s5j s5jVar3, Banner$VerticalAlignment banner$VerticalAlignment, s5j s5jVar4) {
        this.b = c16Var;
        this.c = s5jVar;
        this.d = s5jVar2;
        this.e = s5jVar3;
        this.f = banner$VerticalAlignment;
        this.g = s5jVar4;
    }

    @Override // xsna.izs
    public final s3q0 invoke(q5j q5jVar) {
        q5j q5jVar2 = q5jVar;
        y5j.b bVar = this.b != null ? this.c.c : this.d.c;
        jor0.a(q5jVar2.d, this.e.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jcv.b(q5jVar2.e, q5jVar2.c.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        jor0.a(q5jVar2.f, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        if (this.f == Banner$VerticalAlignment.Center) {
            jcv.b(q5jVar2.g, this.g.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
        }
        q5jVar2.d(new bzm("spread"));
        q5jVar2.c(new bzm("wrap"));
        return s3q0.a;
    }
}
