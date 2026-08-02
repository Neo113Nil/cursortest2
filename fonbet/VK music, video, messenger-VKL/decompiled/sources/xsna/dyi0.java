package xsna;

/* compiled from: SessionsSettings_Factory.java */
/* loaded from: classes.dex */
public final class dyi0 implements vhq<cyi0> {
    public final e9e0<i3j0> b;
    public final e9e0<i3j0> c;

    public dyi0(e9e0<i3j0> e9e0Var, e9e0<i3j0> e9e0Var2) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new cyi0(this.b.get(), this.c.get());
    }
}
