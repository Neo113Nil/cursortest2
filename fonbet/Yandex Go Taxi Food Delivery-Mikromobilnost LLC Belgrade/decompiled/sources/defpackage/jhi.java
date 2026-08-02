package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jhi {
    public final String a;
    public final String b;

    public jhi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhi)) {
            return false;
        }
        jhi jhiVar = (jhi) obj;
        return jl40.l(this.a, jhiVar.a) && jl40.l(this.b, jhiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeliveryPaidInsuranceSummaryBubbleModel(title=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
    }
}
