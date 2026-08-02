package defpackage;

import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class j31 {
    public static final /* synthetic */ int[] a;

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
    }
}
