package defpackage;

import android.view.View;

/* loaded from: classes7.dex */
public class l881 implements i281 {
    public final ia71 a;

    public l881(ia71 ia71Var) {
        this.a = ia71Var;
    }

    @Override // defpackage.i281
    public final boolean a(Object obj) {
        ia71 ia71Var = this.a;
        View d = ia71Var.d();
        return d != null && ia71Var.c(d, obj);
    }

    @Override // defpackage.i281
    public final boolean b() {
        return this.a.d() != null;
    }

    @Override // defpackage.i281
    public final void c(Object obj) {
        ia71 ia71Var = this.a;
        View d = ia71Var.d();
        if (d == null) {
            return;
        }
        ia71Var.e(d, obj);
        d.setVisibility(0);
    }

    @Override // defpackage.i281
    public final boolean d() {
        return sj71.b(this.a.d()) >= 100;
    }

    @Override // defpackage.i281
    public final boolean e() {
        return this.a.f();
    }

    public final void b(Object obj) {
        c(obj);
    }

    @Override // defpackage.i281
    public final iv81 c() {
        View d = this.a.d();
        if (d != null) {
            return new iv81(d);
        }
        return null;
    }

    @Override // defpackage.i281
    public final void a(uy71 uy71Var, pj71 pj71Var) {
        this.a.b(uy71Var, pj71Var, uy71Var.c);
    }

    @Override // defpackage.i281
    public final void a() {
        ia71 ia71Var = this.a;
        View d = ia71Var.d();
        if (d == null) {
            return;
        }
        ia71Var.a(d);
    }
}
