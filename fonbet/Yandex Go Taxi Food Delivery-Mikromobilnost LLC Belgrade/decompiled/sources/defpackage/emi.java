package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class emi {
    public final String a;
    public final String b;

    public emi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emi)) {
            return false;
        }
        emi emiVar = (emi) obj;
        return jl40.l(this.a, emiVar.a) && jl40.l(this.b, emiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeliveryRentalDescription(title=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
