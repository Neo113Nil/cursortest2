package com.yandex.go.overdraft.data.model;

import defpackage.bka0;
import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/overdraft/data/model/PaymentState;", "", "Companion", "bka0", "DEBT", "SBP_AWAITING_TOKEN", "SBP_AWAITING_USER_INTERACTION", "PROCESSING", "NO_DEBT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final bka0 Companion;
    public static final PaymentState DEBT;
    public static final PaymentState NO_DEBT;
    public static final PaymentState PROCESSING;
    public static final PaymentState SBP_AWAITING_TOKEN;
    public static final PaymentState SBP_AWAITING_USER_INTERACTION;
    public static final PaymentState UNKNOWN;

    static {
        PaymentState paymentState = new PaymentState("DEBT", 0);
        DEBT = paymentState;
        PaymentState paymentState2 = new PaymentState("SBP_AWAITING_TOKEN", 1);
        SBP_AWAITING_TOKEN = paymentState2;
        PaymentState paymentState3 = new PaymentState("SBP_AWAITING_USER_INTERACTION", 2);
        SBP_AWAITING_USER_INTERACTION = paymentState3;
        PaymentState paymentState4 = new PaymentState("PROCESSING", 3);
        PROCESSING = paymentState4;
        PaymentState paymentState5 = new PaymentState("NO_DEBT", 4);
        NO_DEBT = paymentState5;
        PaymentState paymentState6 = new PaymentState("UNKNOWN", 5);
        UNKNOWN = paymentState6;
        PaymentState[] paymentStateArr = {paymentState, paymentState2, paymentState3, paymentState4, paymentState5, paymentState6};
        $VALUES = paymentStateArr;
        $ENTRIES = kotlin.enums.a.a(paymentStateArr);
        Companion = new bka0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(21));
    }

    public static PaymentState valueOf(String str) {
        return (PaymentState) Enum.valueOf(PaymentState.class, str);
    }

    public static PaymentState[] values() {
        return (PaymentState[]) $VALUES.clone();
    }
}
