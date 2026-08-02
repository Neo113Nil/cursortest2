package com.yandex.go.taxi.auction.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/taxi/auction/analytics/AuctionAnalytics$Source", "", "Lcom/yandex/go/taxi/auction/analytics/AuctionAnalytics$Source;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Summary", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AuctionAnalytics$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuctionAnalytics$Source[] $VALUES;
    public static final AuctionAnalytics$Source Summary;
    private final String eventValue = "summary";

    static {
        AuctionAnalytics$Source auctionAnalytics$Source = new AuctionAnalytics$Source();
        Summary = auctionAnalytics$Source;
        AuctionAnalytics$Source[] auctionAnalytics$SourceArr = {auctionAnalytics$Source};
        $VALUES = auctionAnalytics$SourceArr;
        $ENTRIES = a.a(auctionAnalytics$SourceArr);
    }

    public static AuctionAnalytics$Source valueOf(String str) {
        return (AuctionAnalytics$Source) Enum.valueOf(AuctionAnalytics$Source.class, str);
    }

    public static AuctionAnalytics$Source[] values() {
        return (AuctionAnalytics$Source[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
