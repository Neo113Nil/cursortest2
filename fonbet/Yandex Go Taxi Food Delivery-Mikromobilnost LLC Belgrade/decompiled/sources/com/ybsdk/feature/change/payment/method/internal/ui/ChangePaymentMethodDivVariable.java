package com.ybsdk.feature.change.payment.method.internal.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/ui/ChangePaymentMethodDivVariable;", "", "variableName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getVariableName", "()Ljava/lang/String;", "SHOULD_EXECUTE_CLOSE_ACTIONS", "TRUST_ID", "SET_DEFAULT_PAYMENT_METHOD_STATUS", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangePaymentMethodDivVariable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePaymentMethodDivVariable[] $VALUES;
    private final String variableName;
    public static final ChangePaymentMethodDivVariable SHOULD_EXECUTE_CLOSE_ACTIONS = new ChangePaymentMethodDivVariable("SHOULD_EXECUTE_CLOSE_ACTIONS", 0, "SHOULD_EXECUTE_CLOSE_ACTIONS");
    public static final ChangePaymentMethodDivVariable TRUST_ID = new ChangePaymentMethodDivVariable("TRUST_ID", 1, "TRUST_ID");
    public static final ChangePaymentMethodDivVariable SET_DEFAULT_PAYMENT_METHOD_STATUS = new ChangePaymentMethodDivVariable("SET_DEFAULT_PAYMENT_METHOD_STATUS", 2, "SET_DEFAULT_PAYMENT_METHOD_STATUS");

    private static final /* synthetic */ ChangePaymentMethodDivVariable[] $values() {
        return new ChangePaymentMethodDivVariable[]{SHOULD_EXECUTE_CLOSE_ACTIONS, TRUST_ID, SET_DEFAULT_PAYMENT_METHOD_STATUS};
    }

    static {
        ChangePaymentMethodDivVariable[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ChangePaymentMethodDivVariable(String str, int i, String str2) {
        this.variableName = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ChangePaymentMethodDivVariable valueOf(String str) {
        return (ChangePaymentMethodDivVariable) Enum.valueOf(ChangePaymentMethodDivVariable.class, str);
    }

    public static ChangePaymentMethodDivVariable[] values() {
        return (ChangePaymentMethodDivVariable[]) $VALUES.clone();
    }

    public final String getVariableName() {
        return this.variableName;
    }
}
