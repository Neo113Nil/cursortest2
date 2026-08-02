package defpackage;

import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class gki extends hki {
    public static final gki a = new gki();
    public static final DeliveryFormStepType b = DeliveryFormStepType.SOURCE;

    @Override // defpackage.hki
    public final DeliveryFormStepType a() {
        return b;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gki);
    }

    public final int hashCode() {
        return 306051041;
    }

    public final String toString() {
        return "Source";
    }
}
