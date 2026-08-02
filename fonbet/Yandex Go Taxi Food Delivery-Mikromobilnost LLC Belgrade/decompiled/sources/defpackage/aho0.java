package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class aho0 implements eho0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;

    public aho0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aho0)) {
            return false;
        }
        aho0 aho0Var = (aho0) obj;
        return jl40.l(this.a, aho0Var.a) && jl40.l(this.b, aho0Var.b) && jl40.l(this.c, aho0Var.c) && jl40.l(this.d, aho0Var.d);
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
        return hashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Available(title=", ", subtitle=", ", iconTag=");
        r.append(this.c);
        r.append(", badgeTitle=");
        r.append((Object) this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
