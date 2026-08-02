package io.opentelemetry.sdk.metrics.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MetricDataType {
    private static final /* synthetic */ MetricDataType[] $VALUES;
    public static final MetricDataType DOUBLE_GAUGE;
    public static final MetricDataType DOUBLE_SUM;
    public static final MetricDataType EXPONENTIAL_HISTOGRAM;
    public static final MetricDataType HISTOGRAM;
    public static final MetricDataType LONG_GAUGE;
    public static final MetricDataType LONG_SUM;
    public static final MetricDataType SUMMARY;

    static {
        MetricDataType metricDataType = new MetricDataType("LONG_GAUGE", 0);
        LONG_GAUGE = metricDataType;
        MetricDataType metricDataType2 = new MetricDataType("DOUBLE_GAUGE", 1);
        DOUBLE_GAUGE = metricDataType2;
        MetricDataType metricDataType3 = new MetricDataType("LONG_SUM", 2);
        LONG_SUM = metricDataType3;
        MetricDataType metricDataType4 = new MetricDataType("DOUBLE_SUM", 3);
        DOUBLE_SUM = metricDataType4;
        MetricDataType metricDataType5 = new MetricDataType("SUMMARY", 4);
        SUMMARY = metricDataType5;
        MetricDataType metricDataType6 = new MetricDataType("HISTOGRAM", 5);
        HISTOGRAM = metricDataType6;
        MetricDataType metricDataType7 = new MetricDataType("EXPONENTIAL_HISTOGRAM", 6);
        EXPONENTIAL_HISTOGRAM = metricDataType7;
        $VALUES = new MetricDataType[]{metricDataType, metricDataType2, metricDataType3, metricDataType4, metricDataType5, metricDataType6, metricDataType7};
    }

    public MetricDataType() {
        throw null;
    }

    public static MetricDataType valueOf(String str) {
        return (MetricDataType) Enum.valueOf(MetricDataType.class, str);
    }

    public static MetricDataType[] values() {
        return (MetricDataType[]) $VALUES.clone();
    }
}
