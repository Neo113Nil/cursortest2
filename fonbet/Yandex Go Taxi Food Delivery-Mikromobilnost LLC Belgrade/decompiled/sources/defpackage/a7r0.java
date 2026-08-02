package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class a7r0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigationDirection.values().length];
        try {
            iArr[NavigationDirection.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationDirection.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NavigationDirection.NO_ANIMATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
