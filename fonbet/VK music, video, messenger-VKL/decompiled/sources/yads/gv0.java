package yads;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class gv0 implements di3 {
    public final w5 a;
    public final i72 b;
    public final hv0 c;

    public gv0(w5 w5Var, i72 i72Var, b72 b72Var, Iterator it, z30 z30Var) {
        this.a = w5Var;
        this.b = i72Var;
        this.c = new hv0(w5Var, i72Var, b72Var, it, z30Var);
    }

    @Override // yads.di3
    public final void a() {
        this.a.a(v5.p);
        this.b.a();
        this.c.a();
    }

    @Override // yads.di3
    public final void b() {
        this.a.a(v5.p);
        this.b.a();
        this.c.e.a(y30.f);
    }

    @Override // yads.di3
    public final void c() {
    }
}
