package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class bvh {
    public final Address a;
    public final String b;
    public final tqo c;
    public final DeliveryFormStepType d;

    public bvh(Address address, String str, tqo tqoVar, DeliveryFormStepType deliveryFormStepType) {
        this.a = address;
        this.b = str;
        this.c = tqoVar;
        this.d = deliveryFormStepType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvh)) {
            return false;
        }
        bvh bvhVar = (bvh) obj;
        return jl40.l(this.a, bvhVar.a) && this.b.equals(bvhVar.b) && this.c.equals(bvhVar.c) && this.d == bvhVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "DeliveryAddressCorrectionParams(address=" + this.a + ", originalText=" + this.b + ", titlesModel=" + this.c + ", pointType=" + this.d + Extension.C_BRAKE;
    }
}
