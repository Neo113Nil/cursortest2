package defpackage;

import com.yandex.mapkit.navigation.transport.RouteChangeReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class o541 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteChangeReason.values().length];
        try {
            iArr[RouteChangeReason.REROUTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteChangeReason.USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteChangeReason.FINISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouteChangeReason.TRANSPORT_THREAD_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
