package defpackage;

import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ejd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PurchaseStatus.values().length];
        try {
            iArr[PurchaseStatus.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchaseStatus.SUBSCRIPTION_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchaseStatus.PURCHASE_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PurchaseStatus.PURCHASE_UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PurchaseStatus.PURCHASED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PurchaseStatus.SUCCESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PurchaseStatus.NETWORK_OR_SERVER_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
