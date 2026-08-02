package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import yads.zm0;

/* loaded from: classes7.dex */
public abstract class gy61 implements i071 {
    public final int b;
    public v581 d;
    public int e;
    public wl61 f;
    public int g;
    public dg81 h;
    public qd81[] i;
    public long j;
    public boolean l;
    public boolean m;
    public final og81 c = new og81();
    public long k = Long.MIN_VALUE;

    public gy61(int i) {
        this.b = i;
    }

    public static int b(int i) {
        return i & 64;
    }

    public final int a(og81 og81Var, yh81 yh81Var, int i) {
        dg81 dg81Var = this.h;
        dg81Var.getClass();
        int b = dg81Var.b(og81Var, yh81Var, i);
        if (b == -4) {
            if (yh81Var.c(4)) {
                this.k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j = yh81Var.x + this.j;
            yh81Var.x = j;
            this.k = Math.max(this.k, j);
            return b;
        }
        if (b == -5) {
            qd81 qd81Var = og81Var.b;
            qd81Var.getClass();
            long j2 = qd81Var.I;
            if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                da81 da81Var = new da81(qd81Var);
                da81Var.o = j2 + this.j;
                og81Var.b = new qd81(da81Var);
            }
        }
        return b;
    }

    public abstract int a(qd81 qd81Var);

    public abstract void a(long j, long j2);

    public abstract void a(long j, boolean z);

    public abstract void a(qd81[] qd81VarArr, long j, long j2);

    public abstract String c();

    public final boolean d() {
        return this.k == Long.MIN_VALUE;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public int k() {
        return 0;
    }

    public lf81 b() {
        return null;
    }

    @Override // defpackage.i071
    public void a(int i, Object obj) {
    }

    public static int a(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public void a(boolean z) {
    }

    public static int a(int i) {
        return i & 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zm0 a(Exception exc, qd81 qd81Var, boolean z, int i) {
        int i2;
        if (qd81Var != null && !this.m) {
            this.m = true;
            try {
                i2 = a(qd81Var) & 7;
            } catch (zm0 unused) {
            } finally {
                this.m = false;
            }
            return new zm0(1, exc, null, i, c(), this.e, qd81Var, qd81Var != null ? 4 : i2, z);
        }
        i2 = 4;
        return new zm0(1, exc, null, i, c(), this.e, qd81Var, qd81Var != null ? 4 : i2, z);
    }

    public void a(float f, float f2) {
    }
}
