package defpackage;

import com.yandex.xplat.payment.sdk.PaymentPollingResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class moe {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentPollingResult.values().length];
        try {
            iArr[PaymentPollingResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentPollingResult.WAIT_FOR_PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
