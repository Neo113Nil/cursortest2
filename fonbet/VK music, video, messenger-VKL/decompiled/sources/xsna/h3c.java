package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: CheckoutCompleteActionStickItem.kt */
/* loaded from: classes18.dex */
public final class h3c {
    public static final void a(g3c g3cVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1343297449);
        if ((i & 6) == 0) {
            i2 = (M.J(g3cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1343297449, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.stick.CheckoutCompleteActionStickItem (CheckoutCompleteActionStickItem.kt:18)");
            }
            String str = g3cVar.a;
            boolean z = !g3cVar.b;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new yq1(2, izsVar, g3cVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            q630 f = txj0.f(aVar2, 1.0f);
            float f2 = kqu0.b;
            e3c.a(0, M, str, gzsVar, ahn.E(s200.G(f, f2, kqu0.t, f2, kqu0.v), "checkout_do_order"), z);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wp8(g3cVar, izsVar, i);
        }
    }
}
