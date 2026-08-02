package defpackage;

import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class jbf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CreditType.values().length];
        try {
            iArr[CreditType.CREDIT_LIMIT_DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditType.MKK_DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditType.BOOST_DEPOSIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditType.CREDIT_DEPOSIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[CreditDepositTransactionStatusEntity$Status.values().length];
        try {
            iArr2[CreditDepositTransactionStatusEntity$Status.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CreditDepositTransactionStatusEntity$Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CreditDepositTransactionStatusEntity$Status.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
