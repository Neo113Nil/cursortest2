package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersRentContractAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersRentContractAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BackToBooking", "Close", "AcceptToggle", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersRentContractAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersRentContractAnalytics$ButtonName[] $VALUES;
    public static final ScootersRentContractAnalytics$ButtonName AcceptToggle;
    public static final ScootersRentContractAnalytics$ButtonName BackToBooking;
    public static final ScootersRentContractAnalytics$ButtonName Close;
    private final String eventValue;

    static {
        ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName = new ScootersRentContractAnalytics$ButtonName("BackToBooking", 0, "back_to_booking");
        BackToBooking = scootersRentContractAnalytics$ButtonName;
        ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName2 = new ScootersRentContractAnalytics$ButtonName("Close", 1, "close");
        Close = scootersRentContractAnalytics$ButtonName2;
        ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName3 = new ScootersRentContractAnalytics$ButtonName("AcceptToggle", 2, "accept_toggle");
        AcceptToggle = scootersRentContractAnalytics$ButtonName3;
        ScootersRentContractAnalytics$ButtonName[] scootersRentContractAnalytics$ButtonNameArr = {scootersRentContractAnalytics$ButtonName, scootersRentContractAnalytics$ButtonName2, scootersRentContractAnalytics$ButtonName3};
        $VALUES = scootersRentContractAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersRentContractAnalytics$ButtonNameArr);
    }

    public ScootersRentContractAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersRentContractAnalytics$ButtonName valueOf(String str) {
        return (ScootersRentContractAnalytics$ButtonName) Enum.valueOf(ScootersRentContractAnalytics$ButtonName.class, str);
    }

    public static ScootersRentContractAnalytics$ButtonName[] values() {
        return (ScootersRentContractAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
