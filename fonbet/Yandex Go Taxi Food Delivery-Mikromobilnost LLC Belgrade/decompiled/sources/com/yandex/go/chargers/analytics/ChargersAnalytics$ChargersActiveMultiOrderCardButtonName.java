package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveMultiOrderCardButtonName", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersActiveMultiOrderCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Geo", "Back", "TakeMore", "OrderCard", "Switcher", "Unknown", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersActiveMultiOrderCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersActiveMultiOrderCardButtonName[] $VALUES;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName Back;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName Geo;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName OrderCard;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName Switcher;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName TakeMore;
    public static final ChargersAnalytics$ChargersActiveMultiOrderCardButtonName Unknown;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("Geo", 0, "geo");
        Geo = chargersAnalytics$ChargersActiveMultiOrderCardButtonName;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName2 = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("Back", 1, "back");
        Back = chargersAnalytics$ChargersActiveMultiOrderCardButtonName2;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName3 = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("TakeMore", 2, "take_more");
        TakeMore = chargersAnalytics$ChargersActiveMultiOrderCardButtonName3;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName4 = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("OrderCard", 3, "order_card");
        OrderCard = chargersAnalytics$ChargersActiveMultiOrderCardButtonName4;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName5 = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("Switcher", 4, "switcher");
        Switcher = chargersAnalytics$ChargersActiveMultiOrderCardButtonName5;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName chargersAnalytics$ChargersActiveMultiOrderCardButtonName6 = new ChargersAnalytics$ChargersActiveMultiOrderCardButtonName("Unknown", 5, "unknown");
        Unknown = chargersAnalytics$ChargersActiveMultiOrderCardButtonName6;
        ChargersAnalytics$ChargersActiveMultiOrderCardButtonName[] chargersAnalytics$ChargersActiveMultiOrderCardButtonNameArr = {chargersAnalytics$ChargersActiveMultiOrderCardButtonName, chargersAnalytics$ChargersActiveMultiOrderCardButtonName2, chargersAnalytics$ChargersActiveMultiOrderCardButtonName3, chargersAnalytics$ChargersActiveMultiOrderCardButtonName4, chargersAnalytics$ChargersActiveMultiOrderCardButtonName5, chargersAnalytics$ChargersActiveMultiOrderCardButtonName6};
        $VALUES = chargersAnalytics$ChargersActiveMultiOrderCardButtonNameArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersActiveMultiOrderCardButtonNameArr);
    }

    public ChargersAnalytics$ChargersActiveMultiOrderCardButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersActiveMultiOrderCardButtonName valueOf(String str) {
        return (ChargersAnalytics$ChargersActiveMultiOrderCardButtonName) Enum.valueOf(ChargersAnalytics$ChargersActiveMultiOrderCardButtonName.class, str);
    }

    public static ChargersAnalytics$ChargersActiveMultiOrderCardButtonName[] values() {
        return (ChargersAnalytics$ChargersActiveMultiOrderCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
