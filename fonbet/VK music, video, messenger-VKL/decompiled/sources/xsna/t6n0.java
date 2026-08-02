package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;

/* compiled from: SumAggregation.java */
/* loaded from: classes8.dex */
public final class t6n0 implements x71, rb1 {
    public static final t6n0 a = new t6n0();

    /* compiled from: SumAggregation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            b = iArr;
            try {
                iArr[InstrumentType.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[InstrumentType.OBSERVABLE_COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[InstrumentType.UP_DOWN_COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[InstrumentType.OBSERVABLE_UP_DOWN_COUNTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[InstrumentType.HISTOGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[InstrumentValueType.values().length];
            a = iArr2;
            try {
                iArr2[InstrumentValueType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[InstrumentValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // xsna.rb1
    public final pb1 a(ym5 ym5Var, d4q d4qVar, MemoryMode memoryMode) {
        epo epoVar = new epo(d4qVar, new nk3(Runtime.getRuntime().availableProcessors(), jwe0.a()));
        int i = a.a[ym5Var.g.ordinal()];
        if (i == 1) {
            return new y500(ym5Var, epoVar, memoryMode);
        }
        if (i == 2) {
            return new w6o(ym5Var, epoVar, memoryMode);
        }
        throw new IllegalArgumentException("Invalid instrument value type");
    }

    @Override // xsna.rb1
    public final boolean b(ym5 ym5Var) {
        int i = a.b[ym5Var.f.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public final String toString() {
        return "SumAggregation";
    }
}
