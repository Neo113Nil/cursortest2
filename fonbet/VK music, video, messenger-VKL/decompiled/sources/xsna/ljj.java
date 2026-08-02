package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ljj implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ljj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(970276391, intValue, -1, "com.vk.ecomm.contentproducts.view.ProductsGreed.<anonymous>.<anonymous>.<anonymous> (ContentProductsBottomSheetContent.kt:220)");
                    }
                    if (list.isEmpty()) {
                        aVar.K(364537019);
                    } else {
                        aVar.K(374135177);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                        int hashCode = Long.hashCode(n34.n(aVar));
                        sy90 D = aVar.D();
                        q630.a aVar2 = q630.a.a;
                        q630 c = qri.c(aVar, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar.H();
                        if (aVar.L()) {
                            aVar.I(aVar3);
                        } else {
                            aVar.f();
                        }
                        k9q0.w(aVar, a, cri.a.f);
                        k9q0.w(aVar, D, cri.a.e);
                        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar, cri.a.h);
                        k9q0.w(aVar, c, cri.a.d);
                        float f = 6;
                        jqu0.a(s200.G(txj0.f(aVar2, 1.0f), f, 4, f, f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 14);
                        com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.content_product_other_products_in_shop_title, 0, aVar), null, null, null, null, null, null, null, false, aVar, 805306368, 510), kci.l(txj0.f(aVar2, 1.0f), -10, 0), null, null, null, null, false, aVar, 1572912, 60);
                        aVar = aVar;
                        aVar.G();
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2075407235, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:86)");
                    }
                    axqVar.j("Без текста с анимацией", aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                cbv cbvVar = (cbv) this.c;
                ((Integer) obj2).intValue();
                Integer num = (Integer) obj3;
                num.intValue();
                cbvVar.q.onNext(num);
                return s3q0.a;
            default:
                g9d0 g9d0Var = (g9d0) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1645546801, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileShimmerContentImpl.Content.<anonymous> (PrimaryBlockServicesTileShimmerContentImpl.kt:34)");
                    }
                    u890 n = s200.n(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    boolean J = aVar5.J(g9d0Var);
                    Object x = aVar5.x();
                    if (J || x == a.C0011a.a) {
                        x = new qi00(g9d0Var, 29);
                        aVar5.R(x);
                    }
                    lqy.b(null, null, n, null, null, null, false, null, (izs) x, aVar5, 12583296, 379);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}
