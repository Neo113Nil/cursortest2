package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kiz {
    public final jiz a;
    public final String b;
    public final String c;
    public final String d;

    public kiz(jiz jizVar, String str, String str2, String str3) {
        this.a = jizVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiz)) {
            return false;
        }
        kiz kizVar = (kiz) obj;
        return this.a.equals(kizVar.a) && jl40.l(this.b, kizVar.b) && jl40.l(this.c, kizVar.c) && jl40.l(this.d, kizVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSection(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return g8e.r(sb, this.c, ", imageUrl=", this.d, Extension.C_BRAKE);
    }
}
