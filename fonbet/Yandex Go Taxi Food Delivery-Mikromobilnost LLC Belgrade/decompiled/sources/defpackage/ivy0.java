package defpackage;

import ru.yandex.taxi.themes.ThemeChangeMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ivy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThemeChangeMode.values().length];
        try {
            iArr[ThemeChangeMode.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeChangeMode.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThemeChangeMode.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ThemeChangeMode.SYSTEM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
