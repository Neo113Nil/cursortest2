package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class aks0 extends see {
    public final String a;
    public final zjs0 b;

    public aks0(String str, zjs0 zjs0Var) {
        this.a = str;
        this.b = zjs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aks0.class != obj.getClass()) {
            return false;
        }
        aks0 aks0Var = (aks0) obj;
        return jl40.l(this.a, aks0Var.a) && jl40.l(this.b, aks0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zjs0 zjs0Var = this.b;
        return hashCode + (zjs0Var != null ? zjs0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SkeletonContent(skeleton=" + this.a + ", animations=" + this.b + Extension.C_BRAKE;
    }
}
