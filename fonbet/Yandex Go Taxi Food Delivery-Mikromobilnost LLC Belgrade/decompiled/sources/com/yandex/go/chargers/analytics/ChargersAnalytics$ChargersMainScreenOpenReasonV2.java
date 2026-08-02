package com.yandex.go.chargers.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenOpenReasonV2", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersMainScreenOpenReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Shortcut", "Deeplink", "DetailedOrder", "Unknown", "DiscountsAndPromocodes", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersMainScreenOpenReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersMainScreenOpenReasonV2[] $VALUES;
    public static final ChargersAnalytics$ChargersMainScreenOpenReasonV2 Deeplink;
    public static final ChargersAnalytics$ChargersMainScreenOpenReasonV2 DetailedOrder;
    public static final ChargersAnalytics$ChargersMainScreenOpenReasonV2 DiscountsAndPromocodes;
    public static final ChargersAnalytics$ChargersMainScreenOpenReasonV2 Shortcut;
    public static final ChargersAnalytics$ChargersMainScreenOpenReasonV2 Unknown;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV2 = new ChargersAnalytics$ChargersMainScreenOpenReasonV2("Shortcut", 0, "shortcut");
        Shortcut = chargersAnalytics$ChargersMainScreenOpenReasonV2;
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV22 = new ChargersAnalytics$ChargersMainScreenOpenReasonV2("Deeplink", 1, Constants.DEEPLINK);
        Deeplink = chargersAnalytics$ChargersMainScreenOpenReasonV22;
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV23 = new ChargersAnalytics$ChargersMainScreenOpenReasonV2("DetailedOrder", 2, "detailed_order");
        DetailedOrder = chargersAnalytics$ChargersMainScreenOpenReasonV23;
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV24 = new ChargersAnalytics$ChargersMainScreenOpenReasonV2("Unknown", 3, "unknown");
        Unknown = chargersAnalytics$ChargersMainScreenOpenReasonV24;
        ChargersAnalytics$ChargersMainScreenOpenReasonV2 chargersAnalytics$ChargersMainScreenOpenReasonV25 = new ChargersAnalytics$ChargersMainScreenOpenReasonV2("DiscountsAndPromocodes", 4, "discounts_and_promocodes");
        DiscountsAndPromocodes = chargersAnalytics$ChargersMainScreenOpenReasonV25;
        ChargersAnalytics$ChargersMainScreenOpenReasonV2[] chargersAnalytics$ChargersMainScreenOpenReasonV2Arr = {chargersAnalytics$ChargersMainScreenOpenReasonV2, chargersAnalytics$ChargersMainScreenOpenReasonV22, chargersAnalytics$ChargersMainScreenOpenReasonV23, chargersAnalytics$ChargersMainScreenOpenReasonV24, chargersAnalytics$ChargersMainScreenOpenReasonV25};
        $VALUES = chargersAnalytics$ChargersMainScreenOpenReasonV2Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersMainScreenOpenReasonV2Arr);
    }

    public ChargersAnalytics$ChargersMainScreenOpenReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersMainScreenOpenReasonV2 valueOf(String str) {
        return (ChargersAnalytics$ChargersMainScreenOpenReasonV2) Enum.valueOf(ChargersAnalytics$ChargersMainScreenOpenReasonV2.class, str);
    }

    public static ChargersAnalytics$ChargersMainScreenOpenReasonV2[] values() {
        return (ChargersAnalytics$ChargersMainScreenOpenReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
