package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class pti {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThemeStyle.values().length];
        try {
            iArr[ThemeStyle.ULTIMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeStyle.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
