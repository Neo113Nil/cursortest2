package ru.ok.tracer.opentelemetry;

import xsna.aj20;
import xsna.cj20;
import xsna.yi20;
import xsna.zcl;

/* compiled from: TracerOpenTelemetryMeterProvider.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryMeterProvider implements cj20 {
    public static final Companion Companion = new Companion(null);
    private final cj20 delegate;

    /* compiled from: TracerOpenTelemetryMeterProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final cj20 create(cj20 cj20Var) {
            return new TracerOpenTelemetryMeterProvider(cj20Var, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TracerOpenTelemetryMeterProvider(cj20 cj20Var, zcl zclVar) {
        this(cj20Var);
    }

    @Override // xsna.cj20
    public /* bridge */ /* synthetic */ yi20 get(String str) {
        return super.get(str);
    }

    @Override // xsna.cj20
    public aj20 meterBuilder(String str) {
        return new WrapMeterBuilder(this.delegate.meterBuilder(str));
    }

    private TracerOpenTelemetryMeterProvider(cj20 cj20Var) {
        this.delegate = cj20Var;
    }
}
