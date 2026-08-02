package defpackage;

import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class i37 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PurchaseStatus.values().length];
        try {
            iArr[PurchaseStatus.PURCHASE_AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchaseStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchaseStatus.PURCHASED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PurchaseStatus.PURCHASE_UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PurchaseStatus.NETWORK_OR_SERVER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PurchaseStatus.SUCCESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PurchaseStatus.SUBSCRIPTION_EXISTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[UpgradeStatus.values().length];
        try {
            iArr2[UpgradeStatus.UPGRADE_AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[UpgradeStatus.UPGRADE_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[UpgradeStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[UpgradeStatus.ERROR_UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[UpgradeStatus.NETWORK_OR_SERVER_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[UpgradeStatus.UPGRADED.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[UpgradeStatus.UPGRADE_SUCCESS.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr2;
    }
}
