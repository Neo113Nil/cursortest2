package defpackage;

import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class cfg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportQrScannerExperiment.QrTarget.values().length];
        try {
            iArr[TransportQrScannerExperiment.QrTarget.TRANSPORT_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
