package defpackage;

import com.yandex.go.taxi.order.map.overlay.traffic.TrafficLightWithSignal$Signal;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class f901 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrafficLightWithSignal$Signal.values().length];
        try {
            iArr[TrafficLightWithSignal$Signal.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrafficLightWithSignal$Signal.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrafficLightWithSignal$Signal.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
