package defpackage;

import com.yandex.go.taxi.order.change.route.RouteChangeWarning;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class e1l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteChangeWarning.values().length];
        try {
            iArr[RouteChangeWarning.CHANGE_DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteChangeWarning.ADD_ROUTE_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteChangeWarning.CHANGE_ROUTE_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
