package defpackage;

/* loaded from: classes5.dex */
public final class bgf implements mgf {
    public final rqo a;

    public bgf(rqo rqoVar) {
        this.a = rqoVar;
        agf.Companion.getClass();
        ((jbh) rqoVar).c(agf.j).a();
    }

    @Override // defpackage.mgf
    public final String a() {
        agf g = g();
        return d6z.Y(g, g.d);
    }

    @Override // defpackage.mgf
    public final String b() {
        return g().f;
    }

    @Override // defpackage.mgf
    public final String c() {
        agf g = g();
        return d6z.Y(g, g.e);
    }

    @Override // defpackage.mgf
    public final boolean d() {
        return g().h;
    }

    @Override // defpackage.mgf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.mgf
    public final boolean f() {
        return g().g;
    }

    public final agf g() {
        agf.Companion.getClass();
        return (agf) ((jbh) this.a).c(agf.j).b();
    }

    @Override // defpackage.mgf
    public final boolean isEnabled() {
        return g().b();
    }
}
