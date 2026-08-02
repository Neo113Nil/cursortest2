package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ja11 implements la11 {
    public final String a;
    public final fao b;

    public ja11(String str, fao faoVar) {
        this.a = str;
        this.b = faoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja11)) {
            return false;
        }
        ja11 ja11Var = (ja11) obj;
        return jl40.l(this.a, ja11Var.a) && jl40.l(this.b, ja11Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(offerId=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }
}
