package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dc8 {
    public final String a;
    public final String b;
    public final String c;
    public final nr d;

    public dc8(String str, String str2, String str3, nr nrVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = nrVar;
    }

    public final nr a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc8)) {
            return false;
        }
        dc8 dc8Var = (dc8) obj;
        return jl40.l(this.a, dc8Var.a) && jl40.l(this.b, dc8Var.b) && jl40.l(this.c, dc8Var.c) && jl40.l(this.d, dc8Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        nr nrVar = this.d;
        return hashCode3 + (nrVar != null ? nrVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardBottomSection(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
