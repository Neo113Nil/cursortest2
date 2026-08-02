package com.yandex.go.payments.api.composite;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/api/composite/CompositePaymentState;", "", "ENABLED_CHECKED", "ENABLED_UNCHECKED", "DISABLED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompositePaymentState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositePaymentState[] $VALUES;
    public static final CompositePaymentState DISABLED;
    public static final CompositePaymentState ENABLED_CHECKED;
    public static final CompositePaymentState ENABLED_UNCHECKED;

    static {
        CompositePaymentState compositePaymentState = new CompositePaymentState("ENABLED_CHECKED", 0);
        ENABLED_CHECKED = compositePaymentState;
        CompositePaymentState compositePaymentState2 = new CompositePaymentState("ENABLED_UNCHECKED", 1);
        ENABLED_UNCHECKED = compositePaymentState2;
        CompositePaymentState compositePaymentState3 = new CompositePaymentState("DISABLED", 2);
        DISABLED = compositePaymentState3;
        CompositePaymentState[] compositePaymentStateArr = {compositePaymentState, compositePaymentState2, compositePaymentState3};
        $VALUES = compositePaymentStateArr;
        $ENTRIES = a.a(compositePaymentStateArr);
    }

    public static CompositePaymentState valueOf(String str) {
        return (CompositePaymentState) Enum.valueOf(CompositePaymentState.class, str);
    }

    public static CompositePaymentState[] values() {
        return (CompositePaymentState[]) $VALUES.clone();
    }
}
