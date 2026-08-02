package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class lgg extends a9z0 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final egg i;
    public final fe10 j;
    public final yd10 k;

    public lgg(long j, long j2, long j3, int i, long j4, long j5, long j6, egg eggVar, fe10 fe10Var, yd10 yd10Var) {
        d6z.x(eggVar.dynamic == (yd10Var != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = eggVar;
        this.j = fe10Var;
        this.k = yd10Var;
    }

    @Override // defpackage.a9z0
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < this.i.getPeriodCount()) {
            return intValue;
        }
        return -1;
    }

    @Override // defpackage.a9z0
    public final y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        egg eggVar = this.i;
        d6z.s(i, eggVar.getPeriodCount());
        String str = z ? eggVar.getPeriod(i).a : null;
        Integer valueOf = z ? Integer.valueOf(this.e + i) : null;
        long periodDurationUs = eggVar.getPeriodDurationUs(i);
        long W = tw21.W(eggVar.getPeriod(i).b - eggVar.getPeriod(0).b) - this.f;
        y8z0Var.getClass();
        y8z0Var.h(str, valueOf, 0, periodDurationUs, W, s60.c, false);
        return y8z0Var;
    }

    @Override // defpackage.a9z0
    public final int i() {
        return this.i.getPeriodCount();
    }

    @Override // defpackage.a9z0
    public final Object m(int i) {
        d6z.s(i, this.i.getPeriodCount());
        return Integer.valueOf(this.e + i);
    }

    @Override // defpackage.a9z0
    public final z8z0 n(int i, z8z0 z8z0Var, long j) {
        boolean z;
        long j2;
        long j3;
        long j4;
        pgg b;
        d6z.s(i, 1);
        egg eggVar = this.i;
        boolean z2 = eggVar.dynamic;
        long j5 = this.h;
        if (z2 && eggVar.minUpdatePeriodMs != -9223372036854775807L && eggVar.durationMs == -9223372036854775807L) {
            long j6 = 0;
            if (j > 0) {
                j5 += j;
                if (j5 > this.g) {
                    z = true;
                    j3 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    Object obj = z8z0.p;
                    z8z0Var.c(this.j, eggVar, this.b, this.c, this.d, true, (eggVar.dynamic || eggVar.minUpdatePeriodMs == j2 || eggVar.durationMs != j2) ? false : z, this.k, j3, this.g, eggVar.getPeriodCount() - 1, this.f);
                    return z8z0Var;
                }
            }
            long j7 = this.f + j5;
            long periodDurationUs = eggVar.getPeriodDurationUs(0);
            int i2 = 0;
            while (i2 < eggVar.getPeriodCount() - 1 && j7 >= periodDurationUs) {
                j7 -= periodDurationUs;
                i2++;
                periodDurationUs = eggVar.getPeriodDurationUs(i2);
            }
            pxa0 period = eggVar.getPeriod(i2);
            List list = period.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j4 = j6;
                    i3 = -1;
                    break;
                }
                j4 = j6;
                if (((a70) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j6 = j4;
            }
            if (i3 != -1 && (b = ((s4j0) ((a70) period.c.get(i3)).c.get(0)).b()) != null && b.x(periodDurationUs) != j4) {
                j5 = (b.f(b.t(j7, periodDurationUs)) + j5) - j7;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        j3 = j5;
        Object obj2 = z8z0.p;
        z8z0Var.c(this.j, eggVar, this.b, this.c, this.d, true, (eggVar.dynamic || eggVar.minUpdatePeriodMs == j2 || eggVar.durationMs != j2) ? false : z, this.k, j3, this.g, eggVar.getPeriodCount() - 1, this.f);
        return z8z0Var;
    }

    @Override // defpackage.a9z0
    public final int p() {
        return 1;
    }
}
