package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eum0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final dum0 f;
    public final sco0 g;

    public eum0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str2, dum0 dum0Var, sco0 sco0Var) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = str2;
        this.f = dum0Var;
        this.g = sco0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eum0)) {
            return false;
        }
        eum0 eum0Var = (eum0) obj;
        return jl40.l(this.a, eum0Var.a) && jl40.l(this.b, eum0Var.b) && jl40.l(this.c, eum0Var.c) && jl40.l(this.d, eum0Var.d) && jl40.l(this.e, eum0Var.e) && jl40.l(this.f, eum0Var.f) && jl40.l(this.g, eum0Var.g);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int b2 = smw0.b((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        dum0 dum0Var = this.f;
        return this.g.hashCode() + ((hashCode + (dum0Var != null ? dum0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "UpsaleLongestPass(passId=", this.a, ", passTitle=", ", passSubtitle=");
        vfc.A(t, this.c, ", priceTitle=", this.d, ", imageTag=");
        t.append(this.e);
        t.append(", button=");
        t.append(this.f);
        t.append(", scootersPasses=");
        t.append(this.g);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
