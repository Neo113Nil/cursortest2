package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nnz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nnz0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnz0)) {
            return false;
        }
        nnz0 nnz0Var = (nnz0) obj;
        return jl40.l(this.a, nnz0Var.a) && jl40.l(this.b, nnz0Var.b) && jl40.l(this.c, nnz0Var.c) && jl40.l(this.d, nnz0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 961, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(b64.v("TokenizeCardData(expirationMonth=", this.a, ", expirationYear=", this.b, ", holderName=null, pan="), this.c, ", secretCode=", this.d, Extension.C_BRAKE);
    }
}
