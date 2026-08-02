package com.yandex.plus.pay.api.exception;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayGooglePlayErrorKind;", "", "CONNECTION_ERROR", "BILLING_UNAVAILABLE", "PRODUCT_UNAVAILABLE", "PURCHASE_UNSPECIFIED_STATE", "NOT_ENOUGH_FUNDS", "BILLING_INTERNAL_ERROR", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayGooglePlayErrorKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayGooglePlayErrorKind[] $VALUES;
    public static final PlusPayGooglePlayErrorKind BILLING_INTERNAL_ERROR;
    public static final PlusPayGooglePlayErrorKind BILLING_UNAVAILABLE;
    public static final PlusPayGooglePlayErrorKind CONNECTION_ERROR;
    public static final PlusPayGooglePlayErrorKind NOT_ENOUGH_FUNDS;
    public static final PlusPayGooglePlayErrorKind PRODUCT_UNAVAILABLE;
    public static final PlusPayGooglePlayErrorKind PURCHASE_UNSPECIFIED_STATE;

    static {
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind = new PlusPayGooglePlayErrorKind("CONNECTION_ERROR", 0);
        CONNECTION_ERROR = plusPayGooglePlayErrorKind;
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind2 = new PlusPayGooglePlayErrorKind("BILLING_UNAVAILABLE", 1);
        BILLING_UNAVAILABLE = plusPayGooglePlayErrorKind2;
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind3 = new PlusPayGooglePlayErrorKind("PRODUCT_UNAVAILABLE", 2);
        PRODUCT_UNAVAILABLE = plusPayGooglePlayErrorKind3;
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind4 = new PlusPayGooglePlayErrorKind("PURCHASE_UNSPECIFIED_STATE", 3);
        PURCHASE_UNSPECIFIED_STATE = plusPayGooglePlayErrorKind4;
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind5 = new PlusPayGooglePlayErrorKind("NOT_ENOUGH_FUNDS", 4);
        NOT_ENOUGH_FUNDS = plusPayGooglePlayErrorKind5;
        PlusPayGooglePlayErrorKind plusPayGooglePlayErrorKind6 = new PlusPayGooglePlayErrorKind("BILLING_INTERNAL_ERROR", 5);
        BILLING_INTERNAL_ERROR = plusPayGooglePlayErrorKind6;
        PlusPayGooglePlayErrorKind[] plusPayGooglePlayErrorKindArr = {plusPayGooglePlayErrorKind, plusPayGooglePlayErrorKind2, plusPayGooglePlayErrorKind3, plusPayGooglePlayErrorKind4, plusPayGooglePlayErrorKind5, plusPayGooglePlayErrorKind6};
        $VALUES = plusPayGooglePlayErrorKindArr;
        $ENTRIES = a.a(plusPayGooglePlayErrorKindArr);
    }

    public static PlusPayGooglePlayErrorKind valueOf(String str) {
        return (PlusPayGooglePlayErrorKind) Enum.valueOf(PlusPayGooglePlayErrorKind.class, str);
    }

    public static PlusPayGooglePlayErrorKind[] values() {
        return (PlusPayGooglePlayErrorKind[]) $VALUES.clone();
    }
}
