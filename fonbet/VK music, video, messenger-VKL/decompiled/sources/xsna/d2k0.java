package xsna;

import android.os.SystemClock;
import java.util.ArrayDeque;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: SlidingWeightedAverageBandwidthStatistic.java */
/* loaded from: classes12.dex */
public final class d2k0 implements q06 {
    public final ArrayDeque<a> a;
    public final ryt0 b;
    public final ypn0 c;
    public double d;
    public double e;

    /* compiled from: SlidingWeightedAverageBandwidthStatistic.java */
    public static class a {
        public final long a;
        public final double b;

        public a(long j, double d) {
            this.a = j;
            this.b = d;
        }
    }

    public d2k0() {
        ryt0 ryt0Var = new ryt0();
        this.a = new ArrayDeque<>();
        this.b = ryt0Var;
        this.c = dvf.a;
    }

    @Override // xsna.q06
    public final long a() {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.d / this.e);
    }

    @Override // xsna.q06
    public final void b(long j, long j2) {
        while (true) {
            this.b.getClass();
            ArrayDeque<a> arrayDeque = this.a;
            if (arrayDeque.size() < 10) {
                double sqrt = Math.sqrt(j);
                long j3 = (j * 8000000) / j2;
                this.c.getClass();
                SystemClock.elapsedRealtime();
                arrayDeque.add(new a(j3, sqrt));
                this.d = (j3 * sqrt) + this.d;
                this.e += sqrt;
                return;
            }
            a remove = arrayDeque.remove();
            double d = this.d;
            double d2 = remove.a;
            double d3 = remove.b;
            this.d = d - (d2 * d3);
            this.e -= d3;
        }
    }

    @Override // xsna.q06
    public final void reset() {
        this.a.clear();
        this.d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }
}
