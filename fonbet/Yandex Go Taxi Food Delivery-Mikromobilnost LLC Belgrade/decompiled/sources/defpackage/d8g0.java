package defpackage;

import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d8g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QrPaymentsSecondFactorScreenProvider$Request.values().length];
        try {
            iArr[QrPaymentsSecondFactorScreenProvider$Request.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrPaymentsSecondFactorScreenProvider$Request.SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
