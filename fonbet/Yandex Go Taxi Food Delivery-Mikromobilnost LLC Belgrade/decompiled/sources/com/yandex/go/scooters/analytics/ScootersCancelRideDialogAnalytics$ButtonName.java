package com.yandex.go.scooters.analytics;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/scooters/analytics/ScootersCancelRideDialogAnalytics$ButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersCancelRideDialogAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ok", "Cancel", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCancelRideDialogAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCancelRideDialogAnalytics$ButtonName[] $VALUES;
    public static final ScootersCancelRideDialogAnalytics$ButtonName Cancel;
    public static final ScootersCancelRideDialogAnalytics$ButtonName Ok;
    private final String eventValue;

    static {
        ScootersCancelRideDialogAnalytics$ButtonName scootersCancelRideDialogAnalytics$ButtonName = new ScootersCancelRideDialogAnalytics$ButtonName("Ok", 0, WriteBlocks.OK);
        Ok = scootersCancelRideDialogAnalytics$ButtonName;
        ScootersCancelRideDialogAnalytics$ButtonName scootersCancelRideDialogAnalytics$ButtonName2 = new ScootersCancelRideDialogAnalytics$ButtonName("Cancel", 1, "cancel");
        Cancel = scootersCancelRideDialogAnalytics$ButtonName2;
        ScootersCancelRideDialogAnalytics$ButtonName[] scootersCancelRideDialogAnalytics$ButtonNameArr = {scootersCancelRideDialogAnalytics$ButtonName, scootersCancelRideDialogAnalytics$ButtonName2};
        $VALUES = scootersCancelRideDialogAnalytics$ButtonNameArr;
        $ENTRIES = a.a(scootersCancelRideDialogAnalytics$ButtonNameArr);
    }

    public ScootersCancelRideDialogAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersCancelRideDialogAnalytics$ButtonName valueOf(String str) {
        return (ScootersCancelRideDialogAnalytics$ButtonName) Enum.valueOf(ScootersCancelRideDialogAnalytics$ButtonName.class, str);
    }

    public static ScootersCancelRideDialogAnalytics$ButtonName[] values() {
        return (ScootersCancelRideDialogAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
