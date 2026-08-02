package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pxs0 {
    public final ety0 a;
    public final ety0 b;
    public final ety0 c;

    public pxs0(ety0 ety0Var, ety0 ety0Var2, ety0 ety0Var3) {
        this.a = ety0Var;
        this.b = ety0Var2;
        this.c = ety0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxs0)) {
            return false;
        }
        pxs0 pxs0Var = (pxs0) obj;
        return this.a.equals(pxs0Var.a) && this.b.equals(pxs0Var.b) && this.c.equals(pxs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tse0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SmallTypography(regular=" + this.a + ", medium=" + this.b + ", bold=" + this.c + Extension.C_BRAKE;
    }
}
