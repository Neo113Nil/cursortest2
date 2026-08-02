package defpackage;

import com.yandex.plus.acquisition.sdk.api.offers.PlusAcquisitionVendorType;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public final class ozs0 {
    public final kzs0 a;

    public ozs0(kzs0 kzs0Var) {
        this.a = kzs0Var;
    }

    public static PlusAcquisitionVendorType a(PlusPayCompositeOffers.Offer.Vendor vendor) {
        int i = nzs0.a[vendor.ordinal()];
        if (i == 1) {
            return PlusAcquisitionVendorType.Google.INSTANCE;
        }
        if (i == 2) {
            return PlusAcquisitionVendorType.Yandex.INSTANCE;
        }
        if (i == 3) {
            return PlusAcquisitionVendorType.Other.INSTANCE;
        }
        w511.b();
        return null;
    }
}
