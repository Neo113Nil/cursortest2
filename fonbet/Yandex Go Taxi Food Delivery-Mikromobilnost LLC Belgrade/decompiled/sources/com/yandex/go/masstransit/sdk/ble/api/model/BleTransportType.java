package com.yandex.go.masstransit.sdk.ble.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/model/BleTransportType;", "", "Bus", "Trolley", "Tram", "Water", "Electrobus", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BleTransportType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BleTransportType[] $VALUES;
    public static final BleTransportType Bus;
    public static final BleTransportType Electrobus;
    public static final BleTransportType Tram;
    public static final BleTransportType Trolley;
    public static final BleTransportType Water;

    static {
        BleTransportType bleTransportType = new BleTransportType("Bus", 0);
        Bus = bleTransportType;
        BleTransportType bleTransportType2 = new BleTransportType("Trolley", 1);
        Trolley = bleTransportType2;
        BleTransportType bleTransportType3 = new BleTransportType("Tram", 2);
        Tram = bleTransportType3;
        BleTransportType bleTransportType4 = new BleTransportType("Water", 3);
        Water = bleTransportType4;
        BleTransportType bleTransportType5 = new BleTransportType("Electrobus", 4);
        Electrobus = bleTransportType5;
        BleTransportType[] bleTransportTypeArr = {bleTransportType, bleTransportType2, bleTransportType3, bleTransportType4, bleTransportType5};
        $VALUES = bleTransportTypeArr;
        $ENTRIES = a.a(bleTransportTypeArr);
    }

    public static BleTransportType valueOf(String str) {
        return (BleTransportType) Enum.valueOf(BleTransportType.class, str);
    }

    public static BleTransportType[] values() {
        return (BleTransportType[]) $VALUES.clone();
    }
}
