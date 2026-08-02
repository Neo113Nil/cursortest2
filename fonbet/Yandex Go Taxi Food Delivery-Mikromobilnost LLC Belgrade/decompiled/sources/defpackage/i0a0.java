package defpackage;

import com.yandex.go.payments.payment.DeliveryPayment$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class i0a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPayment$Type.values().length];
        try {
            iArr[DeliveryPayment$Type.CARGO_CORP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPayment$Type.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
