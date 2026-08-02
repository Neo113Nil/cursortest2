package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cus implements e6v {
    public final String a;
    public final wts b;
    public final String c;

    public cus(String str, wts wtsVar) {
        this.a = str;
        this.b = wtsVar;
        this.c = wtsVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cus)) {
            return false;
        }
        cus cusVar = (cus) obj;
        return jl40.l(this.a, cusVar.a) && jl40.l(this.b, cusVar.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GasStationsFiltersListContent(gasStationServiceId=" + this.a + ", filter=" + this.b + Extension.C_BRAKE;
    }
}
