package com.yandex.go.taxi.order.models.api.status;

import com.adjust.sdk.Constants;
import defpackage.az;
import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/status/ActionType;", "", "", "eventName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "az", "UNKNOWN", "GO_TO_SCREEN", "DEEPLINK", "REORDER", "YANDEX_CARD_TOPUP", "YANGO_CARD_TOPUP", "DO_NOTHING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final az Companion;
    public static final ActionType DEEPLINK;
    public static final ActionType DO_NOTHING;
    public static final ActionType GO_TO_SCREEN;
    public static final ActionType REORDER;
    public static final ActionType UNKNOWN;
    public static final ActionType YANDEX_CARD_TOPUP;
    public static final ActionType YANGO_CARD_TOPUP;
    private final String eventName;

    static {
        ActionType actionType = new ActionType("UNKNOWN", 0, "unknow");
        UNKNOWN = actionType;
        ActionType actionType2 = new ActionType("GO_TO_SCREEN", 1, "go_to_screen");
        GO_TO_SCREEN = actionType2;
        ActionType actionType3 = new ActionType("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = actionType3;
        ActionType actionType4 = new ActionType("REORDER", 3, "repeat_order");
        REORDER = actionType4;
        ActionType actionType5 = new ActionType("YANDEX_CARD_TOPUP", 4, "yandex_card_topup");
        YANDEX_CARD_TOPUP = actionType5;
        ActionType actionType6 = new ActionType("YANGO_CARD_TOPUP", 5, "yango_pay_topup");
        YANGO_CARD_TOPUP = actionType6;
        ActionType actionType7 = new ActionType("DO_NOTHING", 6, "do_nothing");
        DO_NOTHING = actionType7;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7};
        $VALUES = actionTypeArr;
        $ENTRIES = kotlin.enums.a.a(actionTypeArr);
        Companion = new az();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(13));
    }

    public ActionType(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }
}
