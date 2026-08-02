package defpackage;

import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class jj30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VehicleType.values().length];
        try {
            iArr[VehicleType.Bus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VehicleType.Aeroexpress.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VehicleType.Suburban.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
