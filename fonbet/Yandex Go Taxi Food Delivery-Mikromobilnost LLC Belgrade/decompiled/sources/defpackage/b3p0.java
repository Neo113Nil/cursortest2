package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b3p0 implements e3p0 {
    public final String a;
    public final Integer b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;

    public b3p0(String str, Integer num, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str2) {
        this.a = str;
        this.b = num;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3p0)) {
            return false;
        }
        b3p0 b3p0Var = (b3p0) obj;
        return jl40.l(this.a, b3p0Var.a) && jl40.l(this.b, b3p0Var.b) && jl40.l(this.c, b3p0Var.c) && jl40.l(this.d, b3p0Var.d) && jl40.l(this.e, b3p0Var.e) && jl40.l(this.f, b3p0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = smw0.b(smw0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode2 = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("Header(iconUrl=", this.b, this.a, ", color=", ", title=");
        vfc.A(q, this.c, ", description=", this.d, ", detailsText=");
        q.append((Object) this.e);
        q.append(", detailsDeeplink=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
