package com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/setup/v2/state/PaymentMethodState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SAVING", "ME2ME", "UNSELECTED", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodState[] $VALUES;
    private final String value;
    public static final PaymentMethodState SAVING = new PaymentMethodState("SAVING", 0, "saving");
    public static final PaymentMethodState ME2ME = new PaymentMethodState("ME2ME", 1, "me2me");
    public static final PaymentMethodState UNSELECTED = new PaymentMethodState("UNSELECTED", 2, "unselected");

    private static final /* synthetic */ PaymentMethodState[] $values() {
        return new PaymentMethodState[]{SAVING, ME2ME, UNSELECTED};
    }

    static {
        PaymentMethodState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PaymentMethodState(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethodState valueOf(String str) {
        return (PaymentMethodState) Enum.valueOf(PaymentMethodState.class, str);
    }

    public static PaymentMethodState[] values() {
        return (PaymentMethodState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
