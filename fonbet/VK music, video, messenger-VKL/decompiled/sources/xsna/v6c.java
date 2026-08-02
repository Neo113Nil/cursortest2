package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CheckoutOrderList.kt */
/* loaded from: classes18.dex */
public final class v6c {
    public static final void a(r6c r6cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1996531859);
        if ((i & 6) == 0) {
            i2 = (M.J(r6cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1996531859, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutOrderList (CheckoutOrderList.kt:25)");
            }
            float f = 10;
            q630 E = ahn.E(s200.H(q630Var, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 6, 2), "checkout_product_list");
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.im.engine.commands.messages.a(9, r6cVar, izsVar);
                M.R(x);
            }
            lqy.b(E, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kw9(r6cVar, izsVar, q630Var, i, 1);
        }
    }
}
