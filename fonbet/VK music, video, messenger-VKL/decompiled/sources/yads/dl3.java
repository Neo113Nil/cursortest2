package yads;

import android.view.View;
import java.util.List;

/* loaded from: classes10.dex */
public final class dl3 implements cl3 {
    public final cl3 a;
    public boolean b;
    public boolean c;

    public dl3(uy uyVar) {
        this.a = uyVar;
    }

    @Override // yads.cl3
    public final void a(View view, List list) {
        this.a.a(view, list);
        this.b = false;
        this.c = false;
    }

    @Override // yads.cl3
    public final void b() {
        this.a.b();
        k();
    }

    @Override // yads.cl3
    public final void c() {
        this.a.c();
    }

    @Override // yads.cl3
    public final void d() {
        this.a.d();
    }

    @Override // yads.cl3
    public final void f() {
        this.a.f();
    }

    @Override // yads.cl3
    public final void g() {
        this.a.g();
        k();
    }

    @Override // yads.cl3
    public final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.h();
    }

    @Override // yads.cl3
    public final void i() {
        this.a.i();
    }

    @Override // yads.cl3
    public final void j() {
        this.a.j();
    }

    @Override // yads.cl3
    public final void k() {
        this.a.k();
        this.b = false;
        this.c = false;
    }

    @Override // yads.cl3
    public final void l() {
        this.a.l();
    }

    @Override // yads.cl3
    public final void m() {
        this.a.m();
        h();
        n();
    }

    @Override // yads.cl3
    public final void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.n();
    }

    @Override // yads.cl3
    public final void a(ng3 ng3Var) {
        this.a.a(ng3Var);
        k();
    }

    @Override // yads.cl3
    public final void a(bl3 bl3Var) {
        this.a.a(bl3Var);
    }

    @Override // yads.cl3
    public final void a(float f, long j) {
        this.a.a(f, j);
    }

    @Override // yads.cl3
    public final void a() {
        this.a.a();
    }

    @Override // yads.cl3
    public final void a(float f) {
        this.a.a(f);
    }
}
