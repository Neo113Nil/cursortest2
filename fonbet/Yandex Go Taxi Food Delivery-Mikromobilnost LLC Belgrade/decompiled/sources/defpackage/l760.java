package defpackage;

import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class l760 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RecenterType.values().length];
        try {
            iArr[RecenterType.USER_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecenterType.ALL_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
