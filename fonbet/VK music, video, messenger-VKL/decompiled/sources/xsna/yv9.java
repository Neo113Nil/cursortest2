package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vkontakte.android.R;
import xsna.us2;

/* compiled from: CartBanner.kt */
/* loaded from: classes18.dex */
public final class yv9 {
    public static final void a(CartItem.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        int i3;
        androidx.compose.runtime.a M = aVar2.M(1145547193);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1145547193, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartBanner (CartBanner.kt:31)");
            }
            q630 m = hr80.m(s200.E(ahn.E(q630Var, "cart_banner_" + fkq0.a(aVar.c)), kqu0.b, kqu0.s), wlb0.h(M).getBackground().x, vog0.b(kqu0.e));
            qzu0.a.getClass();
            com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.f.a(qzu0.B(M), Cell$Left.Main.Size.Small, wlb0.h(M).getIcon().n, null, null, M, 196664, 24);
            M.K(1359252551);
            us2.b bVar = new us2.b();
            M.K(1359253866);
            int m2 = bVar.m(new hik0(wlb0.h(M).getText().m, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                bVar.g(kq01.g(aVar.d, M));
                s3q0 s3q0Var = s3q0.a;
                bVar.k(m2);
                M.j();
                us2 n = bVar.n();
                M.j();
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new nj(4);
                    M.R(x);
                }
                com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(null, Cell$Middle.c.b.a(n, null, 0, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, 805306368, 446), null, null, M, 196608, 29);
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
                } else {
                    i3 = 0;
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_dismiss_24, i3, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = wlb0.h(M).getIcon().l;
                String N = d370.N(R.string.ecomm_cart_banner_accessibility_hide, i3, M);
                int i4 = ((i2 & 112) == 32 ? 1 : i3) | ((i2 & 14) != 4 ? i3 : 1);
                Object x2 = M.x();
                if (i4 != 0 || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.ui.m(2, izsVar, aVar);
                    M.R(x2);
                }
                wiu0.b(m, false, a, a2, o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a3, j, 0L, N, (gzs) x2, null, M, 1572872, 36), null, null, null, M, 61), null, null, M, 0, 98);
                aVar3 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                bVar.k(m2);
                throw th;
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new xv9(i, 0, aVar, izsVar, q630Var);
        }
    }
}
