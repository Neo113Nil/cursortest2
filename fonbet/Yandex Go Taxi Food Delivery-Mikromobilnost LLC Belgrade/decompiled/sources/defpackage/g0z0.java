package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class g0z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinInvalidationReason.values().length];
        try {
            iArr[PinInvalidationReason.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinInvalidationReason.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinInvalidationReason.SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinInvalidationReason.DESELECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PinInvalidationReason.HIDE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PinInvalidationReason.SHOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PinInvalidationReason.REDRAW.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
