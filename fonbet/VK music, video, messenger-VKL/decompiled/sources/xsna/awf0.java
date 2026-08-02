package xsna;

/* compiled from: RemoteSettings_Factory.java */
/* loaded from: classes.dex */
public final class awf0 implements vhq<wvf0> {
    public final e9e0<kotlin.coroutines.d> b;
    public final e9e0<uir> c;
    public final e9e0<ad3> d;
    public final e9e0<v5k> e;
    public final e9e0<x0j0> f;

    public awf0(e9e0<kotlin.coroutines.d> e9e0Var, e9e0<uir> e9e0Var2, e9e0<ad3> e9e0Var3, e9e0<v5k> e9e0Var4, e9e0<x0j0> e9e0Var5) {
        this.b = e9e0Var;
        this.c = e9e0Var2;
        this.d = e9e0Var3;
        this.e = e9e0Var4;
        this.f = e9e0Var5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsna.zpy] */
    @Override // xsna.e9e0
    public final Object get() {
        kotlin.coroutines.d dVar = this.b.get();
        uir uirVar = this.c.get();
        ad3 ad3Var = this.d.get();
        v5k v5kVar = this.e.get();
        e9e0<x0j0> e9e0Var = this.f;
        return new wvf0(dVar, uirVar, ad3Var, v5kVar, e9e0Var instanceof zpy ? (zpy) e9e0Var : new b6o(e9e0Var));
    }
}
