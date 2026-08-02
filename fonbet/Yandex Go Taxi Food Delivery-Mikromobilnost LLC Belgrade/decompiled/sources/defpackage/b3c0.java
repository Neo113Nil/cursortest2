package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.api.PinWarAnimationType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class b3c0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinWarAnimationType.values().length];
        try {
            iArr[PinWarAnimationType.Smooth.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinWarAnimationType.Linear.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
