package defpackage;

import ru.yandextaxi.flutter_yandex_mapkit.models.OverzoomMode;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class d390 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OverzoomMode.values().length];
        try {
            iArr[OverzoomMode.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OverzoomMode.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OverzoomMode.WITH_PREFETCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
