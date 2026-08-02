package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class c0u0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigationDirection.values().length];
        try {
            iArr[NavigationDirection.BACKWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationDirection.FORWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
