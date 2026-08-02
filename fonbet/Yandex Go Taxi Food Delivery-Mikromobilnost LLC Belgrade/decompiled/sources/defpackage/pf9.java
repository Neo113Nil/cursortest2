package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class pf9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteChangeType.values().length];
        try {
            iArr[RouteChangeType.CHANGE_DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteChangeType.ADD_MID_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteChangeType.DELETE_MID_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouteChangeType.CHANGE_MID_POINT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RouteChangeType.CHANGE_DESTINATIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
