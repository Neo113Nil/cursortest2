package defpackage;

import ru.yandex.taxi.object.RouteVehicleType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class aqe0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteVehicleType.values().length];
        try {
            iArr[RouteVehicleType.TRUCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteVehicleType.MOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteVehicleType.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
