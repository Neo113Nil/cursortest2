package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class m8l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteChangeType.values().length];
        try {
            iArr[RouteChangeType.ADD_MID_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteChangeType.DELETE_MID_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
