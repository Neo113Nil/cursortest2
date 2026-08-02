package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dh30 implements wh30 {
    public final h711 a;
    public final ib11 b;

    public dh30(h711 h711Var, ib11 ib11Var) {
        this.a = h711Var;
        this.b = ib11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh30)) {
            return false;
        }
        dh30 dh30Var = (dh30) obj;
        return jl40.l(this.a, dh30Var.a) && jl40.l(this.b, dh30Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ib11 ib11Var = this.b;
        return hashCode + (ib11Var == null ? 0 : ib11Var.hashCode());
    }

    public final String toString() {
        return "BubbleClicked(item=" + this.a + ", variant=" + this.b + Extension.C_BRAKE;
    }
}
