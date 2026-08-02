package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gce0 extends s1a1 {
    public final jce0 b;
    public final jce0 c;

    public gce0(jce0 jce0Var, jce0 jce0Var2) {
        this.b = jce0Var;
        this.c = jce0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gce0)) {
            return false;
        }
        gce0 gce0Var = (gce0) obj;
        return this.b.equals(gce0Var.b) && this.c.equals(gce0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Between(min=" + this.b + ", max=" + this.c + Extension.C_BRAKE;
    }
}
