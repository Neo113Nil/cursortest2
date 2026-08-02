package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ce40 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;

    public ce40(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce40)) {
            return false;
        }
        ce40 ce40Var = (ce40) obj;
        return jl40.l(this.a, ce40Var.a) && jl40.l(this.b, ce40Var.b) && jl40.l(this.c, ce40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return xvz.n(ly3.t(this.b, "MtTrainConditionInfoDialogItem(iconTag=", this.a, ", title=", ", subtitle="), this.c, Extension.C_BRAKE);
    }

    public ce40() {
        this(null, null, "");
    }
}
