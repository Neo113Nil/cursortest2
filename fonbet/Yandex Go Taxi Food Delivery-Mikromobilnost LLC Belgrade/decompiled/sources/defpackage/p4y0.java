package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p4y0 extends r4y0 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final int d;
    public final n4y0 e;

    public /* synthetic */ p4y0(String str, kdc kdcVar, kdc kdcVar2, n4y0 n4y0Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : kdcVar, (i & 4) != 0 ? null : kdcVar2, 3, (i & 16) != 0 ? new s2u0(8) : n4y0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4y0)) {
            return false;
        }
        p4y0 p4y0Var = (p4y0) obj;
        return jl40.l(this.a, p4y0Var.a) && jl40.l(this.b, p4y0Var.b) && jl40.l(this.c, p4y0Var.c) && this.d == p4y0Var.d && jl40.l(this.e, p4y0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        kdc kdcVar2 = this.c;
        return this.e.hashCode() + oyr.b(this.d, (hashCode2 + (kdcVar2 != null ? kdcVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + ", typeFace=" + this.d + ", onButtonClick=" + this.e + Extension.C_BRAKE;
    }

    public p4y0(String str, kdc kdcVar, kdc kdcVar2, int i, n4y0 n4y0Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = i;
        this.e = n4y0Var;
    }

    public p4y0() {
        this((String) null, (kdc) null, (kdc) null, (n4y0) null, 31);
    }
}
