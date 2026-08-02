package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$LowBatteryNotificationState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$LowBatteryNotificationState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "On", "Off", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$LowBatteryNotificationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$LowBatteryNotificationState[] $VALUES;
    public static final ChargersAnalytics$LowBatteryNotificationState Off;
    public static final ChargersAnalytics$LowBatteryNotificationState On;
    private final String eventValue;

    static {
        ChargersAnalytics$LowBatteryNotificationState chargersAnalytics$LowBatteryNotificationState = new ChargersAnalytics$LowBatteryNotificationState("On", 0, "on");
        On = chargersAnalytics$LowBatteryNotificationState;
        ChargersAnalytics$LowBatteryNotificationState chargersAnalytics$LowBatteryNotificationState2 = new ChargersAnalytics$LowBatteryNotificationState("Off", 1, "off");
        Off = chargersAnalytics$LowBatteryNotificationState2;
        ChargersAnalytics$LowBatteryNotificationState[] chargersAnalytics$LowBatteryNotificationStateArr = {chargersAnalytics$LowBatteryNotificationState, chargersAnalytics$LowBatteryNotificationState2};
        $VALUES = chargersAnalytics$LowBatteryNotificationStateArr;
        $ENTRIES = a.a(chargersAnalytics$LowBatteryNotificationStateArr);
    }

    public ChargersAnalytics$LowBatteryNotificationState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$LowBatteryNotificationState valueOf(String str) {
        return (ChargersAnalytics$LowBatteryNotificationState) Enum.valueOf(ChargersAnalytics$LowBatteryNotificationState.class, str);
    }

    public static ChargersAnalytics$LowBatteryNotificationState[] values() {
        return (ChargersAnalytics$LowBatteryNotificationState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
