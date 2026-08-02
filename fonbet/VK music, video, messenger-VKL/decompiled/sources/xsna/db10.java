package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketProductCardName.kt */
/* loaded from: classes18.dex */
public final class db10 {
    public static final void a(String str, String str2, frv0 frv0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1456348399);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(frv0Var) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1456348399, i2, -1, "com.vk.ecomm.design.compose.product_info.ProductCardName (MarketProductCardName.kt:18)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(str, ahn.E(q630.a.a, "main_info_title"), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, (i2 & 14) | 48, (i2 << 3) & 7168, 8184);
            M = M;
            if (str2 == null) {
                M.K(-513691795);
            } else {
                M.K(-513691794);
                yqv0.c(str2, null, wlb0.h(M).getText().s, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8186);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f95(i, 1, str, str2, frv0Var, q630Var);
        }
    }
}
