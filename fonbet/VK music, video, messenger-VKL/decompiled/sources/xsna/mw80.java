package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.f7p0;

/* compiled from: OrderListToolbar.kt */
/* loaded from: classes18.dex */
public final class mw80 {
    public static final void a(c3p0 c3p0Var, boolean z, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        String str;
        a.C0011a.C0012a c0012a;
        TopBar$Before.e eVar;
        f7p0.c cVar;
        int i2 = c3p0Var.b;
        androidx.compose.runtime.a M = aVar.M(-1522625716);
        int i3 = i | (M.J(c3p0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        int i4 = i3 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1522625716, i4, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListToolbar (OrderListToolbar.kt:26)");
            }
            M.K(1340542128);
            if (i2 > 0) {
                M.K(966581139);
                str = d370.F(R.plurals.ecomm_order_product_amount_description, i2, new Object[]{Integer.valueOf(i2)}, M, 0);
                M.j();
            } else {
                M.K(966779414);
                M.j();
                str = null;
            }
            M.j();
            String N = d370.N(R.string.ecomm_order_list_top_bar_cart, 0, M);
            String str2 = str;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.ecomm_order_list_top_bar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            androidx.compose.runtime.a aVar3 = M;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                c0012a = c0012a2;
                aVar3.K(-1392018831);
                aVar3.j();
                eVar = null;
            } else {
                aVar3.K(-1392258429);
                String N2 = d370.N(R.string.ecomm_order_list_top_bar_back, 0, aVar3);
                boolean z2 = (i4 & 896) == 256;
                Object x = aVar3.x();
                if (z2 || x == c0012a2) {
                    x = new th2(izsVar, 6);
                    aVar3.R(x);
                }
                c0012a = c0012a2;
                TopBar$Before.e a2 = e.a.a((gzs) x, N2, null, null, null, aVar3, 196608, 28);
                aVar3.j();
                eVar = a2;
            }
            qzu0.a.getClass();
            lg90 m1 = qzu0.m1(aVar3);
            String N3 = d370.N(R.string.ecomm_order_list_top_bar_cart, 0, aVar3);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = aVar3.J(str2) | aVar3.J(N);
            Object x2 = aVar3.x();
            if (J || x2 == c0012a) {
                x2 = new np5(18, str2, N);
                aVar3.R(x2);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
            if (i2 > 0) {
                aVar3.K(-1391233600);
                f7p0.c a4 = f7p0.c.a.a(c3p0Var.b, CounterAppearance.Design.AccentRed, null, null, aVar3, 24624, 12);
                aVar3 = aVar3;
                aVar3.j();
                cVar = a4;
            } else {
                aVar3.K(-1391020630);
                aVar3.j();
                cVar = null;
            }
            int i5 = i4 & 896;
            boolean z3 = i5 == 256;
            Object x3 = aVar3.x();
            if (z3 || x3 == c0012a) {
                x3 = new o87(izsVar, 9);
                aVar3.R(x3);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            d.c.C0760d a5 = d.c.C0760d.a.a(m1, N3, (gzs) x3, cVar, null, a3, aVar4, 1572872, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-75149298, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-HelpCircleOutline28> (VkSdkIcons.kt:1024)");
            }
            lg90 b = or.b(aVar4, -1094593778, R.drawable.vk_icon_help_circle_outline_28, aVar4, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N4 = d370.N(R.string.ecomm_order_list_top_bar_help, 0, aVar4);
            boolean z4 = i5 == 256;
            Object x4 = aVar4.x();
            if (z4 || x4 == c0012a) {
                x4 = new mse(izsVar, 7);
                aVar4.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            Object x5 = aVar4.x();
            if (x5 == c0012a) {
                x5 = new k220(10);
                aVar4.R(x5);
            }
            muv0.h(a, q630Var, null, null, eVar, null, d.a.a(a5, d.b.a.C0757a.a(b, N4, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar4, 12582920, 88), null, null, aVar4, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8108);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lw80(c3p0Var, z, izsVar, q630Var, i);
        }
    }
}
