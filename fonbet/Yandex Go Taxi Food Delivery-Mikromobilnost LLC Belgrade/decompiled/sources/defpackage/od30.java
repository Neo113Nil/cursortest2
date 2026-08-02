package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class od30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckoutResponse.CheckoutPaymentMethods.Source.values().length];
        try {
            iArr[CheckoutResponse.CheckoutPaymentMethods.Source.MOSMETRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
