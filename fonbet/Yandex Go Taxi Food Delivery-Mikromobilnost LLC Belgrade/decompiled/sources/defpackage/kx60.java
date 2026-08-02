package defpackage;

/* loaded from: classes.dex */
public final class kx60 extends l750 {
    public final mx60 d;
    public boolean e;

    public kx60(mx60 mx60Var, nx60 nx60Var) {
        super(nx60Var, mx60Var.b);
        this.d = mx60Var;
        this.e = true;
    }

    @Override // defpackage.l750
    public final void b() {
        this.d.c();
    }

    @Override // defpackage.l750
    public final void c() {
        this.d.d();
    }

    @Override // defpackage.l750
    public final void d(i750 i750Var) {
        this.d.e(new je4(i750Var));
    }

    @Override // defpackage.l750
    public final void e(i750 i750Var) {
        this.d.f(new je4(i750Var));
    }

    public final void h(boolean z) {
        this.e = z;
        g(z && this.d.b);
    }
}
