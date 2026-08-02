package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.data.ButtonType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class pyc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonType.values().length];
        try {
            iArr[ButtonType.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonType.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
