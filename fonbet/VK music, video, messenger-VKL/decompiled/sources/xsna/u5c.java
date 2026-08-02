package xsna;

import androidx.compose.runtime.a;

/* compiled from: CheckoutInputFieldsRow.kt */
/* loaded from: classes18.dex */
public final class u5c {
    public static final void a(l5c l5cVar, x1x x1xVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1117021148);
        if ((i & 6) == 0) {
            i2 = (M.J(l5cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(x1xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1117021148, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutInputFieldsRow (CheckoutInputFieldsRow.kt:19)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new tv7(x1xVar, izsVar, l5cVar);
                M.R(x);
            }
            vyu0.c((i2 >> 9) & 14, M, (izs) x, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s5c(l5cVar, x1xVar, izsVar, q630Var, i);
        }
    }
}
