package defpackage;

import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oc01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StationSearchOpenReason.values().length];
        try {
            iArr[StationSearchOpenReason.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StationSearchOpenReason.DEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StationSearchOpenReason.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
