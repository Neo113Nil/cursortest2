package xsna;

import xsna.zbi0;

/* compiled from: SelectionController.kt */
/* loaded from: classes11.dex */
public final class lci0 implements zdo0 {
    public long a = 0;
    public long b = 0;
    public zbi0 c = zbi0.a.a;
    public final /* synthetic */ gd70 d;
    public final /* synthetic */ mei0 e;
    public final /* synthetic */ long f;

    public lci0(gd70 gd70Var, mei0 mei0Var, long j) {
        this.d = gd70Var;
        this.e = mei0Var;
        this.f = j;
    }

    @Override // xsna.zdo0
    public final void c(long j, zbi0 zbi0Var) {
        this.c = zbi0Var;
        tny tnyVar = (tny) this.d.invoke();
        mei0 mei0Var = this.e;
        if (tnyVar != null) {
            if (!tnyVar.e()) {
                return;
            }
            mei0Var.g(tnyVar, j, this.c, true);
            this.a = j;
        }
        if (pei0.a(mei0Var, this.f)) {
            this.b = 0L;
        }
    }

    @Override // xsna.zdo0
    public final void d(long j) {
        tny tnyVar = (tny) this.d.invoke();
        if (tnyVar == null || !tnyVar.e()) {
            return;
        }
        mei0 mei0Var = this.e;
        if (pei0.a(mei0Var, this.f)) {
            long f = ov70.f(this.b, j);
            this.b = f;
            long f2 = ov70.f(this.a, f);
            if (mei0Var.b(tnyVar, f2, this.a, this.c, true)) {
                this.a = f2;
                this.b = 0L;
            }
        }
    }

    @Override // xsna.zdo0
    public final void onCancel() {
        long j = this.f;
        mei0 mei0Var = this.e;
        if (pei0.a(mei0Var, j)) {
            mei0Var.c();
        }
    }

    @Override // xsna.zdo0
    public final void onStop() {
        long j = this.f;
        mei0 mei0Var = this.e;
        if (pei0.a(mei0Var, j)) {
            mei0Var.c();
        }
    }

    @Override // xsna.zdo0
    public final void a() {
    }

    @Override // xsna.zdo0
    public final void b() {
    }
}
