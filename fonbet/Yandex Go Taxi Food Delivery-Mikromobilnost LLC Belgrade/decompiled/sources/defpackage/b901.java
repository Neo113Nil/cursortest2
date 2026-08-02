package defpackage;

import com.yandex.mapkit.directions.traffic_lights.Signal;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class b901 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Signal.values().length];
        try {
            iArr[Signal.GREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Signal.RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Signal.YELLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Signal.RED_AND_YELLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
