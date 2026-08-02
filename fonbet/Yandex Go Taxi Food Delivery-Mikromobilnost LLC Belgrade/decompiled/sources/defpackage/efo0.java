package defpackage;

import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class efo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PurchaseStatus.values().length];
        try {
            iArr[PurchaseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchaseStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchaseStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
