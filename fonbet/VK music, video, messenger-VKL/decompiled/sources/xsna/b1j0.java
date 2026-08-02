package xsna;

/* compiled from: SettingsCache_Factory.java */
/* loaded from: classes.dex */
public final class b1j0 implements vhq<x0j0> {
    public final e9e0<fvk<uyc0>> b;

    public b1j0(e9e0<fvk<uyc0>> e9e0Var) {
        this.b = e9e0Var;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new x0j0(this.b.get());
    }
}
