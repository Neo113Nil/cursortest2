package xsna;

import androidx.compose.runtime.a;

/* compiled from: CheckoutPrompt.kt */
/* loaded from: classes18.dex */
public final class r7c {
    public static final void a(q7c q7cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1593842829);
        if ((i & 6) == 0) {
            i2 = (M.J(q7cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1593842829, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutPrompt (CheckoutPrompt.kt:13)");
            }
            String str = q7cVar.d;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new a94(6, izsVar, q7cVar);
                M.R(x);
            }
            aVar2 = M;
            qiu0.a(str, (gzs) x, q630Var2, null, null, null, 0, null, null, null, null, false, aVar2, i2 & 896, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new t2c(i, 1, q7cVar, izsVar, q630Var);
        }
    }
}
