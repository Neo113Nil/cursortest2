package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class efu0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;

    public efu0(CharSequence charSequence, CharSequence charSequence2, String str, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efu0)) {
            return false;
        }
        efu0 efu0Var = (efu0) obj;
        return jl40.l(this.a, efu0Var.a) && jl40.l(this.b, efu0Var.b) && jl40.l(this.c, efu0Var.c) && this.d == efu0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Stop(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", isEnabled=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
