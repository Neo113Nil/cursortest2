package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class daa implements jaa {
    public final uj9 a;
    public final n9a b;

    public daa(uj9 uj9Var, n9a n9aVar) {
        this.a = uj9Var;
        this.b = n9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daa)) {
            return false;
        }
        daa daaVar = (daa) obj;
        return jl40.l(this.a, daaVar.a) && jl40.l(this.b, daaVar.b);
    }

    public final int hashCode() {
        uj9 uj9Var = this.a;
        int hashCode = (uj9Var == null ? 0 : uj9Var.hashCode()) * 31;
        n9a n9aVar = this.b;
        return hashCode + (n9aVar != null ? n9aVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnPromoPlateClick(action=" + this.a + ", toggle=" + this.b + Extension.C_BRAKE;
    }
}
