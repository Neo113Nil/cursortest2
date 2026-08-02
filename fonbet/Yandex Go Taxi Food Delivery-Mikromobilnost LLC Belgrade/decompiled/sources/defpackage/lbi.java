package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lbi {
    public final boolean a;
    public final hki b;
    public final ju0 c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public lbi(hki hkiVar, ju0 ju0Var, String str, String str2, String str3, boolean z, String str4, boolean z2, int i) {
        boolean z3 = (i & 1) == 0;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        z = (i & 64) != 0 ? false : z;
        str4 = (i & 128) != 0 ? null : str4;
        z2 = (i & 256) != 0 ? true : z2;
        this.a = z3;
        this.b = hkiVar;
        this.c = ju0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = z2;
    }

    public final String a() {
        return this.d;
    }

    public final ju0 b() {
        return this.c;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbi)) {
            return false;
        }
        lbi lbiVar = (lbi) obj;
        return this.a == lbiVar.a && this.b.equals(lbiVar.b) && jl40.l(this.c, lbiVar.c) && jl40.l(this.d, lbiVar.d) && jl40.l(this.e, lbiVar.e) && jl40.l(this.f, lbiVar.f) && this.g == lbiVar.g && jl40.l(this.h, lbiVar.h) && this.i == lbiVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int e = unr0.e((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        return Boolean.hashCode(this.i) + ((e + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryFormSearchPayload(isNddFlow=");
        sb.append(this.a);
        sb.append(", pointType=");
        sb.append(this.b);
        sb.append(", editMode=");
        sb.append(this.c);
        sb.append(", currentMode=");
        sb.append(this.d);
        sb.append(", selectedClass=");
        g8e.D(sb, this.e, ", hint=", this.f, ", isDiscoveryMapEnabled=");
        unr0.A(", destinationSearchText=", this.h, ", isMapSelectionEnabled=", sb, this.g);
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
