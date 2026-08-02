package defpackage;

/* loaded from: classes10.dex */
public final class p6z0 implements xe10, we10 {
    public final xe10 a;
    public final long b;
    public we10 c;

    public p6z0(xe10 xe10Var, long j) {
        this.a = xe10Var;
        this.b = j;
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        long j2 = this.b;
        return this.a.c(j - j2, g7q0Var) + j2;
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        long j2 = this.b;
        return this.a.e(j - j2) + j2;
    }

    @Override // defpackage.xe10
    public final long f() {
        long f = this.a.f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.b;
    }

    @Override // defpackage.urq0
    public final long g() {
        long g = this.a.g();
        if (g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return g + this.b;
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.a.h(j - this.b);
    }

    @Override // defpackage.urq0
    public final long i() {
        long i = this.a.i();
        if (i == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return i + this.b;
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        xyl0[] xyl0VarArr2 = new xyl0[xyl0VarArr.length];
        int i = 0;
        while (true) {
            xyl0 xyl0Var = null;
            if (i >= xyl0VarArr.length) {
                break;
            }
            o6z0 o6z0Var = (o6z0) xyl0VarArr[i];
            if (o6z0Var != null) {
                xyl0Var = o6z0Var.a;
            }
            xyl0VarArr2[i] = xyl0Var;
            i++;
        }
        xe10 xe10Var = this.a;
        long j2 = this.b;
        long k = xe10Var.k(looVarArr, zArr, xyl0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < xyl0VarArr.length; i2++) {
            xyl0 xyl0Var2 = xyl0VarArr2[i2];
            if (xyl0Var2 == null) {
                xyl0VarArr[i2] = null;
            } else {
                xyl0 xyl0Var3 = xyl0VarArr[i2];
                if (xyl0Var3 == null || ((o6z0) xyl0Var3).a != xyl0Var2) {
                    xyl0VarArr[i2] = new o6z0(xyl0Var2, j2);
                }
            }
        }
        return k + j2;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.c = we10Var;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        wzy wzyVar = new wzy();
        long j = xzyVar.a;
        wzyVar.b = xzyVar.b;
        wzyVar.c = xzyVar.c;
        wzyVar.a = j - this.b;
        return this.a.n(new xzy(wzyVar));
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        we10 we10Var = this.c;
        we10Var.getClass();
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.we10
    public final void onPrepared(xe10 xe10Var) {
        we10 we10Var = this.c;
        we10Var.getClass();
        we10Var.onPrepared(this);
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }
}
