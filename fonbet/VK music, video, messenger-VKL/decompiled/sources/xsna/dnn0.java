package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SwitchContent.kt */
@ozl
/* loaded from: classes17.dex */
public final class dnn0 implements ekg0, qzy {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    /* compiled from: SwitchContent.kt */
    public static final class a {
        public static dnn0 a(boolean z, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1045716910, 3072, -1, "com.vk.core.compose.component.cell.content.SwitchContent.Companion.invoke (SwitchContent.kt:49)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new dnn0(z);
                aVar.R(x);
            }
            dnn0 dnn0Var = (dnn0) x;
            ((zak0) dnn0Var.a).setValue(Boolean.valueOf(z));
            ((zak0) dnn0Var.b).setValue(null);
            ((zak0) dnn0Var.c).setValue(true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return dnn0Var;
        }
    }

    public dnn0() {
        throw null;
    }

    public dnn0(boolean z) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(Boolean.TRUE);
    }

    @Override // xsna.ana
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1438793653);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1438793653, i2, -1, "com.vk.core.compose.component.cell.content.SwitchContent.invoke (SwitchContent.kt:28)");
            }
            q630 h = txj0.h(q630.a.a, 48);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.g, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            izs izsVar = null;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.a).getValue()).booleanValue();
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            if (gzsVar == null) {
                M.K(-263273130);
            } else {
                M.K(-263273129);
                boolean J = M.J(gzsVar);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new c4i(2, gzsVar);
                    M.R(x);
                }
                izsVar = (izs) x;
            }
            M.j();
            zov0.a(booleanValue, izsVar, null, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, M, 0, 20);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ech0(this, i, 1);
        }
    }
}
