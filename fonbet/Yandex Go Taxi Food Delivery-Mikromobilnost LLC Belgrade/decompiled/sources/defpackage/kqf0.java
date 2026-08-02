package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kqf0 extends t4z0 {
    public final String a;
    public final ldc b;
    public final it1 c;
    public final Boolean d;

    public kqf0(String str, ldc ldcVar, so5 so5Var, Boolean bool) {
        this.a = str;
        this.b = ldcVar;
        this.c = so5Var;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqf0)) {
            return false;
        }
        kqf0 kqf0Var = (kqf0) obj;
        return jl40.l(this.a, kqf0Var.a) && jl40.l(this.b, kqf0Var.b) && jl40.l(this.c, kqf0Var.c) && jl40.l(this.d, kqf0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        it1 it1Var = this.c;
        int hashCode3 = (hashCode2 + (it1Var == null ? 0 : it1Var.hashCode())) * 31;
        Boolean bool = this.d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PromoTileFooterState(text=" + this.a + ", textColor=" + this.b + ", horizontalAlignment=" + this.c + ", locked=" + this.d + Extension.C_BRAKE;
    }
}
