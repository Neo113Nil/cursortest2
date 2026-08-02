package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class h4w {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final a4w e;
    public final v3w f;

    public h4w(String str, String str2, String str3, int i, lvm lvmVar, v3w v3wVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = lvmVar;
        this.f = v3wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4w)) {
            return false;
        }
        h4w h4wVar = (h4w) obj;
        return jl40.l(this.a, h4wVar.a) && jl40.l(this.b, h4wVar.b) && jl40.l(this.c, h4wVar.c) && this.d == h4wVar.d && jl40.l(this.e, h4wVar.e) && jl40.l(this.f, h4wVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = oyr.b(this.d, unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
        a4w a4wVar = this.e;
        int hashCode2 = (b + (a4wVar == null ? 0 : a4wVar.hashCode())) * 31;
        v3w v3wVar = this.f;
        return hashCode2 + (v3wVar != null ? v3wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("InstructionModel(title=", this.a, ", subtitle=", this.b, ", iconImageTag=");
        b64.A(this.d, this.c, ", defaultIcon=", ", action=", v);
        v.append(this.e);
        v.append(", button=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public h4w() {
        this("", null, "", 0, null, null);
    }
}
