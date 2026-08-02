package com.ybsdk.core.analytics;

import defpackage.k4o;
import io.appmetrica.analytics.RtmConfig;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/analytics/AnalyticsEnvironment;", "", "rtmConfigEnvironment", "Lio/appmetrica/analytics/RtmConfig$Environment;", "<init>", "(Ljava/lang/String;ILio/appmetrica/analytics/RtmConfig$Environment;)V", "getRtmConfigEnvironment$core_analytics_release", "()Lio/appmetrica/analytics/RtmConfig$Environment;", "DEVELOPMENT", "PRODUCTION", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnalyticsEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsEnvironment[] $VALUES;
    public static final AnalyticsEnvironment DEVELOPMENT = new AnalyticsEnvironment("DEVELOPMENT", 0, RtmConfig.Environment.DEVELOPMENT);
    public static final AnalyticsEnvironment PRODUCTION = new AnalyticsEnvironment("PRODUCTION", 1, RtmConfig.Environment.PRODUCTION);
    private final RtmConfig.Environment rtmConfigEnvironment;

    private static final /* synthetic */ AnalyticsEnvironment[] $values() {
        return new AnalyticsEnvironment[]{DEVELOPMENT, PRODUCTION};
    }

    static {
        AnalyticsEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsEnvironment(String str, int i, RtmConfig.Environment environment) {
        this.rtmConfigEnvironment = environment;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsEnvironment valueOf(String str) {
        return (AnalyticsEnvironment) Enum.valueOf(AnalyticsEnvironment.class, str);
    }

    public static AnalyticsEnvironment[] values() {
        return (AnalyticsEnvironment[]) $VALUES.clone();
    }

    /* renamed from: getRtmConfigEnvironment$core_analytics_release, reason: from getter */
    public final RtmConfig.Environment getRtmConfigEnvironment() {
        return this.rtmConfigEnvironment;
    }
}
