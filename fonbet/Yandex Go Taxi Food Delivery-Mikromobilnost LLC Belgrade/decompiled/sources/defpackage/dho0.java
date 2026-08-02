package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dho0 implements eho0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public dho0(CharSequence charSequence, CharSequence charSequence2, String str, Integer num, Integer num2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dho0)) {
            return false;
        }
        dho0 dho0Var = (dho0) obj;
        return jl40.l(this.a, dho0Var.a) && jl40.l(this.b, dho0Var.b) && jl40.l(this.c, dho0Var.c) && jl40.l(this.d, dho0Var.d) && jl40.l(this.e, dho0Var.e);
    }

    @Override // defpackage.eho0
    public final CharSequence getSubtitle() {
        return this.b;
    }

    @Override // defpackage.eho0
    public final CharSequence getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "InProgress(title=", ", subtitle=", ", iconTag=");
        vfc.w(this.d, this.c, ", totalProgress=", ", currentProgress=", r);
        return oo31.j(r, this.e, Extension.C_BRAKE);
    }
}
