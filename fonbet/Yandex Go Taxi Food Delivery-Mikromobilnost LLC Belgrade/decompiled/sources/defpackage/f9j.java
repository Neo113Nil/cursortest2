package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model.TitleStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f9j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TitleStyle.values().length];
        try {
            iArr[TitleStyle.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TitleStyle.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
