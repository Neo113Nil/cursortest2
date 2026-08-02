package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddPaymentInfo$AddPaymentInfoStatus.values().length];
        try {
            iArr[AddPaymentInfo$AddPaymentInfoStatus.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentInfo$AddPaymentInfoStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddPaymentInfo$AddPaymentInfoStatus.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
