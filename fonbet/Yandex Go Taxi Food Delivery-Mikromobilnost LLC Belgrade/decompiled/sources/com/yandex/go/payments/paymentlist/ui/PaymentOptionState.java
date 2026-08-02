package com.yandex.go.payments.paymentlist.ui;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/paymentlist/ui/PaymentOptionState;", "", "UNSELECTED", "SELECTED", "DELETABLE", "DELETABLE_WITH_EDIT_NAME", "CLICKABLE", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentOptionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentOptionState[] $VALUES;
    public static final PaymentOptionState CLICKABLE;
    public static final PaymentOptionState DELETABLE;
    public static final PaymentOptionState DELETABLE_WITH_EDIT_NAME;
    public static final PaymentOptionState NONE;
    public static final PaymentOptionState SELECTED;
    public static final PaymentOptionState UNSELECTED;

    static {
        PaymentOptionState paymentOptionState = new PaymentOptionState("UNSELECTED", 0);
        UNSELECTED = paymentOptionState;
        PaymentOptionState paymentOptionState2 = new PaymentOptionState("SELECTED", 1);
        SELECTED = paymentOptionState2;
        PaymentOptionState paymentOptionState3 = new PaymentOptionState("DELETABLE", 2);
        DELETABLE = paymentOptionState3;
        PaymentOptionState paymentOptionState4 = new PaymentOptionState("DELETABLE_WITH_EDIT_NAME", 3);
        DELETABLE_WITH_EDIT_NAME = paymentOptionState4;
        PaymentOptionState paymentOptionState5 = new PaymentOptionState("CLICKABLE", 4);
        CLICKABLE = paymentOptionState5;
        PaymentOptionState paymentOptionState6 = new PaymentOptionState(JCP.RAW_PREFIX, 5);
        NONE = paymentOptionState6;
        PaymentOptionState[] paymentOptionStateArr = {paymentOptionState, paymentOptionState2, paymentOptionState3, paymentOptionState4, paymentOptionState5, paymentOptionState6};
        $VALUES = paymentOptionStateArr;
        $ENTRIES = kotlin.enums.a.a(paymentOptionStateArr);
    }

    public static PaymentOptionState valueOf(String str) {
        return (PaymentOptionState) Enum.valueOf(PaymentOptionState.class, str);
    }

    public static PaymentOptionState[] values() {
        return (PaymentOptionState[]) $VALUES.clone();
    }
}
