package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ky6 {
    public final CharSequence a;
    public final CharSequence b;
    public final kdc c;
    public final fr d;

    public ky6(CharSequence charSequence, CharSequence charSequence2, kdc kdcVar, fr frVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = kdcVar;
        this.d = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky6)) {
            return false;
        }
        ky6 ky6Var = (ky6) obj;
        return jl40.l(this.a, ky6Var.a) && jl40.l(this.b, ky6Var.b) && jl40.l(this.c, ky6Var.c) && jl40.l(this.d, ky6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        kdc kdcVar = this.c;
        int hashCode3 = (hashCode2 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        fr frVar = this.d;
        return hashCode3 + (frVar != null ? frVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Button(title=", ", subtitle=", ", backgroundColor=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public ky6() {
        this("", null, null, null);
    }
}
