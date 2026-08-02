package com.yandex.go.taxi.order;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/ActionButtonsClickListener$SourceScreen", "", "Lcom/yandex/go/taxi/order/ActionButtonsClickListener$SourceScreen;", "ORDER_LIST", "ORDER_DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionButtonsClickListener$SourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonsClickListener$SourceScreen[] $VALUES;
    public static final ActionButtonsClickListener$SourceScreen ORDER_DETAILS;
    public static final ActionButtonsClickListener$SourceScreen ORDER_LIST;

    static {
        ActionButtonsClickListener$SourceScreen actionButtonsClickListener$SourceScreen = new ActionButtonsClickListener$SourceScreen("ORDER_LIST", 0);
        ORDER_LIST = actionButtonsClickListener$SourceScreen;
        ActionButtonsClickListener$SourceScreen actionButtonsClickListener$SourceScreen2 = new ActionButtonsClickListener$SourceScreen("ORDER_DETAILS", 1);
        ORDER_DETAILS = actionButtonsClickListener$SourceScreen2;
        ActionButtonsClickListener$SourceScreen[] actionButtonsClickListener$SourceScreenArr = {actionButtonsClickListener$SourceScreen, actionButtonsClickListener$SourceScreen2};
        $VALUES = actionButtonsClickListener$SourceScreenArr;
        $ENTRIES = kotlin.enums.a.a(actionButtonsClickListener$SourceScreenArr);
    }

    public static ActionButtonsClickListener$SourceScreen valueOf(String str) {
        return (ActionButtonsClickListener$SourceScreen) Enum.valueOf(ActionButtonsClickListener$SourceScreen.class, str);
    }

    public static ActionButtonsClickListener$SourceScreen[] values() {
        return (ActionButtonsClickListener$SourceScreen[]) $VALUES.clone();
    }
}
