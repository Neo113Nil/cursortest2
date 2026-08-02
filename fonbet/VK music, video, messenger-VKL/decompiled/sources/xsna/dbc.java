package xsna;

import java.util.List;

/* compiled from: Chip.kt */
/* loaded from: classes3.dex */
public final class dbc implements cp10 {
    public final /* synthetic */ azl a;
    public final /* synthetic */ wh50<pco> b;

    public dbc(azl azlVar, wh50<pco> wh50Var) {
        this.a = azlVar;
        this.b = wh50Var;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        if (!list.isEmpty()) {
            float j1 = this.a.j1(((zo10) j5g.Y(list)).N(j).b);
            wh50<pco> wh50Var = this.b;
            if (!pco.b(wh50Var.getValue().b, j1)) {
                wh50Var.setValue(new pco(j1));
            }
        }
        return ep10Var.Q(0, 0, jgp.b, new ci3(10));
    }
}
