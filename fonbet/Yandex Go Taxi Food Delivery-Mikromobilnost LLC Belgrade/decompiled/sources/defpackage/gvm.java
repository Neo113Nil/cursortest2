package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gvm {
    public final String a;
    public final String b;
    public final r9x0 c;

    public gvm(String str, String str2, r9x0 r9x0Var) {
        this.a = str;
        this.b = str2;
        this.c = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvm)) {
            return false;
        }
        gvm gvmVar = (gvm) obj;
        return jl40.l(this.a, gvmVar.a) && jl40.l(this.b, gvmVar.b) && jl40.l(this.c, gvmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r9x0 r9x0Var = this.c;
        return hashCode2 + (r9x0Var != null ? r9x0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DueButtonProperties(title=", this.a, ", subtitle=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
