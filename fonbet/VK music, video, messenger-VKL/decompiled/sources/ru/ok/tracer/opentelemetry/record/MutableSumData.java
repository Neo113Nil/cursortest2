package ru.ok.tracer.opentelemetry.record;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.jlb0;
import xsna.opw;
import xsna.q94;
import xsna.qhk0;
import xsna.u6n0;
import xsna.um5;

/* compiled from: TracerOpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
abstract class MutableSumData<PT extends jlb0, T> extends MutableData<PT, T> {
    private final AggregationTemporality aggregationTemporality;
    private final AtomicReference<List<jlb0>> atomicPoints = new AtomicReference<>(EmptyList.b);
    private final boolean isMonotonic;

    public MutableSumData(boolean z, AggregationTemporality aggregationTemporality) {
        this.isMonotonic = z;
        this.aggregationTemporality = aggregationTemporality;
    }

    public abstract PT appendPointData(long j, PT pt, q94 q94Var, T t, qhk0 qhk0Var);

    public abstract PT createPointData(long j, PT pt);

    @Override // ru.ok.tracer.opentelemetry.record.MutableData
    public boolean isEmpty() {
        return this.atomicPoints.get().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [xsna.jlb0] */
    @Override // ru.ok.tracer.opentelemetry.record.MutableData
    public void record(long j, T t, q94 q94Var, qhk0 qhk0Var) {
        while (true) {
            List<jlb0> list = this.atomicPoints.get();
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (epx.f(((jlb0) it.next()).getAttributes(), q94Var)) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i;
            PT appendPointData = appendPointData(j, i2 >= 0 ? (jlb0) arrayList.get(i2) : null, q94Var, t, qhk0Var);
            if (i2 >= 0) {
                arrayList.set(i2, appendPointData);
            } else {
                arrayList.add(appendPointData);
            }
            AtomicReference<List<jlb0>> atomicReference = this.atomicPoints;
            while (!atomicReference.compareAndSet(list, arrayList)) {
                if (atomicReference.get() != list) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.tracer.opentelemetry.record.MutableData
    public u6n0<?> rotate(long j) {
        while (true) {
            List<jlb0> list = this.atomicPoints.get();
            List<jlb0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(createPointData(j, (jlb0) it.next()));
            }
            AtomicReference<List<jlb0>> atomicReference = this.atomicPoints;
            while (!atomicReference.compareAndSet(list, arrayList)) {
                if (atomicReference.get() != list) {
                    break;
                }
            }
            boolean z = this.isMonotonic;
            AggregationTemporality aggregationTemporality = this.aggregationTemporality;
            int i = opw.a;
            return new um5(list, z, aggregationTemporality);
        }
    }
}
