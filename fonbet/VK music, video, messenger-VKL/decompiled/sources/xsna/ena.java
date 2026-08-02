package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;

/* compiled from: Cell.kt */
/* loaded from: classes5.dex */
public final class ena {
    public static final void a(q630 q630Var, yzs<? super spg0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, yzs<? super spg0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar2, yzs<? super spg0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar3, androidx.compose.runtime.a aVar, int i, int i2) {
        androidx.compose.runtime.a M = aVar.M(1720894422);
        int i3 = (M.J(q630Var) ? 4 : 2) | i;
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= M.y(yzsVar3) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                yzsVar3 = jcr.b;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1720894422, i3, -1, "com.vk.profile.tool.compose.edit.Cell (Cell.kt:17)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.l, M, 54);
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
            tpg0 tpg0Var = tpg0.a;
            yzsVar.invoke(tpg0Var, M, 54);
            yzsVar2.invoke(tpg0Var, M, 54);
            yzsVar3.invoke(tpg0Var, M, Integer.valueOf(6 | ((i3 >> 6) & 112)));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        yzs<? super spg0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar4 = yzsVar3;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dna(q630Var, yzsVar, yzsVar2, yzsVar4, i, i2);
        }
    }
}
