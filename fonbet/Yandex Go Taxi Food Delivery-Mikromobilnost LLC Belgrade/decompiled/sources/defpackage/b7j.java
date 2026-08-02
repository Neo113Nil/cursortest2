package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$RoutePointsState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class b7j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetailsCardRoutePointsStyleInteractor$RoutePointsState.values().length];
        try {
            iArr[DetailsCardRoutePointsStyleInteractor$RoutePointsState.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetailsCardRoutePointsStyleInteractor$RoutePointsState.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DetailsCardRoutePointsStyleInteractor$RoutePointsState.STATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
