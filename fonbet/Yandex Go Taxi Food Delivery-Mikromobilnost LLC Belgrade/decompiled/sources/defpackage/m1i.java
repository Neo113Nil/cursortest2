package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySkipAlertCondition;

/* loaded from: classes5.dex */
public final class m1i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final DeliverySkipAlertCondition e;

    static {
        new m1i(0);
    }

    public m1i(String str, String str2, String str3, String str4, DeliverySkipAlertCondition deliverySkipAlertCondition) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = deliverySkipAlertCondition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1i)) {
            return false;
        }
        m1i m1iVar = (m1i) obj;
        return jl40.l(this.a, m1iVar.a) && jl40.l(this.b, m1iVar.b) && jl40.l(this.c, m1iVar.c) && jl40.l(this.d, m1iVar.d) && this.e == m1iVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryContinueWithRequirementAlert(title=", this.a, ", description=", this.b, ", cancelButtonText=");
        g8e.D(v, this.c, ", continueButtonText=", this.d, ", condition=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ m1i(int i) {
        this("", "", "", "", DeliverySkipAlertCondition.NEVER);
    }

    public m1i() {
        this(0);
    }
}
