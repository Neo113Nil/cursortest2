package defpackage;

import com.yandex.go.payments.payment.TransportCardPayment$CardStatusDomain;
import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class f111 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransportCardPayment$CardStatusDomain.values().length];
        try {
            iArr[TransportCardPayment$CardStatusDomain.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportCardPayment$CardStatusDomain.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentOptionState.values().length];
        try {
            iArr2[PaymentOptionState.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
