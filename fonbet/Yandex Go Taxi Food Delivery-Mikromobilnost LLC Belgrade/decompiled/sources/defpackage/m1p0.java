package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class m1p0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final k1p0 f;
    public final Integer g;
    public final l1p0 h;
    public final CharSequence i;

    public m1p0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, k1p0 k1p0Var, Integer num, l1p0 l1p0Var, CharSequence charSequence5) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = charSequence4;
        this.f = k1p0Var;
        this.g = num;
        this.h = l1p0Var;
        this.i = charSequence5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1p0)) {
            return false;
        }
        m1p0 m1p0Var = (m1p0) obj;
        return jl40.l(this.a, m1p0Var.a) && jl40.l(this.b, m1p0Var.b) && jl40.l(this.c, m1p0Var.c) && jl40.l(this.d, m1p0Var.d) && jl40.l(this.e, m1p0Var.e) && jl40.l(this.f, m1p0Var.f) && jl40.l(this.g, m1p0Var.g) && jl40.l(this.h, m1p0Var.h) && jl40.l(this.i, m1p0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + smw0.b(smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        Integer num = this.g;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        l1p0 l1p0Var = this.h;
        int hashCode3 = (hashCode2 + (l1p0Var == null ? 0 : l1p0Var.hashCode())) * 31;
        CharSequence charSequence = this.i;
        return hashCode3 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "PassElement(passId=", this.a, ", passTitle=", ", passSubtitle=");
        vfc.A(t, this.c, ", priceTitle=", this.d, ", priceSubtitle=");
        t.append((Object) this.e);
        t.append(", confirmButton=");
        t.append(this.f);
        t.append(", packageDiscount=");
        t.append(this.g);
        t.append(", trialPeriod=");
        t.append(this.h);
        t.append(", description=");
        return xvz.n(t, this.i, Extension.C_BRAKE);
    }
}
