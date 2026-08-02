package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hk80 {
    public final String a;
    public final String b;
    public final String c;
    public final k7v d;
    public final String e;
    public final kdc f;

    public hk80(String str, String str2, String str3, k7v k7vVar, String str4, kdc kdcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k7vVar;
        this.e = str4;
        this.f = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk80)) {
            return false;
        }
        hk80 hk80Var = (hk80) obj;
        return jl40.l(this.a, hk80Var.a) && jl40.l(this.b, hk80Var.b) && jl40.l(this.c, hk80Var.c) && jl40.l(this.d, hk80Var.d) && jl40.l(this.e, hk80Var.e) && jl40.l(this.f, hk80Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        k7v k7vVar = this.d;
        int b2 = unr0.b((b + (k7vVar == null ? 0 : k7vVar.hashCode())) * 31, 31, this.e);
        kdc kdcVar = this.f;
        return b2 + (kdcVar != null ? kdcVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrganizationPreviewTag(id=", this.a, ", title=", this.b, ", searchQuery=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", backgroundColor=");
        v.append(this.e);
        v.append(", textColor=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
