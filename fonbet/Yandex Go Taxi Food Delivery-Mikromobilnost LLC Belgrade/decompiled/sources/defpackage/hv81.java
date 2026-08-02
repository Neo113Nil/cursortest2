package defpackage;

import android.view.View;
import yads.wh3;

/* loaded from: classes7.dex */
public final class hv81 implements ps81 {
    public final te71 a;
    public boolean b;
    public boolean c;

    public hv81(te71 te71Var) {
        this.a = te71Var;
    }

    @Override // defpackage.ps81
    public final void a(String str) {
        this.a.a(str);
        h();
        q();
    }

    @Override // defpackage.ps81
    public final void b() {
        this.a.b();
        n();
    }

    @Override // defpackage.ps81
    public final void c(wh3 wh3Var) {
        this.a.c(wh3Var);
    }

    @Override // defpackage.ps81
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.ps81
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.ps81
    public final void g() {
        this.a.g();
        n();
    }

    @Override // defpackage.ps81
    public final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.h();
    }

    @Override // defpackage.ps81
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.ps81
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.ps81
    public final void l(float f) {
        this.a.l(f);
    }

    @Override // defpackage.ps81
    public final void n() {
        this.a.n();
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.ps81
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.ps81
    public final void p() {
        this.a.p();
        h();
        q();
    }

    @Override // defpackage.ps81
    public final void q() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.q();
    }

    @Override // defpackage.ps81
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.ps81
    public final void d(float f, long j) {
        this.a.d(f, j);
    }

    @Override // defpackage.ps81
    public final void b(cf71 cf71Var) {
        this.a.b(cf71Var);
        n();
    }

    @Override // defpackage.ps81
    public final void a(View view) {
        this.a.a(view);
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.ps81
    public final void a() {
        this.a.a();
    }
}
