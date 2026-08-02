package defpackage;

import ru.yandex.taxi.design.sourcedestination.PinType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class j9l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinType.values().length];
        try {
            iArr[PinType.SIMPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinType.PICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
