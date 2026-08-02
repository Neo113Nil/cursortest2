package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.cbw;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$ButtonStyle", "", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$ButtonStyle;", "Companion", "cbw", "MAIN", "MINOR", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtonsDataDto$ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardButtonsDataDto$ButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final cbw Companion;
    public static final IntercityDashboardButtonsDataDto$ButtonStyle MAIN;
    public static final IntercityDashboardButtonsDataDto$ButtonStyle MINOR;
    public static final IntercityDashboardButtonsDataDto$ButtonStyle UNSUPPORTED;

    static {
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle = new IntercityDashboardButtonsDataDto$ButtonStyle("MAIN", 0);
        MAIN = intercityDashboardButtonsDataDto$ButtonStyle;
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle2 = new IntercityDashboardButtonsDataDto$ButtonStyle("MINOR", 1);
        MINOR = intercityDashboardButtonsDataDto$ButtonStyle2;
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle3 = new IntercityDashboardButtonsDataDto$ButtonStyle("UNSUPPORTED", 2);
        UNSUPPORTED = intercityDashboardButtonsDataDto$ButtonStyle3;
        IntercityDashboardButtonsDataDto$ButtonStyle[] intercityDashboardButtonsDataDto$ButtonStyleArr = {intercityDashboardButtonsDataDto$ButtonStyle, intercityDashboardButtonsDataDto$ButtonStyle2, intercityDashboardButtonsDataDto$ButtonStyle3};
        $VALUES = intercityDashboardButtonsDataDto$ButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(intercityDashboardButtonsDataDto$ButtonStyleArr);
        Companion = new cbw();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(12));
    }

    public static IntercityDashboardButtonsDataDto$ButtonStyle valueOf(String str) {
        return (IntercityDashboardButtonsDataDto$ButtonStyle) Enum.valueOf(IntercityDashboardButtonsDataDto$ButtonStyle.class, str);
    }

    public static IntercityDashboardButtonsDataDto$ButtonStyle[] values() {
        return (IntercityDashboardButtonsDataDto$ButtonStyle[]) $VALUES.clone();
    }
}
