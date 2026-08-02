package com.yandex.go.scooters.tariff_fix.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionPresenter$AddressType", "", "Lcom/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionPresenter$AddressType;", "USER_POSITION", "PARKING_END", "USER_DESTINATION", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffFixSelectionPresenter$AddressType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTariffFixSelectionPresenter$AddressType[] $VALUES;
    public static final ScootersTariffFixSelectionPresenter$AddressType PARKING_END;
    public static final ScootersTariffFixSelectionPresenter$AddressType USER_DESTINATION;
    public static final ScootersTariffFixSelectionPresenter$AddressType USER_POSITION;

    static {
        ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType = new ScootersTariffFixSelectionPresenter$AddressType("USER_POSITION", 0);
        USER_POSITION = scootersTariffFixSelectionPresenter$AddressType;
        ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType2 = new ScootersTariffFixSelectionPresenter$AddressType("PARKING_END", 1);
        PARKING_END = scootersTariffFixSelectionPresenter$AddressType2;
        ScootersTariffFixSelectionPresenter$AddressType scootersTariffFixSelectionPresenter$AddressType3 = new ScootersTariffFixSelectionPresenter$AddressType("USER_DESTINATION", 2);
        USER_DESTINATION = scootersTariffFixSelectionPresenter$AddressType3;
        ScootersTariffFixSelectionPresenter$AddressType[] scootersTariffFixSelectionPresenter$AddressTypeArr = {scootersTariffFixSelectionPresenter$AddressType, scootersTariffFixSelectionPresenter$AddressType2, scootersTariffFixSelectionPresenter$AddressType3};
        $VALUES = scootersTariffFixSelectionPresenter$AddressTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersTariffFixSelectionPresenter$AddressTypeArr);
    }

    public static ScootersTariffFixSelectionPresenter$AddressType valueOf(String str) {
        return (ScootersTariffFixSelectionPresenter$AddressType) Enum.valueOf(ScootersTariffFixSelectionPresenter$AddressType.class, str);
    }

    public static ScootersTariffFixSelectionPresenter$AddressType[] values() {
        return (ScootersTariffFixSelectionPresenter$AddressType[]) $VALUES.clone();
    }
}
