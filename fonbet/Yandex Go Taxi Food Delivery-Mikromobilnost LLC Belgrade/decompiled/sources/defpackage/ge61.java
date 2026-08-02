package defpackage;

import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ge61 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RecenterType.values().length];
        try {
            iArr[RecenterType.ALL_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecenterType.USER_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RecenterType.DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RecenterType.CUSTOM_FROM_ORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
