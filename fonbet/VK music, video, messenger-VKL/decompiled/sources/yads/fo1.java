package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class fo1 implements do1, qk0 {
    public final ho1 a;
    public co1 b;
    public pk0 c;
    public final /* synthetic */ jo1 d;

    public fo1(jo1 jo1Var, ho1 ho1Var) {
        this.d = jo1Var;
        this.b = jo1Var.f;
        this.c = jo1Var.g;
        this.a = ho1Var;
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var) {
        if (e(i, zn1Var)) {
            this.c.a();
        }
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.a(in1Var);
        }
    }

    @Override // yads.qk0
    public final void c(int i, zn1 zn1Var) {
        if (e(i, zn1Var)) {
            this.c.c();
        }
    }

    @Override // yads.qk0
    public final void d(int i, zn1 zn1Var) {
        if (e(i, zn1Var)) {
            this.c.b();
        }
    }

    public final boolean e(int i, zn1 zn1Var) {
        zn1 zn1Var2 = null;
        if (zn1Var != null) {
            ho1 ho1Var = this.a;
            int i2 = 0;
            while (true) {
                if (i2 >= ho1Var.c.size()) {
                    break;
                }
                if (((zn1) ho1Var.c.get(i2)).d == zn1Var.d) {
                    zn1Var2 = zn1Var.a(e.a(ho1Var.b, zn1Var.a));
                    break;
                }
                i2++;
            }
            if (zn1Var2 == null) {
                return false;
            }
        }
        zn1 zn1Var3 = zn1Var2;
        int i3 = i + this.a.d;
        co1 co1Var = this.b;
        if (co1Var.a != i3 || !mc3.a(co1Var.b, zn1Var3)) {
            this.b = new co1(this.d.f.c, i3, zn1Var3, 0L);
        }
        pk0 pk0Var = this.c;
        if (pk0Var.a == i3 && mc3.a(pk0Var.b, zn1Var3)) {
            return true;
        }
        this.c = new pk0(this.d.g.c, i3, zn1Var3);
        return true;
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, int i2) {
        if (e(i, zn1Var)) {
            this.c.a(i2);
        }
    }

    @Override // yads.qk0
    public final void b(int i, zn1 zn1Var) {
        if (e(i, zn1Var)) {
            this.c.d();
        }
    }

    @Override // yads.do1
    public final void c(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.a(wg1Var, in1Var);
        }
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, Exception exc) {
        if (e(i, zn1Var)) {
            this.c.a(exc);
        }
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.c(wg1Var, in1Var);
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.b(wg1Var, in1Var);
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var, IOException iOException, boolean z) {
        if (e(i, zn1Var)) {
            this.b.a(wg1Var, in1Var, iOException, z);
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.b(in1Var);
        }
    }
}
