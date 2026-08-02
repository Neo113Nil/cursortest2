package xsna;

/* compiled from: ClipsScrollBehaviorAdapter.kt */
/* loaded from: classes17.dex */
public final class p2f {
    public final q8e a;
    public final i1e b;
    public final androidx.recyclerview.widget.o0 c;
    public final z3o0 d;
    public final ekf0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public p2f(q8e q8eVar, i1e i1eVar, e4o0 e4o0Var, z3o0 z3o0Var, ekf0 ekf0Var) {
        this.a = q8eVar;
        this.b = i1eVar;
        this.c = (androidx.recyclerview.widget.o0) e4o0Var;
        this.d = z3o0Var;
        this.e = ekf0Var;
        e4o0Var.c(new sz(this, 24));
        e4o0Var.b().attachToRecyclerView(q8eVar);
        q8eVar.addOnScrollListener(ekf0Var);
    }
}
