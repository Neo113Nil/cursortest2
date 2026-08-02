package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gfe0 {
    public final boolean a;
    public final int b;
    public final efe0 c;

    public gfe0(boolean z, int i, efe0 efe0Var) {
        this.a = z;
        this.b = i;
        this.c = efe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfe0)) {
            return false;
        }
        gfe0 gfe0Var = (gfe0) obj;
        return this.a == gfe0Var.a && this.b == gfe0Var.b && jl40.l(this.c, gfe0Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        efe0 efe0Var = this.c;
        return b + (efe0Var == null ? 0 : efe0Var.hashCode());
    }

    public final String toString() {
        StringBuilder p = xvz.p("PostOrderDetailsForm(isForced=", this.b, ", forcedDisplayDelay=", ", layout=", this.a);
        p.append(this.c);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
