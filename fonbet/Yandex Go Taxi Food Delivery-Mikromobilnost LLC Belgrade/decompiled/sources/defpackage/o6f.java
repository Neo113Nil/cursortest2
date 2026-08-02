package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class o6f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreatePaymentResponse.Status.values().length];
        try {
            iArr[CreatePaymentResponse.Status.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreatePaymentResponse.Status.Failure.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreatePaymentResponse.Status.Processing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
