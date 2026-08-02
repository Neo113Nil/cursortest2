package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: BitrateCounter.java */
/* loaded from: classes8.dex */
public final class nd7 {
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public long c = 0;
    public final AtomicReference<Double> d = new AtomicReference<>(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    public final long a = 2000;

    /* compiled from: BitrateCounter.java */
    public static class a {
        public long a;
        public long b;
    }

    public final synchronized void a(long j, long j2) {
        if (this.a <= 0) {
            return;
        }
        if (this.b.isEmpty() || this.b.getLast().a <= j) {
            ArrayDeque<a> arrayDeque = this.b;
            a aVar = new a();
            aVar.a = j;
            aVar.b = j2;
            arrayDeque.addLast(aVar);
            this.c += j2;
            long j3 = this.a;
            if (j > j3) {
                long j4 = j - j3;
                while (this.b.getFirst().a < j4) {
                    this.c -= this.b.pop().b;
                }
            }
            this.d.set(Double.valueOf(((this.c * 8.0d) * 1000.0d) / this.a));
        }
    }
}
