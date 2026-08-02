package com.yandex.go.taxi.order.details.v2.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/taxi/order/details/v2/analytics/evgen/RideCardAnalytics$fallback", "", "Lcom/yandex/go/taxi/order/details/v2/analytics/evgen/RideCardAnalytics$fallback;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NoStatusInfo", "NoRideCardInfo", "EmptyItems", "EmptyPresentationDetails", "EmptyPresentationCompact", "CheckIn", "WalkingRoute", "A11y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardAnalytics$fallback {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardAnalytics$fallback[] $VALUES;
    public static final RideCardAnalytics$fallback A11y;
    public static final RideCardAnalytics$fallback CheckIn;
    public static final RideCardAnalytics$fallback EmptyItems;
    public static final RideCardAnalytics$fallback EmptyPresentationCompact;
    public static final RideCardAnalytics$fallback EmptyPresentationDetails;
    public static final RideCardAnalytics$fallback NoRideCardInfo;
    public static final RideCardAnalytics$fallback NoStatusInfo;
    public static final RideCardAnalytics$fallback WalkingRoute;
    private final String eventValue;

    static {
        RideCardAnalytics$fallback rideCardAnalytics$fallback = new RideCardAnalytics$fallback("NoStatusInfo", 0, "no_status_info");
        NoStatusInfo = rideCardAnalytics$fallback;
        RideCardAnalytics$fallback rideCardAnalytics$fallback2 = new RideCardAnalytics$fallback("NoRideCardInfo", 1, "no_ride_card_info");
        NoRideCardInfo = rideCardAnalytics$fallback2;
        RideCardAnalytics$fallback rideCardAnalytics$fallback3 = new RideCardAnalytics$fallback("EmptyItems", 2, "empty_items");
        EmptyItems = rideCardAnalytics$fallback3;
        RideCardAnalytics$fallback rideCardAnalytics$fallback4 = new RideCardAnalytics$fallback("EmptyPresentationDetails", 3, "empty_presentation_details");
        EmptyPresentationDetails = rideCardAnalytics$fallback4;
        RideCardAnalytics$fallback rideCardAnalytics$fallback5 = new RideCardAnalytics$fallback("EmptyPresentationCompact", 4, "empty_presentation_compact");
        EmptyPresentationCompact = rideCardAnalytics$fallback5;
        RideCardAnalytics$fallback rideCardAnalytics$fallback6 = new RideCardAnalytics$fallback("CheckIn", 5, "check_in");
        CheckIn = rideCardAnalytics$fallback6;
        RideCardAnalytics$fallback rideCardAnalytics$fallback7 = new RideCardAnalytics$fallback("WalkingRoute", 6, "walking_route");
        WalkingRoute = rideCardAnalytics$fallback7;
        RideCardAnalytics$fallback rideCardAnalytics$fallback8 = new RideCardAnalytics$fallback("A11y", 7, "a11y");
        A11y = rideCardAnalytics$fallback8;
        RideCardAnalytics$fallback[] rideCardAnalytics$fallbackArr = {rideCardAnalytics$fallback, rideCardAnalytics$fallback2, rideCardAnalytics$fallback3, rideCardAnalytics$fallback4, rideCardAnalytics$fallback5, rideCardAnalytics$fallback6, rideCardAnalytics$fallback7, rideCardAnalytics$fallback8};
        $VALUES = rideCardAnalytics$fallbackArr;
        $ENTRIES = a.a(rideCardAnalytics$fallbackArr);
    }

    public RideCardAnalytics$fallback(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RideCardAnalytics$fallback valueOf(String str) {
        return (RideCardAnalytics$fallback) Enum.valueOf(RideCardAnalytics$fallback.class, str);
    }

    public static RideCardAnalytics$fallback[] values() {
        return (RideCardAnalytics$fallback[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
