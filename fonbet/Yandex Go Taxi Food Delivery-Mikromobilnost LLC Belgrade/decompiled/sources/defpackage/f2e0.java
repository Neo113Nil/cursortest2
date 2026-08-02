package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f2e0 {
    public final String a;
    public final pb30 b;

    public f2e0(String str, pb30 pb30Var) {
        this.a = str;
        this.b = pb30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2e0) {
            f2e0 f2e0Var = (f2e0) obj;
            return jl40.l(this.a, f2e0Var.a) && this.b == f2e0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PollingModel(id=" + this.a + ", placemarkModel=" + this.b + Extension.C_BRAKE;
    }
}
