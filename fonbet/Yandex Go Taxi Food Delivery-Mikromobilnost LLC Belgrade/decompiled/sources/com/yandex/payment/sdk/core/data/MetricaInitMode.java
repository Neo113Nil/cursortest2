package com.yandex.payment.sdk.core.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/payment/sdk/core/data/MetricaInitMode;", "", "DO_NOT_INIT", "PAYMENT_SDK_DIALOG", "CORE", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MetricaInitMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MetricaInitMode[] $VALUES;
    public static final MetricaInitMode CORE;
    public static final MetricaInitMode DO_NOT_INIT;
    public static final MetricaInitMode PAYMENT_SDK_DIALOG;

    static {
        MetricaInitMode metricaInitMode = new MetricaInitMode("DO_NOT_INIT", 0);
        DO_NOT_INIT = metricaInitMode;
        MetricaInitMode metricaInitMode2 = new MetricaInitMode("PAYMENT_SDK_DIALOG", 1);
        PAYMENT_SDK_DIALOG = metricaInitMode2;
        MetricaInitMode metricaInitMode3 = new MetricaInitMode("CORE", 2);
        CORE = metricaInitMode3;
        MetricaInitMode[] metricaInitModeArr = {metricaInitMode, metricaInitMode2, metricaInitMode3};
        $VALUES = metricaInitModeArr;
        $ENTRIES = kotlin.enums.a.a(metricaInitModeArr);
    }

    public static MetricaInitMode valueOf(String str) {
        return (MetricaInitMode) Enum.valueOf(MetricaInitMode.class, str);
    }

    public static MetricaInitMode[] values() {
        return (MetricaInitMode[]) $VALUES.clone();
    }
}
