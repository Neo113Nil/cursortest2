package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mau0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final String d;

    public mau0(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mau0)) {
            return false;
        }
        mau0 mau0Var = (mau0) obj;
        return jl40.l(this.a, mau0Var.a) && jl40.l(this.b, mau0Var.b) && jl40.l(this.c, mau0Var.c) && jl40.l(this.d, mau0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return g8e.r(vfc.r(this.a, this.b, "StepModel(title=", ", subtitle=", ", imageUrl="), this.c, ", iconTag=", this.d, Extension.C_BRAKE);
    }
}
