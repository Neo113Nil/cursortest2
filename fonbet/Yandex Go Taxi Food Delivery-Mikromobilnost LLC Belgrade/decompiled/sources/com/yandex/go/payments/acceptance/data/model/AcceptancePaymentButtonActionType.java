package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pd;
import defpackage.qd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentButtonActionType;", "", "Companion", "qd", "OPEN_PAYMENT_URL", "CANCEL_PAYMENT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AcceptancePaymentButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcceptancePaymentButtonActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final AcceptancePaymentButtonActionType CANCEL_PAYMENT;
    public static final qd Companion;
    public static final AcceptancePaymentButtonActionType OPEN_PAYMENT_URL;
    public static final AcceptancePaymentButtonActionType UNKNOWN;

    static {
        AcceptancePaymentButtonActionType acceptancePaymentButtonActionType = new AcceptancePaymentButtonActionType("OPEN_PAYMENT_URL", 0);
        OPEN_PAYMENT_URL = acceptancePaymentButtonActionType;
        AcceptancePaymentButtonActionType acceptancePaymentButtonActionType2 = new AcceptancePaymentButtonActionType("CANCEL_PAYMENT", 1);
        CANCEL_PAYMENT = acceptancePaymentButtonActionType2;
        AcceptancePaymentButtonActionType acceptancePaymentButtonActionType3 = new AcceptancePaymentButtonActionType("UNKNOWN", 2);
        UNKNOWN = acceptancePaymentButtonActionType3;
        AcceptancePaymentButtonActionType[] acceptancePaymentButtonActionTypeArr = {acceptancePaymentButtonActionType, acceptancePaymentButtonActionType2, acceptancePaymentButtonActionType3};
        $VALUES = acceptancePaymentButtonActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(acceptancePaymentButtonActionTypeArr);
        Companion = new qd();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(1));
    }

    public static AcceptancePaymentButtonActionType valueOf(String str) {
        return (AcceptancePaymentButtonActionType) Enum.valueOf(AcceptancePaymentButtonActionType.class, str);
    }

    public static AcceptancePaymentButtonActionType[] values() {
        return (AcceptancePaymentButtonActionType[]) $VALUES.clone();
    }
}
