package defpackage;

import com.yandex.go.payments.sbp.domain.OpeningBankDialogInteractor$DialogDataSource;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ia70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OpeningBankDialogInteractor$DialogDataSource.values().length];
        try {
            iArr[OpeningBankDialogInteractor$DialogDataSource.WEB_OVERRIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpeningBankDialogInteractor$DialogDataSource.WITHOUT_WEB_OVERRIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OpeningBankDialogInteractor$DialogDataSource.ORIGINAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
