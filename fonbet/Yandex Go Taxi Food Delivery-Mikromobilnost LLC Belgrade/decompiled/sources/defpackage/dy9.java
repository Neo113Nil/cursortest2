package defpackage;

import com.yandex.go.chargers.error.api.ChargersErrorCode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dy9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersErrorCode.values().length];
        try {
            iArr[ChargersErrorCode.NETWORK_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersErrorCode.AUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersErrorCode.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersErrorCode.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersErrorCode.PAYMENT_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChargersErrorCode.OFFER_NOT_FOUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChargersErrorCode.ORDER_NOT_FOUND.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChargersErrorCode.USER_IS_DEBTOR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ChargersErrorCode.INTERNAL_ERROR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ChargersErrorCode.STATION_NOT_FOUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ChargersErrorCode.EXECUTION_FAILED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ChargersErrorCode.STATION_IS_EMPTY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ChargersErrorCode.STATION_IS_BUSY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ChargersErrorCode.OFFER_IS_EXPIRED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ChargersErrorCode.FORBIDDEN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ChargersErrorCode.PRICE_CHANGED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ChargersErrorCode.NOT_ENOUGH_MONEY.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ChargersErrorCode.SUBSCRIPTION_POLLING_FAILURE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ChargersErrorCode.DVIZH_PURCHASE_ON_OFFER_FAILED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        a = iArr;
    }
}
