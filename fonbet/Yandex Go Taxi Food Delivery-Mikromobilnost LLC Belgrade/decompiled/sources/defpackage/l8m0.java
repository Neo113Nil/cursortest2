package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l8m0 extends n8m0 {
    public final kao b;
    public final lur0 c;

    public l8m0(kao kaoVar, lur0 lur0Var) {
        super(lur0Var);
        this.b = kaoVar;
        this.c = lur0Var;
    }

    public final kao b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l8m0) {
            l8m0 l8m0Var = (l8m0) obj;
            if (this.b == l8m0Var.b && this.c.equals(l8m0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Error(errorState=" + this.b + ", shimmerTimeStatus=" + this.c + Extension.C_BRAKE;
    }
}
