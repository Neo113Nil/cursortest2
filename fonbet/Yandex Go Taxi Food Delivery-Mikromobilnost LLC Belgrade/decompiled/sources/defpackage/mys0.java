package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.OpeningSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class mys0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OpeningSource.values().length];
        try {
            iArr[OpeningSource.SLIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpeningSource.COMMON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
