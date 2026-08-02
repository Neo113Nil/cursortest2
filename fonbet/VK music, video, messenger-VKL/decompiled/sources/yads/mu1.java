package yads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class mu1 implements dy2 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public mu1(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C.TIME_UNSET ? mc3.a(jArr2[jArr2.length - 1]) : j;
    }

    @Override // yads.dy2
    public final long a() {
        return -1L;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.c;
    }

    @Override // yads.dy2
    public final long a(long j) {
        return mc3.a(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        long j2 = this.c;
        int i = mc3.a;
        Pair a = a(mc3.b(Math.max(0L, Math.min(j, j2))), this.b, this.a);
        by2 by2Var = new by2(mc3.a(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new xx2(by2Var, by2Var);
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int b = mc3.b(jArr, j, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }
}
