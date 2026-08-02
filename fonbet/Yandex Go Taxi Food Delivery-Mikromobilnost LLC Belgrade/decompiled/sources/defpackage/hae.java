package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hae extends lae {
    public final String a;
    public final dqb1 b;

    public hae(String str, dqb1 dqb1Var) {
        this.a = str;
        this.b = dqb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae)) {
            return false;
        }
        hae haeVar = (hae) obj;
        return jl40.l(this.a, haeVar.a) && this.b.equals(haeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(query=" + this.a + ", contacts=" + this.b + Extension.C_BRAKE;
    }
}
