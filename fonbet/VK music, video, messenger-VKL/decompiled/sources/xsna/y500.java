package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LongSumAggregator.java */
/* loaded from: classes8.dex */
public final class y500 extends ai<v300, g300> {
    public final epo b;
    public final MemoryMode c;

    /* compiled from: LongSumAggregator.java */
    public static final class a extends sb1<v300> {
        public final a300 e;
        public final yg50 f;

        public a(epo epoVar, MemoryMode memoryMode) {
            super(epoVar, false);
            this.e = wp0.a ? new b1y((byte) 0, 0) : new ofy0(2);
            this.f = memoryMode == MemoryMode.REUSABLE_DATA ? new yg50() : null;
        }

        @Override // xsna.sb1
        public final v300 c(long j, long j2, q94 q94Var, List list, boolean z) {
            a300 a300Var = this.e;
            long b = z ? a300Var.b() : a300Var.sum();
            yg50 yg50Var = this.f;
            if (yg50Var == null) {
                return new pm5(j, j2, q94Var, b, list);
            }
            yg50Var.b = j;
            yg50Var.c = j2;
            yg50Var.d = q94Var;
            yg50Var.a = b;
            yg50Var.e = list;
            return yg50Var;
        }

        @Override // xsna.sb1
        public final void e(long j) {
            this.e.add(j);
        }
    }

    public y500(ym5 ym5Var, epo epoVar, MemoryMode memoryMode) {
        super(ym5Var);
        this.b = epoVar;
        this.c = memoryMode;
    }

    @Override // xsna.pb1
    public final jlb0 a() {
        return new yg50();
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = opw.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.LONG_SUM, new um5(arrayList, this.a, aggregationTemporality));
    }

    @Override // xsna.pb1
    public final void c(jlb0 jlb0Var, jlb0 jlb0Var2) {
        v300 v300Var = (v300) jlb0Var;
        v300 v300Var2 = (v300) jlb0Var2;
        yg50 yg50Var = (yg50) v300Var;
        long g = v300Var2.g();
        long b = v300Var2.b();
        q94 attributes = v300Var2.getAttributes();
        long value = v300Var2.getValue() - v300Var.getValue();
        List o = v300Var2.o();
        yg50Var.b = g;
        yg50Var.c = b;
        yg50Var.d = attributes;
        yg50Var.a = value;
        yg50Var.e = o;
    }

    @Override // xsna.pb1
    public final void d(jlb0 jlb0Var, jlb0 jlb0Var2) {
        ((yg50) ((v300) jlb0Var2)).p((v300) jlb0Var);
    }

    @Override // xsna.pb1
    public final sb1<v300> e() {
        return new a(this.b, this.c);
    }

    @Override // xsna.pb1
    public final jlb0 f(jlb0 jlb0Var, jlb0 jlb0Var2) {
        v300 v300Var = (v300) jlb0Var2;
        return new pm5(v300Var.g(), v300Var.b(), v300Var.getAttributes(), v300Var.getValue() - ((v300) jlb0Var).getValue(), v300Var.o());
    }
}
