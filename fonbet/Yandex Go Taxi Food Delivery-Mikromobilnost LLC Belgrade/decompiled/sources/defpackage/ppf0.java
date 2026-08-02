package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ppf0 {
    public final String a;
    public final String b;
    public final opf0 c;

    public ppf0(String str, String str2, opf0 opf0Var) {
        this.a = str;
        this.b = str2;
        this.c = opf0Var;
    }

    public static ppf0 a(ppf0 ppf0Var, String str, String str2, opf0 opf0Var, int i) {
        if ((i & 1) != 0) {
            str = ppf0Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ppf0Var.b;
        }
        if ((i & 4) != 0) {
            opf0Var = ppf0Var.c;
        }
        ppf0Var.getClass();
        return new ppf0(str, str2, opf0Var);
    }

    public final opf0 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppf0)) {
            return false;
        }
        ppf0 ppf0Var = (ppf0) obj;
        return jl40.l(this.a, ppf0Var.a) && jl40.l(this.b, ppf0Var.b) && jl40.l(this.c, ppf0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        opf0 opf0Var = this.c;
        return hashCode2 + (opf0Var != null ? opf0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoPlaqueOverride(title=", this.a, ", text=", this.b, ", counter=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ppf0() {
        this(null, null, null);
    }
}
