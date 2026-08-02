package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class hjx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TariffOrderFlow.values().length];
        try {
            iArr[TariffOrderFlow.DRIVE_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TariffOrderFlow.TAXI_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TariffOrderFlow.SHUTTLE_FLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TariffOrderFlow.DELIVERY_FLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
