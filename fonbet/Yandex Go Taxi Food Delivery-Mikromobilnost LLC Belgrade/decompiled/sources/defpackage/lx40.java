package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lx40 {
    public final wg6 a;
    public final int b;
    public final tx40 c;

    public lx40(wg6 wg6Var, int i, tx40 tx40Var) {
        this.a = wg6Var;
        this.b = i;
        this.c = tx40Var;
    }

    public final void a(float f) {
        tx40 tx40Var = this.c;
        if (Math.abs(f - tx40Var.getFloatValue()) < 0.001f) {
            return;
        }
        tx40Var.setFloatValue(f);
        this.a.d(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lx40) {
            lx40 lx40Var = (lx40) obj;
            if (this.a == lx40Var.a && this.b == lx40Var.b && jl40.l(this.c, lx40Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MutableAnchor(sheetState=" + this.a + ", target=" + dtr0.a(this.b) + ", heightState=" + this.c + Extension.C_BRAKE;
    }
}
