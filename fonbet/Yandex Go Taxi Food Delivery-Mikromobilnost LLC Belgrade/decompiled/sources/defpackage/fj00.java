package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fj00 {
    public final yi00 a;
    public final cj00 b;

    public fj00(yi00 yi00Var, cj00 cj00Var) {
        this.a = yi00Var;
        this.b = cj00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj00)) {
            return false;
        }
        fj00 fj00Var = (fj00) obj;
        return this.a.equals(fj00Var.a) && this.b.equals(fj00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MapImageConfig(url=" + this.a + ", pinModel=" + this.b + Extension.C_BRAKE;
    }
}
