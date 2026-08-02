package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$ButtonType", "", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$ButtonType;", "CONFIRM_PREORDER", "TAXI_ORDER_FLOW", "SELECT_DESTINATION", "SELECT_STARTING", "SELECT_DUE", "SHOW_FLEX_SCREEN", "DEEPLINK", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtonsDataDto$ButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardButtonsDataDto$ButtonType[] $VALUES;
    public static final IntercityDashboardButtonsDataDto$ButtonType CONFIRM_PREORDER;
    public static final IntercityDashboardButtonsDataDto$ButtonType DEEPLINK;
    public static final IntercityDashboardButtonsDataDto$ButtonType SELECT_DESTINATION;
    public static final IntercityDashboardButtonsDataDto$ButtonType SELECT_DUE;
    public static final IntercityDashboardButtonsDataDto$ButtonType SELECT_STARTING;
    public static final IntercityDashboardButtonsDataDto$ButtonType SHOW_FLEX_SCREEN;
    public static final IntercityDashboardButtonsDataDto$ButtonType TAXI_ORDER_FLOW;
    public static final IntercityDashboardButtonsDataDto$ButtonType UNSUPPORTED;

    static {
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType = new IntercityDashboardButtonsDataDto$ButtonType("CONFIRM_PREORDER", 0);
        CONFIRM_PREORDER = intercityDashboardButtonsDataDto$ButtonType;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType2 = new IntercityDashboardButtonsDataDto$ButtonType("TAXI_ORDER_FLOW", 1);
        TAXI_ORDER_FLOW = intercityDashboardButtonsDataDto$ButtonType2;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType3 = new IntercityDashboardButtonsDataDto$ButtonType("SELECT_DESTINATION", 2);
        SELECT_DESTINATION = intercityDashboardButtonsDataDto$ButtonType3;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType4 = new IntercityDashboardButtonsDataDto$ButtonType("SELECT_STARTING", 3);
        SELECT_STARTING = intercityDashboardButtonsDataDto$ButtonType4;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType5 = new IntercityDashboardButtonsDataDto$ButtonType("SELECT_DUE", 4);
        SELECT_DUE = intercityDashboardButtonsDataDto$ButtonType5;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType6 = new IntercityDashboardButtonsDataDto$ButtonType("SHOW_FLEX_SCREEN", 5);
        SHOW_FLEX_SCREEN = intercityDashboardButtonsDataDto$ButtonType6;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType7 = new IntercityDashboardButtonsDataDto$ButtonType("DEEPLINK", 6);
        DEEPLINK = intercityDashboardButtonsDataDto$ButtonType7;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType8 = new IntercityDashboardButtonsDataDto$ButtonType("UNSUPPORTED", 7);
        UNSUPPORTED = intercityDashboardButtonsDataDto$ButtonType8;
        IntercityDashboardButtonsDataDto$ButtonType[] intercityDashboardButtonsDataDto$ButtonTypeArr = {intercityDashboardButtonsDataDto$ButtonType, intercityDashboardButtonsDataDto$ButtonType2, intercityDashboardButtonsDataDto$ButtonType3, intercityDashboardButtonsDataDto$ButtonType4, intercityDashboardButtonsDataDto$ButtonType5, intercityDashboardButtonsDataDto$ButtonType6, intercityDashboardButtonsDataDto$ButtonType7, intercityDashboardButtonsDataDto$ButtonType8};
        $VALUES = intercityDashboardButtonsDataDto$ButtonTypeArr;
        $ENTRIES = kotlin.enums.a.a(intercityDashboardButtonsDataDto$ButtonTypeArr);
    }

    public static IntercityDashboardButtonsDataDto$ButtonType valueOf(String str) {
        return (IntercityDashboardButtonsDataDto$ButtonType) Enum.valueOf(IntercityDashboardButtonsDataDto$ButtonType.class, str);
    }

    public static IntercityDashboardButtonsDataDto$ButtonType[] values() {
        return (IntercityDashboardButtonsDataDto$ButtonType[]) $VALUES.clone();
    }
}
