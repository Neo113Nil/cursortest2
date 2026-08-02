package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DoubleSumAggregator.java */
/* loaded from: classes8.dex */
public final class w6o extends ai<u6o, j6o> {
    public final epo b;
    public final MemoryMode c;

    /* compiled from: DoubleSumAggregator.java */
    public static final class a extends sb1<u6o> {
        public final w5o e;
        public final hg50 f;

        public a(epo epoVar, MemoryMode memoryMode) {
            super(epoVar, true);
            this.e = wp0.a ? new a1y() : new u04(0);
            this.f = memoryMode == MemoryMode.REUSABLE_DATA ? new hg50() : null;
        }

        @Override // xsna.sb1
        public final u6o b(long j, long j2, q94 q94Var, List list, boolean z) {
            w5o w5oVar = this.e;
            double b = z ? w5oVar.b() : w5oVar.sum();
            hg50 hg50Var = this.f;
            if (hg50Var == null) {
                return new fm5(j, j2, q94Var, b, list);
            }
            hg50Var.a = j;
            hg50Var.b = j2;
            hg50Var.c = q94Var;
            hg50Var.d = b;
            hg50Var.e = list;
            return hg50Var;
        }

        @Override // xsna.sb1
        public final void d(double d) {
            this.e.add(d);
        }
    }

    public w6o(ym5 ym5Var, epo epoVar, MemoryMode memoryMode) {
        super(ym5Var);
        this.b = epoVar;
        this.c = memoryMode;
    }

    @Override // xsna.pb1
    public final jlb0 a() {
        return new hg50();
    }

    @Override // xsna.pb1
    public final yk20 b(gag0 gag0Var, q8x q8xVar, mn5 mn5Var, ArrayList arrayList, AggregationTemporality aggregationTemporality) {
        String str = mn5Var.c;
        String str2 = mn5Var.d;
        String str3 = mn5Var.f.e;
        int i = opw.a;
        return new qm5(gag0Var, q8xVar, str, str2, str3, MetricDataType.DOUBLE_SUM, new um5(arrayList, this.a, aggregationTemporality));
    }

    @Override // xsna.pb1
    public final void c(jlb0 jlb0Var, jlb0 jlb0Var2) {
        u6o u6oVar = (u6o) jlb0Var;
        u6o u6oVar2 = (u6o) jlb0Var2;
        hg50 hg50Var = (hg50) u6oVar;
        long g = u6oVar2.g();
        long b = u6oVar2.b();
        q94 attributes = u6oVar2.getAttributes();
        double value = u6oVar2.getValue() - u6oVar.getValue();
        List o = u6oVar2.o();
        hg50Var.a = g;
        hg50Var.b = b;
        hg50Var.c = attributes;
        hg50Var.d = value;
        hg50Var.e = o;
    }

    @Override // xsna.pb1
    public final void d(jlb0 jlb0Var, jlb0 jlb0Var2) {
        ((hg50) ((u6o) jlb0Var2)).p((u6o) jlb0Var);
    }

    @Override // xsna.pb1
    public final sb1<u6o> e() {
        return new a(this.b, this.c);
    }

    @Override // xsna.pb1
    public final jlb0 f(jlb0 jlb0Var, jlb0 jlb0Var2) {
        u6o u6oVar = (u6o) jlb0Var2;
        return new fm5(u6oVar.g(), u6oVar.b(), u6oVar.getAttributes(), u6oVar.getValue() - ((u6o) jlb0Var).getValue(), u6oVar.o());
    }
}
