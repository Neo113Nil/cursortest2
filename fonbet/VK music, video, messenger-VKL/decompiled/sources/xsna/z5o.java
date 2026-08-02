package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: DoubleBase2ExponentialHistogramAggregator.java */
/* loaded from: classes8.dex */
public final class z5o implements pb1<paq> {
    public final epo a;
    public final MemoryMode b;

    /* compiled from: DoubleBase2ExponentialHistogramAggregator.java */
    public static final class a extends sb1<paq> {
        public final int e;
        public final int f;
        public final boolean g;
        public a6o h;
        public a6o i;
        public long j;
        public double k;
        public double l;
        public double m;
        public long n;
        public int o;
        public final MemoryMode p;
        public final jg50 q;

        public a(epo epoVar, MemoryMode memoryMode) {
            super(epoVar, true);
            jg50 jg50Var;
            this.e = 160;
            this.f = 20;
            this.g = true;
            this.k = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.j = 0L;
            this.l = Double.MAX_VALUE;
            this.m = -1.0d;
            this.n = 0L;
            this.o = 20;
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                jg50Var = new jg50();
                jg50Var.c = jk3.e;
                jg50Var.l = tfp.a(0);
                jg50Var.m = tfp.a(0);
                jg50Var.n = Collections.EMPTY_LIST;
            } else {
                jg50Var = null;
            }
            this.q = jg50Var;
            this.p = memoryMode;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0019, B:12:0x0029, B:14:0x0032, B:18:0x003f, B:19:0x0046, B:21:0x00d7, B:30:0x0074, B:32:0x0083, B:36:0x008e, B:38:0x0096, B:42:0x00a5, B:43:0x00aa), top: B:3:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
        @Override // xsna.sb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final paq b(long j, long j2, q94 q94Var, List list, boolean z) {
            boolean z2;
            paq paqVar;
            synchronized (this) {
                try {
                    jg50 jg50Var = this.q;
                    if (jg50Var == null) {
                        int i = this.o;
                        double d = this.k;
                        long j3 = this.j;
                        boolean z3 = this.g;
                        boolean z4 = z3 && this.n > 0;
                        double d2 = z3 ? this.l : 0.0d;
                        boolean z5 = z3 && this.n > 0;
                        double d3 = z3 ? this.m : 0.0d;
                        naq h = h(this.h, i, z, null);
                        naq h2 = h(this.i, this.o, z, null);
                        paqVar = new jm5(j, j2, q94Var, i, d, h2.getTotalCount() + h.getTotalCount() + j3, j3, z4, d2, z5, d3, h, h2, list);
                    } else {
                        int i2 = this.o;
                        double d4 = this.k;
                        long j4 = this.j;
                        boolean z6 = this.g;
                        boolean z7 = z6 && this.n > 0;
                        double d5 = z6 ? this.l : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        if (z6 && this.n > 0) {
                            z2 = true;
                            jg50Var.p(i2, d4, j4, z7, d5, z2, !z6 ? this.m : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, h(this.h, i2, z, jg50Var.l), h(this.i, this.o, z, this.q.m), j, j2, q94Var, list);
                            paqVar = jg50Var;
                        }
                        z2 = false;
                        jg50Var.p(i2, d4, j4, z7, d5, z2, !z6 ? this.m : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, h(this.h, i2, z, jg50Var.l), h(this.i, this.o, z, this.q.m), j, j2, q94Var, list);
                        paqVar = jg50Var;
                    }
                    if (z) {
                        this.k = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        this.j = 0L;
                        this.l = Double.MAX_VALUE;
                        this.m = -1.0d;
                        this.n = 0L;
                        this.o = this.f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return paqVar;
        }

        @Override // xsna.sb1
        public final synchronized void d(double d) {
            a6o a6oVar;
            try {
                if (Double.isFinite(d)) {
                    this.k += d;
                    if (this.g) {
                        this.l = Math.min(this.l, d);
                        this.m = Math.max(this.m, d);
                    }
                    this.n++;
                    int compare = Double.compare(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                    if (compare == 0) {
                        this.j++;
                        return;
                    }
                    if (compare > 0) {
                        if (this.h == null) {
                            this.h = new a6o(this.o, this.e, this.p);
                        }
                        a6oVar = this.h;
                    } else {
                        if (this.i == null) {
                            this.i = new a6o(this.o, this.e, this.p);
                        }
                        a6oVar = this.i;
                    }
                    if (!a6oVar.b(d)) {
                        long a = a6oVar.d.a(d);
                        long min = Math.min(a, a6oVar.b.b);
                        long max = Math.max(a, a6oVar.b.a);
                        int i = 0;
                        while ((max - min) + 1 > a6oVar.b.d.b()) {
                            min >>= 1;
                            max >>= 1;
                            i++;
                        }
                        a6o a6oVar2 = this.h;
                        if (a6oVar2 != null) {
                            a6oVar2.a(i);
                            this.o = this.h.c;
                        }
                        a6o a6oVar3 = this.i;
                        if (a6oVar3 != null) {
                            a6oVar3.a(i);
                            this.o = this.i.c;
                        }
                        a6oVar.b(d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // xsna.sb1
        public final void g(long j, q94 q94Var, wmj wmjVar) {
            f(j, q94Var, wmjVar);
        }

        public final naq h(a6o a6oVar, int i, boolean z, naq naqVar) {
            naq naqVar2;
            if (a6oVar == null) {
                return tfp.a(i);
            }
            if (naqVar == null) {
                naqVar2 = new a6o(a6oVar);
            } else {
                ig50 ig50Var = naqVar instanceof ig50 ? (ig50) naqVar : new ig50();
                oqo oqoVar = ig50Var.d;
                bk0 bk0Var = a6oVar.b;
                if (bk0Var.c == Integer.MIN_VALUE) {
                    oqoVar.d(0);
                } else {
                    int i2 = (bk0Var.a - bk0Var.b) + 1;
                    if (oqoVar.d != i2) {
                        oqoVar.d(i2);
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
                        bk0 bk0Var2 = a6oVar.b;
                        oqoVar.setLong(i3, bk0Var2.b(bk0Var2.b + i3));
                    }
                }
                int i4 = a6oVar.c;
                int offset = a6oVar.getOffset();
                long j = a6oVar.e;
                ig50Var.a = i4;
                ig50Var.b = offset;
                ig50Var.c = j;
                ig50Var.d = oqoVar;
                naqVar2 = ig50Var;
            }
            if (z) {
                a6oVar.e = 0L;
                int i5 = this.f;
                a6oVar.c = i5;
                a6oVar.d = i46.b(i5);
                a6oVar.b.a();
            }
            return naqVar2;
        }
    }

    public z5o(epo epoVar, MemoryMode memoryMode) {
        this.a = epoVar;
        this.b = memoryMode;
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = jow.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.EXPONENTIAL_HISTOGRAM, new im5(aggregationTemporality, arrayList));
    }

    @Override // xsna.pb1
    public final sb1<paq> e() {
        return new a(this.a, this.b);
    }
}
