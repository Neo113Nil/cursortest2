package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d600 implements e600 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;
    public final boolean e;
    public final m1a0 f;

    public d600(boolean z, boolean z2, int i, String str, boolean z3, m1a0 m1a0Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = z3;
        this.f = m1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d600)) {
            return false;
        }
        d600 d600Var = (d600) obj;
        return this.a == d600Var.a && this.b == d600Var.b && this.c == d600Var.c && jl40.l(this.d, d600Var.d) && this.e == d600Var.e && jl40.l(this.f, d600Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.d;
        return this.f.hashCode() + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Visible(isEnabled=", ", isShowIcon=", ", itemTitleRes=", this.a, this.b);
        smw0.t(this.c, ", itemSubtitle=", this.d, ", errorSubtitleColor=", u);
        u.append(this.e);
        u.append(", paymentInfo=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
