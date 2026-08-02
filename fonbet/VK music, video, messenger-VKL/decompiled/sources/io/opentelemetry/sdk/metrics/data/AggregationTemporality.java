package io.opentelemetry.sdk.metrics.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AggregationTemporality {
    private static final /* synthetic */ AggregationTemporality[] $VALUES;
    public static final AggregationTemporality CUMULATIVE;
    public static final AggregationTemporality DELTA;

    static {
        AggregationTemporality aggregationTemporality = new AggregationTemporality("DELTA", 0);
        DELTA = aggregationTemporality;
        AggregationTemporality aggregationTemporality2 = new AggregationTemporality("CUMULATIVE", 1);
        CUMULATIVE = aggregationTemporality2;
        $VALUES = new AggregationTemporality[]{aggregationTemporality, aggregationTemporality2};
    }

    public AggregationTemporality() {
        throw null;
    }

    public static AggregationTemporality valueOf(String str) {
        return (AggregationTemporality) Enum.valueOf(AggregationTemporality.class, str);
    }

    public static AggregationTemporality[] values() {
        return (AggregationTemporality[]) $VALUES.clone();
    }
}
