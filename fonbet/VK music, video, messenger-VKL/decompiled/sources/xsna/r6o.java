package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DoubleLastValueAggregator.java */
/* loaded from: classes8.dex */
public final class r6o implements pb1<u6o> {
    public final epo a;
    public final MemoryMode b;

    /* compiled from: DoubleLastValueAggregator.java */
    public static final class a extends sb1<u6o> {
        public final AtomicReference<AtomicLong> e;
        public final AtomicLong f;
        public final hg50 g;

        public a(epo epoVar, MemoryMode memoryMode) {
            super(epoVar, true);
            this.e = new AtomicReference<>(null);
            this.f = new AtomicLong();
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                this.g = new hg50();
            } else {
                this.g = null;
            }
        }

        @Override // xsna.sb1
        public final u6o b(long j, long j2, q94 q94Var, List list, boolean z) {
            AtomicReference<AtomicLong> atomicReference = this.e;
            AtomicLong andSet = z ? atomicReference.getAndSet(null) : atomicReference.get();
            Objects.requireNonNull(andSet);
            double longBitsToDouble = Double.longBitsToDouble(andSet.get());
            hg50 hg50Var = this.g;
            if (hg50Var == null) {
                return new fm5(j, j2, q94Var, longBitsToDouble, list);
            }
            hg50Var.a = j;
            hg50Var.b = j2;
            hg50Var.c = q94Var;
            hg50Var.d = longBitsToDouble;
            hg50Var.e = list;
            return hg50Var;
        }

        @Override // xsna.sb1
        public final void d(double d) {
            AtomicReference<AtomicLong> atomicReference;
            long doubleToLongBits = Double.doubleToLongBits(d);
            AtomicLong atomicLong = this.f;
            atomicLong.set(doubleToLongBits);
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(null, atomicLong)) {
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    public r6o(epo epoVar, MemoryMode memoryMode) {
        this.a = epoVar;
        this.b = memoryMode;
    }

    @Override // xsna.pb1
    public final u6o a() {
        return new hg50();
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = now.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.DOUBLE_GAUGE, new km5(arrayList));
    }

    @Override // xsna.pb1
    public final void c(u6o u6oVar, u6o u6oVar2) {
        ((hg50) u6oVar).p(u6oVar2);
    }

    @Override // xsna.pb1
    public final void d(u6o u6oVar, u6o u6oVar2) {
        ((hg50) u6oVar2).p(u6oVar);
    }

    @Override // xsna.pb1
    public final sb1<u6o> e() {
        return new a(this.a, this.b);
    }

    @Override // xsna.pb1
    public final u6o f(u6o u6oVar, u6o u6oVar2) {
        return u6oVar2;
    }
}
