package com.yandex.go.masstransit.sdk.ble.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/analytics/BleVehiclesButtonAction;", "", "Back", "Qr", "Refresh", "OpenSettings", "VehicleItem", "Other", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BleVehiclesButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleVehiclesButtonAction[] $VALUES;
    public static final BleVehiclesButtonAction Back;
    public static final BleVehiclesButtonAction OpenSettings;
    public static final BleVehiclesButtonAction Other;
    public static final BleVehiclesButtonAction Qr;
    public static final BleVehiclesButtonAction Refresh;
    public static final BleVehiclesButtonAction VehicleItem;

    static {
        BleVehiclesButtonAction bleVehiclesButtonAction = new BleVehiclesButtonAction("Back", 0);
        Back = bleVehiclesButtonAction;
        BleVehiclesButtonAction bleVehiclesButtonAction2 = new BleVehiclesButtonAction("Qr", 1);
        Qr = bleVehiclesButtonAction2;
        BleVehiclesButtonAction bleVehiclesButtonAction3 = new BleVehiclesButtonAction("Refresh", 2);
        Refresh = bleVehiclesButtonAction3;
        BleVehiclesButtonAction bleVehiclesButtonAction4 = new BleVehiclesButtonAction("OpenSettings", 3);
        OpenSettings = bleVehiclesButtonAction4;
        BleVehiclesButtonAction bleVehiclesButtonAction5 = new BleVehiclesButtonAction("VehicleItem", 4);
        VehicleItem = bleVehiclesButtonAction5;
        BleVehiclesButtonAction bleVehiclesButtonAction6 = new BleVehiclesButtonAction("Other", 5);
        Other = bleVehiclesButtonAction6;
        BleVehiclesButtonAction[] bleVehiclesButtonActionArr = {bleVehiclesButtonAction, bleVehiclesButtonAction2, bleVehiclesButtonAction3, bleVehiclesButtonAction4, bleVehiclesButtonAction5, bleVehiclesButtonAction6};
        $VALUES = bleVehiclesButtonActionArr;
        $ENTRIES = a.a(bleVehiclesButtonActionArr);
    }

    public static BleVehiclesButtonAction valueOf(String str) {
        return (BleVehiclesButtonAction) Enum.valueOf(BleVehiclesButtonAction.class, str);
    }

    public static BleVehiclesButtonAction[] values() {
        return (BleVehiclesButtonAction[]) $VALUES.clone();
    }
}
