package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cum0 {
    public final CharSequence a;
    public final CharSequence b;
    public final bum0 c;

    public cum0(CharSequence charSequence, CharSequence charSequence2, bum0 bum0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bum0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cum0)) {
            return false;
        }
        cum0 cum0Var = (cum0) obj;
        return jl40.l(this.a, cum0Var.a) && jl40.l(this.b, cum0Var.b) && jl40.l(this.c, cum0Var.c);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        bum0 bum0Var = this.c;
        return b + (bum0Var == null ? 0 : bum0Var.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TitleGroup(primaryText=", ", secondaryText=", ", badge=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
