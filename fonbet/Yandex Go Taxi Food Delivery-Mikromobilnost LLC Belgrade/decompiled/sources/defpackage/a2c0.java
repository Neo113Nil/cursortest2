package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGeometryEasing;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a2c0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinWarGeometryEasing.values().length];
        try {
            iArr[PinWarGeometryEasing.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinWarGeometryEasing.EASE_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinWarGeometryEasing.EASE_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinWarGeometryEasing.EASE_IN_OUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
