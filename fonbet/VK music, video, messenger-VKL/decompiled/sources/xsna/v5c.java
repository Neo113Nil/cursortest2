package xsna;

import androidx.compose.runtime.a;

/* compiled from: CheckoutListCompleteActionItem.kt */
/* loaded from: classes18.dex */
public final class v5c {
    public static final void a(f3c f3cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1155301310);
        if ((i & 6) == 0) {
            i2 = (M.J(f3cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1155301310, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutListCompleteActionItem (CheckoutListCompleteActionItem.kt:17)");
            }
            String str = f3cVar.d;
            boolean z = !f3cVar.e;
            q630 E = ahn.E(s200.E(q630Var, kqu0.b, kqu0.v), "checkout_do_order_item");
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.ui.i(6, izsVar, f3cVar);
                M.R(x);
            }
            e3c.a(0, M, str, (gzs) x, E, z);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new es5(i, 1, f3cVar, izsVar, q630Var);
        }
    }
}
