package defpackage;

/* loaded from: classes12.dex */
public final class hgf implements mgf {
    public final rqo a;

    public hgf(rqo rqoVar) {
        this.a = rqoVar;
        ggf.Companion.getClass();
        ((jbh) rqoVar).c(ggf.l).a();
    }

    @Override // defpackage.mgf
    public final String a() {
        ggf g = g();
        return d6z.Y(g, g.d);
    }

    @Override // defpackage.mgf
    public final String b() {
        return g().f;
    }

    @Override // defpackage.mgf
    public final String c() {
        ggf g = g();
        return d6z.Y(g, g.e);
    }

    @Override // defpackage.mgf
    public final boolean d() {
        return g().h;
    }

    @Override // defpackage.mgf
    public final boolean e() {
        return g().i;
    }

    @Override // defpackage.mgf
    public final boolean f() {
        return g().g;
    }

    public final ggf g() {
        ggf.Companion.getClass();
        return (ggf) ((jbh) this.a).c(ggf.l).b();
    }

    @Override // defpackage.mgf
    public final boolean isEnabled() {
        return g().b();
    }
}
