package com.yandex.go.taxi.intercity.dashboard.impl.presentation.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/presentation/state/IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle", "", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/state/IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;", "MAIN", "MINOR", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle[] $VALUES;
    public static final IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle MAIN;
    public static final IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle MINOR;
    public static final IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle UNSUPPORTED;

    static {
        IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle = new IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle("MAIN", 0);
        MAIN = intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;
        IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle2 = new IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle("MINOR", 1);
        MINOR = intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle2;
        IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle3 = new IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle("UNSUPPORTED", 2);
        UNSUPPORTED = intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle3;
        IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle[] intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyleArr = {intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle2, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle3};
        $VALUES = intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyleArr;
        $ENTRIES = a.a(intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyleArr);
    }

    public static IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle valueOf(String str) {
        return (IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle) Enum.valueOf(IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.class, str);
    }

    public static IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle[] values() {
        return (IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle[]) $VALUES.clone();
    }
}
