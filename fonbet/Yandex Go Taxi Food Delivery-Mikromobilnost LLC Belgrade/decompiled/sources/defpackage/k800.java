package defpackage;

import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class k800 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MainScreenBehavior.values().length];
        try {
            iArr[MainScreenBehavior.SHORTCUTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MainScreenBehavior.WHERE_TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
