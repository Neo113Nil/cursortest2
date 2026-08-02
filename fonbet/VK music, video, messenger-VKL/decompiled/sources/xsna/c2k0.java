package xsna;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: SlidingPercentileBandwidthStatistic.java */
/* loaded from: classes12.dex */
public final class c2k0 implements q06 {
    public final int a;
    public final double b;
    public final ArrayDeque<a> c;
    public final TreeSet<a> d;
    public double e;
    public long f;

    /* compiled from: SlidingPercentileBandwidthStatistic.java */
    public static class a implements Comparable<a> {
        public final long b;
        public final double c;

        public a(long j, double d) {
            this.b = j;
            this.c = d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.b, aVar.b);
        }
    }

    public c2k0(double d) {
        fxc0.p(d >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && d <= 1.0d);
        this.a = 10;
        this.b = d;
        this.c = new ArrayDeque<>();
        this.d = new TreeSet<>();
        this.f = Long.MIN_VALUE;
    }

    @Override // xsna.q06
    public final long a() {
        return this.f;
    }

    @Override // xsna.q06
    public final void b(long j, long j2) {
        ArrayDeque<a> arrayDeque;
        TreeSet<a> treeSet;
        long j3;
        while (true) {
            arrayDeque = this.c;
            int size = arrayDeque.size();
            int i = this.a;
            treeSet = this.d;
            if (size < i) {
                break;
            }
            a remove = arrayDeque.remove();
            treeSet.remove(remove);
            this.e -= remove.c;
        }
        double sqrt = Math.sqrt(j);
        a aVar = new a((j * 8000000) / j2, sqrt);
        arrayDeque.add(aVar);
        treeSet.add(aVar);
        this.e += sqrt;
        if (!arrayDeque.isEmpty()) {
            double d = this.e * this.b;
            Iterator<a> it = treeSet.iterator();
            double d2 = 0.0d;
            double d3 = 0.0d;
            long j4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    j3 = j4;
                    break;
                }
                a next = it.next();
                double d4 = next.c;
                long j5 = next.b;
                double d5 = d4 / 2.0d;
                double d6 = d2 + d5;
                if (d6 < d) {
                    d3 = d6;
                    d2 = d5 + d6;
                    j4 = j5;
                } else if (j4 == 0) {
                    j3 = j5;
                } else {
                    j3 = ((long) (((d - d3) * (j5 - j4)) / (d6 - d3))) + j4;
                }
            }
        } else {
            j3 = Long.MIN_VALUE;
        }
        this.f = j3;
    }

    @Override // xsna.q06
    public final void reset() {
        this.c.clear();
        this.d.clear();
        this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.f = Long.MIN_VALUE;
    }
}
