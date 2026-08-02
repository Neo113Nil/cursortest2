package defpackage;

/* loaded from: classes10.dex */
public final class okf0 implements xyl0 {
    public final int a;
    public final /* synthetic */ qkf0 b;

    public okf0(qkf0 qkf0Var, int i) {
        this.b = qkf0Var;
        this.a = i;
    }

    @Override // defpackage.xyl0
    public final void b() {
        int i = this.a;
        qkf0 qkf0Var = this.b;
        qkf0Var.N[i].v();
        qkf0Var.F.e(qkf0Var.w.getMinimumLoadableRetryCount(qkf0Var.Z));
    }

    @Override // defpackage.xyl0
    public final boolean isReady() {
        qkf0 qkf0Var = this.b;
        return !qkf0Var.E() && qkf0Var.N[this.a].t(qkf0Var.j0);
    }

    @Override // defpackage.xyl0
    public final int q(o7s o7sVar, nyg nygVar, int i) {
        qkf0 qkf0Var = this.b;
        if (qkf0Var.E()) {
            return -3;
        }
        int i2 = this.a;
        qkf0Var.x(i2);
        int y = qkf0Var.N[i2].y(o7sVar, nygVar, i, qkf0Var.j0);
        if (y == -3) {
            qkf0Var.y(i2);
        }
        return y;
    }

    @Override // defpackage.xyl0
    public final int r(long j) {
        qkf0 qkf0Var = this.b;
        if (qkf0Var.E()) {
            return 0;
        }
        int i = this.a;
        qkf0Var.x(i);
        uyl0 uyl0Var = qkf0Var.N[i];
        int r = uyl0Var.r(j, qkf0Var.j0);
        uyl0Var.D(r);
        if (r == 0) {
            qkf0Var.y(i);
        }
        return r;
    }
}
