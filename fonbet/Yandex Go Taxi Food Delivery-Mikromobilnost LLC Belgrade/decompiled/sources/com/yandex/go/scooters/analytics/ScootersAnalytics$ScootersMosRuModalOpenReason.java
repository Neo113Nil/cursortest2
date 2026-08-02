package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuModalOpenReason", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuModalOpenReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TopBar", "Trigger", "Shortcut", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersMosRuModalOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersMosRuModalOpenReason[] $VALUES;
    public static final ScootersAnalytics$ScootersMosRuModalOpenReason Shortcut;
    public static final ScootersAnalytics$ScootersMosRuModalOpenReason TopBar;
    public static final ScootersAnalytics$ScootersMosRuModalOpenReason Trigger;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersMosRuModalOpenReason scootersAnalytics$ScootersMosRuModalOpenReason = new ScootersAnalytics$ScootersMosRuModalOpenReason("TopBar", 0, "top_bar");
        TopBar = scootersAnalytics$ScootersMosRuModalOpenReason;
        ScootersAnalytics$ScootersMosRuModalOpenReason scootersAnalytics$ScootersMosRuModalOpenReason2 = new ScootersAnalytics$ScootersMosRuModalOpenReason("Trigger", 1, "trigger");
        Trigger = scootersAnalytics$ScootersMosRuModalOpenReason2;
        ScootersAnalytics$ScootersMosRuModalOpenReason scootersAnalytics$ScootersMosRuModalOpenReason3 = new ScootersAnalytics$ScootersMosRuModalOpenReason("Shortcut", 2, "shortcut");
        Shortcut = scootersAnalytics$ScootersMosRuModalOpenReason3;
        ScootersAnalytics$ScootersMosRuModalOpenReason[] scootersAnalytics$ScootersMosRuModalOpenReasonArr = {scootersAnalytics$ScootersMosRuModalOpenReason, scootersAnalytics$ScootersMosRuModalOpenReason2, scootersAnalytics$ScootersMosRuModalOpenReason3};
        $VALUES = scootersAnalytics$ScootersMosRuModalOpenReasonArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersMosRuModalOpenReasonArr);
    }

    public ScootersAnalytics$ScootersMosRuModalOpenReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersMosRuModalOpenReason valueOf(String str) {
        return (ScootersAnalytics$ScootersMosRuModalOpenReason) Enum.valueOf(ScootersAnalytics$ScootersMosRuModalOpenReason.class, str);
    }

    public static ScootersAnalytics$ScootersMosRuModalOpenReason[] values() {
        return (ScootersAnalytics$ScootersMosRuModalOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
