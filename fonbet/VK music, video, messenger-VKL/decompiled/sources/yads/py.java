package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class py implements do1, qk0 {
    public final Object a;
    public co1 b;
    public pk0 c;
    public final /* synthetic */ ry d;

    public py(ry ryVar, Object obj) {
        this.d = ryVar;
        this.b = ryVar.b((zn1) null);
        this.c = ryVar.a((zn1) null);
        this.a = obj;
    }

    public final in1 a(in1 in1Var) {
        ry ryVar = this.d;
        long j = in1Var.f;
        ryVar.getClass();
        ry ryVar2 = this.d;
        long j2 = in1Var.g;
        ryVar2.getClass();
        return (j == in1Var.f && j2 == in1Var.g) ? in1Var : new in1(in1Var.a, in1Var.b, in1Var.c, in1Var.d, in1Var.e, j, j2);
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.a(a(in1Var));
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
        zn1 zn1Var2;
        int i2;
        if (zn1Var != null) {
            zn1Var2 = this.d.a(this.a, zn1Var);
            if (zn1Var2 == null) {
                return false;
            }
        } else {
            zn1Var2 = null;
        }
        zn1 zn1Var3 = zn1Var2;
        this.d.getClass();
        co1 co1Var = this.b;
        if (co1Var.a == i && mc3.a(co1Var.b, zn1Var3)) {
            i2 = i;
        } else {
            i2 = i;
            this.b = new co1(this.d.c.c, i2, zn1Var3, 0L);
        }
        pk0 pk0Var = this.c;
        if (pk0Var.a == i2 && mc3.a(pk0Var.b, zn1Var3)) {
            return true;
        }
        this.c = new pk0(this.d.d.c, i2, zn1Var3);
        return true;
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
            this.b.a(wg1Var, a(in1Var));
        }
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var) {
        if (e(i, zn1Var)) {
            this.c.a();
        }
    }

    @Override // yads.do1
    public final void b(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.c(wg1Var, a(in1Var));
        }
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, int i2) {
        if (e(i, zn1Var)) {
            this.c.a(i2);
        }
    }

    @Override // yads.qk0
    public final void a(int i, zn1 zn1Var, Exception exc) {
        if (e(i, zn1Var)) {
            this.c.a(exc);
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.b(wg1Var, a(in1Var));
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, wg1 wg1Var, in1 in1Var, IOException iOException, boolean z) {
        if (e(i, zn1Var)) {
            this.b.a(wg1Var, a(in1Var), iOException, z);
        }
    }

    @Override // yads.do1
    public final void a(int i, zn1 zn1Var, in1 in1Var) {
        if (e(i, zn1Var)) {
            this.b.b(a(in1Var));
        }
    }
}
