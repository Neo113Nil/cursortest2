package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o4y0 extends r4y0 {
    public final String a;
    public final kdc b;
    public final int c;
    public final n4y0 d;

    public o4y0() {
        this("", null, 3, new s2u0(8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4y0)) {
            return false;
        }
        o4y0 o4y0Var = (o4y0) obj;
        return jl40.l(this.a, o4y0Var.a) && jl40.l(this.b, o4y0Var.b) && this.c == o4y0Var.c && jl40.l(this.d, o4y0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return this.d.hashCode() + oyr.b(this.c, (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ArrowButton(text=" + this.a + ", textColor=" + this.b + ", typeFace=" + this.c + ", onButtonClick=" + this.d + Extension.C_BRAKE;
    }

    public o4y0(String str, bdc bdcVar, int i, n4y0 n4y0Var) {
        this.a = str;
        this.b = bdcVar;
        this.c = i;
        this.d = n4y0Var;
    }
}
