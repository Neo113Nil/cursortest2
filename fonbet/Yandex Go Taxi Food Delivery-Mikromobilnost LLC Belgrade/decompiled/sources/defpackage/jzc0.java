package defpackage;

/* loaded from: classes10.dex */
public final class jzc0 extends has {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public jzc0(a9z0 a9z0Var) {
        super(a9z0Var);
        this.d = new z8z0();
    }

    @Override // defpackage.has, defpackage.a9z0
    public y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        switch (this.c) {
            case 0:
                a9z0 a9z0Var = this.b;
                y8z0 g = a9z0Var.g(i, y8z0Var, z);
                if (a9z0Var.n(g.c, (z8z0) this.d, 0L).b()) {
                    g.h(y8z0Var.a, y8z0Var.b, y8z0Var.c, y8z0Var.d, y8z0Var.e, s60.c, true);
                } else {
                    g.f = true;
                }
                return g;
            default:
                return super.g(i, y8z0Var, z);
        }
    }

    @Override // defpackage.has, defpackage.a9z0
    public z8z0 n(int i, z8z0 z8z0Var, long j) {
        switch (this.c) {
            case 1:
                super.n(i, z8z0Var, j);
                fe10 fe10Var = (fe10) this.d;
                z8z0Var.b = fe10Var;
                zd10 zd10Var = fe10Var.b;
                return z8z0Var;
            default:
                return super.n(i, z8z0Var, j);
        }
    }

    public jzc0(a9z0 a9z0Var, fe10 fe10Var) {
        super(a9z0Var);
        this.d = fe10Var;
    }
}
