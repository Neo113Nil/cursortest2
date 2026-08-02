package com.yandex.payment.sdk.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/payment/sdk/core/MetricaSwitch;", "", "OFF", "DEPENDENT", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MetricaSwitch {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MetricaSwitch[] $VALUES;
    public static final MetricaSwitch DEPENDENT;
    public static final MetricaSwitch OFF;

    static {
        MetricaSwitch metricaSwitch = new MetricaSwitch("OFF", 0);
        OFF = metricaSwitch;
        MetricaSwitch metricaSwitch2 = new MetricaSwitch("DEPENDENT", 1);
        DEPENDENT = metricaSwitch2;
        MetricaSwitch[] metricaSwitchArr = {metricaSwitch, metricaSwitch2};
        $VALUES = metricaSwitchArr;
        $ENTRIES = a.a(metricaSwitchArr);
    }

    public static MetricaSwitch valueOf(String str) {
        return (MetricaSwitch) Enum.valueOf(MetricaSwitch.class, str);
    }

    public static MetricaSwitch[] values() {
        return (MetricaSwitch[]) $VALUES.clone();
    }
}
