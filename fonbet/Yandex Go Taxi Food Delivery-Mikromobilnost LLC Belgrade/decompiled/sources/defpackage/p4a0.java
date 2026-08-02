package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p4a0 {
    public final String a;
    public final kdc b;
    public final String c;

    public p4a0(kdc kdcVar, String str, String str2) {
        this.a = str;
        this.b = kdcVar;
        this.c = str2;
    }

    public final kdc a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4a0)) {
            return false;
        }
        p4a0 p4a0Var = (p4a0) obj;
        return this.a.equals(p4a0Var.a) && jl40.l(this.b, p4a0Var.b) && this.c.equals(p4a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return this.c.hashCode() + ((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodCustomSubtitle(subtitle=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", title=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
