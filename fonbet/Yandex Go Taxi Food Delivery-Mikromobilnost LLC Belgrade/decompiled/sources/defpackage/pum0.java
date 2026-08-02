package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class pum0 {
    public final boolean a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;

    public pum0(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7) {
        this.a = z;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = charSequence4;
        this.f = str;
        this.g = charSequence5;
        this.h = charSequence6;
        this.i = charSequence7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pum0)) {
            return false;
        }
        pum0 pum0Var = (pum0) obj;
        return this.a == pum0Var.a && jl40.l(this.b, pum0Var.b) && jl40.l(this.c, pum0Var.c) && jl40.l(this.d, pum0Var.d) && jl40.l(this.e, pum0Var.e) && jl40.l(this.f, pum0Var.f) && jl40.l(this.g, pum0Var.g) && jl40.l(this.h, pum0Var.h) && jl40.l(this.i, pum0Var.i);
    }

    public final int hashCode() {
        int b = smw0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int b2 = smw0.b((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        CharSequence charSequence2 = this.e;
        int hashCode = (b2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence3 = this.g;
        return this.i.hashCode() + smw0.b((hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersActivePassesV3WinbackUiState(inProgress=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        vfc.A(sb, this.c, ", priceTitle=", this.d, ", priceSubtitle=");
        sb.append((Object) this.e);
        sb.append(", imageTag=");
        sb.append(this.f);
        sb.append(", description=");
        vfc.A(sb, this.g, ", rejectButtonText=", this.h, ", confirmButtonText=");
        return xvz.n(sb, this.i, Extension.C_BRAKE);
    }
}
