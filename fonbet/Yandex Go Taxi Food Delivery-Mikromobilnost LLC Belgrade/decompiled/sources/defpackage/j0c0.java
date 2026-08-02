package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class j0c0 extends rm91 {
    public final String b;
    public final boolean c;
    public final k0c0 d;

    public j0c0(String str, boolean z, k0c0 k0c0Var) {
        this.b = str;
        this.c = z;
        this.d = k0c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0c0)) {
            return false;
        }
        j0c0 j0c0Var = (j0c0) obj;
        return jl40.l(this.b, j0c0Var.b) && this.c == j0c0Var.c && this.d.equals(j0c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Loadable(imageTag=", this.b, ", rotatable=", ", anchor=", this.c);
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
