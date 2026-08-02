package com.yandex.go.multimodal_route.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteTripStatus", "", "Lcom/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteTripStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Created", "Search", "Driving", "Waiting", "Transporting", CA20Status.STATUS_REQUEST_DESCRIPTION_C, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteAnalytics$MultimodalRouteTripStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteTripStatus[] $VALUES;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Complete;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Created;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Driving;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Search;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Transporting;
    public static final MultimodalRouteAnalytics$MultimodalRouteTripStatus Waiting;
    private final String eventValue;

    static {
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus = new MultimodalRouteAnalytics$MultimodalRouteTripStatus("Created", 0, "created");
        Created = multimodalRouteAnalytics$MultimodalRouteTripStatus;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus2 = new MultimodalRouteAnalytics$MultimodalRouteTripStatus("Search", 1, "search");
        Search = multimodalRouteAnalytics$MultimodalRouteTripStatus2;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus3 = new MultimodalRouteAnalytics$MultimodalRouteTripStatus("Driving", 2, "driving");
        Driving = multimodalRouteAnalytics$MultimodalRouteTripStatus3;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus4 = new MultimodalRouteAnalytics$MultimodalRouteTripStatus("Waiting", 3, "waiting");
        Waiting = multimodalRouteAnalytics$MultimodalRouteTripStatus4;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus5 = new MultimodalRouteAnalytics$MultimodalRouteTripStatus("Transporting", 4, "transporting");
        Transporting = multimodalRouteAnalytics$MultimodalRouteTripStatus5;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus6 = new MultimodalRouteAnalytics$MultimodalRouteTripStatus(CA20Status.STATUS_REQUEST_DESCRIPTION_C, 5, "complete");
        Complete = multimodalRouteAnalytics$MultimodalRouteTripStatus6;
        MultimodalRouteAnalytics$MultimodalRouteTripStatus[] multimodalRouteAnalytics$MultimodalRouteTripStatusArr = {multimodalRouteAnalytics$MultimodalRouteTripStatus, multimodalRouteAnalytics$MultimodalRouteTripStatus2, multimodalRouteAnalytics$MultimodalRouteTripStatus3, multimodalRouteAnalytics$MultimodalRouteTripStatus4, multimodalRouteAnalytics$MultimodalRouteTripStatus5, multimodalRouteAnalytics$MultimodalRouteTripStatus6};
        $VALUES = multimodalRouteAnalytics$MultimodalRouteTripStatusArr;
        $ENTRIES = a.a(multimodalRouteAnalytics$MultimodalRouteTripStatusArr);
    }

    public MultimodalRouteAnalytics$MultimodalRouteTripStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultimodalRouteAnalytics$MultimodalRouteTripStatus valueOf(String str) {
        return (MultimodalRouteAnalytics$MultimodalRouteTripStatus) Enum.valueOf(MultimodalRouteAnalytics$MultimodalRouteTripStatus.class, str);
    }

    public static MultimodalRouteAnalytics$MultimodalRouteTripStatus[] values() {
        return (MultimodalRouteAnalytics$MultimodalRouteTripStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
