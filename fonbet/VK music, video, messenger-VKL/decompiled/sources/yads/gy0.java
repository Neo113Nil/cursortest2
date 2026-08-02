package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class gy0 extends i11 {
    public final j22 A;
    public final ey0 B;
    public cy0 C;
    public cy0 D;
    public ry0 E;
    public final hy0 y;
    public final my0 z;

    public /* synthetic */ gy0(Context context, d4 d4Var, ov2 ov2Var, hy0 hy0Var, w5 w5Var, my0 my0Var, j22 j22Var) {
        this(context, d4Var, ov2Var, hy0Var, w5Var, my0Var, j22Var, new ey0(ov2Var));
    }

    public abstract cy0 a(dy0 dy0Var);

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.y.a(l4Var);
    }

    @Override // yads.zn
    public final void i() {
        this.y.a(h9.h);
    }

    @Override // yads.zn
    public final void j() {
        ry0 ry0Var = this.E;
        if (ry0Var != null) {
            this.y.a(ry0Var);
        } else {
            this.y.a(h9.b);
        }
    }

    public gy0(Context context, d4 d4Var, ov2 ov2Var, hy0 hy0Var, w5 w5Var, my0 my0Var, j22 j22Var, ey0 ey0Var) {
        super(context, d4Var, ov2Var, w5Var);
        this.y = hy0Var;
        this.z = my0Var;
        this.A = j22Var;
        this.B = ey0Var;
        a(ma.a.a());
    }

    @Override // yads.vq2
    public void a(v9 v9Var) {
        dy0 yw2Var;
        synchronized (this) {
            this.b.a(v5.s);
            this.v = v9Var;
        }
        this.A.d = v9Var;
        ey0 ey0Var = this.B;
        ey0Var.getClass();
        ir1 ir1Var = v9Var.q;
        if (ir1Var != null) {
            yw2Var = new gq1(v9Var, ir1Var);
        } else {
            yw2Var = new yw2(ey0Var.a);
        }
        cy0 a = a(yw2Var);
        this.D = this.C;
        this.C = a;
        this.E = this.z.a(v9Var, this.c, a);
        Context a2 = j1.a();
        if (a2 == null) {
            a2 = this.a;
        }
        a.a(a2, v9Var);
    }
}
