package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ThreeButtonsItem.kt */
/* loaded from: classes2.dex */
public final class vro0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1570664122);
        int i2 = i | 6 | (M.l(false) ? 32 : 16) | (M.l(false) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1570664122, i2, -1, "com.vk.im.edu.ui.compose.item.ThreeButtonsItem (ThreeButtonsItem.kt:41)");
            }
            float f = 16;
            float f2 = 12;
            q630.a aVar2 = q630.a.a;
            q630 G = s200.G(aVar2, f, f2, f, f2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1007602803);
            M.K(1005075652);
            M.j();
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w2k(i, gzsVar, gzsVar2, q630Var);
        }
    }
}
