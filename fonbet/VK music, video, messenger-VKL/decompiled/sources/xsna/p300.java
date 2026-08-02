package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LongLastValueAggregator.java */
/* loaded from: classes8.dex */
public final class p300 implements pb1<v300> {
    public final epo a;
    public final MemoryMode b;

    /* compiled from: LongLastValueAggregator.java */
    public static final class a extends sb1<v300> {
        public final AtomicReference<AtomicLong> e;
        public final AtomicLong f;
        public final yg50 g;

        public a(epo epoVar, MemoryMode memoryMode) {
            super(epoVar, false);
            this.e = new AtomicReference<>(null);
            this.f = new AtomicLong();
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                this.g = new yg50();
            } else {
                this.g = null;
            }
        }

        @Override // xsna.sb1
        public final v300 c(long j, long j2, q94 q94Var, List list, boolean z) {
            AtomicReference<AtomicLong> atomicReference = this.e;
            AtomicLong andSet = z ? atomicReference.getAndSet(null) : atomicReference.get();
            Objects.requireNonNull(andSet);
            long j3 = andSet.get();
            yg50 yg50Var = this.g;
            if (yg50Var == null) {
                return new pm5(j, j2, q94Var, j3, list);
            }
            yg50Var.b = j;
            yg50Var.c = j2;
            yg50Var.d = q94Var;
            yg50Var.a = j3;
            yg50Var.e = list;
            return yg50Var;
        }

        @Override // xsna.sb1
        public final void e(long j) {
            AtomicReference<AtomicLong> atomicReference;
            AtomicLong atomicLong = this.f;
            atomicLong.set(j);
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(null, atomicLong)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    public p300(epo epoVar, MemoryMode memoryMode) {
        this.a = epoVar;
        this.b = memoryMode;
    }

    @Override // xsna.pb1
    public final v300 a() {
        return new yg50();
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = now.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.LONG_GAUGE, new km5(arrayList));
    }

    @Override // xsna.pb1
    public final void c(v300 v300Var, v300 v300Var2) {
        ((yg50) v300Var).p(v300Var2);
    }

    @Override // xsna.pb1
    public final void d(v300 v300Var, v300 v300Var2) {
        ((yg50) v300Var2).p(v300Var);
    }

    @Override // xsna.pb1
    public final sb1<v300> e() {
        return new a(this.a, this.b);
    }

    @Override // xsna.pb1
    public final v300 f(v300 v300Var, v300 v300Var2) {
        return v300Var2;
    }
}
