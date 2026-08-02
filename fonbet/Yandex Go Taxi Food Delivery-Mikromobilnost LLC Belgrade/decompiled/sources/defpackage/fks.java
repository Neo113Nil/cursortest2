package defpackage;

import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fks {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NextButtonShowStrategy.values().length];
        try {
            iArr[NextButtonShowStrategy.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NextButtonShowStrategy.WHEN_HAS_DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NextButtonShowStrategy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
