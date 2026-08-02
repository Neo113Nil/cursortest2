package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hec0 {
    public final String a;
    public final String b;
    public final fr c;

    public hec0(String str, String str2, fr frVar) {
        this.a = str;
        this.b = str2;
        this.c = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hec0)) {
            return false;
        }
        hec0 hec0Var = (hec0) obj;
        return jl40.l(this.a, hec0Var.a) && jl40.l(this.b, hec0Var.b) && jl40.l(this.c, hec0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fr frVar = this.c;
        return hashCode2 + (frVar != null ? frVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(imageTag=", this.a, ", contentDescription=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
