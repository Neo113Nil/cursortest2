package defpackage;

import yads.kv;

/* loaded from: classes7.dex */
public final class al71 extends cn81 {
    public final long w;
    public final long x;
    public final long y;
    public final boolean z;

    public al71(yn81 yn81Var, long j, long j2) {
        super(yn81Var);
        boolean z = false;
        if (yn81Var.a() != 1) {
            throw new kv(0);
        }
        uk81 a = yn81Var.a(0, new uk81(), 0L);
        long max = Math.max(0L, j);
        if (!a.D && max != 0 && !a.z) {
            throw new kv(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? a.F : Math.max(0L, j2);
        long j3 = a.F;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                throw new kv(2);
            }
        }
        this.w = max;
        this.x = max2;
        this.y = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (a.A && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z = true;
        }
        this.z = z;
    }

    @Override // defpackage.yn81
    public final uk81 a(int i, uk81 uk81Var, long j) {
        this.a.a(0, uk81Var, 0L);
        long j2 = uk81Var.I;
        long j3 = this.w;
        uk81Var.I = j2 + j3;
        uk81Var.F = this.y;
        uk81Var.A = this.z;
        long j4 = uk81Var.E;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            uk81Var.E = max;
            long j5 = this.x;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            uk81Var.E = max - j3;
        }
        long u = rf71.u(j3);
        long j6 = uk81Var.w;
        if (j6 != -9223372036854775807L) {
            uk81Var.w = j6 + u;
        }
        long j7 = uk81Var.x;
        if (j7 != -9223372036854775807L) {
            uk81Var.x = j7 + u;
        }
        return uk81Var;
    }

    @Override // defpackage.yn81
    public final ie81 a(int i, ie81 ie81Var, boolean z) {
        this.a.a(0, ie81Var, z);
        long j = ie81Var.x - this.w;
        long j2 = this.y;
        ie81Var.d(ie81Var.a, ie81Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, uu71.y, false);
        return ie81Var;
    }
}
