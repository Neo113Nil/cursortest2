package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cwj0 {
    public final String a;
    public final j57 b;

    public cwj0(String str, j57 j57Var) {
        this.a = str;
        this.b = j57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwj0)) {
            return false;
        }
        cwj0 cwj0Var = (cwj0) obj;
        return jl40.l(this.a, cwj0Var.a) && jl40.l(this.b, cwj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j57 j57Var = this.b;
        return hashCode + (j57Var == null ? 0 : j57Var.hashCode());
    }

    public final String toString() {
        return "ResponseEntity(url=" + this.a + ", buttonEntity=" + this.b + Extension.C_BRAKE;
    }
}
