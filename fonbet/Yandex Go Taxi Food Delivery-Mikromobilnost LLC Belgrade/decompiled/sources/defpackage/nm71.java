package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class nm71 {
    public static final hj71 Companion = new hj71();
    public final String a;
    public final String b;

    public nm71(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, eg71.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm71)) {
            return false;
        }
        nm71 nm71Var = (nm71) obj;
        return jl40.l(this.a, nm71Var.a) && jl40.l(this.b, nm71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PrefetchedMediationNetworkWinner(networkName=", this.a, ", networkAdUnit=", this.b, Extension.C_BRAKE);
    }
}
