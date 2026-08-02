package com.yandex.go.taxi.order.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$TaxiOrderStatus", "", "Lcom/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$TaxiOrderStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Preorder", "Search", "Scheduling", "Scheduled", "CheckIn", "Driving", "Waiting", "Transporting", CA20Status.STATUS_REQUEST_DESCRIPTION_C, "Cancelled", "Failed", CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, "go-client-android.features.taxi_order:shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderAnalytics$TaxiOrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderAnalytics$TaxiOrderStatus[] $VALUES;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Cancelled;
    public static final TaxiOrderAnalytics$TaxiOrderStatus CheckIn;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Complete;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Driving;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Expired;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Failed;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Preorder;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Scheduled;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Scheduling;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Search;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Transporting;
    public static final TaxiOrderAnalytics$TaxiOrderStatus Waiting;
    private final String eventValue;

    static {
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus = new TaxiOrderAnalytics$TaxiOrderStatus("Preorder", 0, "preorder");
        Preorder = taxiOrderAnalytics$TaxiOrderStatus;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus2 = new TaxiOrderAnalytics$TaxiOrderStatus("Search", 1, "search");
        Search = taxiOrderAnalytics$TaxiOrderStatus2;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus3 = new TaxiOrderAnalytics$TaxiOrderStatus("Scheduling", 2, "scheduling");
        Scheduling = taxiOrderAnalytics$TaxiOrderStatus3;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus4 = new TaxiOrderAnalytics$TaxiOrderStatus("Scheduled", 3, "scheduled");
        Scheduled = taxiOrderAnalytics$TaxiOrderStatus4;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus5 = new TaxiOrderAnalytics$TaxiOrderStatus("CheckIn", 4, "check_in");
        CheckIn = taxiOrderAnalytics$TaxiOrderStatus5;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus6 = new TaxiOrderAnalytics$TaxiOrderStatus("Driving", 5, "driving");
        Driving = taxiOrderAnalytics$TaxiOrderStatus6;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus7 = new TaxiOrderAnalytics$TaxiOrderStatus("Waiting", 6, "waiting");
        Waiting = taxiOrderAnalytics$TaxiOrderStatus7;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus8 = new TaxiOrderAnalytics$TaxiOrderStatus("Transporting", 7, "transporting");
        Transporting = taxiOrderAnalytics$TaxiOrderStatus8;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus9 = new TaxiOrderAnalytics$TaxiOrderStatus(CA20Status.STATUS_REQUEST_DESCRIPTION_C, 8, "complete");
        Complete = taxiOrderAnalytics$TaxiOrderStatus9;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus10 = new TaxiOrderAnalytics$TaxiOrderStatus("Cancelled", 9, "cancelled");
        Cancelled = taxiOrderAnalytics$TaxiOrderStatus10;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus11 = new TaxiOrderAnalytics$TaxiOrderStatus("Failed", 10, "failed");
        Failed = taxiOrderAnalytics$TaxiOrderStatus11;
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus12 = new TaxiOrderAnalytics$TaxiOrderStatus(CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E, 11, "expired");
        Expired = taxiOrderAnalytics$TaxiOrderStatus12;
        TaxiOrderAnalytics$TaxiOrderStatus[] taxiOrderAnalytics$TaxiOrderStatusArr = {taxiOrderAnalytics$TaxiOrderStatus, taxiOrderAnalytics$TaxiOrderStatus2, taxiOrderAnalytics$TaxiOrderStatus3, taxiOrderAnalytics$TaxiOrderStatus4, taxiOrderAnalytics$TaxiOrderStatus5, taxiOrderAnalytics$TaxiOrderStatus6, taxiOrderAnalytics$TaxiOrderStatus7, taxiOrderAnalytics$TaxiOrderStatus8, taxiOrderAnalytics$TaxiOrderStatus9, taxiOrderAnalytics$TaxiOrderStatus10, taxiOrderAnalytics$TaxiOrderStatus11, taxiOrderAnalytics$TaxiOrderStatus12};
        $VALUES = taxiOrderAnalytics$TaxiOrderStatusArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderAnalytics$TaxiOrderStatusArr);
    }

    public TaxiOrderAnalytics$TaxiOrderStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TaxiOrderAnalytics$TaxiOrderStatus valueOf(String str) {
        return (TaxiOrderAnalytics$TaxiOrderStatus) Enum.valueOf(TaxiOrderAnalytics$TaxiOrderStatus.class, str);
    }

    public static TaxiOrderAnalytics$TaxiOrderStatus[] values() {
        return (TaxiOrderAnalytics$TaxiOrderStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
