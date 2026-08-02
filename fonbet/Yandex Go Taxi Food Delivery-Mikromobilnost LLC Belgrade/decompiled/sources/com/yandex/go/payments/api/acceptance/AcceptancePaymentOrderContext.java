package com.yandex.go.payments.api.acceptance;

import defpackage.k4o;
import defpackage.xe;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/api/acceptance/AcceptancePaymentOrderContext;", "", "", "wireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "xe", "TRANSPORTING", "COMPLETE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AcceptancePaymentOrderContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcceptancePaymentOrderContext[] $VALUES;
    public static final AcceptancePaymentOrderContext COMPLETE;
    public static final xe Companion;
    public static final AcceptancePaymentOrderContext TRANSPORTING;
    private final String wireName;

    static {
        AcceptancePaymentOrderContext acceptancePaymentOrderContext = new AcceptancePaymentOrderContext("TRANSPORTING", 0, "TRANSPORTING");
        TRANSPORTING = acceptancePaymentOrderContext;
        AcceptancePaymentOrderContext acceptancePaymentOrderContext2 = new AcceptancePaymentOrderContext("COMPLETE", 1, "COMPLETE");
        COMPLETE = acceptancePaymentOrderContext2;
        AcceptancePaymentOrderContext[] acceptancePaymentOrderContextArr = {acceptancePaymentOrderContext, acceptancePaymentOrderContext2};
        $VALUES = acceptancePaymentOrderContextArr;
        $ENTRIES = a.a(acceptancePaymentOrderContextArr);
        Companion = new xe();
    }

    public AcceptancePaymentOrderContext(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static AcceptancePaymentOrderContext valueOf(String str) {
        return (AcceptancePaymentOrderContext) Enum.valueOf(AcceptancePaymentOrderContext.class, str);
    }

    public static AcceptancePaymentOrderContext[] values() {
        return (AcceptancePaymentOrderContext[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
