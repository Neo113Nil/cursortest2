package xsna;

import androidx.annotation.Nullable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.n3i0;

/* compiled from: XingSeeker.java */
/* loaded from: classes12.dex */
public final class h4y0 implements i4i0 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;

    @Nullable
    public final long[] g;

    public h4y0(long j, int i, long j2, int i2, long j3, @Nullable long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // xsna.i4i0
    public final long b() {
        return this.f;
    }

    @Override // xsna.i4i0
    public final int getAverageBitrate() {
        return this.d;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.c;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        double d;
        double d2;
        boolean isSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!isSeekable) {
            p3i0 p3i0Var = new p3i0(0L, j2 + i);
            return new n3i0.a(p3i0Var, p3i0Var);
        }
        long k = y2r0.k(j, 0L, this.c);
        double d3 = (k * 100.0d) / this.c;
        double d4 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (d3 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.e;
        p3i0 p3i0Var2 = new p3i0(k, j2 + y2r0.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new n3i0.a(p3i0Var2, p3i0Var2);
    }

    @Override // xsna.i4i0
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int f = y2r0.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (f * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (f == 99 ? 256L : jArr[i]) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return this.g != null;
    }
}
