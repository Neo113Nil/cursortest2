package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;

/* compiled from: LastValueAggregation.java */
/* loaded from: classes8.dex */
public final class fmy implements x71, rb1 {
    public static final fmy a = new fmy();

    /* compiled from: LastValueAggregation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InstrumentValueType.values().length];
            a = iArr;
            try {
                iArr[InstrumentValueType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InstrumentValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // xsna.rb1
    public final pb1 a(ym5 ym5Var, d4q d4qVar, MemoryMode memoryMode) {
        epo epoVar = new epo(d4qVar, new nk3(Runtime.getRuntime().availableProcessors(), jwe0.a()));
        int i = a.a[ym5Var.g.ordinal()];
        if (i == 1) {
            return new p300(epoVar, memoryMode);
        }
        if (i == 2) {
            return new r6o(epoVar, memoryMode);
        }
        throw new IllegalArgumentException("Invalid instrument value type");
    }

    @Override // xsna.rb1
    public final boolean b(ym5 ym5Var) {
        InstrumentType instrumentType = ym5Var.f;
        return instrumentType == InstrumentType.OBSERVABLE_GAUGE || instrumentType == InstrumentType.GAUGE;
    }

    public final String toString() {
        return "LastValueAggregation";
    }
}
