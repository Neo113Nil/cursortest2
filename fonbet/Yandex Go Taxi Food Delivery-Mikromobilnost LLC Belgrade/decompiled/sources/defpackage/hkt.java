package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hkt {
    public final String a;
    public final String b;
    public final bh70 c;

    public hkt(String str, String str2, bh70 bh70Var) {
        this.a = str;
        this.b = str2;
        this.c = bh70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkt)) {
            return false;
        }
        hkt hktVar = (hkt) obj;
        return jl40.l(this.a, hktVar.a) && jl40.l(this.b, hktVar.b) && this.c.equals(hktVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("GluedRequirement(requirementName=", this.a, ", header=", this.b, ", optionsState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
