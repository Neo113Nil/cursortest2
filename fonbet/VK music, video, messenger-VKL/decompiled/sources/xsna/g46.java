package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;

/* compiled from: Base2ExponentialHistogramAggregation.java */
/* loaded from: classes8.dex */
public final class g46 implements x71, rb1 {
    public static final g46 a = new g46();

    /* compiled from: Base2ExponentialHistogramAggregation.java */
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

    @Override // xsna.rb1
    public final pb1 a(ym5 ym5Var, d4q d4qVar, MemoryMode memoryMode) {
        return new z5o(new epo(d4qVar, new nk3(Runtime.getRuntime().availableProcessors(), jwe0.a())), memoryMode);
    }

    @Override // xsna.rb1
    public final boolean b(ym5 ym5Var) {
        int i = a.a[ym5Var.f.ordinal()];
        return i == 1 || i == 2;
    }

    public final String toString() {
        return "Base2ExponentialHistogramAggregation{maxBuckets=160,maxScale=20,recordMinMax=true}";
    }
}
