package com.yandex.go.payments.paymentlist.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/data/EditModeState;", "", "GONE", "ENABLED", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EditModeState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditModeState[] $VALUES;
    public static final EditModeState DISABLED;
    public static final EditModeState ENABLED;
    public static final EditModeState GONE;

    static {
        EditModeState editModeState = new EditModeState("GONE", 0);
        GONE = editModeState;
        EditModeState editModeState2 = new EditModeState("ENABLED", 1);
        ENABLED = editModeState2;
        EditModeState editModeState3 = new EditModeState("DISABLED", 2);
        DISABLED = editModeState3;
        EditModeState[] editModeStateArr = {editModeState, editModeState2, editModeState3};
        $VALUES = editModeStateArr;
        $ENTRIES = kotlin.enums.a.a(editModeStateArr);
    }

    public static EditModeState valueOf(String str) {
        return (EditModeState) Enum.valueOf(EditModeState.class, str);
    }

    public static EditModeState[] values() {
        return (EditModeState[]) $VALUES.clone();
    }
}
