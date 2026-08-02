package ru.ok.tracer.opentelemetry;

import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import java.util.List;
import java.util.Objects;
import ru.ok.tracer.Tracer;
import xsna.d9z;
import xsna.hpw;
import xsna.n0h0;
import xsna.p0h0;
import xsna.q94;
import xsna.rm5;
import xsna.wmj;
import xsna.zcl;

/* compiled from: TracerOpenTelemetrySampler.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetrySampler implements n0h0 {
    public static final Companion Companion = new Companion(null);
    private final n0h0 delegate;

    /* compiled from: TracerOpenTelemetrySampler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final n0h0 create(n0h0 n0h0Var) {
            return new TracerOpenTelemetrySampler(n0h0Var);
        }

        private Companion() {
        }
    }

    public TracerOpenTelemetrySampler(n0h0 n0h0Var) {
        this.delegate = n0h0Var;
    }

    @Override // xsna.n0h0
    public String getDescription() {
        return "Based on Tracer's sampled flag";
    }

    @Override // xsna.n0h0
    public p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list) {
        q94 builtinAttributes$tracer_opentelemetry_release = TracerOpenTelemetry.INSTANCE.getBuiltinAttributes$tracer_opentelemetry_release(q94Var);
        if (!Tracer.getSampled()) {
            return this.delegate.shouldSample(wmjVar, str, str2, spanKind, builtinAttributes$tracer_opentelemetry_release, list);
        }
        SamplingDecision samplingDecision = SamplingDecision.RECORD_AND_SAMPLE;
        Objects.requireNonNull(builtinAttributes$tracer_opentelemetry_release, "attributes");
        if (!builtinAttributes$tracer_opentelemetry_release.isEmpty()) {
            rm5 rm5Var = hpw.a;
            return new rm5(samplingDecision, builtinAttributes$tracer_opentelemetry_release);
        }
        int i = p0h0.a.a[samplingDecision.ordinal()];
        if (i == 1) {
            return hpw.a;
        }
        if (i == 2) {
            return hpw.c;
        }
        if (i == 3) {
            return hpw.b;
        }
        throw new AssertionError("unrecognised samplingResult");
    }
}
