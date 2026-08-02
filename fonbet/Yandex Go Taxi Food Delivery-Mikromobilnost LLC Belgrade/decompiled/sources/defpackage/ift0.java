package defpackage;

import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ift0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiMainControlElementEvent.values().length];
        try {
            iArr[TaxiMainControlElementEvent.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiMainControlElementEvent.ENABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TaxiMainControlElementEvent.DISABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
