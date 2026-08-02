package xsna;

import java.math.RoundingMode;
import xsna.n3i0;

/* compiled from: WavSeekMap.java */
/* loaded from: classes12.dex */
public final class hdx0 implements n3i0 {
    public final fdx0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public hdx0(fdx0 fdx0Var, int i, long j, long j2) {
        this.a = fdx0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / fdx0Var.c;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = y2r0.a;
        return y2r0.d0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.e;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        fdx0 fdx0Var = this.a;
        long j2 = this.d;
        long k = y2r0.k((fdx0Var.b * j) / (this.b * 1000000), 0L, j2 - 1);
        long j3 = this.c;
        long a = a(k);
        p3i0 p3i0Var = new p3i0(a, (fdx0Var.c * k) + j3);
        if (a >= j || k == j2 - 1) {
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        long j4 = k + 1;
        return new n3i0.a(p3i0Var, new p3i0(a(j4), (fdx0Var.c * j4) + j3));
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }
}
