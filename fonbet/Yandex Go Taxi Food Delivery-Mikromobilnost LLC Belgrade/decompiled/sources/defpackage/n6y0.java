package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n6y0 implements p6y0 {
    public final String a;
    public final String b;
    public final kdc c;
    public final aw51 d;

    public n6y0(String str, String str2, kdc kdcVar, aw51 aw51Var) {
        this.a = str;
        this.b = str2;
        this.c = kdcVar;
        this.d = aw51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6y0)) {
            return false;
        }
        n6y0 n6y0Var = (n6y0) obj;
        return this.a.equals(n6y0Var.a) && this.b.equals(n6y0Var.b) && this.c.equals(n6y0Var.c) && jl40.l(this.d, n6y0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Header(title=", this.a, ", buttonText=", this.b, ", backgroundColor=");
        v.append(this.c);
        v.append(", depositMoneyIntent=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
