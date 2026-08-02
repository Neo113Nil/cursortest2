package defpackage;

import com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pzs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayAcquisitionOfferVendorTypeDto.values().length];
        try {
            iArr[PlusPayAcquisitionOfferVendorTypeDto.GOOGLE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayAcquisitionOfferVendorTypeDto.NATIVE_YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
