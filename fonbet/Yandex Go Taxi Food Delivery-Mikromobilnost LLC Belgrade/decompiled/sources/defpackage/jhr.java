package defpackage;

/* loaded from: classes12.dex */
public abstract class jhr extends h55 {
    public final yvf0 D;
    public pys E;

    public jhr(yvf0 yvf0Var) {
        super(null);
        this.D = yvf0Var;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        this.E = null;
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        Object obj2 = this.D.get();
        this.E = (pys) obj2;
        D((m950) obj2, Q(obj), new dl1(17, this));
    }

    public final void P(cgl0 cgl0Var) {
        fkr fkrVar;
        pys pysVar = this.E;
        if (pysVar == null || (fkrVar = pysVar.F) == null) {
            return;
        }
        fkrVar.T(cgl0Var);
    }

    public abstract rhr Q(Object obj);
}
