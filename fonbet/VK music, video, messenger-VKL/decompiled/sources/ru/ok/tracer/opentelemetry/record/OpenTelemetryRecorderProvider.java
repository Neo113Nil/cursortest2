package ru.ok.tracer.opentelemetry.record;

import xsna.q8x;

/* compiled from: OpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
public interface OpenTelemetryRecorderProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: OpenTelemetryRecorderProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OpenTelemetryRecorderProvider noop() {
            return NoopOpenTelemetryRecorderProvider.INSTANCE;
        }
    }

    DoubleRecorder createDoubleRecorder(q8x q8xVar, String str, String str2, String str3);

    LongRecorder createLongRecorder(q8x q8xVar, String str, String str2, String str3);
}
