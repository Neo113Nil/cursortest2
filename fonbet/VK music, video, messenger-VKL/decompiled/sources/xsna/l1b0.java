package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.j1b0;

/* compiled from: PlayerEqualizerSettingsReducer.kt */
/* loaded from: classes3.dex */
public final class l1b0 extends dm50<n1b0, j1b0, m1b0> {
    @Override // xsna.dm50
    public final m1b0 c(m1b0 m1b0Var, j1b0 j1b0Var) {
        m1b0 m1b0Var2 = m1b0Var;
        j1b0 j1b0Var2 = j1b0Var;
        if (j1b0Var2 instanceof j1b0.a) {
            j1b0.a aVar = (j1b0.a) j1b0Var2;
            return new m1b0(aVar.b, aVar.c, aVar.d, aVar.f, aVar.g, aVar.e);
        }
        if (j1b0Var2 instanceof j1b0.c) {
            j1b0.c cVar = (j1b0.c) j1b0Var2;
            return m1b0.a(m1b0Var2, cVar.c, cVar.d, cVar.b, 22);
        }
        if (j1b0Var2 instanceof j1b0.b) {
            return m1b0.a(m1b0Var2, ((j1b0.b) j1b0Var2).b, null, null, 62);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final n1b0 d() {
        return new n1b0(e(new ye40(7)));
    }

    @Override // xsna.dm50
    public final void h(m1b0 m1b0Var, n1b0 n1b0Var) {
        f(n1b0Var.a, m1b0Var);
    }
}
