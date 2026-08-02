package com.yandex.go.pickuppoints.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/pickuppoints/api/AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType", "", "Lcom/yandex/go/pickuppoints/api/AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType;", "SELECT_ON_MAP", "TEXT_SUGGEST", "COPTER_CITY_TOUR_SELECTOR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType[] $VALUES;
    public static final AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType COPTER_CITY_TOUR_SELECTOR;
    public static final AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType SELECT_ON_MAP;
    public static final AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType TEXT_SUGGEST;

    static {
        AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType = new AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType("SELECT_ON_MAP", 0);
        SELECT_ON_MAP = addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType;
        AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType2 = new AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType("TEXT_SUGGEST", 1);
        TEXT_SUGGEST = addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType2;
        AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType3 = new AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType("COPTER_CITY_TOUR_SELECTOR", 2);
        COPTER_CITY_TOUR_SELECTOR = addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType3;
        AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType[] addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionTypeArr = {addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType, addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType2, addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType3};
        $VALUES = addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionTypeArr;
        $ENTRIES = a.a(addressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionTypeArr);
    }

    public static AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType valueOf(String str) {
        return (AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType) Enum.valueOf(AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.class, str);
    }

    public static AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType[] values() {
        return (AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType[]) $VALUES.clone();
    }
}
