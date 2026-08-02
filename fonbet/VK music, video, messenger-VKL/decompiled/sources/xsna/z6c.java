package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.common.ui.compose.TextHeight;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CheckoutOrderListShimmerScreen.kt */
/* loaded from: classes18.dex */
public final class z6c {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1237723304);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1237723304, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.OrderListShimmer (CheckoutOrderListShimmerScreen.kt:21)");
            }
            float f = 10;
            q630Var2 = q630Var;
            q630 c = sdj0.c(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, c2, cri.a.d);
            b(6, 0, M, s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            b(0, 1, M, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t3(q630Var2, i, 2);
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(633066161);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            q630.a aVar2 = q630.a.a;
            if (i4 != 0) {
                q630Var = aVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(633066161, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.OrderProductSkeleton (CheckoutOrderListShimmerScreen.kt:37)");
            }
            float f = 6;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            float f2 = 4;
            c(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), M, 6);
            TextHeight textHeight = TextHeight.SMALL;
            sdj0.b(textHeight, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, 1, aVar2), new pco(101), M, 438, 0);
            sdj0.b(textHeight, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), new pco(128), M, 438, 0);
            if (xga0.c(aVar2, f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.x6c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z6c.b(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, q630.this);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2095056412);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2095056412, i, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ProductImageSkeleton (CheckoutOrderListShimmerScreen.kt:62)");
            }
            q630 s = txj0.s(q630Var, 128, 154);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ja8.a(hr80.m(s, ylu0Var.c().a, vog0.b(10)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new y6c(q630Var, i, 0);
        }
    }
}
