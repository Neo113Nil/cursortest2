package xsna;

import androidx.compose.runtime.a;

/* compiled from: CheckoutTextInfo.kt */
/* loaded from: classes18.dex */
public final class e9c {
    public static final bpn0 a = new bpn0(new r(6));

    public static final void a(c9c c9cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1652205514);
        if ((i & 6) == 0) {
            i2 = (M.J(c9cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1652205514, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutTextInfo (CheckoutTextInfo.kt:22)");
            }
            CharSequence charSequence = c9cVar.d;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new uq0(izsVar, 1);
                M.R(x);
            }
            us2 d = ws2.d(charSequence, (izs) x);
            q630 E = s200.E(q630Var, kqu0.b, ((Boolean) a.getValue()).booleanValue() ? kqu0.t : kqu0.u);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.d(d, E, j, 0, null, 0, false, 0, null, null, wuv0Var.i0, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new d9c(i, 0, c9cVar, izsVar, q630Var);
        }
    }
}
