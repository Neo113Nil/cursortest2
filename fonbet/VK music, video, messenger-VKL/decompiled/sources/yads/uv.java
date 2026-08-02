package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class uv extends qx0 {
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;

    public uv(w73 w73Var, long j, long j2) {
        super(w73Var);
        boolean z = false;
        if (w73Var.a() != 1) {
            throw new vv(0);
        }
        v73 a = w73Var.a(0, new v73());
        long max = Math.max(0L, j);
        if (!a.m && max != 0 && !a.i) {
            throw new vv(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? a.o : Math.max(0L, j2);
        long j3 = a.o;
        long j4 = C.TIME_UNSET;
        if (j3 != C.TIME_UNSET) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                throw new vv(2);
            }
        }
        this.d = max;
        this.e = max2;
        this.f = max2 != C.TIME_UNSET ? max2 - max : j4;
        if (a.j && (max2 == C.TIME_UNSET || (j3 != C.TIME_UNSET && max2 == j3))) {
            z = true;
        }
        this.g = z;
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        this.c.a(0, t73Var, z);
        long j = t73Var.f - this.d;
        long j2 = this.f;
        long j3 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET) {
            j3 = j2 - j;
        }
        return t73Var.a(t73Var.b, t73Var.c, 0, j3, j, e6.h, false);
    }

    @Override // yads.qx0, yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        this.c.a(0, v73Var, 0L);
        long j2 = v73Var.r;
        long j3 = this.d;
        v73Var.r = j2 + j3;
        v73Var.o = this.f;
        v73Var.j = this.g;
        long j4 = v73Var.n;
        if (j4 != C.TIME_UNSET) {
            long max = Math.max(j4, j3);
            v73Var.n = max;
            long j5 = this.e;
            if (j5 != C.TIME_UNSET) {
                max = Math.min(max, j5);
            }
            v73Var.n = max - this.d;
        }
        long b = mc3.b(this.d);
        long j6 = v73Var.f;
        if (j6 != C.TIME_UNSET) {
            v73Var.f = j6 + b;
        }
        long j7 = v73Var.g;
        if (j7 != C.TIME_UNSET) {
            v73Var.g = j7 + b;
        }
        return v73Var;
    }
}
