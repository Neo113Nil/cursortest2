package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/ErrorButtonAction;", "", "OPEN_ADDRESS_SELECTOR", "REFRESH", "REFRESH_TRANSPORT_ROUTES", "REFRESH_ROUTESTATS", "EXPAND", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ErrorButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorButtonAction[] $VALUES;
    public static final ErrorButtonAction EXPAND;
    public static final ErrorButtonAction OPEN_ADDRESS_SELECTOR;
    public static final ErrorButtonAction REFRESH;
    public static final ErrorButtonAction REFRESH_ROUTESTATS;
    public static final ErrorButtonAction REFRESH_TRANSPORT_ROUTES;

    static {
        ErrorButtonAction errorButtonAction = new ErrorButtonAction("OPEN_ADDRESS_SELECTOR", 0);
        OPEN_ADDRESS_SELECTOR = errorButtonAction;
        ErrorButtonAction errorButtonAction2 = new ErrorButtonAction("REFRESH", 1);
        REFRESH = errorButtonAction2;
        ErrorButtonAction errorButtonAction3 = new ErrorButtonAction("REFRESH_TRANSPORT_ROUTES", 2);
        REFRESH_TRANSPORT_ROUTES = errorButtonAction3;
        ErrorButtonAction errorButtonAction4 = new ErrorButtonAction("REFRESH_ROUTESTATS", 3);
        REFRESH_ROUTESTATS = errorButtonAction4;
        ErrorButtonAction errorButtonAction5 = new ErrorButtonAction("EXPAND", 4);
        EXPAND = errorButtonAction5;
        ErrorButtonAction[] errorButtonActionArr = {errorButtonAction, errorButtonAction2, errorButtonAction3, errorButtonAction4, errorButtonAction5};
        $VALUES = errorButtonActionArr;
        $ENTRIES = kotlin.enums.a.a(errorButtonActionArr);
    }

    public static ErrorButtonAction valueOf(String str) {
        return (ErrorButtonAction) Enum.valueOf(ErrorButtonAction.class, str);
    }

    public static ErrorButtonAction[] values() {
        return (ErrorButtonAction[]) $VALUES.clone();
    }
}
