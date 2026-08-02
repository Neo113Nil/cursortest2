package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.util.List;

/* compiled from: ExplicitBucketHistogramAggregation.java */
/* loaded from: classes8.dex */
public final class s9q implements x71, rb1 {
    public static final s9q d = new s9q(u9q.a);
    public final List<Double> a;
    public final double[] b;
    public final boolean c;

    /* compiled from: ExplicitBucketHistogramAggregation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            a = iArr;
            try {
                iArr[InstrumentType.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InstrumentType.HISTOGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s9q(List list) {
        this.a = list;
        u9q.b(list);
        this.b = list.stream().mapToDouble(new t9q()).toArray();
        this.c = true;
    }

    @Override // xsna.rb1
    public final pb1 a(ym5 ym5Var, d4q d4qVar, MemoryMode memoryMode) {
        return new l6o(this.b, this.c, new epo(d4qVar, new rob(this.a)), memoryMode);
    }

    @Override // xsna.rb1
    public final boolean b(ym5 ym5Var) {
        int i = a.a[ym5Var.f.ordinal()];
        return i == 1 || i == 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExplicitBucketHistogramAggregation{bucketBoundaries=");
        sb.append(this.a);
        sb.append(",recordMinMax=");
        return n23.b(sb, this.c, "}");
    }
}
