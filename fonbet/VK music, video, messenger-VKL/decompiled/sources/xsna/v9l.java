package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: DefaultAggregation.java */
/* loaded from: classes8.dex */
public final class v9l implements x71, rb1 {
    public static final v9l a = new v9l();
    public static final zro0 b = new zro0(Logger.getLogger(v9l.class.getName()));

    /* compiled from: DefaultAggregation.java */
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
                a[InstrumentType.UP_DOWN_COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InstrumentType.OBSERVABLE_COUNTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InstrumentType.OBSERVABLE_UP_DOWN_COUNTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InstrumentType.HISTOGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[InstrumentType.OBSERVABLE_GAUGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[InstrumentType.GAUGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static x71 c(ym5 ym5Var, boolean z) {
        x41 x41Var = ym5Var.h;
        switch (a.a[ym5Var.f.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return t6n0.a;
            case 5:
                return (!z || x41Var.b() == null) ? s9q.d : new s9q(x41Var.b());
            case 6:
            case 7:
                return fmy.a;
            default:
                b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + ym5Var, null);
                return zlo.a;
        }
    }

    @Override // xsna.rb1
    public final pb1 a(ym5 ym5Var, d4q d4qVar, MemoryMode memoryMode) {
        return ((rb1) c(ym5Var, true)).a(ym5Var, d4qVar, memoryMode);
    }

    @Override // xsna.rb1
    public final boolean b(ym5 ym5Var) {
        return ((rb1) c(ym5Var, false)).b(ym5Var);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}
