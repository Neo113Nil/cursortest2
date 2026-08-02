package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.e;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: OrderListScreen.kt */
/* loaded from: classes18.dex */
public final class cw80 {

    /* compiled from: OrderListScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrdersListItem.Order.Action.Style.values().length];
            try {
                iArr[OrdersListItem.Order.Action.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrdersListItem.Order.Action.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, OrdersListItem.Order.Action action, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        ButtonStyle buttonStyle;
        androidx.compose.runtime.a M = aVar.M(1695133211);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(action) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1695133211, i3, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderAction (OrderListScreen.kt:243)");
            }
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new g59(izsVar, i, action, 1);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            ButtonSize buttonSize = ButtonSize.Medium;
            int i4 = a.$EnumSwitchMapping$0[action.b.ordinal()];
            if (i4 == 1) {
                buttonStyle = ButtonStyle.Primary;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonStyle = ButtonStyle.Secondary;
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, f870.h(action.a, M), null, null, null, null, false, null, null, null, aVar2, ((i3 << 3) & 57344) | 3120, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wv80(i, action, izsVar, q630Var, i2);
        }
    }

    public static final void b(final OrdersListItem.Order order, final int i, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-115357704);
        if ((i2 & 6) == 0) {
            i3 = (M.J(order) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-115357704, i3, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderContent (OrderListScreen.kt:135)");
            }
            float f = 20;
            q630 f2 = txj0.f(q630Var, 1.0f);
            float f3 = kqu0.t;
            q630 d = rte0.d(s200.H(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7), vog0.c(i == 0 ? 0 : f, i == 0 ? 0 : f, f, f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            int i4 = i3 & 896;
            int i5 = i3 & 14;
            boolean z = (i4 == 256) | (i5 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.s(14, izsVar2, order);
                M.R(x);
            }
            q630 c = ojc.c(m, false, null, null, (gzs) x, 15);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z2 = (i4 == 256) | (i5 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new ie3(20, izsVar2, order);
                M.R(x2);
            }
            q630.a aVar3 = q630.a.a;
            c(order, (gzs) x2, ahn.E(aVar3, "order_header"), M, i5 | 384);
            d(order, izsVar2, null, M, ((i3 >> 3) & 112) | i5);
            if (order.i.isEmpty()) {
                M.K(517026112);
            } else {
                M.K(523311145);
                int i6 = order.b;
                int i7 = i3;
                tv80.b(i6, order.i, order.j, izsVar, s200.H(ahn.E(aVar3, "order_product_list" + i6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, (i7 << 3) & 7168);
                izsVar2 = izsVar;
                M = M;
            }
            M.j();
            qow<CharSequence> qowVar = order.k;
            if (qowVar == null) {
                M.K(523776175);
            } else {
                M.K(523776176);
                CharSequence charSequence = qowVar.a;
                boolean z3 = i4 == 256;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new xv80(izsVar2, 0);
                    M.R(x3);
                }
                ex80.a(charSequence, (izs) x3, s200.H(ahn.E(aVar3, "order_seller_comment"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            }
            M.j();
            OrdersListItem.Order.Action action = order.l;
            if (action == null) {
                M.K(524228155);
            } else {
                M.K(524228156);
                a(order.b, action, izsVar, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(txj0.f(ahn.E(aVar3, "order_action_button"), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), M, i4);
            }
            M.j();
            if (xga0.c(aVar3, kqu0.v, M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yv80
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cw80.b(OrdersListItem.Order.this, i, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(OrdersListItem.Order order, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        int i3;
        SemanticsConfiguration.Mode mode;
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.group.header.e eVar;
        androidx.compose.runtime.a M = aVar.M(198630440);
        if ((i & 6) == 0) {
            i2 = (M.J(order) ? 4 : 2) | i;
        } else {
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
                androidx.compose.runtime.b.f(198630440, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderHeader (OrderListScreen.kt:205)");
            }
            boolean z = order.d;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                c0012a = c0012a2;
                i3 = 3;
                mode = null;
                aVar2 = M;
                aVar2.K(-1064962522);
                aVar2.j();
                eVar = null;
            } else {
                M.K(-1065308327);
                qzu0.a.getClass();
                lg90 T0 = qzu0.T0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().a;
                String N = d370.N(R.string.ecomm_orders_new, 0, M);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new h2w(17);
                    M.R(x);
                }
                com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                aVar2 = M;
                c0012a = c0012a2;
                i3 = 3;
                mode = null;
                com.vk.core.compose.component.group.header.e a3 = e.a.a(T0, j, N, a2, null, aVar2, 196616, 16);
                aVar2.j();
                eVar = a3;
            }
            String h = f870.h(order.c, aVar2);
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new oi40(6);
                aVar2.R(x2);
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            M = aVar3;
            int i4 = i2 >> 3;
            com.vk.core.compose.component.group.header.g.b(f.a.a(h, eVar, null, null, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, i3), null, false, aVar3, 805306368, 444), q630Var, b.C0749b.a, null, null, GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a((i4 & 14) | 3072, 4, M, null, d370.N(R.string.ecomm_orders_next, 0, M), gzsVar), null, M, 11), false, M, (i4 & 112) | 384, 88);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs0(i, 3, order, gzsVar, q630Var);
        }
    }

    public static final void d(OrdersListItem.Order order, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1421001674);
        if ((i & 6) == 0) {
            i2 = (M.J(order) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1421001674, i3, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderInfo (OrderListScreen.kt:264)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new p9(7, order, izsVar);
                M.R(x);
            }
            wzs wzsVar = (wzs) x;
            com.vk.ecomm.orders.impl.common.ui.model.a aVar4 = order.e;
            Map<String, com.vk.ecomm.orders.impl.common.ui.model.a> map = order.g;
            if (aVar4 == null) {
                M.K(-1462107321);
            } else {
                M.K(-1462107320);
                ey80.a(d370.N(R.string.ecomm_orders_number, 0, M), on00.f(new Pair("number", aVar4)), wzsVar, ahn.E(aVar2, "order_id"), M, 3072);
            }
            M.j();
            com.vk.ecomm.orders.impl.common.ui.model.a aVar5 = order.h;
            if (aVar5 == null) {
                M.K(-1461737956);
            } else {
                M.K(-1461737955);
                ey80.a(d370.N(R.string.ecomm_orders_price_sum, 0, M), on00.f(new Pair("price", aVar5)), wzsVar, ahn.E(aVar2, "order_price"), M, 3072);
            }
            M.j();
            com.vk.ecomm.orders.impl.common.ui.model.a aVar6 = order.f;
            if (aVar6 == null) {
                M.K(-1461358299);
            } else {
                M.K(-1461358298);
                ey80.a(d370.N(R.string.ecomm_orders_date, 0, M), on00.f(new Pair("date", aVar6)), wzsVar, ahn.E(aVar2, "order_date"), M, 3072);
            }
            M.j();
            if (map.isEmpty()) {
                M.K(-1472158078);
            } else {
                M.K(-1460969062);
                ey80.a(d370.N(R.string.ecomm_orders_seller, 0, M), map, wzsVar, ahn.E(aVar2, "order_seller"), M, 3072);
            }
            M.j();
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
            s.d = new hj(i, 6, order, izsVar, q630Var);
        }
    }

    public static final void e(a.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1987907204);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1987907204, i2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListScreen (OrderListScreen.kt:55)");
            }
            boolean z = dVar.e;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new me1(izsVar, 5);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            q630 d = txj0.d(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dge0.a(z, gzsVar, hr80.m(d, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), null, null, kai.c(1986892914, new com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.a(1, dVar, izsVar), M), M, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wo7(i, 3, dVar, izsVar, q630Var);
        }
    }
}
