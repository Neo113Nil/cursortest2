package defpackage;

import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oco0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperPassesDisplayVersionDto.values().length];
        try {
            iArr[SuperPassesDisplayVersionDto.V1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperPassesDisplayVersionDto.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
