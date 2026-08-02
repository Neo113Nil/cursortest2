package com.yandex.plus.pay.repository.api.model.invoice;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/plus/pay/repository/api/model/invoice/Invoice$Payment$ErrorStatusCode", "", "Lcom/yandex/plus/pay/repository/api/model/invoice/Invoice$Payment$ErrorStatusCode;", "PAYMENT_TIMEOUT", "BLACKLISTED", "EXPIRED_CARD", "USER_CANCELLED", "RESTRICTED_CARD", "FAIL_3DS", "NOT_ENOUGH_FUNDS", "INVALID_XRF_TOKEN", "OPERATION_CANCELLED", "AUTH_REJECT", "TIMEOUT_NO_SUCCESS", "TRANSACTION_NOT_PERMITTED", "LIMIT_EXCEEDED", "UNEXPECTED", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Invoice$Payment$ErrorStatusCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Invoice$Payment$ErrorStatusCode[] $VALUES;
    public static final Invoice$Payment$ErrorStatusCode AUTH_REJECT;
    public static final Invoice$Payment$ErrorStatusCode BLACKLISTED;
    public static final Invoice$Payment$ErrorStatusCode EXPIRED_CARD;
    public static final Invoice$Payment$ErrorStatusCode FAIL_3DS;
    public static final Invoice$Payment$ErrorStatusCode INVALID_XRF_TOKEN;
    public static final Invoice$Payment$ErrorStatusCode LIMIT_EXCEEDED;
    public static final Invoice$Payment$ErrorStatusCode NOT_ENOUGH_FUNDS;
    public static final Invoice$Payment$ErrorStatusCode OPERATION_CANCELLED;
    public static final Invoice$Payment$ErrorStatusCode PAYMENT_TIMEOUT;
    public static final Invoice$Payment$ErrorStatusCode RESTRICTED_CARD;
    public static final Invoice$Payment$ErrorStatusCode TIMEOUT_NO_SUCCESS;
    public static final Invoice$Payment$ErrorStatusCode TRANSACTION_NOT_PERMITTED;
    public static final Invoice$Payment$ErrorStatusCode UNEXPECTED;
    public static final Invoice$Payment$ErrorStatusCode USER_CANCELLED;

    static {
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode = new Invoice$Payment$ErrorStatusCode("PAYMENT_TIMEOUT", 0);
        PAYMENT_TIMEOUT = invoice$Payment$ErrorStatusCode;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode2 = new Invoice$Payment$ErrorStatusCode("BLACKLISTED", 1);
        BLACKLISTED = invoice$Payment$ErrorStatusCode2;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode3 = new Invoice$Payment$ErrorStatusCode("EXPIRED_CARD", 2);
        EXPIRED_CARD = invoice$Payment$ErrorStatusCode3;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode4 = new Invoice$Payment$ErrorStatusCode("USER_CANCELLED", 3);
        USER_CANCELLED = invoice$Payment$ErrorStatusCode4;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode5 = new Invoice$Payment$ErrorStatusCode("RESTRICTED_CARD", 4);
        RESTRICTED_CARD = invoice$Payment$ErrorStatusCode5;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode6 = new Invoice$Payment$ErrorStatusCode("FAIL_3DS", 5);
        FAIL_3DS = invoice$Payment$ErrorStatusCode6;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode7 = new Invoice$Payment$ErrorStatusCode("NOT_ENOUGH_FUNDS", 6);
        NOT_ENOUGH_FUNDS = invoice$Payment$ErrorStatusCode7;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode8 = new Invoice$Payment$ErrorStatusCode("INVALID_XRF_TOKEN", 7);
        INVALID_XRF_TOKEN = invoice$Payment$ErrorStatusCode8;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode9 = new Invoice$Payment$ErrorStatusCode("OPERATION_CANCELLED", 8);
        OPERATION_CANCELLED = invoice$Payment$ErrorStatusCode9;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode10 = new Invoice$Payment$ErrorStatusCode("AUTH_REJECT", 9);
        AUTH_REJECT = invoice$Payment$ErrorStatusCode10;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode11 = new Invoice$Payment$ErrorStatusCode("TIMEOUT_NO_SUCCESS", 10);
        TIMEOUT_NO_SUCCESS = invoice$Payment$ErrorStatusCode11;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode12 = new Invoice$Payment$ErrorStatusCode("TRANSACTION_NOT_PERMITTED", 11);
        TRANSACTION_NOT_PERMITTED = invoice$Payment$ErrorStatusCode12;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode13 = new Invoice$Payment$ErrorStatusCode("LIMIT_EXCEEDED", 12);
        LIMIT_EXCEEDED = invoice$Payment$ErrorStatusCode13;
        Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode14 = new Invoice$Payment$ErrorStatusCode("UNEXPECTED", 13);
        UNEXPECTED = invoice$Payment$ErrorStatusCode14;
        Invoice$Payment$ErrorStatusCode[] invoice$Payment$ErrorStatusCodeArr = {invoice$Payment$ErrorStatusCode, invoice$Payment$ErrorStatusCode2, invoice$Payment$ErrorStatusCode3, invoice$Payment$ErrorStatusCode4, invoice$Payment$ErrorStatusCode5, invoice$Payment$ErrorStatusCode6, invoice$Payment$ErrorStatusCode7, invoice$Payment$ErrorStatusCode8, invoice$Payment$ErrorStatusCode9, invoice$Payment$ErrorStatusCode10, invoice$Payment$ErrorStatusCode11, invoice$Payment$ErrorStatusCode12, invoice$Payment$ErrorStatusCode13, invoice$Payment$ErrorStatusCode14};
        $VALUES = invoice$Payment$ErrorStatusCodeArr;
        $ENTRIES = a.a(invoice$Payment$ErrorStatusCodeArr);
    }

    public static Invoice$Payment$ErrorStatusCode valueOf(String str) {
        return (Invoice$Payment$ErrorStatusCode) Enum.valueOf(Invoice$Payment$ErrorStatusCode.class, str);
    }

    public static Invoice$Payment$ErrorStatusCode[] values() {
        return (Invoice$Payment$ErrorStatusCode[]) $VALUES.clone();
    }
}
