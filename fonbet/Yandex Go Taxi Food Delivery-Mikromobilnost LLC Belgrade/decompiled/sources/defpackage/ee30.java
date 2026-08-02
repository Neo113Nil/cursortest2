package defpackage;

import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ee30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode.values().length];
        try {
            iArr[CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState.PaymentCheckoutErrorCode.MOS_METRO_AUTH_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
