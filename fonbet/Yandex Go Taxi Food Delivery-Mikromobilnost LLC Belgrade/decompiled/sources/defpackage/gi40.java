package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gi40 {
    public final ovi0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final Boolean d;
    public final CharSequence e;
    public final be40 f;

    public gi40(ovi0 ovi0Var, CharSequence charSequence, CharSequence charSequence2, Boolean bool, CharSequence charSequence3, be40 be40Var) {
        this.a = ovi0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = bool;
        this.e = charSequence3;
        this.f = be40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi40)) {
            return false;
        }
        gi40 gi40Var = (gi40) obj;
        return jl40.l(this.a, gi40Var.a) && jl40.l(this.b, gi40Var.b) && jl40.l(this.c, gi40Var.c) && jl40.l(this.d, gi40Var.d) && jl40.l(this.e, gi40Var.e) && jl40.l(this.f, gi40Var.f);
    }

    public final int hashCode() {
        ovi0 ovi0Var = this.a;
        int hashCode = (ovi0Var == null ? 0 : ovi0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CharSequence charSequence3 = this.e;
        int hashCode5 = (hashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        be40 be40Var = this.f;
        return hashCode5 + (be40Var != null ? be40Var.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainTransportState(transportImageTag=" + this.a + ", transportTitle=" + ((Object) this.b) + ", transportTimeInfo=" + ((Object) this.c) + ", isConditionButtonEnabled=" + this.d + ", conditionsButtonTitle=" + ((Object) this.e) + ", conditionData=" + this.f + Extension.C_BRAKE;
    }

    public gi40() {
        this(null, null, null, null, null, null);
    }
}
