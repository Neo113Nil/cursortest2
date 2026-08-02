package xsna;

import xsna.nqs;

/* compiled from: FriendsListAdapter.kt */
/* loaded from: classes15.dex */
public final class mqs<T, V extends nqs> extends vif0<nqs> {
    public final vif0<T> n;
    public final izs<V, T> o;

    /* JADX WARN: Multi-variable type inference failed */
    public mqs(vif0<T> vif0Var, izs<? super V, ? extends T> izsVar) {
        super(vif0Var.itemView);
        this.n = vif0Var;
        this.o = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(nqs nqsVar) {
        this.n.V5(this.o.invoke(nqsVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void j6(nqs nqsVar, Object obj) {
        this.n.W5(this.o.invoke(nqsVar), obj);
    }
}
