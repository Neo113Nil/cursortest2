package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class pyr0 implements ryr0 {
    public static final pyr0 a = new pyr0();

    @Override // defpackage.b52
    public final String a() {
        return TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pyr0);
    }

    public final int hashCode() {
        return 1715820429;
    }

    public final String toString() {
        return "Taxi";
    }
}
