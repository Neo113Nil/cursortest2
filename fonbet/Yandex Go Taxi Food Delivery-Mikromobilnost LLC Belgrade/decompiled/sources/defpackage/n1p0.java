package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n1p0 {
    public final CharSequence a;
    public final CharSequence b;
    public final m1p0 c;
    public final List d;

    public n1p0(CharSequence charSequence, CharSequence charSequence2, m1p0 m1p0Var, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = m1p0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1p0)) {
            return false;
        }
        n1p0 n1p0Var = (n1p0) obj;
        return jl40.l(this.a, n1p0Var.a) && jl40.l(this.b, n1p0Var.b) && this.c.equals(n1p0Var.c) && jl40.l(this.d, n1p0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "PassGroup(title=", ", subtitle=", ", selectedPass=");
        r.append(this.c);
        r.append(", passes=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
