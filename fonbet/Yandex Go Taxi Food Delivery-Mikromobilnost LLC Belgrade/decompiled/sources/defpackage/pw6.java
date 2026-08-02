package defpackage;

import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class pw6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedAccountScreen.values().length];
        try {
            iArr[SharedAccountScreen.PAYMENT_METHOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedAccountScreen.REPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
