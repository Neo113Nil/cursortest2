package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/ActionButtonsState;", "", "ONLY_BACK", "BACK_AND_FOCUS_ROUTE", "HIDDEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionButtonsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonsState[] $VALUES;
    public static final ActionButtonsState BACK_AND_FOCUS_ROUTE;
    public static final ActionButtonsState HIDDEN;
    public static final ActionButtonsState ONLY_BACK;

    static {
        ActionButtonsState actionButtonsState = new ActionButtonsState("ONLY_BACK", 0);
        ONLY_BACK = actionButtonsState;
        ActionButtonsState actionButtonsState2 = new ActionButtonsState("BACK_AND_FOCUS_ROUTE", 1);
        BACK_AND_FOCUS_ROUTE = actionButtonsState2;
        ActionButtonsState actionButtonsState3 = new ActionButtonsState("HIDDEN", 2);
        HIDDEN = actionButtonsState3;
        ActionButtonsState[] actionButtonsStateArr = {actionButtonsState, actionButtonsState2, actionButtonsState3};
        $VALUES = actionButtonsStateArr;
        $ENTRIES = kotlin.enums.a.a(actionButtonsStateArr);
    }

    public static ActionButtonsState valueOf(String str) {
        return (ActionButtonsState) Enum.valueOf(ActionButtonsState.class, str);
    }

    public static ActionButtonsState[] values() {
        return (ActionButtonsState[]) $VALUES.clone();
    }
}
