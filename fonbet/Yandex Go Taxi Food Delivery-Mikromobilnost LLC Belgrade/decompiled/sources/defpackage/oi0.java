package defpackage;

import com.yandex.go.deeplinks.generated.add_payment_method.AddPaymentMethodType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class oi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddPaymentMethodType.values().length];
        try {
            iArr[AddPaymentMethodType.SBP_TOKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentMethodType.MBANK_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddPaymentMethodType.YAPE_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddPaymentMethodType.NEQUI_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AddPaymentMethodType.FASTSHIFT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
