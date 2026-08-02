package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g921 {
    public final String a;
    public final String b;
    public final String c;

    public g921(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g921)) {
            return false;
        }
        g921 g921Var = (g921) obj;
        return this.a.equals(g921Var.a) && this.b.equals(g921Var.b) && this.c.equals(g921Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("UpgradeAccountModal(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
