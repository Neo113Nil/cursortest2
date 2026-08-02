package defpackage;

import ru.yandex.taxi.masstransit.StopModalDto;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class g440 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StopModalDto.ButtonType.values().length];
        try {
            iArr[StopModalDto.ButtonType.ROUTE_FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StopModalDto.ButtonType.ROUTE_TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StopModalDto.ButtonType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
