package defpackage;

import ru.yandex.taxi.masstransit.ui.StationFocus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class hc01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StationFocus.values().length];
        try {
            iArr[StationFocus.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StationFocus.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StationFocus.DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
