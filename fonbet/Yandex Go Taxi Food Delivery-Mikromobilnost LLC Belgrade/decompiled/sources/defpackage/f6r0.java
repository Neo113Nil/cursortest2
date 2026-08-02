package defpackage;

import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class f6r0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MenuItemElementType.values().length];
        try {
            iArr[MenuItemElementType.SWITCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MenuItemElementType.NAVIGATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
