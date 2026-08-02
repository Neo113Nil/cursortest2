package defpackage;

import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ph50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPvzExperiment.AddressFlow.values().length];
        try {
            iArr[DeliveryPvzExperiment.AddressFlow.COURIER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPvzExperiment.AddressFlow.PICKUP_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
