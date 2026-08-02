package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class au30 {
    public final String a;
    public final nt30 b;

    public au30(String str, nt30 nt30Var) {
        this.a = str;
        this.b = nt30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au30)) {
            return false;
        }
        au30 au30Var = (au30) obj;
        return jl40.l(this.a, au30Var.a) && jl40.l(this.b, au30Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        nt30 nt30Var = this.b;
        return hashCode + (nt30Var != null ? nt30Var.hashCode() : 0);
    }

    public final String toString() {
        return "PayButtonState(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
