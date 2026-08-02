package xsna;

import xsna.n3i0;

/* compiled from: VbriSeeker.java */
/* loaded from: classes12.dex */
public final class kkr0 implements i4i0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public kkr0(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // xsna.i4i0
    public final long b() {
        return this.d;
    }

    @Override // xsna.i4i0
    public final int getAverageBitrate() {
        return this.e;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.c;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        long[] jArr = this.a;
        int f = y2r0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        p3i0 p3i0Var = new p3i0(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int i = f + 1;
        return new n3i0.a(p3i0Var, new p3i0(jArr[i], jArr2[i]));
    }

    @Override // xsna.i4i0
    public final long getTimeUs(long j) {
        return this.a[y2r0.f(this.b, j, true)];
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }
}
