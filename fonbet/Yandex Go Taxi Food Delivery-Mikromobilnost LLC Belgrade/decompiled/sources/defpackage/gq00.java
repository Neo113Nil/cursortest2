package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gq00 implements iq00 {
    public final in00 a;
    public final boolean b;

    public gq00(in00 in00Var, boolean z) {
        this.a = in00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq00)) {
            return false;
        }
        gq00 gq00Var = (gq00) obj;
        return jl40.l(this.a, gq00Var.a) && this.b == gq00Var.b;
    }

    public final int hashCode() {
        in00 in00Var = this.a;
        return Boolean.hashCode(this.b) + ((in00Var == null ? 0 : in00Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectMapObject(selectedPin=" + this.a + ", shouldAddPinOnMap=" + this.b + Extension.C_BRAKE;
    }
}
