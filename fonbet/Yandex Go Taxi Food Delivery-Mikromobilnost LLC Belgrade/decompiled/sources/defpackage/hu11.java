package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class hu11 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentKitError.Kind6_6_0.values().length];
        try {
            iArr[PaymentKitError.Kind6_6_0.sbpTokenBindingDuplicate.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentKitError.Kind.values().length];
        try {
            iArr2[PaymentKitError.Kind.tooManyCards.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[PaymentKitError.Kind.fail3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PaymentKitError.Kind.expiredCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PaymentKitError.Kind.invalidProcessingRequest.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PaymentKitError.Kind.limitExceeded.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentKitError.Kind.notEnoughFunds.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentKitError.Kind.paymentAuthorizationReject.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentKitError.Kind.paymentCancelled.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentKitError.Kind.paymentGatewayTechnicalError.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PaymentKitError.Kind.paymentTimeout.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PaymentKitError.Kind.promocodeAlreadyUsed.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PaymentKitError.Kind.restrictedCard.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PaymentKitError.Kind.transactionNotPermitted.ordinal()] = 13;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PaymentKitError.Kind.userCancelled.ordinal()] = 14;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[PaymentKitError.Kind.creditRejected.ordinal()] = 15;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[PaymentKitError.Kind.sbpBanksNotFound.ordinal()] = 16;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[PaymentKitError.Kind.paymentMethodNotFound.ordinal()] = 17;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[PaymentKitError.Kind.startBankError.ordinal()] = 18;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[PaymentKitError.Kind.sbpBankListLoadFailed.ordinal()] = 19;
        } catch (NoSuchFieldError unused20) {
        }
        b = iArr2;
    }
}
