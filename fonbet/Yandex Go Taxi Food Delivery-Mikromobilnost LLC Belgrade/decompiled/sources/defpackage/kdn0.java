package defpackage;

import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class kdn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DebtStatus.values().length];
        try {
            iArr[DebtStatus.NO_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DebtStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
