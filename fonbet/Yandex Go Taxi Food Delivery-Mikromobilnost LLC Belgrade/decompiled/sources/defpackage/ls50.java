package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ls50 extends ps50 {
    public final int a;
    public final String b;

    public ls50(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ps50
    public final String a() {
        return oyr.k(this.a, "HTTP error code: ", Extension.FIX_SPACE, g8e.o("backend error code: ", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls50)) {
            return false;
        }
        ls50 ls50Var = (ls50) obj;
        return this.a == ls50Var.a && jl40.l(this.b, ls50Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "Http(httpCode=", ", body=", this.b, Extension.C_BRAKE);
    }
}
