package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cal0 {
    public final int a;
    public final String b;
    public final String c;

    public cal0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cal0)) {
            return false;
        }
        cal0 cal0Var = (cal0) obj;
        return this.a == cal0Var.a && jl40.l(this.b, cal0Var.b) && jl40.l(this.c, cal0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.a, "StateData(estimatedTime=", ", routeTime=", this.b, ", price="), this.c, Extension.C_BRAKE);
    }
}
