package defpackage;

import ru.yandex.taxi.map.overlay.OrderDrivingRoute$Type;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class m080 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderDrivingRoute$Type.values().length];
        try {
            iArr[OrderDrivingRoute$Type.NORMAL_MONOCHROME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderDrivingRoute$Type.NORMAL_JAMS_COLORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
