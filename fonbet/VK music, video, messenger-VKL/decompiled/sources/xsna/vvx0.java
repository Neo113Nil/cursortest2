package xsna;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes.dex */
public final class vvx0 implements xhq<uvx0> {
    public final e9e0<Executor> b;
    public final e9e0<n0q> c;
    public final l8h0 d;
    public final e9e0<uon0> e;

    public vvx0(e9e0 e9e0Var, e9e0 e9e0Var2, l8h0 l8h0Var, e9e0 e9e0Var3) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
        this.d = l8h0Var;
        this.e = e9e0Var3;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new uvx0(this.b.get(), this.c.get(), (dxx0) this.d.get(), this.e.get());
    }
}
