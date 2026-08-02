package xsna;

/* compiled from: FirebaseSessions_Factory.java */
/* loaded from: classes.dex */
public final class rkr implements vhq<fkr> {
    public final o6x b;
    public final e9e0<cyi0> c;
    public final e9e0<kotlin.coroutines.d> d;
    public final e9e0<cui0> e;

    public rkr(o6x o6xVar, e9e0 e9e0Var, e9e0 e9e0Var2, e9e0 e9e0Var3) {
        this.b = o6xVar;
        this.c = e9e0Var;
        this.d = e9e0Var2;
        this.e = e9e0Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.e9e0
    public final Object get() {
        return new fkr((vhr) this.b.b, this.c.get(), this.d.get(), this.e.get());
    }
}
