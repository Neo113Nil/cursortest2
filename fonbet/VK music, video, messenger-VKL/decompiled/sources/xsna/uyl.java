package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DeliveryPointsSwipeIndicator.kt */
/* loaded from: classes18.dex */
public final class uyl {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1663002899);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1663002899, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSwipeIndicator (DeliveryPointsSwipeIndicator.kt:18)");
            }
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), 16);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d2 = rte0.d(ra8.a.b(txj0.h(txj0.v(aVar2, 40), 2), dt1.a.f), vog0.b(1));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(d2, ylu0Var.getIcon().n, androidx.compose.ui.graphics.e.a), M, 0)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tyl(q630Var, i, 0);
        }
    }
}
