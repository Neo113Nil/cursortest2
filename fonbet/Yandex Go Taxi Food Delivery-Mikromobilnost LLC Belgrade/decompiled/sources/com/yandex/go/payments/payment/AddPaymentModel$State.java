package com.yandex.go.payments.payment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/payments/payment/AddPaymentModel$State", "", "Lcom/yandex/go/payments/payment/AddPaymentModel$State;", "ENABLED", "BUSY", "DISABLED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddPaymentModel$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddPaymentModel$State[] $VALUES;
    public static final AddPaymentModel$State BUSY;
    public static final AddPaymentModel$State DISABLED;
    public static final AddPaymentModel$State ENABLED;

    static {
        AddPaymentModel$State addPaymentModel$State = new AddPaymentModel$State("ENABLED", 0);
        ENABLED = addPaymentModel$State;
        AddPaymentModel$State addPaymentModel$State2 = new AddPaymentModel$State("BUSY", 1);
        BUSY = addPaymentModel$State2;
        AddPaymentModel$State addPaymentModel$State3 = new AddPaymentModel$State("DISABLED", 2);
        DISABLED = addPaymentModel$State3;
        AddPaymentModel$State[] addPaymentModel$StateArr = {addPaymentModel$State, addPaymentModel$State2, addPaymentModel$State3};
        $VALUES = addPaymentModel$StateArr;
        $ENTRIES = a.a(addPaymentModel$StateArr);
    }

    public static AddPaymentModel$State valueOf(String str) {
        return (AddPaymentModel$State) Enum.valueOf(AddPaymentModel$State.class, str);
    }

    public static AddPaymentModel$State[] values() {
        return (AddPaymentModel$State[]) $VALUES.clone();
    }
}
