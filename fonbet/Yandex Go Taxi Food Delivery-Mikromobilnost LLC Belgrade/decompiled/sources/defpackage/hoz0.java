package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hoz0 {
    public final String a;
    public final String b;
    public final String c;

    public hoz0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoz0)) {
            return false;
        }
        hoz0 hoz0Var = (hoz0) obj;
        return jl40.l(this.a, hoz0Var.a) && jl40.l(this.b, hoz0Var.b) && jl40.l(this.c, hoz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("TokenizeResult(pmd=", this.a, ", psd=", this.b, ", requestId="), this.c, Extension.C_BRAKE);
    }
}
