package defpackage;

import ru.yandex.taxi.masstransit.trains.search.SuggestType;
import ru.yandex.taxi.masstransit.ui.StationFocus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class cc01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

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
        int[] iArr2 = new int[SuggestType.values().length];
        try {
            iArr2[SuggestType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SuggestType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
