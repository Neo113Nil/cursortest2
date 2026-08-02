package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ur20;
import xsna.vr20;

/* compiled from: MiniWidgetSettingsTabReducer.kt */
/* loaded from: classes6.dex */
public final class rr20 extends dm50<wr20, ur20, vr20> {
    public final qr20 d;

    public rr20(qr20 qr20Var) {
        super(vr20.b.b);
        this.d = qr20Var;
    }

    @Override // xsna.dm50
    public final vr20 c(vr20 vr20Var, ur20 ur20Var) {
        vr20 vr20Var2 = vr20Var;
        ur20 ur20Var2 = ur20Var;
        if (ur20Var2 instanceof ur20.a.b) {
            return vr20.b.b;
        }
        if (ur20Var2 instanceof ur20.a.c) {
            return new vr20.a(((ur20.a.c) ur20Var2).b, true, false);
        }
        if (ur20Var2 instanceof ur20.a.d) {
            ur20.a.d dVar = (ur20.a.d) ur20Var2;
            return new vr20.a(dVar.b, false, dVar.c);
        }
        if (!ur20Var2.equals(ur20.a.C3816a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(vr20Var2 instanceof vr20.a)) {
            return vr20Var2;
        }
        vr20.a aVar = (vr20.a) vr20Var2;
        return new vr20.a(aVar.b, aVar.c, false);
    }

    @Override // xsna.dm50
    public final wr20 d() {
        return new wr20(e(new hs00(this, 6)));
    }

    @Override // xsna.dm50
    public final void h(vr20 vr20Var, wr20 wr20Var) {
        f(wr20Var.a, vr20Var);
    }
}
