package ru.ok.tracer.opentelemetry.export;

import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import xsna.o000;
import xsna.o7f0;
import xsna.v7i;
import xsna.wmj;
import xsna.zcl;

/* compiled from: TracerOpenTelemetryLogProcessor.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryLogProcessor implements o000 {
    public static final Companion Companion = new Companion(null);
    private final o000 delegate;

    /* compiled from: TracerOpenTelemetryLogProcessor.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final o000 create(o000 o000Var) {
            return new TracerOpenTelemetryLogProcessor(o000Var, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TracerOpenTelemetryLogProcessor(o000 o000Var, zcl zclVar) {
        this(o000Var);
    }

    @Override // xsna.o000, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // xsna.o000
    public v7i forceFlush() {
        return v7i.e;
    }

    @Override // xsna.o000
    public void onEmit(wmj wmjVar, o7f0 o7f0Var) {
        o7f0Var.d(TracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry.INSTANCE, null, 1, null));
        this.delegate.onEmit(wmjVar, o7f0Var);
    }

    @Override // xsna.o000
    public v7i shutdown() {
        return forceFlush();
    }

    private TracerOpenTelemetryLogProcessor(o000 o000Var) {
        this.delegate = o000Var;
    }
}
