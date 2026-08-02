package defpackage;

import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ocy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentSdkEnvironment.values().length];
        try {
            iArr[PaymentSdkEnvironment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentSdkEnvironment.LOCALTESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentSdkEnvironment.CROWDTESTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentSdkEnvironment.MIMINOTESTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentSdkEnvironment.PRODUCTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
