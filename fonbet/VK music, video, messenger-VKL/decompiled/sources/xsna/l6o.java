package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: DoubleExplicitBucketHistogramAggregator.java */
/* loaded from: classes8.dex */
public final class l6o implements pb1<v7v> {
    public final double[] a;
    public final boolean b;
    public final MemoryMode c;
    public final List<Double> d;
    public final epo e;

    /* compiled from: DoubleExplicitBucketHistogramAggregator.java */
    public static final class a extends sb1<v7v> {
        public final List<Double> e;
        public final double[] f;
        public final boolean g;
        public final Object h;
        public double i;
        public double j;
        public double k;
        public long l;
        public final long[] m;
        public final lg50 n;

        public a(List list, double[] dArr, boolean z, epo epoVar, MemoryMode memoryMode) {
            super(epoVar, true);
            this.h = new Object();
            this.e = list;
            this.f = dArr;
            this.g = z;
            int length = dArr.length + 1;
            this.m = new long[length];
            this.i = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.j = Double.MAX_VALUE;
            this.k = -1.0d;
            this.l = 0L;
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                this.n = new lg50(length);
            } else {
                this.n = null;
            }
        }

        @Override // xsna.sb1
        public final v7v b(long j, long j2, q94 q94Var, List list, boolean z) {
            boolean z2;
            boolean z3;
            v7v v7vVar;
            synchronized (this.h) {
                try {
                    lg50 lg50Var = this.n;
                    boolean z4 = false;
                    if (lg50Var == null) {
                        double d = this.i;
                        boolean z5 = this.g;
                        boolean z6 = z5 && this.l > 0;
                        double d2 = z5 ? this.j : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        boolean z7 = z5 && this.l > 0;
                        double d3 = z5 ? this.k : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        List<Double> list2 = this.e;
                        long[] jArr = this.m;
                        v7vVar = pow.p(j, j2, q94Var, d, z6, d2, z7, d3, list2, new hbd0(Arrays.copyOf(jArr, jArr.length)), list);
                    } else {
                        double d4 = this.i;
                        boolean z8 = this.g;
                        if (!z8 || this.l <= 0) {
                            z2 = z8;
                            z3 = false;
                        } else {
                            z2 = z8;
                            z3 = true;
                        }
                        double d5 = z2 ? this.j : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        if (z2 && this.l > 0) {
                            z4 = true;
                        }
                        lg50Var.p(j, j2, q94Var, d4, z3, d5, z4, z2 ? this.k : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, this.e, this.m, list);
                        v7vVar = lg50Var;
                    }
                    if (z) {
                        this.i = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        this.j = Double.MAX_VALUE;
                        this.k = -1.0d;
                        this.l = 0L;
                        Arrays.fill(this.m, 0L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return v7vVar;
        }

        @Override // xsna.sb1
        public final void d(double d) {
            int a = u9q.a(d, this.f);
            synchronized (this.h) {
                try {
                    this.i += d;
                    if (this.g) {
                        this.j = Math.min(this.j, d);
                        this.k = Math.max(this.k, d);
                    }
                    this.l++;
                    long[] jArr = this.m;
                    jArr[a] = jArr[a] + 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.sb1
        public final void g(long j, q94 q94Var, wmj wmjVar) {
            f(j, q94Var, wmjVar);
        }
    }

    public l6o(double[] dArr, boolean z, epo epoVar, MemoryMode memoryMode) {
        this.a = dArr;
        this.b = z;
        this.c = memoryMode;
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = epoVar;
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = oow.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.HISTOGRAM, new lm5(aggregationTemporality, arrayList));
    }

    @Override // xsna.pb1
    public final sb1<v7v> e() {
        return new a(this.d, this.a, this.b, this.e, this.c);
    }
}
