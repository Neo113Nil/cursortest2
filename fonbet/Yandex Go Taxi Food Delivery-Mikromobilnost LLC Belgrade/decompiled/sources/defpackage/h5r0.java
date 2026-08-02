package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h5r0 extends mab1 {
    public final ev3 d;
    public final String e;
    public final String f;
    public final pln g;

    public h5r0(ev3 ev3Var, String str, String str2, pln plnVar) {
        this.d = ev3Var;
        this.e = str;
        this.f = str2;
        this.g = plnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5r0)) {
            return false;
        }
        h5r0 h5r0Var = (h5r0) obj;
        return this.d.equals(h5r0Var.d) && jl40.l(this.e, h5r0Var.e) && jl40.l(this.f, h5r0Var.f) && jl40.l(this.g, h5r0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        pln plnVar = this.g;
        return b + (plnVar == null ? 0 : plnVar.hashCode());
    }

    public final String toString() {
        return "AutoFund(buttonGroup=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ", limit=" + this.g + Extension.C_BRAKE;
    }
}
