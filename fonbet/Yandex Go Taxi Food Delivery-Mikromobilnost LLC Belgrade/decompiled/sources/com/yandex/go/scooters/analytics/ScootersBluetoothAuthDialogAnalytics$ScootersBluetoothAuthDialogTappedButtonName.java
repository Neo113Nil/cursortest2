package com.yandex.go.scooters.analytics;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ok", "Support", "FindNearestParking", "PaymentMethods", "RiskyParkingOk", "RiskyParkingCancel", "Cancel", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName[] $VALUES;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName Cancel;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName FindNearestParking;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName Ok;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName PaymentMethods;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName RiskyParkingCancel;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName RiskyParkingOk;
    public static final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName Support;
    private final String eventValue;

    static {
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("Ok", 0, WriteBlocks.OK);
        Ok = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName2 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("Support", 1, FoldersConfig.SUPPORT_FILTER_ID);
        Support = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName2;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName3 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("FindNearestParking", 2, "find_nearest_parking");
        FindNearestParking = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName3;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName4 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("PaymentMethods", 3, "payment_methods");
        PaymentMethods = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName4;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName5 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("RiskyParkingOk", 4, "risky_parking_ok");
        RiskyParkingOk = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName5;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName6 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("RiskyParkingCancel", 5, "risky_parking_cancel");
        RiskyParkingCancel = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName6;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName7 = new ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName("Cancel", 6, "cancel");
        Cancel = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName7;
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName[] scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonNameArr = {scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName2, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName3, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName4, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName5, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName6, scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName7};
        $VALUES = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonNameArr;
        $ENTRIES = a.a(scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonNameArr);
    }

    public ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName valueOf(String str) {
        return (ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName) Enum.valueOf(ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.class, str);
    }

    public static ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName[] values() {
        return (ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
