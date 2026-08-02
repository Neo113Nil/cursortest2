package defpackage;

import ru.yandex.taxi.map_common.map.process.MapComputationsProcessor$ExecuteOn;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class hg00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapComputationsProcessor$ExecuteOn.values().length];
        try {
            iArr[MapComputationsProcessor$ExecuteOn.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapComputationsProcessor$ExecuteOn.WORKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
