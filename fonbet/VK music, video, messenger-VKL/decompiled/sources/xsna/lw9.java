package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.cart.impl.cart.a;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CartError.kt */
/* loaded from: classes18.dex */
public final class lw9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(izs izsVar, a.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        q630.a aVar2;
        boolean z;
        t8p0 a;
        y48 y48Var;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-1862527187);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1862527187, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartError (CartError.kt:33)");
            }
            mw9 mw9Var = (mw9) jk50.a(cVar.a, M, 0, 3).getValue();
            q630.a aVar4 = q630.a.a;
            if (mw9Var == null) {
                M.K(135274514);
                M.j();
                aVar3 = aVar4;
            } else {
                M.K(135274515);
                int i4 = i3 & 910;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1370495246, i4, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.CartError (CartError.kt:50)");
                }
                q630 d = txj0.d(aVar4, 1.0f);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, d);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                boolean z2 = mw9Var.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1235356385, 0, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.topPlaceholderIcon (CartError.kt:81)");
                }
                if (z2) {
                    M.K(-1072598996);
                    z = false;
                    aVar2 = aVar4;
                    a = csa0.a(pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M), 0L, 0L, null, null, M, 196616, 30);
                    M.j();
                } else {
                    aVar2 = aVar4;
                    z = false;
                    M.K(-1072476546);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
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
                    a = csa0.a(a2, ylu0Var.getIcon().l, 0L, null, null, M, 196616, 28);
                    M.j();
                }
                t8p0 t8p0Var = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vl20 a3 = zra0.a.a(kq01.d(mw9Var.b, M), null, kq01.d(mw9Var.c, M), null, M, 196608, 26);
                tlo0 tlo0Var = mw9Var.d;
                if (tlo0Var == null) {
                    M.K(1018366990);
                    M.j();
                    y48Var = null;
                } else {
                    M.K(1018366991);
                    String g = kq01.g(tlo0Var, M);
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    ButtonStyle buttonStyle = ButtonStyle.Link;
                    ButtonSize buttonSize = ButtonSize.Small;
                    if ((((i3 & 14) ^ 6) > 4 && M.J(izsVar)) || (i3 & 6) == 4) {
                        z = true;
                    }
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new cc1(izsVar, 2);
                        M.R(x);
                    }
                    r48 a4 = wra0.a.C3954a.a(g, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28032, 12582912, 131040);
                    M = M;
                    y48 a5 = wra0.b.a(a4, null, null, M, 14);
                    M.j();
                    y48Var = a5;
                }
                q630.a aVar6 = aVar2;
                ldv0.d(aVar6, t8p0Var, a3, y48Var, null, null, false, M, 6, 112);
                aVar3 = aVar6;
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kw9(izsVar, cVar, q630Var2, i);
        }
    }
}
