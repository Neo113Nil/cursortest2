package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jls {
    public final v4v a;
    public final CharSequence b;
    public final CharSequence c;
    public final sls d;
    public final v4v e;
    public final u08 f;
    public final ldc g;

    public jls(v4v v4vVar, CharSequence charSequence, CharSequence charSequence2, u08 u08Var, lvi0 lvi0Var, u08 u08Var2, ldc ldcVar) {
        this.a = v4vVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = u08Var;
        this.e = lvi0Var;
        this.f = u08Var2;
        this.g = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jls) {
            jls jlsVar = (jls) obj;
            if (jl40.l(this.a, jlsVar.a) && jl40.l(this.b, jlsVar.b) && jl40.l(this.c, jlsVar.c) && jl40.l(this.d, jlsVar.d) && jl40.l(this.e, jlsVar.e) && this.f == jlsVar.f && jl40.l(this.g, jlsVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        v4v v4vVar = this.a;
        int hashCode = (v4vVar == null ? 0 : v4vVar.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        sls slsVar = this.d;
        int hashCode4 = (hashCode3 + (slsVar == null ? 0 : slsVar.hashCode())) * 31;
        v4v v4vVar2 = this.e;
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + (v4vVar2 == null ? 0 : v4vVar2.hashCode())) * 31)) * 31;
        ldc ldcVar = this.g;
        return hashCode5 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        return "FullsizePopupState(leadIcon=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", onClick=" + this.d + ", closeIcon=" + this.e + ", onCloseClick=" + this.f + ", backgroundColor=" + this.g + Extension.C_BRAKE;
    }
}
