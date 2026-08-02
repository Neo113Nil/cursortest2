package com.yandex.go.taxi.order.detailed_price.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/yandex/go/taxi/order/detailed_price/analytics/DetailedPriceAnalytics$OrderStatus", "", "Lcom/yandex/go/taxi/order/detailed_price/analytics/DetailedPriceAnalytics$OrderStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Preorder", "Search", "Scheduling", "Scheduled", "CheckIn", "Driving", "Waiting", "Transporting", CA20Status.STATUS_REQUEST_DESCRIPTION_C, "Cancelled", "Failed", CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailedPriceAnalytics$OrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailedPriceAnalytics$OrderStatus[] $VALUES;
    public static final DetailedPriceAnalytics$OrderStatus Cancelled;
    public static final DetailedPriceAnalytics$OrderStatus CheckIn;
    public static final DetailedPriceAnalytics$OrderStatus Complete;
    public static final DetailedPriceAnalytics$OrderStatus Driving;
    public static final DetailedPriceAnalytics$OrderStatus Expired;
    public static final DetailedPriceAnalytics$OrderStatus Failed;
    public static final DetailedPriceAnalytics$OrderStatus Preorder;
    public static final DetailedPriceAnalytics$OrderStatus Scheduled;
    public static final DetailedPriceAnalytics$OrderStatus Scheduling;
    public static final DetailedPriceAnalytics$OrderStatus Search;
    public static final DetailedPriceAnalytics$OrderStatus Transporting;
    public static final DetailedPriceAnalytics$OrderStatus Waiting;
    private final String eventValue;

    static {
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus = new DetailedPriceAnalytics$OrderStatus("Preorder", 0, "preorder");
        Preorder = detailedPriceAnalytics$OrderStatus;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus2 = new DetailedPriceAnalytics$OrderStatus("Search", 1, "search");
        Search = detailedPriceAnalytics$OrderStatus2;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus3 = new DetailedPriceAnalytics$OrderStatus("Scheduling", 2, "scheduling");
        Scheduling = detailedPriceAnalytics$OrderStatus3;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus4 = new DetailedPriceAnalytics$OrderStatus("Scheduled", 3, "scheduled");
        Scheduled = detailedPriceAnalytics$OrderStatus4;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus5 = new DetailedPriceAnalytics$OrderStatus("CheckIn", 4, "check_in");
        CheckIn = detailedPriceAnalytics$OrderStatus5;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus6 = new DetailedPriceAnalytics$OrderStatus("Driving", 5, "driving");
        Driving = detailedPriceAnalytics$OrderStatus6;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus7 = new DetailedPriceAnalytics$OrderStatus("Waiting", 6, "waiting");
        Waiting = detailedPriceAnalytics$OrderStatus7;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus8 = new DetailedPriceAnalytics$OrderStatus("Transporting", 7, "transporting");
        Transporting = detailedPriceAnalytics$OrderStatus8;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus9 = new DetailedPriceAnalytics$OrderStatus(CA20Status.STATUS_REQUEST_DESCRIPTION_C, 8, "complete");
        Complete = detailedPriceAnalytics$OrderStatus9;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus10 = new DetailedPriceAnalytics$OrderStatus("Cancelled", 9, "cancelled");
        Cancelled = detailedPriceAnalytics$OrderStatus10;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus11 = new DetailedPriceAnalytics$OrderStatus("Failed", 10, "failed");
        Failed = detailedPriceAnalytics$OrderStatus11;
        DetailedPriceAnalytics$OrderStatus detailedPriceAnalytics$OrderStatus12 = new DetailedPriceAnalytics$OrderStatus(CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, 11, "expired");
        Expired = detailedPriceAnalytics$OrderStatus12;
        DetailedPriceAnalytics$OrderStatus[] detailedPriceAnalytics$OrderStatusArr = {detailedPriceAnalytics$OrderStatus, detailedPriceAnalytics$OrderStatus2, detailedPriceAnalytics$OrderStatus3, detailedPriceAnalytics$OrderStatus4, detailedPriceAnalytics$OrderStatus5, detailedPriceAnalytics$OrderStatus6, detailedPriceAnalytics$OrderStatus7, detailedPriceAnalytics$OrderStatus8, detailedPriceAnalytics$OrderStatus9, detailedPriceAnalytics$OrderStatus10, detailedPriceAnalytics$OrderStatus11, detailedPriceAnalytics$OrderStatus12};
        $VALUES = detailedPriceAnalytics$OrderStatusArr;
        $ENTRIES = a.a(detailedPriceAnalytics$OrderStatusArr);
    }

    public DetailedPriceAnalytics$OrderStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static DetailedPriceAnalytics$OrderStatus valueOf(String str) {
        return (DetailedPriceAnalytics$OrderStatus) Enum.valueOf(DetailedPriceAnalytics$OrderStatus.class, str);
    }

    public static DetailedPriceAnalytics$OrderStatus[] values() {
        return (DetailedPriceAnalytics$OrderStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
