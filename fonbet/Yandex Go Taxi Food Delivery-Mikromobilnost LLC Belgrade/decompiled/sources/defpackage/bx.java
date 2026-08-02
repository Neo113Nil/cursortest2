package defpackage;

/* loaded from: classes.dex */
public final class bx implements ax, a3q0 {
    public final qeu a;

    @Override // defpackage.a3q0
    public void c(k1q0 k1q0Var) {
        boolean z = k1q0Var instanceof j1q0;
        qeu qeuVar = this.a;
        if (z) {
            j1q0 j1q0Var = (j1q0) k1q0Var;
            qeuVar.u(j1q0Var.a(), j1q0Var.b(), j1q0Var.c());
        } else if (!(k1q0Var instanceof i1q0)) {
            w511.b();
        } else {
            i1q0 i1q0Var = (i1q0) k1q0Var;
            qeuVar.p(i1q0Var.a(), i1q0Var.b(), i1q0Var.c(), i1q0Var.d());
        }
    }

    @Override // defpackage.ax
    public void j(jw jwVar) {
        boolean z = jwVar instanceof iw;
        qeu qeuVar = this.a;
        if (z) {
            iw iwVar = (iw) jwVar;
            qeuVar.x(iwVar.b(), iwVar.a());
        } else if (!(jwVar instanceof hw)) {
            w511.b();
        } else {
            hw hwVar = (hw) jwVar;
            qeuVar.f(hwVar.b(), hwVar.a(), hwVar.c());
        }
    }
}
