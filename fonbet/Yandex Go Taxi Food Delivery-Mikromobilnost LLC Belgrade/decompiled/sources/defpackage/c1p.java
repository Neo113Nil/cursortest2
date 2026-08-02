package defpackage;

import ru.yandex.taxi.superapp.adjust.SupportedAdjustEvents;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c1p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportedAdjustEvents.values().length];
        try {
            iArr[SupportedAdjustEvents.SHORTCUT_CLICKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportedAdjustEvents.SHOWCASE_APPEARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
