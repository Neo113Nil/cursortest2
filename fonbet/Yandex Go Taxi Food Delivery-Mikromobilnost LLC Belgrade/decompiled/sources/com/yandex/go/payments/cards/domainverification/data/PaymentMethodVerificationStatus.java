package com.yandex.go.payments.cards.domainverification.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.m8a0;
import defpackage.t7a0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatus;", "", "Companion", "m8a0", "NOT_STARTED", "CVN_EXPECTED", "REQUIRED_3DS", "IN_PROGRESS", "AMOUNT_EXPECTED", "SMS_CODE_EXPECTED", "OTP_EXPECTED", "QR_EXPECTED", "RECEIVED_3DS_STATUS", "SUCCESS", "FAILURE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodVerificationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodVerificationStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PaymentMethodVerificationStatus AMOUNT_EXPECTED;
    public static final PaymentMethodVerificationStatus CVN_EXPECTED;
    public static final m8a0 Companion;
    public static final PaymentMethodVerificationStatus FAILURE;
    public static final PaymentMethodVerificationStatus IN_PROGRESS;
    public static final PaymentMethodVerificationStatus NOT_STARTED;
    public static final PaymentMethodVerificationStatus OTP_EXPECTED;
    public static final PaymentMethodVerificationStatus QR_EXPECTED;
    public static final PaymentMethodVerificationStatus RECEIVED_3DS_STATUS;
    public static final PaymentMethodVerificationStatus REQUIRED_3DS;
    public static final PaymentMethodVerificationStatus SMS_CODE_EXPECTED;
    public static final PaymentMethodVerificationStatus SUCCESS;
    public static final PaymentMethodVerificationStatus UNKNOWN;

    static {
        PaymentMethodVerificationStatus paymentMethodVerificationStatus = new PaymentMethodVerificationStatus("NOT_STARTED", 0);
        NOT_STARTED = paymentMethodVerificationStatus;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus2 = new PaymentMethodVerificationStatus("CVN_EXPECTED", 1);
        CVN_EXPECTED = paymentMethodVerificationStatus2;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus3 = new PaymentMethodVerificationStatus("REQUIRED_3DS", 2);
        REQUIRED_3DS = paymentMethodVerificationStatus3;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus4 = new PaymentMethodVerificationStatus("IN_PROGRESS", 3);
        IN_PROGRESS = paymentMethodVerificationStatus4;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus5 = new PaymentMethodVerificationStatus("AMOUNT_EXPECTED", 4);
        AMOUNT_EXPECTED = paymentMethodVerificationStatus5;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus6 = new PaymentMethodVerificationStatus("SMS_CODE_EXPECTED", 5);
        SMS_CODE_EXPECTED = paymentMethodVerificationStatus6;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus7 = new PaymentMethodVerificationStatus("OTP_EXPECTED", 6);
        OTP_EXPECTED = paymentMethodVerificationStatus7;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus8 = new PaymentMethodVerificationStatus("QR_EXPECTED", 7);
        QR_EXPECTED = paymentMethodVerificationStatus8;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus9 = new PaymentMethodVerificationStatus("RECEIVED_3DS_STATUS", 8);
        RECEIVED_3DS_STATUS = paymentMethodVerificationStatus9;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus10 = new PaymentMethodVerificationStatus("SUCCESS", 9);
        SUCCESS = paymentMethodVerificationStatus10;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus11 = new PaymentMethodVerificationStatus("FAILURE", 10);
        FAILURE = paymentMethodVerificationStatus11;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus12 = new PaymentMethodVerificationStatus("UNKNOWN", 11);
        UNKNOWN = paymentMethodVerificationStatus12;
        PaymentMethodVerificationStatus[] paymentMethodVerificationStatusArr = {paymentMethodVerificationStatus, paymentMethodVerificationStatus2, paymentMethodVerificationStatus3, paymentMethodVerificationStatus4, paymentMethodVerificationStatus5, paymentMethodVerificationStatus6, paymentMethodVerificationStatus7, paymentMethodVerificationStatus8, paymentMethodVerificationStatus9, paymentMethodVerificationStatus10, paymentMethodVerificationStatus11, paymentMethodVerificationStatus12};
        $VALUES = paymentMethodVerificationStatusArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodVerificationStatusArr);
        Companion = new m8a0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(2));
    }

    public static PaymentMethodVerificationStatus valueOf(String str) {
        return (PaymentMethodVerificationStatus) Enum.valueOf(PaymentMethodVerificationStatus.class, str);
    }

    public static PaymentMethodVerificationStatus[] values() {
        return (PaymentMethodVerificationStatus[]) $VALUES.clone();
    }
}
