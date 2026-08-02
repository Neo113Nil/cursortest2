package defpackage;

import com.yandex.go.payments.payment.CardPayment$VerifyStrategy;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class fyz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardPayment$VerifyStrategy.values().length];
        try {
            iArr[CardPayment$VerifyStrategy.ANTIFRAUD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
