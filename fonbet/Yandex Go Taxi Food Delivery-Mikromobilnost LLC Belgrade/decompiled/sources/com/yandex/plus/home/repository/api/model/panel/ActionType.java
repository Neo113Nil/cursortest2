package com.yandex.plus.home.repository.api.model.panel;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/ActionType;", "", "CURRENT_WINDOW", "POPUP", "NEW_WINDOW", "UNKNOWN", "DEBUG_PANEL", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType CURRENT_WINDOW;
    public static final ActionType DEBUG_PANEL;
    public static final ActionType NEW_WINDOW;
    public static final ActionType POPUP;
    public static final ActionType UNKNOWN;

    static {
        ActionType actionType = new ActionType("CURRENT_WINDOW", 0);
        CURRENT_WINDOW = actionType;
        ActionType actionType2 = new ActionType("POPUP", 1);
        POPUP = actionType2;
        ActionType actionType3 = new ActionType("NEW_WINDOW", 2);
        NEW_WINDOW = actionType3;
        ActionType actionType4 = new ActionType("UNKNOWN", 3);
        UNKNOWN = actionType4;
        ActionType actionType5 = new ActionType("DEBUG_PANEL", 4);
        DEBUG_PANEL = actionType5;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5};
        $VALUES = actionTypeArr;
        $ENTRIES = a.a(actionTypeArr);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
