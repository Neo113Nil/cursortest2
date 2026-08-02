package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: CheckoutRadioOption.kt */
/* loaded from: classes18.dex */
public final class t7c {
    public static final void a(s7c s7cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1563779121);
        if ((i & 6) == 0) {
            i2 = (M.J(s7cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1563779121, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutRadioOption (CheckoutRadioOption.kt:16)");
            }
            boolean z = s7cVar.g;
            rci0 d = qci0.d(60, s7cVar.e, s7cVar.f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new cm(5, izsVar, s7cVar);
                M.R(x);
            }
            afv0.c(z, d, (gzs) x, ahn.E(q630.a.a, "checkout_radio_".concat(s7cVar.b.e)).g(q630Var), s7cVar.h, M, 0, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ty5(i, 2, s7cVar, izsVar, q630Var);
        }
    }
}
