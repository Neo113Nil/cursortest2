package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.Map;
import xsna.hxu;
import xsna.q630;
import xsna.sx80;

/* compiled from: OrderContent.kt */
/* loaded from: classes18.dex */
public final class nu80 {
    public static final void a(hxu hxuVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ikg0 a;
        androidx.compose.runtime.a M = aVar.M(1222793725);
        if ((i & 6) == 0) {
            i2 = (M.J(hxuVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1222793725, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.HeaderItem (OrderContent.kt:139)");
            }
            String h = f870.h(hxuVar.d, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new d4r(16);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.f a2 = f.a.a(h, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, M, 805306368, 446);
            M = M;
            b.C0749b c0749b = b.C0749b.a;
            hxu.a aVar2 = hxuVar.e;
            if (aVar2 == null) {
                M.K(-1664277328);
                M.j();
                a = null;
            } else {
                M.K(-1664277327);
                String h2 = f870.h(aVar2.a, M);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonStyle buttonStyle = ButtonStyle.Link;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new v4v(22);
                    M.R(x2);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
                boolean y = ((i2 & 112) == 32) | M.y(aVar2);
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new com.vk.voip.a(21, izsVar, aVar2);
                    M.R(x3);
                }
                a = GroupHeader$Right.c.a(GroupHeader$Right.a.C0743a.C0744a.a(h2, (gzs) x3, buttonSize, buttonStyle, buttonAppearance, null, a3, M, 28032, 16352), null, null, null, M, 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.g.b(a2, yu80.a(q630Var, ylu0Var.getBackground().g, hxuVar.b), c0749b, null, null, a, false, M, 384, 88);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ju80(i, 0, hxuVar, izsVar, q630Var);
        }
    }

    public static final void b(gww gwwVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1018732111);
        if ((i & 6) == 0) {
            i2 = (M.J(gwwVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1018732111, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.InfoRowItem (OrderContent.kt:201)");
            }
            String h = f870.h(gwwVar.d, M);
            Map<String, com.vk.ecomm.orders.impl.common.ui.model.a> map = gwwVar.e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a = yu80.a(q630Var, ylu0Var.getBackground().g, gwwVar.b);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w1(izsVar, 6);
                M.R(x);
            }
            ey80.a(h, map, (wzs) x, a, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rzg(gwwVar, izsVar, q630Var, i);
        }
    }

    public static final void c(final sx80.a.d dVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-512557768);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-512557768, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderContent (OrderContent.kt:53)");
            }
            boolean z = dVar.c;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new tw(izsVar, 5);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dge0.a(z, gzsVar, hr80.m(d, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), null, null, kai.c(148396966, new yzs() { // from class: xsna.ku80
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(148396966, intValue, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderContent.<anonymous> (OrderContent.kt:63)");
                        }
                        q630 E = ahn.E(q630.a.a, "order_content_list");
                        sx80.a.d dVar2 = sx80.a.d.this;
                        boolean J = aVar3.J(dVar2);
                        Object obj4 = izsVar;
                        boolean J2 = J | aVar3.J(obj4);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == a.C0011a.a) {
                            x2 = new na7(21, dVar2, obj4);
                            aVar3.R(x2);
                        }
                        lqy.a(E, null, null, null, null, null, false, null, (izs) x2, aVar3, 6, 510);
                        mm2.f(dVar2.b, null, anp.e(null, 3), anp.f(null, 3), null, eji.b, aVar3, 200064, 18);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 24);
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
            s.d = new ax(i, 5, dVar, izsVar, q630Var2);
        }
    }

    public static final void d(jv80 jv80Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-20921770);
        int i2 = (M.J(jv80Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-20921770, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderContentListItem (OrderContent.kt:118)");
            }
            q630 E = ahn.E(q630Var, jv80Var.a());
            if (jv80Var instanceof hxu) {
                M.K(1369023461);
                a((hxu) jv80Var, izsVar, E, M, i2 & 112);
                M.j();
            } else if (jv80Var instanceof gww) {
                M.K(1369025830);
                b((gww) jv80Var, izsVar, E, M, i2 & 112);
                M.j();
            } else if (jv80Var instanceof ns90) {
                M.K(1369028230);
                e((ns90) jv80Var, izsVar, E, M, i2 & 112);
                M.j();
            } else if (jv80Var instanceof gpd0) {
                M.K(1369030772);
                gpd0 gpd0Var = (gpd0) jv80Var;
                UserId userId = gpd0Var.e;
                yw80.a(gpd0Var, izsVar, ahn.E(q630.a.a, "order_product_" + fkq0.a(userId) + '_' + gpd0Var.d), M, i2 & 112);
                M.j();
            } else {
                if (!(jv80Var instanceof ofi0)) {
                    throw alb0.c(1369022712, M);
                }
                M.K(1369037772);
                f((ofi0) jv80Var, izsVar, E, M, i2 & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p2(i, 1, jv80Var, izsVar, q630Var);
        }
    }

    public static final void e(ns90 ns90Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-261971877);
        if ((i & 6) == 0) {
            i2 = (M.J(ns90Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-261971877, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.PaymentItem (OrderContent.kt:177)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new iz7(izsVar, 4);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(yu80.a(q630Var, ylu0Var.getBackground().g, ns90Var.b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), null, false, false, null, null, null, d370.N(R.string.ecomm_orders_pay_order, 0, M), null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mx9(i, 5, ns90Var, izsVar, q630Var);
        }
    }

    public static final void f(ofi0 ofi0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1804015257);
        if ((i & 6) == 0) {
            i2 = (M.J(ofi0Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1804015257, i2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.SellerCommentItem (OrderContent.kt:221)");
            }
            Object obj = ofi0Var.d;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d8k(izsVar, 3);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ex80.a(obj, izsVar2, s200.H(yu80.a(q630Var, ylu0Var.getBackground().g, ofi0Var.b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xv9(i, 3, ofi0Var, izsVar, q630Var);
        }
    }
}
