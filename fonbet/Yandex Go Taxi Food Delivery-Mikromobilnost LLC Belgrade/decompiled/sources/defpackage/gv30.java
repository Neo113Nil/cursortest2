package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gv30 {
    public final String a;
    public final String b;

    public gv30(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv30)) {
            return false;
        }
        gv30 gv30Var = (gv30) obj;
        return this.a.equals(gv30Var.a) && this.b.equals(gv30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MtRouteEstimation(departureTime=", this.a, ", arrivalTime=", this.b, Extension.C_BRAKE);
    }
}
