package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import xsna.cri;
import xsna.q630;

/* compiled from: VkCollapsableTopAppBar.kt */
/* loaded from: classes17.dex */
public final class xlu0 {
    public static final void a(final v6p0 v6p0Var, q630 q630Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1905932207);
        if ((i & 6) == 0) {
            i2 = (M.J(v6p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(jaiVar2) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1905932207, i3, -1, "com.vk.core.compose.component.topbar.VkCollapsableTopAppBar (VkCollapsableTopAppBar.kt:18)");
            }
            jgh0 x = p490.x(M);
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(aVar2, x, 14);
            List l = e43.l(jaiVar, jaiVar2);
            boolean z = (i3 & 14) == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x2 == c0012a) {
                x2 = new wlu0(v6p0Var);
                M.R(x2);
            }
            b540 b540Var = (b540) x2;
            jai b = joy.b(l);
            boolean J = M.J(b540Var);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new c540(b540Var);
                M.R(x3);
            }
            cp10 cp10Var = (cp10) x3;
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(0, M, b)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vlu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xlu0.a(v6p0.this, q630Var2, jaiVar, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
