package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import xsna.c4q;
import xsna.jlb0;

/* compiled from: AbstractSumAggregator.java */
/* loaded from: classes8.dex */
public abstract class ai<T extends jlb0, U extends c4q> implements pb1<T> {
    public final boolean a;

    public ai(ym5 ym5Var) {
        InstrumentType instrumentType = ym5Var.f;
        this.a = instrumentType == InstrumentType.HISTOGRAM || instrumentType == InstrumentType.COUNTER || instrumentType == InstrumentType.OBSERVABLE_COUNTER;
    }
}
