package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class pz90 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentErrorButtonContent$ClickAction.values().length];
        try {
            iArr[PaymentErrorButtonContent$ClickAction.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentErrorButtonContent$ClickAction.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPayCompositeOffers.Offer.Vendor.values().length];
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PlusPayCompositeOffers.Offer.Vendor.NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
