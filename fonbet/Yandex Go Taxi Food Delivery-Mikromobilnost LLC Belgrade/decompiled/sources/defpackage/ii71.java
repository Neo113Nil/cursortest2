package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ii71 {
    public static final jf71 Companion = new jf71();
    public final String a;
    public final String b;

    public ii71(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, dc71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii71)) {
            return false;
        }
        ii71 ii71Var = (ii71) obj;
        return jl40.l(this.a, ii71Var.a) && jl40.l(this.b, ii71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DebugPanelBiddingParameter(name=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
