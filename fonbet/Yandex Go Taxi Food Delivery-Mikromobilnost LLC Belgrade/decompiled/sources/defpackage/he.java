package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class he {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AcceptancePaymentButtonActionType.values().length];
        try {
            iArr[AcceptancePaymentButtonActionType.OPEN_PAYMENT_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AcceptancePaymentButtonActionType.CANCEL_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AcceptancePaymentButtonActionType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
