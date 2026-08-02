package defpackage;

import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ory0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextMiddleEllipsizer$EllipsizingMode.values().length];
        try {
            iArr[TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextMiddleEllipsizer$EllipsizingMode.MIDDLE_ELLIPSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
