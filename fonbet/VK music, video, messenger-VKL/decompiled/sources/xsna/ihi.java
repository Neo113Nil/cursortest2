package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ihi implements a0t {
    public final /* synthetic */ int b;

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        qa8 qa8Var = (qa8) obj;
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 384) == 0) {
                    intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(832284725, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.image.ComposableSingletons$MarketProductImagesKt.lambda$832284725.<anonymous> (MarketProductImages.kt:103)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vjw.a(lg90Var, null, hr80.m(d, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56 | ((intValue >> 6) & 14), 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                lg90 lg90Var2 = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(qa8Var) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 384) == 0) {
                    i |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(i & 1, (i & 1155) != 1154)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-956795346, i, -1, "com.vk.community.design.compose.primaryblock.items.ComposableSingletons$PrimaryBlockAlbumItemKt.lambda$-956795346.<anonymous> (PrimaryBlockAlbumItem.kt:166)");
                    }
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.f;
                    vjw.a(lg90Var2, null, qa8Var.b(q630.a.a, ty6Var), ty6Var, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 27704 | ((i >> 6) & 14), 96);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
