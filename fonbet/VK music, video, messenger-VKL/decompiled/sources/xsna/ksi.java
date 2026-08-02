package xsna;

import xsna.cxs;
import xsna.hox;
import xsna.ijg0;
import xsna.j11;

/* compiled from: CompositeAdListener.kt */
/* loaded from: classes6.dex */
public abstract class ksi implements hox.d, ijg0.a {
    @Override // xsna.hox.d
    public final void a() {
        o();
    }

    @Override // xsna.ijg0.a
    public final void b() {
        m();
    }

    @Override // xsna.hox.d
    public final void c(iaz0 iaz0Var) {
        j11.b bVar = new j11.b(iaz0Var.a, iaz0Var.b);
        cxs.a aVar = ((fq50) this).a.a;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    @Override // xsna.ijg0.a
    public final void d() {
        o();
    }

    @Override // xsna.ijg0.a
    public final void e(iaz0 iaz0Var) {
        j11.b bVar = new j11.b(iaz0Var.a, iaz0Var.b);
        cxs.a aVar = ((fq50) this).a.a;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    @Override // xsna.hox.d
    public final void g() {
        cxs.a aVar = ((fq50) this).a.a;
        if (aVar != null) {
            aVar.c(new j11.b(1309, "Failed to show ad"));
        }
    }

    @Override // xsna.ijg0.a
    public final void h(ijg0 ijg0Var) {
        eq50 eq50Var = ((fq50) this).a;
        cxs.a aVar = eq50Var.a;
        if (aVar != null) {
            aVar.e(eq50Var);
        }
    }

    @Override // xsna.ijg0.a
    public final void i() {
        cxs.a aVar = ((fq50) this).a.a;
        if (aVar != null) {
            aVar.c(new j11.b(1309, "Failed to show ad"));
        }
    }

    @Override // xsna.ijg0.a
    public final void j() {
        n();
    }

    @Override // xsna.hox.d
    public final void k(hox hoxVar) {
        eq50 eq50Var = ((fq50) this).a;
        cxs.a aVar = eq50Var.a;
        if (aVar != null) {
            aVar.e(eq50Var);
        }
    }

    @Override // xsna.ijg0.a
    public final void l(fvr fvrVar) {
        cxs.a aVar = ((fq50) this).a.a;
        if (aVar != null) {
            aVar.onCompleted();
        }
    }

    public abstract void m();

    public abstract void n();

    public abstract void o();

    @Override // xsna.hox.d
    public final void onClick() {
        m();
    }

    @Override // xsna.hox.d
    public final void onDismiss() {
        n();
    }

    @Override // xsna.hox.d
    public final void f() {
    }
}
