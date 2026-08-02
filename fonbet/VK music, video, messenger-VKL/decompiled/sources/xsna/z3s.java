package xsna;

import xsna.lta;

/* compiled from: FollowersModeChangesApplier.kt */
/* loaded from: classes5.dex */
public final class z3s implements lta {
    public final pta a;
    public final b4s b;
    public final ouq0 c;

    public z3s(pta ptaVar, b4s b4sVar, ouq0 ouq0Var) {
        this.a = ptaVar;
        this.b = b4sVar;
        this.c = ouq0Var;
    }

    @Override // xsna.lta
    public final io.reactivex.rxjava3.core.x<lta.a> apply() {
        pta ptaVar = this.a;
        pta ptaVar2 = pta.this;
        if (ptaVar2.c.e != ptaVar2.b.e) {
            return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.completable.c0(new io.reactivex.rxjava3.internal.operators.observable.l0(ptaVar.c.e ? this.c.A() : io.reactivex.rxjava3.core.q.T(s3q0.a), new rx0(new gmj(this, 11), 23)), new y3s(), null), new wq(6), null);
        }
        return io.reactivex.rxjava3.core.x.k(lta.a.b.a);
    }
}
