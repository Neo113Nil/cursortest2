package defpackage;

import com.yandex.go.payments.api.interactor.BankPaymentsDepositType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class or51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BankPaymentsDepositType.values().length];
        try {
            iArr[BankPaymentsDepositType.EXACT_AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BankPaymentsDepositType.ORDER_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
