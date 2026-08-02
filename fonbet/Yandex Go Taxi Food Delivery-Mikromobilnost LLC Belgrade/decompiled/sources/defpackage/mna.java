package defpackage;

import com.yandex.go.analytics.realtime.event.RealtimeEventType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class mna {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RealtimeEventType.values().length];
        try {
            iArr[RealtimeEventType.Shown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RealtimeEventType.Clicked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RealtimeEventType.Received.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
