package com.yandex.go.taxi.order.communications.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/taxi/order/communications/analytics/PromoPlaqueAnalytics$Screen", "", "Lcom/yandex/go/taxi/order/communications/analytics/PromoPlaqueAnalytics$Screen;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "MULTI_ORDER", "DETAILS", "DETAILS_TOP", "RIDE_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoPlaqueAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoPlaqueAnalytics$Screen[] $VALUES;
    public static final PromoPlaqueAnalytics$Screen DETAILS;
    public static final PromoPlaqueAnalytics$Screen DETAILS_TOP;
    public static final PromoPlaqueAnalytics$Screen MULTI_ORDER;
    public static final PromoPlaqueAnalytics$Screen RIDE_CARD;
    private final String id;

    static {
        PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen = new PromoPlaqueAnalytics$Screen("MULTI_ORDER", 0, "multiorder");
        MULTI_ORDER = promoPlaqueAnalytics$Screen;
        PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen2 = new PromoPlaqueAnalytics$Screen("DETAILS", 1, "details");
        DETAILS = promoPlaqueAnalytics$Screen2;
        PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen3 = new PromoPlaqueAnalytics$Screen("DETAILS_TOP", 2, "details_top");
        DETAILS_TOP = promoPlaqueAnalytics$Screen3;
        PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen4 = new PromoPlaqueAnalytics$Screen("RIDE_CARD", 3, "ride_card_info");
        RIDE_CARD = promoPlaqueAnalytics$Screen4;
        PromoPlaqueAnalytics$Screen[] promoPlaqueAnalytics$ScreenArr = {promoPlaqueAnalytics$Screen, promoPlaqueAnalytics$Screen2, promoPlaqueAnalytics$Screen3, promoPlaqueAnalytics$Screen4};
        $VALUES = promoPlaqueAnalytics$ScreenArr;
        $ENTRIES = a.a(promoPlaqueAnalytics$ScreenArr);
    }

    public PromoPlaqueAnalytics$Screen(String str, int i, String str2) {
        this.id = str2;
    }

    public static PromoPlaqueAnalytics$Screen valueOf(String str) {
        return (PromoPlaqueAnalytics$Screen) Enum.valueOf(PromoPlaqueAnalytics$Screen.class, str);
    }

    public static PromoPlaqueAnalytics$Screen[] values() {
        return (PromoPlaqueAnalytics$Screen[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
