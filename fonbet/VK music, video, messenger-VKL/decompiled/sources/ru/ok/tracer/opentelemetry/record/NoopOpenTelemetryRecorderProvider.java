package ru.ok.tracer.opentelemetry.record;

import xsna.q8x;

/* compiled from: OpenTelemetryRecorderProvider.kt */
/* loaded from: classes9.dex */
final class NoopOpenTelemetryRecorderProvider implements OpenTelemetryRecorderProvider {
    public static final NoopOpenTelemetryRecorderProvider INSTANCE = new NoopOpenTelemetryRecorderProvider();

    private NoopOpenTelemetryRecorderProvider() {
    }

    @Override // ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider
    public DoubleRecorder createDoubleRecorder(q8x q8xVar, String str, String str2, String str3) {
        return DoubleRecorder.Companion.noop();
    }

    @Override // ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider
    public LongRecorder createLongRecorder(q8x q8xVar, String str, String str2, String str3) {
        return LongRecorder.Companion.noop();
    }
}
