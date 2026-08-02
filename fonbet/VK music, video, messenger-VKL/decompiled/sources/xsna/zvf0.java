package xsna;

/* compiled from: RemoteSettingsFetcher_Factory.java */
/* loaded from: classes.dex */
public final class zvf0 implements vhq<yvf0> {
    public final e9e0<ad3> b;
    public final e9e0<kotlin.coroutines.d> c;

    public zvf0(e9e0<ad3> e9e0Var, e9e0<kotlin.coroutines.d> e9e0Var2) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new yvf0(this.b.get(), this.c.get());
    }
}
