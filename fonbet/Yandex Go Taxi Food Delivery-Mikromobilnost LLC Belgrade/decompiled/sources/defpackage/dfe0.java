package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dfe0 {
    public final String a;
    public final int b;

    public dfe0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfe0)) {
            return false;
        }
        dfe0 dfe0Var = (dfe0) obj;
        return jl40.l(this.a, dfe0Var.a) && this.b == dfe0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "VerticalBarData(color=", this.a, ", width=", Extension.C_BRAKE);
    }
}
