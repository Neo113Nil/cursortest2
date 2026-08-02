package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dob {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayCompositeOffers.Offer.Vendor.values().length];
        try {
            iArr[PlusPayCompositeOffers.Offer.Vendor.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayCompositeOffers.Offer.Vendor.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
