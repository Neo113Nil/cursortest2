package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/taxi/order/models/api/cancel/Action$Type", "", "Lcom/yandex/go/taxi/order/models/api/cancel/Action$Type;", "UNKNOWN", "CANCEL", "DRIVER_CALL", "OPEN_CHAT_WITH_DRIVER", "DO_NOTHING", "CHANGE_POINT_A", "CHANGE_POINT_B", "CHANGE_DRIVER", "OPEN_MODAL_WINDOW", "DEEPLINK", "DEEPLINK_AND_CANCEL", "OPEN_RIDE_SUPPORT_CHAT", "CLOSE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Action$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action$Type[] $VALUES;
    public static final Action$Type CANCEL;
    public static final Action$Type CHANGE_DRIVER;
    public static final Action$Type CHANGE_POINT_A;
    public static final Action$Type CHANGE_POINT_B;
    public static final Action$Type CLOSE;
    public static final Action$Type DEEPLINK;
    public static final Action$Type DEEPLINK_AND_CANCEL;
    public static final Action$Type DO_NOTHING;
    public static final Action$Type DRIVER_CALL;
    public static final Action$Type OPEN_CHAT_WITH_DRIVER;
    public static final Action$Type OPEN_MODAL_WINDOW;
    public static final Action$Type OPEN_RIDE_SUPPORT_CHAT;
    public static final Action$Type UNKNOWN;

    static {
        Action$Type action$Type = new Action$Type("UNKNOWN", 0);
        UNKNOWN = action$Type;
        Action$Type action$Type2 = new Action$Type("CANCEL", 1);
        CANCEL = action$Type2;
        Action$Type action$Type3 = new Action$Type("DRIVER_CALL", 2);
        DRIVER_CALL = action$Type3;
        Action$Type action$Type4 = new Action$Type("OPEN_CHAT_WITH_DRIVER", 3);
        OPEN_CHAT_WITH_DRIVER = action$Type4;
        Action$Type action$Type5 = new Action$Type("DO_NOTHING", 4);
        DO_NOTHING = action$Type5;
        Action$Type action$Type6 = new Action$Type("CHANGE_POINT_A", 5);
        CHANGE_POINT_A = action$Type6;
        Action$Type action$Type7 = new Action$Type("CHANGE_POINT_B", 6);
        CHANGE_POINT_B = action$Type7;
        Action$Type action$Type8 = new Action$Type("CHANGE_DRIVER", 7);
        CHANGE_DRIVER = action$Type8;
        Action$Type action$Type9 = new Action$Type("OPEN_MODAL_WINDOW", 8);
        OPEN_MODAL_WINDOW = action$Type9;
        Action$Type action$Type10 = new Action$Type("DEEPLINK", 9);
        DEEPLINK = action$Type10;
        Action$Type action$Type11 = new Action$Type("DEEPLINK_AND_CANCEL", 10);
        DEEPLINK_AND_CANCEL = action$Type11;
        Action$Type action$Type12 = new Action$Type("OPEN_RIDE_SUPPORT_CHAT", 11);
        OPEN_RIDE_SUPPORT_CHAT = action$Type12;
        Action$Type action$Type13 = new Action$Type("CLOSE", 12);
        CLOSE = action$Type13;
        Action$Type[] action$TypeArr = {action$Type, action$Type2, action$Type3, action$Type4, action$Type5, action$Type6, action$Type7, action$Type8, action$Type9, action$Type10, action$Type11, action$Type12, action$Type13};
        $VALUES = action$TypeArr;
        $ENTRIES = kotlin.enums.a.a(action$TypeArr);
    }

    public static Action$Type valueOf(String str) {
        return (Action$Type) Enum.valueOf(Action$Type.class, str);
    }

    public static Action$Type[] values() {
        return (Action$Type[]) $VALUES.clone();
    }
}
