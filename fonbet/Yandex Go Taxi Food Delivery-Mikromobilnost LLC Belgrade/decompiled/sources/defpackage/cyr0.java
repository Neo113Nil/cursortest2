package defpackage;

import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class cyr0 implements ryr0 {
    public static final cyr0 a = new cyr0();

    @Override // defpackage.b52
    public final String a() {
        return TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cyr0);
    }

    public final int hashCode() {
        return -825758237;
    }

    public final String toString() {
        return "Delivery";
    }
}
