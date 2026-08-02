package com.yandex.go.taxi.summary.mobilityhub.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2", "", "Lcom/yandex/go/taxi/summary/mobilityhub/analytics/TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MissingRoutes", "OfferLoadingError", "MissingEndpoint", "MapkitRoutesLoadingError", "RoutestatsLoadingError", "MissingRoutesByFilter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2[] $VALUES;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 MapkitRoutesLoadingError;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 MissingEndpoint;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 MissingRoutes;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 MissingRoutesByFilter;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 OfferLoadingError;
    public static final TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 RoutestatsLoadingError;
    private final String eventValue;

    static {
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("MissingRoutes", 0, "missing_routes");
        MissingRoutes = transitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV22 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("OfferLoadingError", 1, "offer_loading_error");
        OfferLoadingError = transitRoutesHubAnalytics$RouteSelectorErrorReasonV22;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV23 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("MissingEndpoint", 2, "missing_endpoint");
        MissingEndpoint = transitRoutesHubAnalytics$RouteSelectorErrorReasonV23;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV24 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("MapkitRoutesLoadingError", 3, "mapkit_routes_loading_error");
        MapkitRoutesLoadingError = transitRoutesHubAnalytics$RouteSelectorErrorReasonV24;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV25 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("RoutestatsLoadingError", 4, "routestats_loading_error");
        RoutestatsLoadingError = transitRoutesHubAnalytics$RouteSelectorErrorReasonV25;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV26 = new TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2("MissingRoutesByFilter", 5, "missing_routes_by_filter");
        MissingRoutesByFilter = transitRoutesHubAnalytics$RouteSelectorErrorReasonV26;
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2[] transitRoutesHubAnalytics$RouteSelectorErrorReasonV2Arr = {transitRoutesHubAnalytics$RouteSelectorErrorReasonV2, transitRoutesHubAnalytics$RouteSelectorErrorReasonV22, transitRoutesHubAnalytics$RouteSelectorErrorReasonV23, transitRoutesHubAnalytics$RouteSelectorErrorReasonV24, transitRoutesHubAnalytics$RouteSelectorErrorReasonV25, transitRoutesHubAnalytics$RouteSelectorErrorReasonV26};
        $VALUES = transitRoutesHubAnalytics$RouteSelectorErrorReasonV2Arr;
        $ENTRIES = a.a(transitRoutesHubAnalytics$RouteSelectorErrorReasonV2Arr);
    }

    public TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 valueOf(String str) {
        return (TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2) Enum.valueOf(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.class, str);
    }

    public static TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2[] values() {
        return (TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
