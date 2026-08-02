package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class hzb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinState.ICON_LABEL_S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinState.ICON_LABEL_M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
