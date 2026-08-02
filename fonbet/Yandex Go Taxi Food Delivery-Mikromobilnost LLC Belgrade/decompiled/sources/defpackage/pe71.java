package defpackage;

/* loaded from: classes7.dex */
public final class pe71 implements dg81 {
    public final dg81 a;
    public boolean b;
    public final /* synthetic */ oh71 c;

    public pe71(oh71 oh71Var, dg81 dg81Var) {
        this.c = oh71Var;
        this.a = dg81Var;
    }

    @Override // defpackage.dg81
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        oh71 oh71Var = this.c;
        if (oh71Var.w != -9223372036854775807L) {
            return -3;
        }
        if (this.b) {
            yh81Var.a = 4;
            return -4;
        }
        int b = this.a.b(og81Var, yh81Var, i);
        if (b != -5) {
            long j = oh71Var.y;
            if (j == Long.MIN_VALUE || ((b != -4 || yh81Var.x < j) && !(b == -3 && oh71Var.g() == Long.MIN_VALUE && !yh81Var.w))) {
                return b;
            }
            yh81Var.e();
            yh81Var.a = 4;
            this.b = true;
            return -4;
        }
        qd81 qd81Var = og81Var.b;
        qd81Var.getClass();
        int i2 = qd81Var.V;
        int i3 = qd81Var.U;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (oh71Var.x != 0) {
            i3 = 0;
        }
        if (oh71Var.y != Long.MIN_VALUE) {
            i2 = 0;
        }
        da81 da81Var = new da81(qd81Var);
        da81Var.A = i3;
        da81Var.B = i2;
        og81Var.b = new qd81(da81Var);
        return -5;
    }

    @Override // defpackage.dg81
    public final boolean c() {
        return this.c.w == -9223372036854775807L && this.a.c();
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        if (this.c.w != -9223372036854775807L) {
            return -3;
        }
        return this.a.d(j);
    }
}
