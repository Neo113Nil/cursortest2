package com.yandex.plus.pay.inapp.google.common.internal.operation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/plus/pay/inapp/google/common/internal/operation/PlusPayGoogleBillingResponse$Code", "", "Lcom/yandex/plus/pay/inapp/google/common/internal/operation/PlusPayGoogleBillingResponse$Code;", "OK", "NETWORK_ERROR", "SERVICE_DISCONNECTED", "BILLING_UNAVAILABLE", "SERVICE_UNAVAILABLE", "ITEM_UNAVAILABLE", "DEVELOPER_ERROR", "ERROR", "ITEM_ALREADY_OWNED", "USER_CANCELED", "PAYMENT_TIMEOUT", "PURCHASE_UNSPECIFIED_STATE", "NOT_ENOUGH_FUNDS", "UNKNOWN", "pay-sdk-inapp-google-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusPayGoogleBillingResponse$Code {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayGoogleBillingResponse$Code[] $VALUES;
    public static final PlusPayGoogleBillingResponse$Code BILLING_UNAVAILABLE;
    public static final PlusPayGoogleBillingResponse$Code DEVELOPER_ERROR;
    public static final PlusPayGoogleBillingResponse$Code ERROR;
    public static final PlusPayGoogleBillingResponse$Code ITEM_ALREADY_OWNED;
    public static final PlusPayGoogleBillingResponse$Code ITEM_UNAVAILABLE;
    public static final PlusPayGoogleBillingResponse$Code NETWORK_ERROR;
    public static final PlusPayGoogleBillingResponse$Code NOT_ENOUGH_FUNDS;
    public static final PlusPayGoogleBillingResponse$Code OK;
    public static final PlusPayGoogleBillingResponse$Code PAYMENT_TIMEOUT;
    public static final PlusPayGoogleBillingResponse$Code PURCHASE_UNSPECIFIED_STATE;
    public static final PlusPayGoogleBillingResponse$Code SERVICE_DISCONNECTED;
    public static final PlusPayGoogleBillingResponse$Code SERVICE_UNAVAILABLE;
    public static final PlusPayGoogleBillingResponse$Code UNKNOWN;
    public static final PlusPayGoogleBillingResponse$Code USER_CANCELED;

    static {
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code = new PlusPayGoogleBillingResponse$Code("OK", 0);
        OK = plusPayGoogleBillingResponse$Code;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code2 = new PlusPayGoogleBillingResponse$Code("NETWORK_ERROR", 1);
        NETWORK_ERROR = plusPayGoogleBillingResponse$Code2;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code3 = new PlusPayGoogleBillingResponse$Code("SERVICE_DISCONNECTED", 2);
        SERVICE_DISCONNECTED = plusPayGoogleBillingResponse$Code3;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code4 = new PlusPayGoogleBillingResponse$Code("BILLING_UNAVAILABLE", 3);
        BILLING_UNAVAILABLE = plusPayGoogleBillingResponse$Code4;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code5 = new PlusPayGoogleBillingResponse$Code("SERVICE_UNAVAILABLE", 4);
        SERVICE_UNAVAILABLE = plusPayGoogleBillingResponse$Code5;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code6 = new PlusPayGoogleBillingResponse$Code("ITEM_UNAVAILABLE", 5);
        ITEM_UNAVAILABLE = plusPayGoogleBillingResponse$Code6;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code7 = new PlusPayGoogleBillingResponse$Code("DEVELOPER_ERROR", 6);
        DEVELOPER_ERROR = plusPayGoogleBillingResponse$Code7;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code8 = new PlusPayGoogleBillingResponse$Code("ERROR", 7);
        ERROR = plusPayGoogleBillingResponse$Code8;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code9 = new PlusPayGoogleBillingResponse$Code("ITEM_ALREADY_OWNED", 8);
        ITEM_ALREADY_OWNED = plusPayGoogleBillingResponse$Code9;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code10 = new PlusPayGoogleBillingResponse$Code("USER_CANCELED", 9);
        USER_CANCELED = plusPayGoogleBillingResponse$Code10;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code11 = new PlusPayGoogleBillingResponse$Code("PAYMENT_TIMEOUT", 10);
        PAYMENT_TIMEOUT = plusPayGoogleBillingResponse$Code11;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code12 = new PlusPayGoogleBillingResponse$Code("PURCHASE_UNSPECIFIED_STATE", 11);
        PURCHASE_UNSPECIFIED_STATE = plusPayGoogleBillingResponse$Code12;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code13 = new PlusPayGoogleBillingResponse$Code("NOT_ENOUGH_FUNDS", 12);
        NOT_ENOUGH_FUNDS = plusPayGoogleBillingResponse$Code13;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code14 = new PlusPayGoogleBillingResponse$Code("UNKNOWN", 13);
        UNKNOWN = plusPayGoogleBillingResponse$Code14;
        PlusPayGoogleBillingResponse$Code[] plusPayGoogleBillingResponse$CodeArr = {plusPayGoogleBillingResponse$Code, plusPayGoogleBillingResponse$Code2, plusPayGoogleBillingResponse$Code3, plusPayGoogleBillingResponse$Code4, plusPayGoogleBillingResponse$Code5, plusPayGoogleBillingResponse$Code6, plusPayGoogleBillingResponse$Code7, plusPayGoogleBillingResponse$Code8, plusPayGoogleBillingResponse$Code9, plusPayGoogleBillingResponse$Code10, plusPayGoogleBillingResponse$Code11, plusPayGoogleBillingResponse$Code12, plusPayGoogleBillingResponse$Code13, plusPayGoogleBillingResponse$Code14};
        $VALUES = plusPayGoogleBillingResponse$CodeArr;
        $ENTRIES = kotlin.enums.a.a(plusPayGoogleBillingResponse$CodeArr);
    }

    public static PlusPayGoogleBillingResponse$Code valueOf(String str) {
        return (PlusPayGoogleBillingResponse$Code) Enum.valueOf(PlusPayGoogleBillingResponse$Code.class, str);
    }

    public static PlusPayGoogleBillingResponse$Code[] values() {
        return (PlusPayGoogleBillingResponse$Code[]) $VALUES.clone();
    }
}
