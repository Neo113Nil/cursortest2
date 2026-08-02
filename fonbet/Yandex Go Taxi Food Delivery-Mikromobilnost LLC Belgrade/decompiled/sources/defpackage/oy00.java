package defpackage;

/* loaded from: classes10.dex */
public final class oy00 implements xe10, we10 {
    public final sf10 a;
    public final long b;
    public final au1 c;
    public uf10 w;
    public xe10 x;
    public we10 y;
    public long z = -9223372036854775807L;

    public oy00(sf10 sf10Var, au1 au1Var, long j) {
        this.a = sf10Var;
        this.c = au1Var;
        this.b = j;
    }

    public final void a(sf10 sf10Var) {
        long j = this.z;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        uf10 uf10Var = this.w;
        uf10Var.getClass();
        xe10 createPeriod = uf10Var.createPeriod(sf10Var, this.c, j);
        this.x = createPeriod;
        if (this.y != null) {
            createPeriod.l(this, j);
        }
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.c(j, g7q0Var);
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.e(j);
    }

    @Override // defpackage.xe10
    public final long f() {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.f();
    }

    @Override // defpackage.urq0
    public final long g() {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.g();
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.getTrackGroups();
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        xe10Var.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.i();
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        xe10 xe10Var = this.x;
        return xe10Var != null && xe10Var.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        xe10 xe10Var = this.x;
        if (xe10Var != null) {
            xe10Var.j();
            return;
        }
        uf10 uf10Var = this.w;
        if (uf10Var != null) {
            uf10Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        long j2 = this.z;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.z = -9223372036854775807L;
        xe10 xe10Var = this.x;
        int i = tw21.a;
        return xe10Var.k(looVarArr, zArr, xyl0VarArr, zArr2, j);
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.y = we10Var;
        xe10 xe10Var = this.x;
        if (xe10Var != null) {
            long j2 = this.z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            xe10Var.l(this, j2);
        }
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        xe10 xe10Var = this.x;
        return xe10Var != null && xe10Var.n(xzyVar);
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        we10 we10Var = this.y;
        int i = tw21.a;
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.we10
    public final void onPrepared(xe10 xe10Var) {
        we10 we10Var = this.y;
        int i = tw21.a;
        we10Var.onPrepared(this);
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        xe10 xe10Var = this.x;
        int i = tw21.a;
        xe10Var.s(j, z);
    }
}
