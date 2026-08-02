package xsna;

import xsna.b4;
import xsna.vts0;

/* compiled from: AboutVideoActionHandlerWrapper.kt */
/* loaded from: classes7.dex */
public final class q4 implements c4 {
    public final n4 b;
    public final wug0 c;

    public q4(n4 n4Var, wug0 wug0Var) {
        this.b = n4Var;
        this.c = wug0Var;
    }

    @Override // xsna.c4
    public final void d(b4 b4Var) {
        boolean equals = b4Var.equals(b4.t.a);
        wug0 wug0Var = this.c;
        if (equals) {
            wug0Var.invoke(vts0.b.a);
            return;
        }
        if (b4Var.equals(b4.d.a)) {
            wug0Var.invoke(vts0.d.a);
            return;
        }
        boolean equals2 = b4Var.equals(b4.w.a);
        vts0.f fVar = vts0.f.a;
        if (equals2) {
            wug0Var.invoke(fVar);
            return;
        }
        if (b4Var instanceof b4.x) {
            wug0Var.invoke(fVar);
            return;
        }
        boolean z = b4Var instanceof b4.f0;
        n4 n4Var = this.b;
        if (!z) {
            n4Var.d(b4Var);
        } else {
            wug0Var.invoke(vts0.g.a);
            n4Var.d(b4Var);
        }
    }
}
