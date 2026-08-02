package ru.ok.tracer.opentelemetry.record;

import xsna.q94;
import xsna.qhk0;

/* compiled from: DoubleRecorder.kt */
/* loaded from: classes9.dex */
final class NoopDoubleRecorder implements DoubleRecorder {
    public static final NoopDoubleRecorder INSTANCE = new NoopDoubleRecorder();

    private NoopDoubleRecorder() {
    }

    @Override // ru.ok.tracer.opentelemetry.record.DoubleRecorder
    public void record(double d, q94 q94Var, qhk0 qhk0Var) {
    }
}
