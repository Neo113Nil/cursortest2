package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g5t0 implements j5t0 {
    public final in00 a;
    public final boolean b;

    public g5t0(in00 in00Var, boolean z) {
        this.a = in00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5t0)) {
            return false;
        }
        g5t0 g5t0Var = (g5t0) obj;
        return jl40.l(this.a, g5t0Var.a) && this.b == g5t0Var.b;
    }

    public final int hashCode() {
        in00 in00Var = this.a;
        return Boolean.hashCode(this.b) + ((in00Var == null ? 0 : in00Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectMapObject(selectedPin=" + this.a + ", shouldAddPinOnMap=" + this.b + Extension.C_BRAKE;
    }
}
