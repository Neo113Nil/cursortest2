package defpackage;

import com.yandex.go.payments.addmethod.data.model.PaymentMethodBindingStatusResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class gk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodBindingStatusResponse.BindingStatus.values().length];
        try {
            iArr[PaymentMethodBindingStatusResponse.BindingStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodBindingStatusResponse.BindingStatus.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodBindingStatusResponse.BindingStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethodBindingStatusResponse.BindingStatus.FAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
