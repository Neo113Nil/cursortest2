package defpackage;

import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class kz90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPaymentMethod.Type.values().length];
        try {
            iArr[DeliveryPaymentMethod.Type.CARGO_CORP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPaymentMethod.Type.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
