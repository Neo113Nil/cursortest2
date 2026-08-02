package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* loaded from: classes10.dex */
public final class o3c extends has {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public o3c(a9z0 a9z0Var, long j, long j2) {
        super(a9z0Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z = false;
        if (a9z0Var.i() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        z8z0 n = a9z0Var.n(0, new z8z0(), 0L);
        long max = Math.max(0L, j);
        if (!n.j && max != 0 && !n.g) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? n.l : Math.max(0L, j2);
        long j3 = n.l;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.c = max;
        this.d = max2;
        this.e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (n.h && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.has, defpackage.a9z0
    public final y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        this.b.g(0, y8z0Var, z);
        long j = y8z0Var.e - this.c;
        long j2 = this.e;
        y8z0Var.h(y8z0Var.a, y8z0Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, s60.c, false);
        return y8z0Var;
    }

    @Override // defpackage.has, defpackage.a9z0
    public final z8z0 n(int i, z8z0 z8z0Var, long j) {
        this.b.n(0, z8z0Var, 0L);
        long j2 = z8z0Var.o;
        long j3 = this.c;
        z8z0Var.o = j2 + j3;
        z8z0Var.l = this.e;
        z8z0Var.h = this.f;
        long j4 = z8z0Var.k;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            z8z0Var.k = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            z8z0Var.k = max - j3;
        }
        long l0 = tw21.l0(j3);
        long j6 = z8z0Var.d;
        if (j6 != -9223372036854775807L) {
            z8z0Var.d = j6 + l0;
        }
        long j7 = z8z0Var.e;
        if (j7 != -9223372036854775807L) {
            z8z0Var.e = j7 + l0;
        }
        return z8z0Var;
    }
}
