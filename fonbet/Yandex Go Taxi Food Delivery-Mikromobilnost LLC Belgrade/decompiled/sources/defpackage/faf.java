package defpackage;

import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class faf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreditDepositTransactionStatusEntity$Status.values().length];
        try {
            iArr[CreditDepositTransactionStatusEntity$Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditDepositTransactionStatusEntity$Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditDepositTransactionStatusEntity$Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
