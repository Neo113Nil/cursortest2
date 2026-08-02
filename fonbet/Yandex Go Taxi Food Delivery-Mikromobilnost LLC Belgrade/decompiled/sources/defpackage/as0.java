package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class as0 {
    public final tqo a;
    public final yr0 b;
    public final DeliveryFormStepType c;

    public as0(tqo tqoVar, yr0 yr0Var, DeliveryFormStepType deliveryFormStepType) {
        this.a = tqoVar;
        this.b = yr0Var;
        this.c = deliveryFormStepType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as0)) {
            return false;
        }
        as0 as0Var = (as0) obj;
        return jl40.l(this.a, as0Var.a) && jl40.l(this.b, as0Var.b) && this.c == as0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddressCorrectionUiModel(experimentTitles=" + this.a + ", addressCorrectionFields=" + this.b + ", pointType=" + this.c + Extension.C_BRAKE;
    }
}
