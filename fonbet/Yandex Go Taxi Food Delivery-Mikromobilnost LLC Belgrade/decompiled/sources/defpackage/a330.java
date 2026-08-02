package defpackage;

/* loaded from: classes10.dex */
public final class a330 extends s45 {
    public static final /* synthetic */ int d = 0;
    public final a850 a;
    public final u45 b;
    public final s45 c;

    static {
        new twn();
    }

    public a330(a850 a850Var, u45 u45Var, s45 s45Var) {
        this.a = a850Var;
        this.b = u45Var;
        this.c = s45Var;
    }

    @Override // defpackage.s45
    public final void a(int i) {
        this.c.a(i);
        this.a.i(this.b.getModalScreenName(), false);
    }

    @Override // defpackage.s45
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.s45
    public final void c() {
        this.c.c();
        this.a.d(this.b.getModalScreenName());
    }

    @Override // defpackage.s45
    public final void d() {
        this.c.d();
    }
}
