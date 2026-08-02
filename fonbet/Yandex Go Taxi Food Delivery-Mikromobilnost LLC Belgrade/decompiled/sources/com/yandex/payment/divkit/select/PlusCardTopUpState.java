package com.yandex.payment.divkit.select;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/payment/divkit/select/PlusCardTopUpState;", "", "INITIAL", "LOADING", "DATA", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusCardTopUpState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusCardTopUpState[] $VALUES;
    public static final PlusCardTopUpState DATA;
    public static final PlusCardTopUpState INITIAL;
    public static final PlusCardTopUpState LOADING;

    static {
        PlusCardTopUpState plusCardTopUpState = new PlusCardTopUpState("INITIAL", 0);
        INITIAL = plusCardTopUpState;
        PlusCardTopUpState plusCardTopUpState2 = new PlusCardTopUpState("LOADING", 1);
        LOADING = plusCardTopUpState2;
        PlusCardTopUpState plusCardTopUpState3 = new PlusCardTopUpState("DATA", 2);
        DATA = plusCardTopUpState3;
        PlusCardTopUpState[] plusCardTopUpStateArr = {plusCardTopUpState, plusCardTopUpState2, plusCardTopUpState3};
        $VALUES = plusCardTopUpStateArr;
        $ENTRIES = kotlin.enums.a.a(plusCardTopUpStateArr);
    }

    public static PlusCardTopUpState valueOf(String str) {
        return (PlusCardTopUpState) Enum.valueOf(PlusCardTopUpState.class, str);
    }

    public static PlusCardTopUpState[] values() {
        return (PlusCardTopUpState[]) $VALUES.clone();
    }
}
