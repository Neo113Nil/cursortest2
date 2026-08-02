package io.opentelemetry.sdk.trace.samplers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SamplingDecision {
    private static final /* synthetic */ SamplingDecision[] $VALUES;
    public static final SamplingDecision DROP;
    public static final SamplingDecision RECORD_AND_SAMPLE;
    public static final SamplingDecision RECORD_ONLY;

    static {
        SamplingDecision samplingDecision = new SamplingDecision("DROP", 0);
        DROP = samplingDecision;
        SamplingDecision samplingDecision2 = new SamplingDecision("RECORD_ONLY", 1);
        RECORD_ONLY = samplingDecision2;
        SamplingDecision samplingDecision3 = new SamplingDecision("RECORD_AND_SAMPLE", 2);
        RECORD_AND_SAMPLE = samplingDecision3;
        $VALUES = new SamplingDecision[]{samplingDecision, samplingDecision2, samplingDecision3};
    }

    public SamplingDecision() {
        throw null;
    }

    public static SamplingDecision valueOf(String str) {
        return (SamplingDecision) Enum.valueOf(SamplingDecision.class, str);
    }

    public static SamplingDecision[] values() {
        return (SamplingDecision[]) $VALUES.clone();
    }
}
