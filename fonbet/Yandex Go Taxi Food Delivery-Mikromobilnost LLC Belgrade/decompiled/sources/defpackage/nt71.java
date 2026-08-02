package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.jk3;
import yads.ly;

/* loaded from: classes7.dex */
public final class nt71 implements vz71 {
    public final jk3 a;
    public final ly b;

    public nt71(jk3 jk3Var, ly lyVar) {
        this.a = jk3Var;
        this.b = lyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt71)) {
            return false;
        }
        nt71 nt71Var = (nt71) obj;
        return jl40.l(this.a, nt71Var.a) && this.b == nt71Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", configurationSource=" + this.b + Extension.C_BRAKE;
    }
}
