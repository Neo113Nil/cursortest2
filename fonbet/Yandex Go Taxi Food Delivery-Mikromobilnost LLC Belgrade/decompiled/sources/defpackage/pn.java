package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pn extends nr {
    public final String a;
    public final String b;
    public final String c;
    public final jw40 d;

    public pn(String str, String str2, String str3, jw40 jw40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jw40Var;
    }

    @Override // defpackage.nr
    public final String a() {
        return this.c;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn)) {
            return false;
        }
        pn pnVar = (pn) obj;
        return jl40.l(this.a, pnVar.a) && jl40.l(this.b, pnVar.b) && jl40.l(this.c, pnVar.c) && jl40.l(this.d, pnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionDialog(title=", this.a, ", badgeText=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", dialog=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
