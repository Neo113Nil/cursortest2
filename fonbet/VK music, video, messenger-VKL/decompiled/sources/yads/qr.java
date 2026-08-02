package yads;

/* loaded from: classes10.dex */
public final class qr implements o30 {
    public nr a;
    public final bv0 b = new bv0();
    public final yr c = yr.a;
    public o30 d;

    public final rr a() {
        o30 o30Var = this.d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 1, -1000);
    }

    public final nr b() {
        return this.a;
    }

    public final yr c() {
        return this.c;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        o30 o30Var = this.d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 0, 0);
    }

    public final rr a(p30 p30Var, int i, int i2) {
        nr nrVar = this.a;
        nrVar.getClass();
        pr prVar = p30Var == null ? null : new pr(nrVar);
        this.b.getClass();
        return new rr(nrVar, p30Var, new dv0(), prVar, this.c, i);
    }
}
