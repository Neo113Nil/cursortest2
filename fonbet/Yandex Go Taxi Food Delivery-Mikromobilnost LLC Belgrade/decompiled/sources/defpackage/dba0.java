package defpackage;

import ru.yandex.taxi.paymentmethods.interactor.PaymentMethodValidator$PaymentSupportByTariff;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class dba0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodValidator$PaymentSupportByTariff.values().length];
        try {
            iArr[PaymentMethodValidator$PaymentSupportByTariff.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodValidator$PaymentSupportByTariff.SUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodValidator$PaymentSupportByTariff.NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
