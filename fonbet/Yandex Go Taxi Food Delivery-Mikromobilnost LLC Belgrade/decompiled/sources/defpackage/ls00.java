package defpackage;

import ru.yandex.taxi.map_common.style.source.model.Theme;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ls00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Theme.values().length];
        try {
            iArr[Theme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Theme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
