package com.yandex.go.scooters.analytics;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAlertAnalytics$ScootersAlertTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAlertAnalytics$ScootersAlertTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ok", "Support", "FindNearestParking", "PaymentMethods", "RiskyParkingOk", "RiskyParkingCancel", "Cancel", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAlertAnalytics$ScootersAlertTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAlertAnalytics$ScootersAlertTappedButtonName[] $VALUES;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName Cancel;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName FindNearestParking;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName Ok;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName PaymentMethods;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName RiskyParkingCancel;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName RiskyParkingOk;
    public static final ScootersAlertAnalytics$ScootersAlertTappedButtonName Support;
    private final String eventValue;

    static {
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("Ok", 0, WriteBlocks.OK);
        Ok = scootersAlertAnalytics$ScootersAlertTappedButtonName;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName2 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("Support", 1, FoldersConfig.SUPPORT_FILTER_ID);
        Support = scootersAlertAnalytics$ScootersAlertTappedButtonName2;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName3 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("FindNearestParking", 2, "find_nearest_parking");
        FindNearestParking = scootersAlertAnalytics$ScootersAlertTappedButtonName3;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName4 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("PaymentMethods", 3, "payment_methods");
        PaymentMethods = scootersAlertAnalytics$ScootersAlertTappedButtonName4;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName5 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("RiskyParkingOk", 4, "risky_parking_ok");
        RiskyParkingOk = scootersAlertAnalytics$ScootersAlertTappedButtonName5;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName6 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("RiskyParkingCancel", 5, "risky_parking_cancel");
        RiskyParkingCancel = scootersAlertAnalytics$ScootersAlertTappedButtonName6;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName7 = new ScootersAlertAnalytics$ScootersAlertTappedButtonName("Cancel", 6, "cancel");
        Cancel = scootersAlertAnalytics$ScootersAlertTappedButtonName7;
        ScootersAlertAnalytics$ScootersAlertTappedButtonName[] scootersAlertAnalytics$ScootersAlertTappedButtonNameArr = {scootersAlertAnalytics$ScootersAlertTappedButtonName, scootersAlertAnalytics$ScootersAlertTappedButtonName2, scootersAlertAnalytics$ScootersAlertTappedButtonName3, scootersAlertAnalytics$ScootersAlertTappedButtonName4, scootersAlertAnalytics$ScootersAlertTappedButtonName5, scootersAlertAnalytics$ScootersAlertTappedButtonName6, scootersAlertAnalytics$ScootersAlertTappedButtonName7};
        $VALUES = scootersAlertAnalytics$ScootersAlertTappedButtonNameArr;
        $ENTRIES = a.a(scootersAlertAnalytics$ScootersAlertTappedButtonNameArr);
    }

    public ScootersAlertAnalytics$ScootersAlertTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAlertAnalytics$ScootersAlertTappedButtonName valueOf(String str) {
        return (ScootersAlertAnalytics$ScootersAlertTappedButtonName) Enum.valueOf(ScootersAlertAnalytics$ScootersAlertTappedButtonName.class, str);
    }

    public static ScootersAlertAnalytics$ScootersAlertTappedButtonName[] values() {
        return (ScootersAlertAnalytics$ScootersAlertTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
