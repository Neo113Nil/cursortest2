package xsna;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public abstract class zb6<T> implements v5j {
    public final k6j<T> a;

    public zb6(k6j<T> k6jVar) {
        this.a = k6jVar;
    }

    @Override // xsna.v5j
    public final nb9 b(p6j p6jVar) {
        return rsr.i(new yb6(this, null));
    }

    @Override // xsna.v5j
    public final boolean c(fxx0 fxx0Var) {
        return a(fxx0Var) && e(this.a.a());
    }

    public abstract int d();

    public abstract boolean e(T t);
}
