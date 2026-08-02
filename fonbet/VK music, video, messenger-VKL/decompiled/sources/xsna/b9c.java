package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.o9c;
import xsna.q630;
import xsna.tlo0;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CheckoutSuccessScreen.kt */
/* loaded from: classes18.dex */
public final class b9c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(o9c.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        String str;
        androidx.compose.runtime.a M = aVar.M(832036356);
        int i2 = i | (M.J(dVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(832036356, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutSuccessScreen (CheckoutSuccessScreen.kt:28)");
            }
            wh50 a = jk50.a(dVar.a, M, 48, 2);
            q630Var2 = q630Var;
            q630 d = txj0.d(q630Var2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 D2 = p490.D(q630.a.a, p490.x(M), 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
            }
            lg90 b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, 0);
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
            t8p0 a2 = csa0.a(b, ylu0Var.getIcon().a, 0L, d370.N(R.string.ecomm_checkout_success_icon_description, 0, M), null, M, 196616, 20);
            String N = d370.N(R.string.ecomm_checkout_thanks_for_order, 0, M);
            r1n0 r1n0Var = (r1n0) a.getValue();
            tlo0.f fVar = r1n0Var != null ? r1n0Var.b : null;
            if (fVar == null) {
                M.K(-2110138670);
                M.j();
                str = null;
            } else {
                M.K(347573007);
                String g = kq01.g(fVar, M);
                M.j();
                str = g;
            }
            vl20 a3 = zra0.a.a(N, null, str, null, M, 196608, 26);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Medium;
            r1n0 r1n0Var2 = (r1n0) a.getValue();
            String g2 = kq01.g(r1n0Var2 != null ? r1n0Var2.a : null, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new z8c(izsVar, 0);
                M.R(x);
            }
            r48 a4 = wra0.a.C3954a.a(g2, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28032, 12582912, 131040);
            ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
            String N2 = d370.N(R.string.ecomm_checkout_continue_buy, 0, M);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new z87(izsVar, 1);
                M.R(x2);
            }
            r48 a5 = wra0.a.C3954a.a(N2, (gzs) x2, buttonSize, buttonStyle2, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28032, 12582912, 131040);
            M = M;
            ldv0.d(D2, a2, a3, wra0.b.a(a4, a5, null, M, 12), null, null, false, M, 0, 112);
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
            s.d = new a9c(i, 0, dVar, q630Var2, izsVar);
        }
    }
}
