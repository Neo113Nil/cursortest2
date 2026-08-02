package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.util.concurrent.TimeoutException;

/* compiled from: TimestampAdjuster.java */
/* loaded from: classes12.dex */
public final class txo0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal<Long> d = new ThreadLocal<>();

    public txo0(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!e()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                String str = y2r0.a;
                long d0 = y2r0.d0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + d0) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - d0) < Math.abs(j5 - d0) ? j4 : j5;
            }
            long j6 = j;
            String str2 = y2r0.a;
            return a(y2r0.d0(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                String str = y2r0.a;
                long d0 = y2r0.d0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = d0 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= d0 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = y2r0.a;
            return a(y2r0.d0(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public final synchronized boolean e() {
        return this.b != C.TIME_UNSET;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = C.TIME_UNSET;
    }

    public final synchronized void g(long j, boolean z) throws InterruptedException, TimeoutException {
        try {
            fxc0.z(this.a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
