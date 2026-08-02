package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fm80 {
    public final ky6 a;
    public final CharSequence b;
    public final CharSequence c;
    public final k7v d;

    public fm80(ky6 ky6Var, CharSequence charSequence, CharSequence charSequence2, k7v k7vVar) {
        this.a = ky6Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = k7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm80)) {
            return false;
        }
        fm80 fm80Var = (fm80) obj;
        return jl40.l(this.a, fm80Var.a) && jl40.l(this.b, fm80Var.b) && jl40.l(this.c, fm80Var.c) && jl40.l(this.d, fm80Var.d);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        k7v k7vVar = this.d;
        return hashCode + (k7vVar != null ? k7vVar.hashCode() : 0);
    }

    public final String toString() {
        return "OrganizationsEmptyScreenConfig(button=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", image=" + this.d + Extension.C_BRAKE;
    }
}
