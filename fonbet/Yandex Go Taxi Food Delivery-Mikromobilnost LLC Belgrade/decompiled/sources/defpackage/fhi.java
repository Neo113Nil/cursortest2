package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fhi {
    public final hhi a;
    public final hhi b;

    public fhi(hhi hhiVar, hhi hhiVar2) {
        this.a = hhiVar;
        this.b = hhiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhi)) {
            return false;
        }
        fhi fhiVar = (fhi) obj;
        return this.a.equals(fhiVar.a) && jl40.l(this.b, fhiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hhi hhiVar = this.b;
        return hashCode + (hhiVar == null ? 0 : hhiVar.hashCode());
    }

    public final String toString() {
        return "DeliveryPaidInsuranceScreenButtonByEntryPointModel(default=" + this.a + ", orderButton=" + this.b + Extension.C_BRAKE;
    }
}
