package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class pj81 implements gk71 {
    public final gk71 a;
    public final tu71 b;

    public pj81(gk71 gk71Var, tu71 tu71Var) {
        this.a = gk71Var;
        this.b = tu71Var;
    }

    @Override // defpackage.gk71
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.gk71
    public final qd81 b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.gk71
    public final boolean c(int i, long j) {
        return this.a.c(i, j);
    }

    @Override // defpackage.gk71
    public final qd81 d() {
        return this.a.d();
    }

    @Override // defpackage.gk71
    public final int e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj81)) {
            return false;
        }
        pj81 pj81Var = (pj81) obj;
        return this.a.equals(pj81Var.a) && this.b.equals(pj81Var.b);
    }

    @Override // defpackage.gk71
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.gk71
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.gk71
    public final Object h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.gk71
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.gk71
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.gk71
    public final int k(qd81 qd81Var) {
        return this.a.k(qd81Var);
    }

    @Override // defpackage.gk71
    public final void l(float f) {
        this.a.l(f);
    }

    @Override // defpackage.gk71
    public final int m(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.gk71
    public final boolean n(long j, lg81 lg81Var, List list) {
        return this.a.n(j, lg81Var, list);
    }

    @Override // defpackage.gk71
    public final void o(long j, long j2, long j3, List list, gc81[] gc81VarArr) {
        this.a.o(j, j2, j3, list, gc81VarArr);
    }

    @Override // defpackage.gk71
    public final int p(long j, List list) {
        return this.a.p(j, list);
    }

    @Override // defpackage.gk71
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override // defpackage.gk71
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // defpackage.gk71
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.gk71
    public final tu71 c() {
        return this.b;
    }

    @Override // defpackage.gk71
    public final int e() {
        return this.a.e();
    }
}
