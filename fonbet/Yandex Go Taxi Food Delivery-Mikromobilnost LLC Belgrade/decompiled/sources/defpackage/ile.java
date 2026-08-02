package defpackage;

import com.yandex.payment.sdk.core.data.PaymentPollingResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ile {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentPollingResult.values().length];
        try {
            iArr[PaymentPollingResult.WAIT_FOR_PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
