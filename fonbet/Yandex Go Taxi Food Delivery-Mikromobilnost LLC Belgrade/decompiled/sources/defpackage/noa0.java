package defpackage;

import ru.yandex.taxi.plus.sdk.payments.web.PaymentEvent$ErrorPaymentEvent;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class noa0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentEvent$ErrorPaymentEvent.Action.values().length];
        try {
            iArr[PaymentEvent$ErrorPaymentEvent.Action.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentEvent$ErrorPaymentEvent.Action.RELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
