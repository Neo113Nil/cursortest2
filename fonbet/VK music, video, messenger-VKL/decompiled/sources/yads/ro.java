package yads;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public abstract class ro implements bg2 {
    public final int b;
    public no2 d;
    public int e;
    public zf2 f;
    public int g;
    public ot2 h;
    public nx0[] i;
    public long j;
    public boolean l;
    public boolean m;
    public final ox0 c = new ox0();
    public long k = Long.MIN_VALUE;

    public ro(int i) {
        this.b = i;
    }

    public static int a(int i) {
        return i & 128;
    }

    public static int b(int i) {
        return i & 64;
    }

    public abstract int a(nx0 nx0Var);

    public abstract void a(long j, long j2);

    public abstract void a(long j, boolean z);

    public abstract void a(nx0[] nx0VarArr, long j, long j2);

    public al1 c() {
        return null;
    }

    public abstract String d();

    public final boolean e() {
        return this.k == Long.MIN_VALUE;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    public int l() {
        return 0;
    }

    public static int a(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public final ro b() {
        return this;
    }

    public /* bridge */ /* synthetic */ void a(float f, float f2) {
    }

    public void a(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qn0 a(int i, nx0 nx0Var, Exception exc, boolean z) {
        int i2;
        if (nx0Var != null && !this.m) {
            this.m = true;
            try {
                i2 = a(nx0Var) & 7;
            } catch (qn0 unused) {
            } finally {
                this.m = false;
            }
            String d = d();
            int i3 = this.e;
            int i4 = nx0Var != null ? 4 : i2;
            return new qn0(qn0.a(1, null, d, i3, nx0Var, i4), exc, i, 1, d, i3, nx0Var, i4, null, SystemClock.elapsedRealtime(), z);
        }
        i2 = 4;
        String d2 = d();
        int i32 = this.e;
        if (nx0Var != null) {
        }
        return new qn0(qn0.a(1, null, d2, i32, nx0Var, i4), exc, i, 1, d2, i32, nx0Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public final void a(int i, zf2 zf2Var) {
        this.e = i;
        this.f = zf2Var;
    }

    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        ot2 ot2Var = this.h;
        ot2Var.getClass();
        int a = ot2Var.a(ox0Var, sa0Var, i);
        if (a == -4) {
            if (sa0Var.b(4)) {
                this.k = Long.MIN_VALUE;
                return this.l ? -4 : -3;
            }
            long j = sa0Var.f + this.j;
            sa0Var.f = j;
            this.k = Math.max(this.k, j);
            return a;
        }
        if (a == -5) {
            nx0 nx0Var = ox0Var.b;
            nx0Var.getClass();
            if (nx0Var.q != Long.MAX_VALUE) {
                mx0 mx0Var = new mx0(nx0Var);
                mx0Var.o = nx0Var.q + this.j;
                ox0Var.b = new nx0(mx0Var);
            }
        }
        return a;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // yads.bg2
    public void handleMessage(int i, Object obj) {
    }
}
