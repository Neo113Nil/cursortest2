package com.yandex.go.scooters.misc.error_dialog;

import com.yandex.go.scooters.analytics.ScootersAlertAnalytics$ScootersAlertTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import defpackage.qjn0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"com/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogAnalytics$TappedButton", "", "Lcom/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogAnalytics$TappedButton;", "", "metricaName", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/yandex/go/scooters/analytics/ScootersAlertAnalytics$ScootersAlertTappedButtonName;", "alertButtonName", "Lcom/yandex/go/scooters/analytics/ScootersAlertAnalytics$ScootersAlertTappedButtonName;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersAlertAnalytics$ScootersAlertTappedButtonName;", "Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "bluetoothButtonName", "Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "b", "()Lcom/yandex/go/scooters/analytics/ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;", "Companion", "qjn0", "OK", "SUPPORT", "FIND_NEAREST_PARKING", "PAYMENT_METHODS", "RISKY_PARKING_OK", "RISKY_PARKING_CANCEL", "CANCEL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogAnalytics$TappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorDialogAnalytics$TappedButton[] $VALUES;
    public static final ScootersErrorDialogAnalytics$TappedButton CANCEL;
    public static final qjn0 Companion;
    public static final ScootersErrorDialogAnalytics$TappedButton FIND_NEAREST_PARKING;
    public static final ScootersErrorDialogAnalytics$TappedButton OK;
    public static final ScootersErrorDialogAnalytics$TappedButton PAYMENT_METHODS;
    public static final ScootersErrorDialogAnalytics$TappedButton RISKY_PARKING_CANCEL;
    public static final ScootersErrorDialogAnalytics$TappedButton RISKY_PARKING_OK;
    public static final ScootersErrorDialogAnalytics$TappedButton SUPPORT;
    private final ScootersAlertAnalytics$ScootersAlertTappedButtonName alertButtonName;
    private final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName bluetoothButtonName;
    private final String metricaName;

    static {
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton = new ScootersErrorDialogAnalytics$TappedButton("OK", 0, WriteBlocks.OK, ScootersAlertAnalytics$ScootersAlertTappedButtonName.Ok, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.Ok);
        OK = scootersErrorDialogAnalytics$TappedButton;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton2 = new ScootersErrorDialogAnalytics$TappedButton("SUPPORT", 1, FoldersConfig.SUPPORT_FILTER_ID, ScootersAlertAnalytics$ScootersAlertTappedButtonName.Support, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.Support);
        SUPPORT = scootersErrorDialogAnalytics$TappedButton2;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton3 = new ScootersErrorDialogAnalytics$TappedButton("FIND_NEAREST_PARKING", 2, "find_nearest_parking", ScootersAlertAnalytics$ScootersAlertTappedButtonName.FindNearestParking, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.FindNearestParking);
        FIND_NEAREST_PARKING = scootersErrorDialogAnalytics$TappedButton3;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton4 = new ScootersErrorDialogAnalytics$TappedButton("PAYMENT_METHODS", 3, "payment_methods", ScootersAlertAnalytics$ScootersAlertTappedButtonName.PaymentMethods, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.PaymentMethods);
        PAYMENT_METHODS = scootersErrorDialogAnalytics$TappedButton4;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton5 = new ScootersErrorDialogAnalytics$TappedButton("RISKY_PARKING_OK", 4, "risky_parking_ok", ScootersAlertAnalytics$ScootersAlertTappedButtonName.RiskyParkingOk, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.RiskyParkingOk);
        RISKY_PARKING_OK = scootersErrorDialogAnalytics$TappedButton5;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton6 = new ScootersErrorDialogAnalytics$TappedButton("RISKY_PARKING_CANCEL", 5, "risky_parking_cancel", ScootersAlertAnalytics$ScootersAlertTappedButtonName.RiskyParkingCancel, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.RiskyParkingCancel);
        RISKY_PARKING_CANCEL = scootersErrorDialogAnalytics$TappedButton6;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton7 = new ScootersErrorDialogAnalytics$TappedButton("CANCEL", 6, "cancel", ScootersAlertAnalytics$ScootersAlertTappedButtonName.Cancel, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.Cancel);
        CANCEL = scootersErrorDialogAnalytics$TappedButton7;
        ScootersErrorDialogAnalytics$TappedButton[] scootersErrorDialogAnalytics$TappedButtonArr = {scootersErrorDialogAnalytics$TappedButton, scootersErrorDialogAnalytics$TappedButton2, scootersErrorDialogAnalytics$TappedButton3, scootersErrorDialogAnalytics$TappedButton4, scootersErrorDialogAnalytics$TappedButton5, scootersErrorDialogAnalytics$TappedButton6, scootersErrorDialogAnalytics$TappedButton7};
        $VALUES = scootersErrorDialogAnalytics$TappedButtonArr;
        $ENTRIES = a.a(scootersErrorDialogAnalytics$TappedButtonArr);
        Companion = new qjn0();
    }

    public ScootersErrorDialogAnalytics$TappedButton(String str, int i, String str2, ScootersAlertAnalytics$ScootersAlertTappedButtonName scootersAlertAnalytics$ScootersAlertTappedButtonName, ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName) {
        this.metricaName = str2;
        this.alertButtonName = scootersAlertAnalytics$ScootersAlertTappedButtonName;
        this.bluetoothButtonName = scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static ScootersErrorDialogAnalytics$TappedButton valueOf(String str) {
        return (ScootersErrorDialogAnalytics$TappedButton) Enum.valueOf(ScootersErrorDialogAnalytics$TappedButton.class, str);
    }

    public static ScootersErrorDialogAnalytics$TappedButton[] values() {
        return (ScootersErrorDialogAnalytics$TappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersAlertAnalytics$ScootersAlertTappedButtonName getAlertButtonName() {
        return this.alertButtonName;
    }

    /* renamed from: b, reason: from getter */
    public final ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName getBluetoothButtonName() {
        return this.bluetoothButtonName;
    }

    /* renamed from: f, reason: from getter */
    public final String getMetricaName() {
        return this.metricaName;
    }
}
