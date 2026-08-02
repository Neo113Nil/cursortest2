package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ihi {
    public final String a;
    public final String b;
    public final lhi c;
    public final List d;
    public final List e;
    public final xgi f;
    public final String g;
    public final fhi h;

    public ihi(String str, String str2, lhi lhiVar, List list, List list2, xgi xgiVar, String str3, fhi fhiVar) {
        this.a = str;
        this.b = str2;
        this.c = lhiVar;
        this.d = list;
        this.e = list2;
        this.f = xgiVar;
        this.g = str3;
        this.h = fhiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihi)) {
            return false;
        }
        ihi ihiVar = (ihi) obj;
        return jl40.l(this.a, ihiVar.a) && jl40.l(this.b, ihiVar.b) && jl40.l(this.c, ihiVar.c) && jl40.l(this.d, ihiVar.d) && jl40.l(this.e, ihiVar.e) && jl40.l(this.f, ihiVar.f) && jl40.l(this.g, ihiVar.g) && jl40.l(this.h, ihiVar.h);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        lhi lhiVar = this.c;
        int hashCode = (b + (lhiVar == null ? 0 : lhiVar.hashCode())) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        xgi xgiVar = this.f;
        int b2 = unr0.b((hashCode3 + (xgiVar == null ? 0 : xgiVar.hashCode())) * 31, 31, this.g);
        fhi fhiVar = this.h;
        return b2 + (fhiVar != null ? fhiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryPaidInsuranceScreenModel(iconTag=", this.a, ", title=", this.b, ", toggle=");
        v.append(this.c);
        v.append(", description=");
        v.append(this.d);
        v.append(", descriptionAT=");
        v.append(this.e);
        v.append(", infoButton=");
        v.append(this.f);
        v.append(", buttonText=");
        v.append(this.g);
        v.append(", button=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
