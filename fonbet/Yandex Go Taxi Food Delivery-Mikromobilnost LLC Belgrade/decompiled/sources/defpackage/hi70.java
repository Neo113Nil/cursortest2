package defpackage;

import com.yandex.go.taxi.order.models.api.objects.RouteInfo;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class hi70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteInfo.Position.Type.values().length];
        try {
            iArr[RouteInfo.Position.Type.POOL_PICKUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteInfo.Position.Type.POOL_DROPOFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteInfo.Position.Type.CHAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
