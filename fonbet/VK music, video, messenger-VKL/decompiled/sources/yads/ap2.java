package yads;

/* loaded from: classes10.dex */
public final class ap2 implements og3 {
    public final /* synthetic */ bp2 a;

    public ap2(bp2 bp2Var) {
        this.a = bp2Var;
    }

    @Override // yads.og3
    public final void a() {
    }

    @Override // yads.og3
    public final void c() {
        zg3 zg3Var = this.a.c;
        if (!zg3Var.d) {
            zg3Var.d = true;
            zg3Var.b.a();
            zg3Var.c.post(new yg3(zg3Var));
        }
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.c();
        }
    }

    @Override // yads.og3
    public final void d() {
        this.a.c.a();
        this.a.a.a((og3) null);
        ig3 ig3Var = this.a.e;
        if (ig3Var != null) {
            ig3Var.b();
        }
    }

    @Override // yads.og3
    public final void e() {
        this.a.c.a();
        this.a.a.a((og3) null);
    }

    @Override // yads.og3
    public final void h() {
        this.a.a.c();
    }

    @Override // yads.og3
    public final void a(ng3 ng3Var) {
        this.a.c.a();
        this.a.a.a((og3) null);
        this.a.a.e();
    }

    @Override // yads.og3
    public final void b() {
    }

    @Override // yads.og3
    public final void f() {
    }

    @Override // yads.og3
    public final void i() {
    }

    @Override // yads.og3
    public final void onVolumeChanged(float f) {
    }
}
