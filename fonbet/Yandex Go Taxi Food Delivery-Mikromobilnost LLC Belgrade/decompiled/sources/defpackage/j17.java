package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j17 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public j17(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j17)) {
            return false;
        }
        j17 j17Var = (j17) obj;
        return jl40.l(this.a, j17Var.a) && this.b == j17Var.b && this.c == j17Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("ButtonModel(title=", this.a, ", isShimmering=", ", isEnabled=", this.b), this.c, Extension.C_BRAKE);
    }
}
