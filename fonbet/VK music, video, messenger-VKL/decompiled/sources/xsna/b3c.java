package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: CheckoutChechbox.kt */
/* loaded from: classes18.dex */
public final class b3c {
    public static final void a(c3c c3cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(100618283);
        if ((i & 6) == 0) {
            i2 = (M.J(c3cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(100618283, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCheckBox (CheckoutChechbox.kt:16)");
            }
            String str = c3cVar.d;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new xy0(5, izsVar, c3cVar);
                M.R(x);
            }
            eku0.d(str, (gzs) x, txj0.f(ahn.E(q630.a.a, "checkout_check_box_".concat(c3cVar.b.c)).g(q630Var), 1.0f), c3cVar.e, null, false, false, M, 0, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new py9(i, 1, c3cVar, izsVar, q630Var);
        }
    }
}
