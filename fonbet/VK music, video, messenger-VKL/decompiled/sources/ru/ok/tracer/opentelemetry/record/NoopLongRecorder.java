package ru.ok.tracer.opentelemetry.record;

import xsna.q94;
import xsna.qhk0;

/* compiled from: LongRecorder.kt */
/* loaded from: classes9.dex */
final class NoopLongRecorder implements LongRecorder {
    public static final NoopLongRecorder INSTANCE = new NoopLongRecorder();

    private NoopLongRecorder() {
    }

    @Override // ru.ok.tracer.opentelemetry.record.LongRecorder
    public void record(long j, q94 q94Var, qhk0 qhk0Var) {
    }
}
