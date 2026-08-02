package xsna;

/* compiled from: SessionGenerator_Factory.java */
/* loaded from: classes.dex */
public final class tti0 implements vhq<sti0> {
    public final e9e0<zuo0> b;
    public final e9e0<e4r0> c;

    public tti0(e9e0<zuo0> e9e0Var, e9e0<e4r0> e9e0Var2) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new sti0(this.b.get(), this.c.get());
    }
}
