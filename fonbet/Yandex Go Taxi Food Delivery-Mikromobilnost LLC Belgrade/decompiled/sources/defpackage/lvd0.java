package defpackage;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class lvd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WalkRouteOrderExperiment.OrderStatusRule.PointType.values().length];
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.POINT_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.POINT_B.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.END_OF_DRIVING_ROUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.USER_LOCATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WalkRouteOrderExperiment.OrderStatusRule.PointType.CHECK_IN_ZONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
