package xsna;

/* compiled from: ActivityResultRegistry.kt */
/* loaded from: classes11.dex */
public final class rh00<I, O> extends hb0<I> {
    public final ib0<I> a;
    public final wh50 b;

    public rh00(ib0 ib0Var, wh50 wh50Var) {
        this.a = ib0Var;
        this.b = wh50Var;
    }

    @Override // xsna.hb0
    public final void a(Object obj) {
        nb0 nb0Var = this.a.a;
        if (nb0Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        nb0Var.a(obj);
    }
}
