package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pmc {
    public final String a;
    public final String b;
    public final String c;
    public final zki0 d;

    public pmc(String str, String str2, String str3, zki0 zki0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zki0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmc)) {
            return false;
        }
        pmc pmcVar = (pmc) obj;
        return jl40.l(this.a, pmcVar.a) && jl40.l(this.b, pmcVar.b) && jl40.l(this.c, pmcVar.c) && jl40.l(this.d, pmcVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommentValidatingData(description=", this.a, ", iconTag=", this.b, ", buttonText=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ pmc(zki0 zki0Var) {
        this("", null, "", zki0Var);
    }
}
