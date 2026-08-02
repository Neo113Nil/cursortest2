package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import xsna.cri;
import xsna.q630;

/* compiled from: ExpandableAppBar.kt */
/* loaded from: classes3.dex */
public final class a8q {
    public static final void a(szm szmVar, jai jaiVar, jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1651602808);
        if ((i & 6) == 0) {
            i2 = (M.J(szmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1651602808, i2, -1, "com.vk.music.playlist.framework.presentation.screen.ExpandableAppBar (ExpandableAppBar.kt:19)");
            }
            q630 D = p490.D(aVar2, p490.x(M), 14);
            List l = e43.l(jaiVar, jaiVar2);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new z7q(szmVar);
                M.R(x);
            }
            b540 b540Var = (b540) x;
            jai b = joy.b(l);
            boolean J = M.J(b540Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new c540(b540Var);
                M.R(x2);
            }
            cp10 cp10Var = (cp10) x2;
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
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pt6(szmVar, jaiVar, jaiVar2, i);
        }
    }
}
