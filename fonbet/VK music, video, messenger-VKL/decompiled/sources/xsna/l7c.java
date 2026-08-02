package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.MarketDiscountBadgeStyle;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.uxe0;

/* compiled from: CheckoutOrderProductScreen.kt */
/* loaded from: classes18.dex */
public final class l7c {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1232463469);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1232463469, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CurrentPriceText (CheckoutOrderProductScreen.kt:181)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.C;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e7c(str, q630Var, i, 0);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-290083446);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-290083446, i, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.EmptyPropertiesPlaceholder (CheckoutOrderProductScreen.kt:326)");
            }
            jqu0.a(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 1.67d, 5), 0L, (float) 0.33d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c7c(q630Var, i, 0);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1834104706);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1834104706, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.NoRatingPlaceholderDescription (CheckoutOrderProductScreen.kt:259)");
            }
            String N = d370.N(R.string.ecomm_checkout_no_reviews, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.c0;
            q630Var2 = q630.a.a;
            aVar2 = M;
            yqv0.c(N, q630Var2, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new k7c(q630Var2, i, 0);
        }
    }

    public static final void d(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(32235329);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(32235329, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.OldPriceText (CheckoutOrderProductScreen.kt:194)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, j, pdo0.d, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.X, M, (i2 & 14) | 3072 | (i2 & 112), 0, 8176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f7c(str, q630Var, i, 0);
        }
    }

    public static final void e(xw80 xw80Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1388979693);
        int i2 = (M.J(xw80Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1388979693, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.OrderProductScreen (CheckoutOrderProductScreen.kt:41)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c = qri.c(M, q630Var2);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            xb10.a(xw80Var.f.b, null, new xz00(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 367, 2, 8, MarketPaginationDotsSize.Large), M, 0);
            i(xw80Var, s200.E(q630Var2, 16, 13), M, (i2 & 14) | 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r21(xw80Var, q630Var2, i, 1);
        }
    }

    public static final void f(xw80 xw80Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1886820229);
        if ((i & 6) == 0) {
            i2 = (M.J(xw80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1886820229, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.PrimaryProductInfo (CheckoutOrderProductScreen.kt:88)");
            }
            q630Var2 = q630.a.a;
            q630 f = txj0.f(q630Var2, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            a.j g = androidx.compose.foundation.layout.a.g(4);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            j(xw80Var.b, s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), M, 48);
            k(xw80Var.d, null, M, 0);
            n(xw80Var, null, M, i3 & 14);
            M.G();
            g(xw80Var.e, 48, M, s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h7c(xw80Var, q630Var2, i, 0);
        }
    }

    public static final void g(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1375102651);
        int i3 = (M.o(i) ? 4 : 2) | i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1375102651, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductAmount (CheckoutOrderProductScreen.kt:131)");
            }
            String O = d370.O(R.string.ecomm_checkout_product_amount, new Object[]{Integer.valueOf(i)}, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(O, q630Var, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.c0, aVar2, 48, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ly5(i, q630Var, i2);
        }
    }

    public static final void h(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-858201053);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-858201053, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductDescription (CheckoutOrderProductScreen.kt:341)");
            }
            aVar2 = M;
            psu0.c(ws2.b(str, M, i2 & 14), q630Var, wlb0.h(M).getText().f, wlb0.l(M).P, wlb0.l(M).c0, wlb0.h(M).getText().m, 3, d370.N(R.string.ecomm_checkout_show_more, 0, M), null, 0L, null, false, aVar2, 1572912, 0, 3840);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xf4(str, q630Var, i, 2);
        }
    }

    public static final void i(xw80 xw80Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(750423167);
        if ((i & 6) == 0) {
            i2 = (M.J(xw80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(750423167, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductInfo (CheckoutOrderProductScreen.kt:62)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            f(xw80Var, null, M, i3);
            boolean isEmpty = xw80Var.g.isEmpty();
            q630.a aVar3 = q630.a.a;
            if (isEmpty) {
                M.K(-120021762);
                b(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 6);
                M.j();
            } else {
                M.K(-120175677);
                m(xw80Var, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, i3 | 48);
                M.j();
            }
            h(xw80Var.c, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g7c(xw80Var, q630Var, i, 0);
        }
    }

    public static final void j(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-620315374);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-620315374, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductName (CheckoutOrderProductScreen.kt:118)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.D;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cu7(str, q630Var, i, 1);
        }
    }

    public static final void k(k6d0 k6d0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(842181678);
        int i2 = (M.J(k6d0Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(842181678, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductPrice (CheckoutOrderProductScreen.kt:147)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c = qri.c(M, q630Var2);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = k6d0Var.c;
            ty6.b bVar = dt1.a.l;
            a(str, new gor0(bVar), M, 0);
            String str2 = k6d0Var.b;
            if (str2 == null) {
                M.K(341090989);
            } else {
                M.K(341090990);
                d(str2, s200.H(new gor0(dt1.a.m), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 7), M, 0);
            }
            M.j();
            int i3 = k6d0Var.a;
            Integer valueOf = i3 != 0 ? Integer.valueOf(i3) : null;
            if (valueOf == null) {
                M.K(341366579);
            } else {
                M.K(341366580);
                sw00.a(valueOf.intValue(), new gor0(bVar), MarketDiscountBadgeStyle.Accent, M, 384, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gd1(k6d0Var, q630Var2, i, 1);
        }
    }

    public static final void l(jrd0 jrd0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(940652279);
        int i2 = (M.J(jrd0Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(940652279, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductProperty (CheckoutOrderProductScreen.kt:294)");
            }
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, aVar3);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(ho8.a(new StringBuilder(), jrd0Var.a, ':'), txj0.v(aVar3, 123), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).c0, aVar2, 100663344, 48, 5880);
            f9t.e(txj0.v(q630Var2, 5), aVar2, 6);
            yqv0.c(jrd0Var.b, txj0.f(q630Var2, 1.0f), wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(aVar2).c0, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fd1(jrd0Var, q630Var2, i, 1);
        }
    }

    public static final void m(xw80 xw80Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1383835078);
        if ((i & 6) == 0) {
            i2 = (M.J(xw80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1383835078, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductPropertyList (CheckoutOrderProductScreen.kt:272)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = (float) 11.5d;
            q630.a aVar3 = q630.a.a;
            jqu0.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            M.K(1810834178);
            Iterator<T> it = xw80Var.g.iterator();
            while (it.hasNext()) {
                l((jrd0) it.next(), null, M, 0);
            }
            M.j();
            jqu0.a(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i7c(xw80Var, q630Var, i, 0);
        }
    }

    public static final void n(xw80 xw80Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-585954256);
        if ((i & 6) == 0) {
            i2 = (M.J(xw80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-585954256, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductRating (CheckoutOrderProductScreen.kt:208)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 2.5d, 1, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25, 1, aVar2));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float floatValue = xw80Var.h.floatValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
            }
            lg90 b = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rxe0.c(floatValue, b, null, false, uxe0.a.b(M), null, M, 64, 44);
            if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                M.K(954115006);
                c(null, M, 0);
                M.j();
            } else {
                M.K(954039087);
                o(floatValue, xw80Var.i, 0, M, null);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j7c(xw80Var, q630Var, i, 0);
        }
    }

    public static final void o(final float f, final int i, final int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1337047565);
        int i3 = (M.n(f) ? 4 : 2) | i2 | (M.o(i) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1337047565, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.RatingDescription (CheckoutOrderProductScreen.kt:235)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            yqv0.c(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), s200.H(aVar3, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().j, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).M, aVar2, 48, 0, 8184);
            yqv0.c(d370.F(R.plurals.ecomm_checkout_reviews_number, i, new Object[]{Integer.valueOf(i)}, aVar2, i3 & 112), null, wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).c0, aVar2, 0, 0, 8186);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f, i, i2, q630Var2) { // from class: xsna.d7c
                public final /* synthetic */ float b;
                public final /* synthetic */ int c;
                public final /* synthetic */ q630 d;

                {
                    this.d = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    l7c.o(this.b, this.c, I, (androidx.compose.runtime.a) obj, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
