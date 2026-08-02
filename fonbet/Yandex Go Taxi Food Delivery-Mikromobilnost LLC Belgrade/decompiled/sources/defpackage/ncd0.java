package defpackage;

import com.yandex.plus.pay.inapp.google.common.internal.operation.PlusPayGoogleBillingResponse$Code;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ncd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayGoogleBillingResponse$Code.values().length];
        try {
            iArr[PlusPayGoogleBillingResponse$Code.NETWORK_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.SERVICE_DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.BILLING_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.SERVICE_UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.ITEM_UNAVAILABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.DEVELOPER_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.ITEM_ALREADY_OWNED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.USER_CANCELED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.PAYMENT_TIMEOUT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.PURCHASE_UNSPECIFIED_STATE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PlusPayGoogleBillingResponse$Code.NOT_ENOUGH_FUNDS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
