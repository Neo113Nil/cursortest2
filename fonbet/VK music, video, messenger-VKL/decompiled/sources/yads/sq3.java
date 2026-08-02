package yads;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class sq3 implements dy2 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public sq3(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // yads.dy2
    public final long a() {
        return this.e;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        if (!b()) {
            by2 by2Var = new by2(0L, this.a + this.b);
            return new xx2(by2Var, by2Var);
        }
        long j2 = this.c;
        int i = mc3.a;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / this.c;
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d3 = jArr[i2];
                d2 = d3 + (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d - i2));
            }
        }
        by2 by2Var2 = new by2(max, this.a + Math.max(this.b, Math.min(Math.round((d2 / 256.0d) * this.d), this.d - 1)));
        return new xx2(by2Var2, by2Var2);
    }

    @Override // yads.zx2
    public final long c() {
        return this.c;
    }

    @Override // yads.dy2
    public final long a(long j) {
        long j2 = j - this.a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        if (jArr == null) {
            throw new IllegalStateException();
        }
        double d = (j2 * 256.0d) / this.d;
        int b = mc3.b(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (b * j3) / 100;
        long j5 = jArr[b];
        int i = b + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (b == 99 ? 256L : jArr[i]) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // yads.zx2
    public final boolean b() {
        return this.f != null;
    }
}
