package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class fki extends hki {
    public final int a;
    public final DeliveryFormStepType b = DeliveryFormStepType.DESTINATION;

    public fki(int i) {
        this.a = i;
    }

    @Override // defpackage.hki
    public final DeliveryFormStepType a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fki) && this.a == ((fki) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "Destination(index=", Extension.C_BRAKE);
    }
}
