package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class fyr0 implements ryr0 {
    public static final fyr0 a = new fyr0();

    @Override // defpackage.b52
    public final String a() {
        return TariffOrderFlow.ORDER_FLOW_DRIVE_KEY;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fyr0);
    }

    public final int hashCode() {
        return 1636541947;
    }

    public final String toString() {
        return "Drive";
    }
}
