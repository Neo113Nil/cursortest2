package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k3l0 {
    public final String a;
    public final nol0 b;

    public k3l0(String str, nol0 nol0Var) {
        this.a = str;
        this.b = nol0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k3l0) {
            k3l0 k3l0Var = (k3l0) obj;
            return jl40.l(this.a, k3l0Var.a) && this.b == k3l0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(geometryId=" + this.a + ", route=" + this.b + Extension.C_BRAKE;
    }
}
