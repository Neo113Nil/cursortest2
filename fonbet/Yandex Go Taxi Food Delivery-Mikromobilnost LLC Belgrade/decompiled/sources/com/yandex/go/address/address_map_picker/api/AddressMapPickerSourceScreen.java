package com.yandex.go.address.address_map_picker.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/address/address_map_picker/api/AddressMapPickerSourceScreen;", "", "Superapp", "SuperappSearch", "TaxiMain", "Summary", "Order", "Intercity", "go-client-android.features.address.address_map_picker:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressMapPickerSourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressMapPickerSourceScreen[] $VALUES;
    public static final AddressMapPickerSourceScreen Intercity;
    public static final AddressMapPickerSourceScreen Order;
    public static final AddressMapPickerSourceScreen Summary;
    public static final AddressMapPickerSourceScreen Superapp;
    public static final AddressMapPickerSourceScreen SuperappSearch;
    public static final AddressMapPickerSourceScreen TaxiMain;

    static {
        AddressMapPickerSourceScreen addressMapPickerSourceScreen = new AddressMapPickerSourceScreen("Superapp", 0);
        Superapp = addressMapPickerSourceScreen;
        AddressMapPickerSourceScreen addressMapPickerSourceScreen2 = new AddressMapPickerSourceScreen("SuperappSearch", 1);
        SuperappSearch = addressMapPickerSourceScreen2;
        AddressMapPickerSourceScreen addressMapPickerSourceScreen3 = new AddressMapPickerSourceScreen("TaxiMain", 2);
        TaxiMain = addressMapPickerSourceScreen3;
        AddressMapPickerSourceScreen addressMapPickerSourceScreen4 = new AddressMapPickerSourceScreen("Summary", 3);
        Summary = addressMapPickerSourceScreen4;
        AddressMapPickerSourceScreen addressMapPickerSourceScreen5 = new AddressMapPickerSourceScreen("Order", 4);
        Order = addressMapPickerSourceScreen5;
        AddressMapPickerSourceScreen addressMapPickerSourceScreen6 = new AddressMapPickerSourceScreen("Intercity", 5);
        Intercity = addressMapPickerSourceScreen6;
        AddressMapPickerSourceScreen[] addressMapPickerSourceScreenArr = {addressMapPickerSourceScreen, addressMapPickerSourceScreen2, addressMapPickerSourceScreen3, addressMapPickerSourceScreen4, addressMapPickerSourceScreen5, addressMapPickerSourceScreen6};
        $VALUES = addressMapPickerSourceScreenArr;
        $ENTRIES = a.a(addressMapPickerSourceScreenArr);
    }

    public static AddressMapPickerSourceScreen valueOf(String str) {
        return (AddressMapPickerSourceScreen) Enum.valueOf(AddressMapPickerSourceScreen.class, str);
    }

    public static AddressMapPickerSourceScreen[] values() {
        return (AddressMapPickerSourceScreen[]) $VALUES.clone();
    }
}
