package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jlq0 {
    public final v4v a;
    public final boolean b;
    public final boolean c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final bfq0 h;

    public jlq0(v4v v4vVar, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, bfq0 bfq0Var) {
        this.a = v4vVar;
        this.b = z;
        this.c = z2;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = bfq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlq0)) {
            return false;
        }
        jlq0 jlq0Var = (jlq0) obj;
        return jl40.l(this.a, jlq0Var.a) && this.b == jlq0Var.b && this.c == jlq0Var.c && jl40.l(this.d, jlq0Var.d) && jl40.l(this.e, jlq0Var.e) && jl40.l(this.f, jlq0Var.f) && jl40.l(this.g, jlq0Var.g) && this.h.equals(jlq0Var.h);
    }

    public final int hashCode() {
        int b = smw0.b(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        CharSequence charSequence = this.e;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.g;
        return this.h.hashCode() + ((hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectorItemModel(icon=");
        sb.append(this.a);
        sb.append(", selected=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", subtitle=");
        vfc.A(sb, this.e, ", bottomTitle=", this.f, ", bottomSubtitle=");
        sb.append((Object) this.g);
        sb.append(", widgetAction=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
