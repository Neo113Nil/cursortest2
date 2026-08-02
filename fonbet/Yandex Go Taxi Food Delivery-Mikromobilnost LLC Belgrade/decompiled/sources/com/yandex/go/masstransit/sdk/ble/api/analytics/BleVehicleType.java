package com.yandex.go.masstransit.sdk.ble.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/analytics/BleVehicleType;", "", "Bus", "Trolley", "Tram", "Water", "Electrobus", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BleVehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleVehicleType[] $VALUES;
    public static final BleVehicleType Bus;
    public static final BleVehicleType Electrobus;
    public static final BleVehicleType Tram;
    public static final BleVehicleType Trolley;
    public static final BleVehicleType Water;

    static {
        BleVehicleType bleVehicleType = new BleVehicleType("Bus", 0);
        Bus = bleVehicleType;
        BleVehicleType bleVehicleType2 = new BleVehicleType("Trolley", 1);
        Trolley = bleVehicleType2;
        BleVehicleType bleVehicleType3 = new BleVehicleType("Tram", 2);
        Tram = bleVehicleType3;
        BleVehicleType bleVehicleType4 = new BleVehicleType("Water", 3);
        Water = bleVehicleType4;
        BleVehicleType bleVehicleType5 = new BleVehicleType("Electrobus", 4);
        Electrobus = bleVehicleType5;
        BleVehicleType[] bleVehicleTypeArr = {bleVehicleType, bleVehicleType2, bleVehicleType3, bleVehicleType4, bleVehicleType5};
        $VALUES = bleVehicleTypeArr;
        $ENTRIES = a.a(bleVehicleTypeArr);
    }

    public static BleVehicleType valueOf(String str) {
        return (BleVehicleType) Enum.valueOf(BleVehicleType.class, str);
    }

    public static BleVehicleType[] values() {
        return (BleVehicleType[]) $VALUES.clone();
    }
}
