package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cho0 implements eho0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final bho0 e;

    public cho0(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, bho0 bho0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = charSequence3;
        this.e = bho0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cho0)) {
            return false;
        }
        cho0 cho0Var = (cho0) obj;
        return this.a.equals(cho0Var.a) && jl40.l(this.b, cho0Var.b) && jl40.l(this.c, cho0Var.c) && jl40.l(this.d, cho0Var.d) && jl40.l(this.e, cho0Var.e);
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
        CharSequence charSequence2 = this.d;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        bho0 bho0Var = this.e;
        return hashCode4 + (bho0Var != null ? bho0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Completed(title=", ", subtitle=", ", iconTag=");
        r.append(this.c);
        r.append(", badgeTitle=");
        r.append((Object) this.d);
        r.append(", rideFinishModal=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
