package xsna;

import xsna.n3i0;
import xsna.tnr;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes12.dex */
public final class snr implements n3i0 {
    public final tnr a;
    public final long b;

    public snr(tnr tnrVar, long j) {
        this.a = tnrVar;
        this.b = j;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.a.b();
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        tnr tnrVar = this.a;
        tnrVar.k.getClass();
        tnr.a aVar = tnrVar.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int f = y2r0.f(jArr, y2r0.k((tnrVar.e * j) / 1000000, 0L, tnrVar.j - 1), false);
        long j2 = f == -1 ? 0L : jArr[f];
        long j3 = f != -1 ? jArr2[f] : 0L;
        int i = tnrVar.e;
        long j4 = (j2 * 1000000) / i;
        long j5 = this.b;
        p3i0 p3i0Var = new p3i0(j4, j3 + j5);
        if (j4 == j || f == jArr.length - 1) {
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        int i2 = f + 1;
        return new n3i0.a(p3i0Var, new p3i0((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }
}
