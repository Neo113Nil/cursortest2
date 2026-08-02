package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jv30 implements pv30 {
    public final q47 a;
    public final String b;

    public jv30(q47 q47Var, String str) {
        this.a = q47Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv30)) {
            return false;
        }
        jv30 jv30Var = (jv30) obj;
        return jl40.l(this.a, jv30Var.a) && jl40.l(this.b, jv30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardShown(routeInfoButtons=" + this.a + ", routeId=" + this.b + Extension.C_BRAKE;
    }
}
