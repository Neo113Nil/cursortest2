package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: CourierMapToolbar.kt */
/* loaded from: classes18.dex */
public final class uzj {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-342825765);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-342825765, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapToolbar (CourierMapToolbar.kt:14)");
            }
            String N = d370.N(R.string.ecomm_courier_map_toolbar_title, 0, M);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new f74(izsVar, 3);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new w77(izsVar, 2);
                M.R(x2);
            }
            kx9.a(N, gzsVar, (gzs) x2, ahn.E(q630Var, "courier_map_top_bar"), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tac(i, 1, izsVar, q630Var);
        }
    }
}
