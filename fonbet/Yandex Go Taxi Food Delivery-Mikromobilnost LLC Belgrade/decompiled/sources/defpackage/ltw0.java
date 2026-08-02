package defpackage;

import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ltw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
