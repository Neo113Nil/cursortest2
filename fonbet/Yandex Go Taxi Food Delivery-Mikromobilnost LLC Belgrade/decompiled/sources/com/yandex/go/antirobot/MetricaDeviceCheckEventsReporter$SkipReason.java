package com.yandex.go.antirobot;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/antirobot/MetricaDeviceCheckEventsReporter$SkipReason", "", "Lcom/yandex/go/antirobot/MetricaDeviceCheckEventsReporter$SkipReason;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GmsDisabled", "Experiment", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MetricaDeviceCheckEventsReporter$SkipReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MetricaDeviceCheckEventsReporter$SkipReason[] $VALUES;
    public static final MetricaDeviceCheckEventsReporter$SkipReason Experiment;
    public static final MetricaDeviceCheckEventsReporter$SkipReason GmsDisabled;
    private final String value;

    static {
        MetricaDeviceCheckEventsReporter$SkipReason metricaDeviceCheckEventsReporter$SkipReason = new MetricaDeviceCheckEventsReporter$SkipReason("GmsDisabled", 0, "gms_disabled");
        GmsDisabled = metricaDeviceCheckEventsReporter$SkipReason;
        MetricaDeviceCheckEventsReporter$SkipReason metricaDeviceCheckEventsReporter$SkipReason2 = new MetricaDeviceCheckEventsReporter$SkipReason("Experiment", 1, "experiment");
        Experiment = metricaDeviceCheckEventsReporter$SkipReason2;
        MetricaDeviceCheckEventsReporter$SkipReason[] metricaDeviceCheckEventsReporter$SkipReasonArr = {metricaDeviceCheckEventsReporter$SkipReason, metricaDeviceCheckEventsReporter$SkipReason2};
        $VALUES = metricaDeviceCheckEventsReporter$SkipReasonArr;
        $ENTRIES = kotlin.enums.a.a(metricaDeviceCheckEventsReporter$SkipReasonArr);
    }

    public MetricaDeviceCheckEventsReporter$SkipReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static MetricaDeviceCheckEventsReporter$SkipReason valueOf(String str) {
        return (MetricaDeviceCheckEventsReporter$SkipReason) Enum.valueOf(MetricaDeviceCheckEventsReporter$SkipReason.class, str);
    }

    public static MetricaDeviceCheckEventsReporter$SkipReason[] values() {
        return (MetricaDeviceCheckEventsReporter$SkipReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
