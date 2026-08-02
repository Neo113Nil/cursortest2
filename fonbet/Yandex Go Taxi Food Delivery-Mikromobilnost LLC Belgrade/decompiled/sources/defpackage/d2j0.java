package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d2j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public d2j0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2j0)) {
            return false;
        }
        d2j0 d2j0Var = (d2j0) obj;
        return jl40.l(this.a, d2j0Var.a) && jl40.l(this.b, d2j0Var.b) && jl40.l(this.c, d2j0Var.c) && jl40.l(this.d, d2j0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("ReportFile(id=", this.a, ", name=", this.b, ", type="), this.c, ", downloadLink=", this.d, Extension.C_BRAKE);
    }
}
