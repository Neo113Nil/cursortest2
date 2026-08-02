package xsna;

import xsna.zbi0;

/* compiled from: SelectionController.kt */
/* loaded from: classes11.dex */
public final class mci0 implements ub30 {
    public long a = 0;
    public final /* synthetic */ gd70 b;
    public final /* synthetic */ mei0 c;
    public final /* synthetic */ long d;

    public mci0(gd70 gd70Var, mei0 mei0Var, long j) {
        this.b = gd70Var;
        this.c = mei0Var;
        this.d = j;
    }

    @Override // xsna.ub30
    public final void a() {
        this.c.c();
    }

    @Override // xsna.ub30
    public final boolean b(long j, zbi0 zbi0Var, int i) {
        tny tnyVar = (tny) this.b.invoke();
        if (tnyVar == null || !tnyVar.e()) {
            return false;
        }
        mei0 mei0Var = this.c;
        mei0Var.g(tnyVar, j, zbi0Var, false);
        this.a = j;
        return pei0.a(mei0Var, this.d);
    }

    @Override // xsna.ub30
    public final boolean c(long j) {
        tny tnyVar = (tny) this.b.invoke();
        if (tnyVar == null || !tnyVar.e()) {
            return false;
        }
        long j2 = this.a;
        vbi0 vbi0Var = zbi0.a.a;
        mei0 mei0Var = this.c;
        if (mei0Var.b(tnyVar, j, j2, vbi0Var, false)) {
            this.a = j;
        }
        return pei0.a(mei0Var, this.d);
    }

    @Override // xsna.ub30
    public final boolean d(long j, zbi0 zbi0Var) {
        tny tnyVar = (tny) this.b.invoke();
        if (tnyVar == null) {
            return true;
        }
        if (!tnyVar.e()) {
            return false;
        }
        mei0 mei0Var = this.c;
        if (!pei0.a(mei0Var, this.d)) {
            return false;
        }
        if (!mei0Var.b(tnyVar, j, this.a, zbi0Var, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // xsna.ub30
    public final boolean e(long j) {
        tny tnyVar = (tny) this.b.invoke();
        if (tnyVar == null) {
            return true;
        }
        if (!tnyVar.e()) {
            return false;
        }
        mei0 mei0Var = this.c;
        if (!pei0.a(mei0Var, this.d)) {
            return false;
        }
        if (!mei0Var.b(tnyVar, j, this.a, zbi0.a.a, false)) {
            return true;
        }
        this.a = j;
        return true;
    }
}
