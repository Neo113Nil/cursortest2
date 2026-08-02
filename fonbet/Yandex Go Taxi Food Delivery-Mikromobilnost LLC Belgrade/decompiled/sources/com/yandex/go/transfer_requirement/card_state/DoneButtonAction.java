package com.yandex.go.transfer_requirement.card_state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/transfer_requirement/card_state/DoneButtonAction;", "", "REQUEST", "RETURN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DoneButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DoneButtonAction[] $VALUES;
    public static final DoneButtonAction REQUEST;
    public static final DoneButtonAction RETURN;

    static {
        DoneButtonAction doneButtonAction = new DoneButtonAction("REQUEST", 0);
        REQUEST = doneButtonAction;
        DoneButtonAction doneButtonAction2 = new DoneButtonAction("RETURN", 1);
        RETURN = doneButtonAction2;
        DoneButtonAction[] doneButtonActionArr = {doneButtonAction, doneButtonAction2};
        $VALUES = doneButtonActionArr;
        $ENTRIES = kotlin.enums.a.a(doneButtonActionArr);
    }

    public static DoneButtonAction valueOf(String str) {
        return (DoneButtonAction) Enum.valueOf(DoneButtonAction.class, str);
    }

    public static DoneButtonAction[] values() {
        return (DoneButtonAction[]) $VALUES.clone();
    }
}
