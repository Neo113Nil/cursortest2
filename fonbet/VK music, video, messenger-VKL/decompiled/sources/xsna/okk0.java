package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.SpinnerState;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Spinner.kt */
/* loaded from: classes7.dex */
public final class okk0 {
    public static final void a(skk0 skk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1835028494);
        if ((i & 6) == 0) {
            i2 = i | (M.J(skk0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1835028494, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.spinner.Spinner (Spinner.kt:20)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new yo80(5);
                M.R(x2);
            }
            q630.a aVar3 = q630.a.a;
            gzs gzsVar = null;
            q630 E = ahn.E(txj0.d(ojc.b(aVar3, sg50Var, null, false, null, (gzs) x2, 28), 1.0f), "SpinnerTags.ROOT");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            SpinnerState spinnerState = SpinnerState.Loading;
            if (skk0Var.a) {
                M.K(-733219904);
                boolean z = (i3 & 112) == 32;
                Object x3 = M.x();
                if (z || x3 == c0012a) {
                    x3 = new dz7(izsVar, 7);
                    M.R(x3);
                }
                gzsVar = (gzs) x3;
                M.j();
            } else {
                M.K(-733137878);
                M.j();
            }
            aVar2 = M;
            zfr0.d(spinnerState, null, null, null, gzsVar, 0L, 0L, null, null, aVar2, 6, 494);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new le1(i, 2, skk0Var, izsVar, q630Var2);
        }
    }
}
