package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class btj0 {
    public final atj0 a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final Integer g;

    public btj0(atj0 atj0Var, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Integer num) {
        this.a = atj0Var;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = charSequence4;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btj0)) {
            return false;
        }
        btj0 btj0Var = (btj0) obj;
        return jl40.l(this.a, btj0Var.a) && jl40.l(this.b, btj0Var.b) && jl40.l(this.c, btj0Var.c) && jl40.l(this.d, btj0Var.d) && jl40.l(this.e, btj0Var.e) && jl40.l(this.f, btj0Var.f) && jl40.l(this.g, btj0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.e;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.f;
        int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        Integer num = this.g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolvedRouteWithUri(resolvedRoute=");
        sb.append(this.a);
        sb.append(", routeUri=");
        sb.append(this.b);
        sb.append(", subtitle=");
        vfc.A(sb, this.c, ", centerText=", this.d, ", endText=");
        vfc.A(sb, this.e, ", textBody=", this.f, ", routeDurationMin=");
        return oo31.j(sb, this.g, Extension.C_BRAKE);
    }
}
