package defpackage;

import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pz00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportPaymentAnalytics$CheckoutScreenOpenReason.values().length];
        try {
            iArr[TransportPaymentAnalytics$CheckoutScreenOpenReason.QrCode.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportPaymentAnalytics$CheckoutScreenOpenReason.Deeplink.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportPaymentAnalytics$CheckoutScreenOpenReason.VehicleItem.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
