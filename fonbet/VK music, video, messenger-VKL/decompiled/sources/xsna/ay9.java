package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: CartProduct.kt */
/* loaded from: classes18.dex */
public final class ay9 {
    public static final void a(izs izsVar, a.C0919a c0919a, CartItem.d.a.InterfaceC0923a.C0924a c0924a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 lg90Var;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(-3015179);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(c0919a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(c0924a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-3015179, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartAmountPicker (CartProduct.kt:512)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new qe3(6);
                M.R(x2);
            }
            q630 a = r18.a(1, wlb0.h(M).p().a, ojc.b(q630Var, sg50Var, null, false, null, (gzs) x2, 28), vog0.b(kqu0.e));
            float f = kqu0.s;
            q630 E = s200.E(a, kqu0.v, f);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i4 == 32) | (i3 == 4);
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new hn9(1, izsVar, c0919a);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            qzu0.a.getClass();
            lg90 O0 = qzu0.O0(M);
            String N = d370.N(R.string.ecomm_cart_amount_decrement, 0, M);
            q630.a aVar4 = q630.a.a;
            q630 E2 = ahn.E(aVar4, "cart_product_amount_decrement");
            float f2 = 16;
            if (c0924a.c) {
                lg90Var = O0;
                j = vcl0.a(M, 1552663411, M).a;
                M.j();
            } else {
                lg90Var = O0;
                j = vcl0.a(M, 1552730929, M).n;
                M.j();
            }
            nzu0.c(gzsVar, lg90Var, N, E2, f2, j, false, null, c0924a.c, null, null, M, 27712, 1728);
            yqv0.c(String.valueOf(c0924a.a), xp2.a(txj0.x(27, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(aVar4, "cart_product_amount")), null, 3), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 1, null, wlb0.l(M).h0, M, 0, 48, 6072);
            boolean z2 = (i3 == 4) | (i4 == 32);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new mk(1, izsVar, c0919a);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            lg90 a3 = qzu0.a(M);
            String N2 = d370.N(R.string.ecomm_cart_amount_increment, 0, M);
            q630 E3 = ahn.E(aVar4, "cart_product_amount_increment");
            if (c0924a.b) {
                j2 = vcl0.a(M, 1553715923, M).a;
                M.j();
            } else {
                j2 = vcl0.a(M, 1553783441, M).n;
                M.j();
            }
            aVar2 = M;
            nzu0.c(gzsVar2, a3, N2, E3, f2, j2, false, null, c0924a.b, null, null, aVar2, 27712, 1728);
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
            s.d = new wx9(izsVar, c0919a, c0924a, q630Var, i);
        }
    }

    public static final void b(final izs izsVar, final a.C0919a c0919a, final CartItem.d.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1645544011);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(c0919a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1645544011, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartControl (CartProduct.kt:279)");
            }
            if (((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 360) {
                M.K(-354815916);
                d(izsVar, c0919a, aVar, M, i3 & 8190);
                M.j();
            } else {
                M.K(-354648330);
                e(izsVar, c0919a, aVar, M, i3 & 8190);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yx9
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ay9.b(izs.this, c0919a, aVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final q630 q630Var, final lg90 lg90Var, final boolean z) {
        long j;
        androidx.compose.runtime.a M = aVar.M(2098213444);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        int i3 = i2 | (M.J(str) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2098213444, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartControlButton (CartProduct.kt:413)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, 1, ojc.c(rte0.d(q630Var, vog0.b(4)), false, null, null, gzsVar, 15));
            boolean z2 = (i3 & 7168) == 2048;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new ux9(str, 0);
                M.R(x);
            }
            q630 a = egi0.a(F, (izs) x);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.s), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z) {
                M.K(-1343557788);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
                M.j();
            } else {
                M.K(-1343490239);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().l;
                M.j();
            }
            pzu0.b(lg90Var, null, null, j, M, ((i3 >> 3) & 14) | 56, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var3.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, null, j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, M, (i3 >> 9) & 14, 0, 8186);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vx9
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ay9.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var, lg90Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(izs izsVar, a.C0919a c0919a, CartItem.d.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        lg90 k;
        androidx.compose.runtime.a M = aVar2.M(-20466936);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(c0919a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-20466936, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartControlDefault (CartProduct.kt:304)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            int i4 = i2 & 14;
            int i5 = i2 & 112;
            boolean z = (i4 == 4) | (i5 == 32);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new ie3(3, izsVar, c0919a);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (aVar.a) {
                M.K(1339876964);
                qzu0.a.getClass();
                k = qzu0.j(M);
                M.j();
            } else {
                M.K(1339932733);
                qzu0.a.getClass();
                k = qzu0.k(M);
                M.j();
            }
            boolean z2 = aVar.a;
            int i6 = i2;
            c(64, M, z2 ? zq.a(M, 1340079580, R.string.ecomm_cart_favorite_button_remove, M, 0) : zq.a(M, 1340174719, R.string.ecomm_cart_favorite_button_add, M, 0), gzsVar, xp2.a(txj0.x(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(aVar3, "cart_product_favorite")), null, 3), k, z2);
            boolean z3 = (i5 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == obj) {
                x2 = new qg1(2, izsVar, c0919a);
                M.R(x2);
            }
            qzu0.a.getClass();
            c(448, M, d370.N(R.string.ecomm_cart_delete_button, 0, M), (gzs) x2, s200.H(ahn.E(aVar3, "cart_product_remove"), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), qzu0.B(M), false);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            f(izsVar, c0919a, aVar.b, null, M, i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 8);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zq2(izsVar, c0919a, aVar, i);
        }
    }

    public static final void e(izs izsVar, a.C0919a c0919a, CartItem.d.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        lg90 k;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar2.M(181700930);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(c0919a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        int i5 = i & 3072;
        q630.a aVar3 = q630.a.a;
        if (i5 == 0) {
            i2 |= M.J(aVar3) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(181700930, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartControlSmall (CartProduct.kt:361)");
            }
            float f = 12;
            q630 H = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            boolean z = (i7 == 32) | (i6 == 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new sk(5, izsVar, c0919a);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (aVar.a) {
                M.K(-584860374);
                qzu0.a.getClass();
                k = qzu0.j(M);
                M.j();
            } else {
                M.K(-584804605);
                qzu0.a.getClass();
                k = qzu0.k(M);
                M.j();
            }
            lg90 lg90Var = k;
            if (aVar.a) {
                i3 = -584687518;
                i4 = R.string.ecomm_cart_favorite_button_remove;
            } else {
                i3 = -584592379;
                i4 = R.string.ecomm_cart_favorite_button_add;
            }
            k(24640, M, zq.a(M, i3, i4, M, 0), gzsVar, ahn.E(aVar3, "cart_product_favorite"), lg90Var, aVar.a);
            boolean z2 = (i6 == 4) | (i7 == 32);
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new tx(4, (Object) c0919a, izsVar);
                M.R(x2);
            }
            qzu0.a.getClass();
            k(27712, M, d370.N(R.string.ecomm_cart_delete_button, 0, M), (gzs) x2, s200.H(ahn.E(aVar3, "cart_product_remove"), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), qzu0.B(M), false);
            f(izsVar, c0919a, aVar.b, s200.H(aVar3, 62, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, i6 | 3072 | i7, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx9(izsVar, c0919a, aVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(izs<? super rv9, s3q0> izsVar, a.C0919a c0919a, CartItem.d.a.InterfaceC0923a interfaceC0923a, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(898633395);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(c0919a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(interfaceC0923a) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(898633395, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPicker (CartProduct.kt:473)");
                }
                if (interfaceC0923a instanceof CartItem.d.a.InterfaceC0923a.C0924a) {
                    M.K(656572771);
                    a(izsVar, c0919a, (CartItem.d.a.InterfaceC0923a.C0924a) interfaceC0923a, s200.H(q630Var4, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    M.j();
                    q630Var3 = q630Var4;
                } else {
                    int i5 = i3;
                    q630 q630Var5 = q630Var4;
                    if (interfaceC0923a instanceof CartItem.d.a.InterfaceC0923a.b) {
                        M.K(656880539);
                        String N = d370.N(R.string.ecomm_cart_select_button, 0, M);
                        float f = 4;
                        q630 d = rte0.d(q630Var5, vog0.b(f));
                        boolean z = ((i5 & 14) == 4) | ((i5 & 112) == 32);
                        Object x = M.x();
                        if (z || x == a.C0011a.a) {
                            x = new com.vk.movika.sdk.base.logic.interactor.c(5, izsVar, c0919a);
                            M.R(x);
                        }
                        q630 E = s200.E(ojc.c(d, false, null, null, (gzs) x, 15), f, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getText().c;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var5;
                        yqv0.c(N, E, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, M, 0, 0, 8184);
                        M.j();
                    } else {
                        q630Var3 = q630Var5;
                        M.K(298303415);
                        M.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630Var3;
            }
            s = M.s();
            if (s == null) {
                s.d = new tx9(izsVar, c0919a, interfaceC0923a, q630Var2, i, i2, 0);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void g(CartItem.d.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-425572561);
        int i3 = i | (M.J(bVar) ? 4 : 2) | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-425572561, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartPrimaryInfo (CartProduct.kt:169)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            l(0, M, kq01.g(bVar.a, M), bVar.c, null);
            String str = bVar.b;
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
            i2 = 0;
            yqv0.c(str, f, j, null, null, 0, 0, null, 2, false, 0, 2, null, wuv0Var.d0, M, 100663344, 48, 5880);
            M = M;
            j(0, M, bVar.d, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 0;
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xx9(bVar, q630Var2, i, i2);
        }
    }

    public static final void h(CartItem.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1560190584);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1560190584, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartProduct (CartProduct.kt:65)");
            }
            a.C0919a c0919a = dVar.c;
            UserId userId = c0919a.b;
            String str = "cart_product_" + fkq0.a(userId) + '_' + c0919a.a;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(ahn.E(aVar2, str).g(q630Var), 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.ui.s(2, izsVar, dVar);
                M.R(x);
            }
            q630 c = ojc.c(f, false, null, null, (gzs) x, 15);
            float f2 = kqu0.s;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, c);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c2, dVar2);
            q630 a2 = o19.a(txj0.f(aVar2, 1.0f), dVar.d ? 1.0f : 0.64f);
            float f3 = kqu0.b;
            q630 H = s200.H(a2, f3 - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, H);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar2);
            i(dVar.e, dVar.f, null, M, 0);
            g(dVar.g, null, M, 0);
            M.G();
            b(izsVar, dVar.c, dVar.h, null, M, (i2 >> 3) & 14);
            jqu0.a(s200.H(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 7.5d, 5), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jx(dVar, izsVar, q630Var, i, 1);
        }
    }

    public static final void i(String str, Integer num, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-909256971);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(num) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-909256971, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartProductImage (CartProduct.kt:124)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            fwu0.c(txj0.r(m(M), s200.E(aVar2, kqu0.s, kqu0.r)), null, str, null, null, null, null, bci.a, M, ((i2 << 6) & 896) | 100663296, 250);
            if (num == null) {
                M.K(-2126894960);
            } else {
                M.K(-2126894959);
                sw00.a(num.intValue(), s200.H(ahn.E(aVar2, "cart_product_discount_badge"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, M, (i2 >> 3) & 14, 4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k71(i, 2, str, num, q630Var2);
        }
    }

    public static final void j(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(263317484);
        char c = 4;
        int i2 = i | (M.J(list) ? 4 : 2) | 48;
        int i3 = 1;
        int i4 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(263317484, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartProperties (CartProduct.kt:230)");
            }
            float f = 2;
            float c2 = (((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp - (kqu0.b * f)) - uco.c(m(M));
            float f2 = kqu0.s;
            float f3 = c2 - f2;
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c3 = qri.c(M, aVar3);
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
            Iterator a2 = yu50.a(M, c3, cri.a.d, -1793728257, list);
            while (a2.hasNext()) {
                CartItem.d.b.a aVar5 = (CartItem.d.b.a) a2.next();
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, i4);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c4 = qri.c(M, aVar3);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, a3, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c4, cri.a.d);
                androidx.compose.runtime.a aVar7 = M;
                int i5 = i4;
                q630.a aVar8 = aVar3;
                float f4 = f;
                float f5 = f3;
                yqv0.c(aVar5.a, txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 / f, i3, aVar3), wlb0.h(aVar7).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar7).d0, aVar7, 100663296, 48, 5880);
                yqv0.c(d370.N(R.string.ecomm_cart_product_properties_divider, i5, aVar7), null, wlb0.h(aVar7).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar7).d0, aVar7, 0, 0, 8186);
                f9t.e(txj0.v(aVar8, 4), aVar7, 6);
                String str = aVar5.b;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqv0.c(str, new xpy(1.0f, true), wlb0.h(aVar7).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar7).d0, aVar7, 100663296, 48, 5880);
                aVar7.G();
                f3 = f5;
                aVar3 = aVar8;
                i4 = i5;
                M = aVar7;
                c = 4;
                f = f4;
                i3 = 1;
            }
            aVar2 = M;
            q630Var2 = aVar3;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a73(list, q630Var2, i, 1);
        }
    }

    public static final void k(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var, boolean z) {
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(617953938);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16) | (M.J(str) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(617953938, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartSmallButton (CartProduct.kt:452)");
            }
            float f = 24;
            if (z) {
                M.K(1236317914);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
                M.j();
            } else {
                M.K(1236377496);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().n;
                M.j();
            }
            aVar2 = M;
            nzu0.c(gzsVar, lg90Var, str, q630Var, f, j, false, null, false, null, null, aVar2, (i2 & 14) | 24640 | (i2 & 112) | (i2 & 896) | 3072, 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fx7(i, str, gzsVar, q630Var, lg90Var, z);
        }
    }

    public static final void l(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1232244601);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1232244601, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartTitleRow (CartProduct.kt:202)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
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
            yqv0.c(str, null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).h0, M, i2 & 14, 0, 8186);
            M = M;
            if (str2 == null) {
                M.K(1686595687);
                M.j();
                aVar2 = aVar3;
            } else {
                M.K(1686595688);
                aVar2 = aVar3;
                yqv0.c(str2, ahn.E(aVar3, "cart_product_old_price").g(new gor0(dt1.a.l)), wlb0.h(M).getText().p, pdo0.d, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, ((i2 >> 3) & 14) | 3072, 0, 8176);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fn7(i, 1, str, str2, q630Var2);
        }
    }

    public static final long m(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(587472946, 0, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.productImageSize (CartProduct.kt:580)");
        }
        long b = ((Configuration) aVar.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 360 ? byc0.b(135, 162) : byc0.b(110, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }
}
