package xsna;

import io.opentelemetry.sdk.trace.samplers.SamplingDecision;

/* compiled from: ImmutableSamplingResult.java */
/* loaded from: classes11.dex */
public abstract class hpw implements p0h0 {
    public static final rm5 a;
    public static final rm5 b;
    public static final rm5 c;

    static {
        SamplingDecision samplingDecision = SamplingDecision.RECORD_AND_SAMPLE;
        jk3 jk3Var = jk3.e;
        a = new rm5(samplingDecision, jk3Var);
        b = new rm5(SamplingDecision.DROP, jk3Var);
        c = new rm5(SamplingDecision.RECORD_ONLY, jk3Var);
    }
}
