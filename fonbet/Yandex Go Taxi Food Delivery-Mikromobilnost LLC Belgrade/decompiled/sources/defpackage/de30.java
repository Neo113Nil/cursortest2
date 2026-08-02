package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class de30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckoutResponse.TransportItem.TransportType.values().length];
        try {
            iArr[CheckoutResponse.TransportItem.TransportType.BUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckoutResponse.TransportItem.TransportType.TRAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckoutResponse.TransportItem.TransportType.TROLLEYBUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CheckoutResponse.TransportItem.TransportType.WATER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CheckoutResponse.TransportItem.TransportType.ELECTROBUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
