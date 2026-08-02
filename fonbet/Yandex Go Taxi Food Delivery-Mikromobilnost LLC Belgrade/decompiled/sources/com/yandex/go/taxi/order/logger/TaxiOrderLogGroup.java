package com.yandex.go.taxi.order.logger;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/taxi/order/logger/TaxiOrderLogGroup;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CORE", "PERF", "NAVIGATION", "MAP", "NOTIFICATION", "RIDE_CARD", "FEEDBACK", "LONG_SEARCH_V2", "ORDINARY_SEARCH", "ORDER_CHAT", "ORDER_MESSENGER", "TOTW_UPDATING", "CHANGE_ORDER", "EMPTY", "go-client-android.features.taxi_order:logger"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxiOrderLogGroup {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderLogGroup[] $VALUES;
    public static final TaxiOrderLogGroup CHANGE_ORDER;
    public static final TaxiOrderLogGroup CORE;
    public static final TaxiOrderLogGroup EMPTY;
    public static final TaxiOrderLogGroup FEEDBACK;
    public static final TaxiOrderLogGroup LONG_SEARCH_V2;
    public static final TaxiOrderLogGroup MAP;
    public static final TaxiOrderLogGroup NAVIGATION;
    public static final TaxiOrderLogGroup NOTIFICATION;
    public static final TaxiOrderLogGroup ORDER_CHAT;
    public static final TaxiOrderLogGroup ORDER_MESSENGER;
    public static final TaxiOrderLogGroup ORDINARY_SEARCH;
    public static final TaxiOrderLogGroup PERF;
    public static final TaxiOrderLogGroup RIDE_CARD;
    public static final TaxiOrderLogGroup TOTW_UPDATING;
    private final String tag;

    static {
        TaxiOrderLogGroup taxiOrderLogGroup = new TaxiOrderLogGroup("CORE", 0, "TaxiOrder.Core");
        CORE = taxiOrderLogGroup;
        TaxiOrderLogGroup taxiOrderLogGroup2 = new TaxiOrderLogGroup("PERF", 1, "TaxiOrder.Perf");
        PERF = taxiOrderLogGroup2;
        TaxiOrderLogGroup taxiOrderLogGroup3 = new TaxiOrderLogGroup("NAVIGATION", 2, "TaxiOrder.Navigation");
        NAVIGATION = taxiOrderLogGroup3;
        TaxiOrderLogGroup taxiOrderLogGroup4 = new TaxiOrderLogGroup("MAP", 3, "TaxiOrder.Map");
        MAP = taxiOrderLogGroup4;
        TaxiOrderLogGroup taxiOrderLogGroup5 = new TaxiOrderLogGroup("NOTIFICATION", 4, "TaxiOrder.Notification");
        NOTIFICATION = taxiOrderLogGroup5;
        TaxiOrderLogGroup taxiOrderLogGroup6 = new TaxiOrderLogGroup("RIDE_CARD", 5, "TaxiOrder.RideCard");
        RIDE_CARD = taxiOrderLogGroup6;
        TaxiOrderLogGroup taxiOrderLogGroup7 = new TaxiOrderLogGroup("FEEDBACK", 6, "TaxiOrder.Feedback");
        FEEDBACK = taxiOrderLogGroup7;
        TaxiOrderLogGroup taxiOrderLogGroup8 = new TaxiOrderLogGroup("LONG_SEARCH_V2", 7, "TaxiOrder.LongSearchV2");
        LONG_SEARCH_V2 = taxiOrderLogGroup8;
        TaxiOrderLogGroup taxiOrderLogGroup9 = new TaxiOrderLogGroup("ORDINARY_SEARCH", 8, "TaxiOrder.OrdinarySearch");
        ORDINARY_SEARCH = taxiOrderLogGroup9;
        TaxiOrderLogGroup taxiOrderLogGroup10 = new TaxiOrderLogGroup("ORDER_CHAT", 9, "TaxiOrder.OrderChat");
        ORDER_CHAT = taxiOrderLogGroup10;
        TaxiOrderLogGroup taxiOrderLogGroup11 = new TaxiOrderLogGroup("ORDER_MESSENGER", 10, "TaxiOrder.OrderChat.Messenger");
        ORDER_MESSENGER = taxiOrderLogGroup11;
        TaxiOrderLogGroup taxiOrderLogGroup12 = new TaxiOrderLogGroup("TOTW_UPDATING", 11, "TaxiOrder.TotwUpdating");
        TOTW_UPDATING = taxiOrderLogGroup12;
        TaxiOrderLogGroup taxiOrderLogGroup13 = new TaxiOrderLogGroup("CHANGE_ORDER", 12, "TaxiOrder.ChangeOrder");
        CHANGE_ORDER = taxiOrderLogGroup13;
        TaxiOrderLogGroup taxiOrderLogGroup14 = new TaxiOrderLogGroup("EMPTY", 13, "TaxiOrder");
        EMPTY = taxiOrderLogGroup14;
        TaxiOrderLogGroup[] taxiOrderLogGroupArr = {taxiOrderLogGroup, taxiOrderLogGroup2, taxiOrderLogGroup3, taxiOrderLogGroup4, taxiOrderLogGroup5, taxiOrderLogGroup6, taxiOrderLogGroup7, taxiOrderLogGroup8, taxiOrderLogGroup9, taxiOrderLogGroup10, taxiOrderLogGroup11, taxiOrderLogGroup12, taxiOrderLogGroup13, taxiOrderLogGroup14};
        $VALUES = taxiOrderLogGroupArr;
        $ENTRIES = a.a(taxiOrderLogGroupArr);
    }

    public TaxiOrderLogGroup(String str, int i, String str2) {
        this.tag = str2;
    }

    public static TaxiOrderLogGroup valueOf(String str) {
        return (TaxiOrderLogGroup) Enum.valueOf(TaxiOrderLogGroup.class, str);
    }

    public static TaxiOrderLogGroup[] values() {
        return (TaxiOrderLogGroup[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
