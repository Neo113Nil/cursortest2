package xsna;

import xsna.q630;

/* compiled from: CheckoutListStickItem.kt */
/* loaded from: classes18.dex */
public final class x5c {
    public static final void a(y8c y8cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-182340282);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(y8cVar) : M.y(y8cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-182340282, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.stick.CheckoutListStickItem (CheckoutListStickItem.kt:14)");
            }
            if (y8cVar instanceof g3c) {
                M.K(1034510960);
                h3c.a((g3c) y8cVar, izsVar, M, i3 & 1008);
                M.j();
            } else {
                if (!(y8cVar instanceof l9c)) {
                    throw alb0.c(864653561, M);
                }
                M.K(1034721667);
                n9c.a((l9c) y8cVar, null, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs0(i, 1, y8cVar, izsVar, q630Var2);
        }
    }
}
