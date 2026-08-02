package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c9u {
    public final String a;
    public final String b;
    public final String c;
    public final g9u d;

    public c9u(String str, String str2, String str3, g9u g9uVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = g9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9u)) {
            return false;
        }
        c9u c9uVar = (c9u) obj;
        return this.a.equals(c9uVar.a) && jl40.l(this.b, c9uVar.b) && jl40.l(this.c, c9uVar.c) && jl40.l(this.d, c9uVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g9u g9uVar = this.d;
        return hashCode3 + (g9uVar != null ? g9uVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Header(title=", this.a, ", subtitle=", this.b, ", leadImageTag=");
        v.append(this.c);
        v.append(", trailButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
