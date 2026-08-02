package com.yandex.go.superapp.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/model/Action;", "", JCP.RAW_PREFIX, "SHOW_SHOP", "SHOW_ORDER", "SHOW_RELATIVE_PATH", "FORCE_RELATIVE_PATH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action FORCE_RELATIVE_PATH;
    public static final Action NONE;
    public static final Action SHOW_ORDER;
    public static final Action SHOW_RELATIVE_PATH;
    public static final Action SHOW_SHOP;

    static {
        Action action = new Action(JCP.RAW_PREFIX, 0);
        NONE = action;
        Action action2 = new Action("SHOW_SHOP", 1);
        SHOW_SHOP = action2;
        Action action3 = new Action("SHOW_ORDER", 2);
        SHOW_ORDER = action3;
        Action action4 = new Action("SHOW_RELATIVE_PATH", 3);
        SHOW_RELATIVE_PATH = action4;
        Action action5 = new Action("FORCE_RELATIVE_PATH", 4);
        FORCE_RELATIVE_PATH = action5;
        Action[] actionArr = {action, action2, action3, action4, action5};
        $VALUES = actionArr;
        $ENTRIES = a.a(actionArr);
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
