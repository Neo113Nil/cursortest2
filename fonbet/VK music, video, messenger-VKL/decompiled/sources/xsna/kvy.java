package xsna;

/* compiled from: LazyListNestedScrollConnection.kt */
/* loaded from: classes7.dex */
public final class kvy implements d160 {
    public final xvy b;
    public final d160 c;

    public kvy(xvy xvyVar, j160 j160Var) {
        this.b = xvyVar;
        this.c = j160Var;
    }

    @Override // xsna.d160
    public final Object M(long j, spj<? super jmr0> spjVar) {
        xvy xvyVar = this.b;
        int h = xvyVar.h();
        d160 d160Var = this.c;
        return (h == 0 && xvyVar.i() == 0 && jmr0.c(j) < -100.0f) ? d160Var.M(m200.b(jmr0.b(j), -jmr0.c(j)), spjVar) : d160Var.M(j, spjVar);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        return this.c.R0(i, j);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        return this.c.W0(i, j, j2);
    }

    @Override // xsna.d160
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        return this.c.m0(j, j2, spjVar);
    }
}
