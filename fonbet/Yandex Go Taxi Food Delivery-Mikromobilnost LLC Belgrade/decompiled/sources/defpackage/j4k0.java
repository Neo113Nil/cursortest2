package defpackage;

/* loaded from: classes2.dex */
public final class j4k0 {
    public final String a;
    public final String b;
    public final String c;
    public final e4k0 d;
    public final f4k0 e;
    public final g4k0 f;
    public final h4k0 g;
    public final i4k0 h;

    public j4k0(String str, String str2, String str3, e4k0 e4k0Var, f4k0 f4k0Var, g4k0 g4k0Var, h4k0 h4k0Var, i4k0 i4k0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e4k0Var;
        this.e = f4k0Var;
        this.f = g4k0Var;
        this.g = h4k0Var;
        this.h = i4k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4k0)) {
            return false;
        }
        j4k0 j4k0Var = (j4k0) obj;
        return jl40.l(this.a, j4k0Var.a) && this.b.equals(j4k0Var.b) && this.c.equals(j4k0Var.c) && jl40.l(this.d, j4k0Var.d) && jl40.l(this.e, j4k0Var.e) && jl40.l(this.f, j4k0Var.f) && jl40.l(this.g, j4k0Var.g) && jl40.l(this.h, j4k0Var.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        e4k0 e4k0Var = this.d;
        int hashCode = (b + (e4k0Var == null ? 0 : e4k0Var.hashCode())) * 31;
        f4k0 f4k0Var = this.e;
        int hashCode2 = (hashCode + (f4k0Var == null ? 0 : f4k0Var.a.hashCode())) * 31;
        g4k0 g4k0Var = this.f;
        int hashCode3 = (hashCode2 + (g4k0Var == null ? 0 : g4k0Var.a.hashCode())) * 31;
        h4k0 h4k0Var = this.g;
        int hashCode4 = (hashCode3 + (h4k0Var == null ? 0 : h4k0Var.hashCode())) * 31;
        i4k0 i4k0Var = this.h;
        return hashCode4 + (i4k0Var != null ? i4k0Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextItem(__typename=" + this.a + ", altText=" + this.b + ", key=" + this.c + ", onCheckoutTitleColorItem=" + this.d + ", onCheckoutTitleHighlightItem=" + this.e + ", onCheckoutTitleIconItem=" + this.f + ", onCheckoutTitleLinkItem=" + this.g + ", onCheckoutTitleStrikeItem=" + this.h + ')';
    }
}
