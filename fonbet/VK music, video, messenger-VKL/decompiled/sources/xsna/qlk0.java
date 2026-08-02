package xsna;

import android.os.SystemClock;
import xsna.p06;

/* compiled from: SplitParallelSampleBandwidthEstimator.java */
/* loaded from: classes12.dex */
public final class qlk0 {
    public final q06 a;
    public final int b;
    public final long c;
    public final ypn0 d;
    public int f;
    public long g;
    public long h;
    public int k;
    public long l;
    public final p06.a.C3482a e = new p06.a.C3482a();
    public long i = Long.MIN_VALUE;
    public long j = Long.MIN_VALUE;

    /* compiled from: SplitParallelSampleBandwidthEstimator.java */
    public static class a {
        public int b;
        public long c;
        public q06 a = new d2k0();
        public final ypn0 d = dvf.a;
    }

    public qlk0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public final void a(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.j) {
                return;
            }
            this.j = j2;
            this.e.a(i, j, j2);
        }
    }

    public final void b() {
        fxc0.z(this.f > 0);
        this.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (int) (elapsedRealtime - this.g);
        if (j > 0) {
            q06 q06Var = this.a;
            q06Var.b(this.h, 1000 * j);
            int i = this.k + 1;
            this.k = i;
            if (i > this.b && this.l > this.c) {
                this.i = q06Var.a();
            }
            a((int) j, this.h, this.i);
            this.g = elapsedRealtime;
            this.h = 0L;
        }
        this.f--;
    }
}
