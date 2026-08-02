package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class oc7 {
    public final iz50 a;
    public final oz50 b;

    public oc7(iz50 iz50Var) {
        this.a = iz50Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc7)) {
            return false;
        }
        oc7 oc7Var = (oc7) obj;
        return jl40.l(this.a, oc7Var.a) && jl40.l(this.b, oc7Var.b);
    }

    public final int hashCode() {
        iz50 iz50Var = this.a;
        int hashCode = (iz50Var != null ? iz50Var.hashCode() : 0) * 31;
        oz50 oz50Var = this.b;
        return hashCode + (oz50Var != null ? oz50Var.hashCode() : 0);
    }

    public final String toString() {
        return "ReadResult(request=" + this.a + ", response=" + this.b + Extension.C_BRAKE;
    }

    public oc7(oz50 oz50Var) {
        this.a = null;
        this.b = oz50Var;
    }
}
