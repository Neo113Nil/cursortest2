package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CartPagination.kt */
/* loaded from: classes18.dex */
public final class ox9 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        String str2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-257409747);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-257409747, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPaginationError (CartPagination.kt:131)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(null, null, str2, null, M, ((i2 << 6) & 896) | 196608, 27);
            r48 a2 = wra0.a.C3954a.a(d370.N(R.string.ecomm_cart_retry, 0, M), gzsVar, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, (i2 & 112) | 28032, 12582912, 131040);
            M = M;
            ldv0.d(null, null, a, wra0.b.a(a2, null, null, M, 14), null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nx9(str, gzsVar, q630Var, i, 0);
        }
    }

    public static final void b(CartItem.c cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1889839038);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1889839038, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPaginationItem (CartPagination.kt:34)");
            }
            if (cVar instanceof CartItem.c.a.b) {
                M.K(1763686370);
                d(q630Var, M, (i2 >> 6) & 14);
                M.j();
            } else {
                boolean z = cVar instanceof CartItem.c.a.C0920a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(1763810060);
                    String N = d370.N(R.string.ecomm_cart_error_loading_data, 0, M);
                    boolean z2 = (i2 & 112) == 32;
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new ws0(izsVar, 1);
                        M.R(x);
                    }
                    a(i2 & 896, M, N, (gzs) x, q630Var);
                    M.j();
                } else if (cVar instanceof CartItem.c.b.C0921b) {
                    M.K(1764140954);
                    c((CartItem.c.b.C0921b) cVar, izsVar, q630Var, M, i2 & 1008);
                    M.j();
                } else if (cVar instanceof CartItem.c.b.C0922c) {
                    M.K(1764270317);
                    d(q630Var, M, (i2 >> 6) & 14);
                    M.j();
                } else {
                    if (!(cVar instanceof CartItem.c.b.a)) {
                        throw alb0.c(-635844654, M);
                    }
                    M.K(1764387187);
                    String N2 = d370.N(R.string.ecomm_cart_error_loading_products, 0, M);
                    boolean z3 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                    Object x2 = M.x();
                    if (z3 || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.base.ui.m(3, izsVar, cVar);
                        M.R(x2);
                    }
                    a(i2 & 896, M, N2, (gzs) x2, q630Var);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xv9(i, 1, cVar, izsVar, q630Var);
        }
    }

    public static final void c(CartItem.c.b.C0921b c0921b, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1764094907);
        if ((i & 6) == 0) {
            i2 = (M.J(c0921b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1764094907, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPaginationLoadButton (CartPagination.kt:75)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
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
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ww(4, izsVar, c0921b);
                M.R(x);
            }
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            int i3 = c0921b.f;
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, null, null, null, d370.F(R.plurals.ecomm_cart_page_products_amount, i3, new Object[]{Integer.valueOf(i3)}, M, 0), null, null, null, null, false, null, null, null, aVar2, 28080, 0, 0, 4190176);
            jqu0.a(s200.H(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 7.5d, 7), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 6, 14);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mx9(i, 0, c0921b, izsVar, q630Var);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1795162426);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1795162426, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPaginationLoading (CartPagination.kt:107)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 1, txj0.f(q630.a.a, 1.0f));
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F2);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, M, 6, 62);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j48(q630Var, i, 1);
        }
    }
}
