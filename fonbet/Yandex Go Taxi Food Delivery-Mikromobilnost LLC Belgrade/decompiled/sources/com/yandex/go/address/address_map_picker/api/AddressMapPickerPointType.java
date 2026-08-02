package com.yandex.go.address.address_map_picker.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/address/address_map_picker/api/AddressMapPickerPointType;", "", "Source", "Destination", "go-client-android.features.address.address_map_picker:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressMapPickerPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressMapPickerPointType[] $VALUES;
    public static final AddressMapPickerPointType Destination;
    public static final AddressMapPickerPointType Source;

    static {
        AddressMapPickerPointType addressMapPickerPointType = new AddressMapPickerPointType("Source", 0);
        Source = addressMapPickerPointType;
        AddressMapPickerPointType addressMapPickerPointType2 = new AddressMapPickerPointType("Destination", 1);
        Destination = addressMapPickerPointType2;
        AddressMapPickerPointType[] addressMapPickerPointTypeArr = {addressMapPickerPointType, addressMapPickerPointType2};
        $VALUES = addressMapPickerPointTypeArr;
        $ENTRIES = a.a(addressMapPickerPointTypeArr);
    }

    public static AddressMapPickerPointType valueOf(String str) {
        return (AddressMapPickerPointType) Enum.valueOf(AddressMapPickerPointType.class, str);
    }

    public static AddressMapPickerPointType[] values() {
        return (AddressMapPickerPointType[]) $VALUES.clone();
    }
}
