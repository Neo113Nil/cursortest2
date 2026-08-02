package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddPaymentHomeResponse.ButtonState.values().length];
        try {
            iArr[AddPaymentHomeResponse.ButtonState.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddPaymentHomeResponse.ButtonState.BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddPaymentHomeResponse.ButtonState.ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
