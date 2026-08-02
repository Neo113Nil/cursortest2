package com.yandex.go.taxi.order.multi.feed.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/multi/feed/analytics/TaxiOrderFeedAnalytics$Source", "", "Lcom/yandex/go/taxi/order/multi/feed/analytics/TaxiOrderFeedAnalytics$Source;", "MAIN", "FEED_ORDER_DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderFeedAnalytics$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderFeedAnalytics$Source[] $VALUES;
    public static final TaxiOrderFeedAnalytics$Source FEED_ORDER_DETAILS;
    public static final TaxiOrderFeedAnalytics$Source MAIN;

    static {
        TaxiOrderFeedAnalytics$Source taxiOrderFeedAnalytics$Source = new TaxiOrderFeedAnalytics$Source("MAIN", 0);
        MAIN = taxiOrderFeedAnalytics$Source;
        TaxiOrderFeedAnalytics$Source taxiOrderFeedAnalytics$Source2 = new TaxiOrderFeedAnalytics$Source("FEED_ORDER_DETAILS", 1);
        FEED_ORDER_DETAILS = taxiOrderFeedAnalytics$Source2;
        TaxiOrderFeedAnalytics$Source[] taxiOrderFeedAnalytics$SourceArr = {taxiOrderFeedAnalytics$Source, taxiOrderFeedAnalytics$Source2};
        $VALUES = taxiOrderFeedAnalytics$SourceArr;
        $ENTRIES = a.a(taxiOrderFeedAnalytics$SourceArr);
    }

    public static TaxiOrderFeedAnalytics$Source valueOf(String str) {
        return (TaxiOrderFeedAnalytics$Source) Enum.valueOf(TaxiOrderFeedAnalytics$Source.class, str);
    }

    public static TaxiOrderFeedAnalytics$Source[] values() {
        return (TaxiOrderFeedAnalytics$Source[]) $VALUES.clone();
    }
}
