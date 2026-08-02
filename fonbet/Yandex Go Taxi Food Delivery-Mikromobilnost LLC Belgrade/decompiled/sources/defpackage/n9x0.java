package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n9x0 implements r9x0 {
    public final c0k0 a;
    public final r9x0 b;

    public n9x0(c0k0 c0k0Var, r9x0 r9x0Var) {
        this.a = c0k0Var;
        this.b = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9x0)) {
            return false;
        }
        n9x0 n9x0Var = (n9x0) obj;
        return this.a.equals(n9x0Var.a) && jl40.l(this.b, n9x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r9x0 r9x0Var = this.b;
        return hashCode + (r9x0Var == null ? 0 : r9x0Var.hashCode());
    }

    public final String toString() {
        return "SelectContactAction(resultPosition=" + this.a + ", actionOnSelected=" + this.b + Extension.C_BRAKE;
    }
}
