package com.yandex.go.layers.api.model;

import defpackage.dr;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/layers/api/model/Action;", "", "TAP", "DRAG", "SERVER_SELECTION", "UNDEFINED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action DRAG;
    public static final Action SERVER_SELECTION;
    public static final Action TAP;
    public static final Action UNDEFINED;

    static {
        Action action = new Action("TAP", 0);
        TAP = action;
        Action action2 = new Action("DRAG", 1);
        DRAG = action2;
        Action action3 = new Action("SERVER_SELECTION", 2);
        SERVER_SELECTION = action3;
        Action action4 = new Action("UNDEFINED", 3);
        UNDEFINED = action4;
        Action[] actionArr = {action, action2, action3, action4};
        $VALUES = actionArr;
        $ENTRIES = a.a(actionArr);
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }

    public final String a() {
        int i = dr.a[ordinal()];
        if (i == 1) {
            return "manual.pickup_point_tap";
        }
        if (i == 2) {
            return "manual.pickup_point_drag";
        }
        if (i == 3) {
            return "manual.pickup_point_auto";
        }
        if (i == 4) {
            return "";
        }
        w511.b();
        return null;
    }
}
