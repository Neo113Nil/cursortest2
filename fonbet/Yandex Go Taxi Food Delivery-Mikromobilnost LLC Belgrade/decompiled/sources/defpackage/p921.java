package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p921 implements q921 {
    public final e921 a;
    public final g921 b;

    public p921(e921 e921Var, g921 g921Var) {
        this.a = e921Var;
        this.b = g921Var;
    }

    public final e921 a() {
        return this.a;
    }

    public final g921 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p921)) {
            return false;
        }
        p921 p921Var = (p921) obj;
        return jl40.l(this.a, p921Var.a) && jl40.l(this.b, p921Var.b);
    }

    public final int hashCode() {
        e921 e921Var = this.a;
        int hashCode = (e921Var == null ? 0 : e921Var.hashCode()) * 31;
        g921 g921Var = this.b;
        return hashCode + (g921Var != null ? g921Var.hashCode() : 0);
    }

    public final String toString() {
        return "Required(menuItem=" + this.a + ", modalView=" + this.b + Extension.C_BRAKE;
    }
}
