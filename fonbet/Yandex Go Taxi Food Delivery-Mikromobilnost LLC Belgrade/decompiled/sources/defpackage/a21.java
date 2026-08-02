package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a21 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AddressMapPickerPointType.values().length];
        try {
            iArr[AddressMapPickerPointType.Source.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressMapPickerPointType.Destination.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[AddressMapPickerSourceScreen.values().length];
        try {
            iArr2[AddressMapPickerSourceScreen.Superapp.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AddressMapPickerSourceScreen.SuperappSearch.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AddressMapPickerSourceScreen.TaxiMain.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AddressMapPickerSourceScreen.Summary.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AddressMapPickerSourceScreen.Order.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AddressMapPickerSourceScreen.Intercity.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
