package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class akl0 {
    public final fkl0 a;
    public final int b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public akl0(fkl0 fkl0Var, int i, List list, String str, String str2, String str3, String str4) {
        this.a = fkl0Var;
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akl0)) {
            return false;
        }
        akl0 akl0Var = (akl0) obj;
        return this.a.equals(akl0Var.a) && this.b == akl0Var.b && jl40.l(this.c, akl0Var.c) && this.d.equals(akl0Var.d) && this.e.equals(akl0Var.e) && this.f.equals(akl0Var.f) && this.g.equals(akl0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.c(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleModel(ruleType=");
        sb.append(this.a);
        sb.append(", maxAttempts=");
        sb.append(this.b);
        sb.append(", partsToParse=");
        oyr.D(", title=", this.d, ", description=", sb, this.c);
        g8e.D(sb, this.e, ", positiveButtonTitle=", this.f, ", negativeButtonTitle=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
