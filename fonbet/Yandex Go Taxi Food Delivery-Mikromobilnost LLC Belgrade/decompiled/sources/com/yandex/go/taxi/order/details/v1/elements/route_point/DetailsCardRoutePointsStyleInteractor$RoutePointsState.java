package com.yandex.go.taxi.order.details.v1.elements.route_point;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/details/v1/elements/route_point/DetailsCardRoutePointsStyleInteractor$RoutePointsState", "", "Lcom/yandex/go/taxi/order/details/v1/elements/route_point/DetailsCardRoutePointsStyleInteractor$RoutePointsState;", "ADD", "EDIT", "STATIC", "GONE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardRoutePointsStyleInteractor$RoutePointsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DetailsCardRoutePointsStyleInteractor$RoutePointsState[] $VALUES;
    public static final DetailsCardRoutePointsStyleInteractor$RoutePointsState ADD;
    public static final DetailsCardRoutePointsStyleInteractor$RoutePointsState EDIT;
    public static final DetailsCardRoutePointsStyleInteractor$RoutePointsState GONE;
    public static final DetailsCardRoutePointsStyleInteractor$RoutePointsState STATIC;

    static {
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState = new DetailsCardRoutePointsStyleInteractor$RoutePointsState("ADD", 0);
        ADD = detailsCardRoutePointsStyleInteractor$RoutePointsState;
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState2 = new DetailsCardRoutePointsStyleInteractor$RoutePointsState("EDIT", 1);
        EDIT = detailsCardRoutePointsStyleInteractor$RoutePointsState2;
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState3 = new DetailsCardRoutePointsStyleInteractor$RoutePointsState("STATIC", 2);
        STATIC = detailsCardRoutePointsStyleInteractor$RoutePointsState3;
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState4 = new DetailsCardRoutePointsStyleInteractor$RoutePointsState("GONE", 3);
        GONE = detailsCardRoutePointsStyleInteractor$RoutePointsState4;
        DetailsCardRoutePointsStyleInteractor$RoutePointsState[] detailsCardRoutePointsStyleInteractor$RoutePointsStateArr = {detailsCardRoutePointsStyleInteractor$RoutePointsState, detailsCardRoutePointsStyleInteractor$RoutePointsState2, detailsCardRoutePointsStyleInteractor$RoutePointsState3, detailsCardRoutePointsStyleInteractor$RoutePointsState4};
        $VALUES = detailsCardRoutePointsStyleInteractor$RoutePointsStateArr;
        $ENTRIES = kotlin.enums.a.a(detailsCardRoutePointsStyleInteractor$RoutePointsStateArr);
    }

    public static DetailsCardRoutePointsStyleInteractor$RoutePointsState valueOf(String str) {
        return (DetailsCardRoutePointsStyleInteractor$RoutePointsState) Enum.valueOf(DetailsCardRoutePointsStyleInteractor$RoutePointsState.class, str);
    }

    public static DetailsCardRoutePointsStyleInteractor$RoutePointsState[] values() {
        return (DetailsCardRoutePointsStyleInteractor$RoutePointsState[]) $VALUES.clone();
    }
}
