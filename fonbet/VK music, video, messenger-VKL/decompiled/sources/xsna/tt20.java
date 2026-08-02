package xsna;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.n3i0;

/* compiled from: MlltSeeker.java */
/* loaded from: classes12.dex */
public final class tt20 implements i4i0 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public tt20(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C.TIME_UNSET ? y2r0.S(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int f = y2r0.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // xsna.i4i0
    public final long b() {
        return -1L;
    }

    @Override // xsna.i4i0
    public final int getAverageBitrate() {
        return -2147483647;
    }

    @Override // xsna.n3i0
    public final long getDurationUs() {
        return this.c;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        Pair<Long, Long> a = a(y2r0.j0(y2r0.k(j, 0L, this.c)), this.b, this.a);
        p3i0 p3i0Var = new p3i0(y2r0.S(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new n3i0.a(p3i0Var, p3i0Var);
    }

    @Override // xsna.i4i0
    public final long getTimeUs(long j) {
        return y2r0.S(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }
}
