package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l3i {
    public final String a;
    public final String b;
    public final n7v c;
    public final boolean d;
    public final String e;

    public l3i(String str, String str2, n7v n7vVar, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = n7vVar;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3i)) {
            return false;
        }
        l3i l3iVar = (l3i) obj;
        return jl40.l(this.a, l3iVar.a) && jl40.l(this.b, l3iVar.b) && jl40.l(this.c, l3iVar.c) && this.d == l3iVar.d && jl40.l(this.e, l3iVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        n7v n7vVar = this.c;
        return this.e.hashCode() + unr0.e((hashCode2 + (n7vVar != null ? n7vVar.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryD2dRequirementModel(title=", this.a, ", subtitle=", this.b, ", leadImage=");
        v.append(this.c);
        v.append(", isSelected=");
        v.append(this.d);
        v.append(", tariffClass=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
