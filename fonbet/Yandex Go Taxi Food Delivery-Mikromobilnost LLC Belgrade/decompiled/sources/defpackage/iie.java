package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iie {
    public final String a;
    public final String b;
    public final nvi0 c;

    public iie(String str, String str2, ovi0 ovi0Var) {
        this.a = str;
        this.b = str2;
        this.c = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iie)) {
            return false;
        }
        iie iieVar = (iie) obj;
        return this.a.equals(iieVar.a) && this.b.equals(iieVar.b) && jl40.l(this.c, iieVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        nvi0 nvi0Var = this.c;
        return b + (nvi0Var == null ? 0 : nvi0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ContentUiState(title=", this.a, ", subtitle=", this.b, ", image=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
