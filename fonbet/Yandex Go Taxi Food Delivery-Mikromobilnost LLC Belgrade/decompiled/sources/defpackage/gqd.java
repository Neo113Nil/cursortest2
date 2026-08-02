package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class gqd {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusPayCompositeOffers.Offer.StructureType.values().length];
        try {
            iArr[PlusPayCompositeOffers.Offer.StructureType.TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayCompositeOffers.Offer.StructureType.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayCompositeOffers.Offer.StructureType.COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPayCompositeOffers.Offer.Vendor.values().length];
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
