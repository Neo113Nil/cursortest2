package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;
import xsna.wra0;
import xsna.zra0;

/* compiled from: OrdersErrorScreen.kt */
/* loaded from: classes18.dex */
public final class cy80 {
    public static final void a(imy imyVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(599420536);
        int i2 = i | (M.J(imyVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(599420536, i2, -1, "com.vk.ecomm.orders.impl.common.ui.compose.OrdersError (OrdersErrorScreen.kt:30)");
            }
            if (imyVar.a) {
                M.K(-1136630948);
                pair = new Pair(pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M), new l5g(l5g.k));
                M.j();
            } else {
                M.K(-1136516961);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(a, new l5g(ylu0Var.getIcon().a));
                M.j();
            }
            lg90 lg90Var = (lg90) pair.d();
            long j = ((l5g) pair.g()).a;
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(ahn.E(aVar2, "order_error_holder").g(txj0.c(aVar2, 1.0f)), p490.x(M), 14);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            t8p0 a3 = csa0.a(lg90Var, j, 0L, d370.N(R.string.ecomm_orders_error_abstract, 0, M), null, M, 196616, 20);
            vl20 a4 = zra0.a.a(f870.h((tlo0.f) imyVar.b, M), null, f870.h((tlo0.f) imyVar.c, M), null, M, 196608, 26);
            tlo0.f fVar = (tlo0.f) imyVar.d;
            M.K(-1600903998);
            r48 a5 = wra0.a.C3954a.a(f870.h(fVar, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, (i2 & 112) | 28032, 12582912, 131040);
            M = M;
            y48 a6 = wra0.b.a(a5, null, null, M, 14);
            M.j();
            ldv0.d(null, a3, a4, a6, null, null, false, M, 0, 113);
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
            s.d = new yi1(i, 5, imyVar, gzsVar, q630Var2);
        }
    }
}
