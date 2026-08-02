package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dz9 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final Integer e;
    public final nvi0 f;
    public final gz9 g;

    public dz9(String str, CharSequence charSequence, CharSequence charSequence2, List list, Integer num, ovi0 ovi0Var, gz9 gz9Var) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = num;
        this.f = ovi0Var;
        this.g = gz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz9)) {
            return false;
        }
        dz9 dz9Var = (dz9) obj;
        return jl40.l(this.a, dz9Var.a) && jl40.l(this.b, dz9Var.b) && jl40.l(this.c, dz9Var.c) && jl40.l(this.d, dz9Var.d) && jl40.l(this.e, dz9Var.e) && jl40.l(this.f, dz9Var.f) && jl40.l(this.g, dz9Var.g);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int c = unr0.c((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        nvi0 nvi0Var = this.f;
        int hashCode2 = (hashCode + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31;
        gz9 gz9Var = this.g;
        return hashCode2 + (gz9Var != null ? gz9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ChargersFeedbackPromoPlate(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", attributes=");
        t.append(this.d);
        t.append(", animationRes=");
        t.append(this.e);
        t.append(", image=");
        t.append(this.f);
        t.append(", action=");
        t.append(this.g);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
