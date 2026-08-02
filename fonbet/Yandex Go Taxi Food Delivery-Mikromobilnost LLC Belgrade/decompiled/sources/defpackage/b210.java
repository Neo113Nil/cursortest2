package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b210 {
    public final String a;
    public final String b;
    public final boolean c;
    public final c210 d;

    public b210(String str, String str2, boolean z, c210 c210Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = c210Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b210)) {
            return false;
        }
        b210 b210Var = (b210) obj;
        return this.a.equals(b210Var.a) && jl40.l(this.b, b210Var.b) && this.c == b210Var.c && jl40.l(this.d, b210Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        c210 c210Var = this.d;
        return e + (c210Var != null ? c210Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Header(title=", this.a, ", description=", this.b, ", showDivider=");
        v.append(this.c);
        v.append(", qrButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
