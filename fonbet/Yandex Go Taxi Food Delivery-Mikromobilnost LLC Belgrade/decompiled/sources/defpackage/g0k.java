package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g0k {
    public static final g0k c = new g0k(new d0k(0), te20.e);
    public final d0k a;
    public final te20 b;

    public g0k(d0k d0kVar, te20 te20Var) {
        this.a = d0kVar;
        this.b = te20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0k)) {
            return false;
        }
        g0k g0kVar = (g0k) obj;
        return jl40.l(this.a, g0kVar.a) && this.b.equals(g0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplaySettings(paddingsSettings=" + this.a + ", backgroundSettings=" + this.b + Extension.C_BRAKE;
    }
}
