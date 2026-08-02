package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eal {
    public final ye0 a;
    public final boolean b;
    public final cal c;

    public eal(ye0 ye0Var, boolean z, cal calVar, int i) {
        int i2 = 0;
        z = (i & 2) != 0 ? false : z;
        calVar = (i & 4) != 0 ? new aal(i2) : calVar;
        this.a = ye0Var;
        this.b = z;
        this.c = calVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eal)) {
            return false;
        }
        eal ealVar = (eal) obj;
        return jl40.l(this.a, ealVar.a) && this.b == ealVar.b && this.c.equals(ealVar.c);
    }

    public final int hashCode() {
        ye0 ye0Var = this.a;
        return this.c.hashCode() + unr0.e((ye0Var == null ? 0 : ye0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "DivSkeletonsViewState(skeletonId=" + this.a + ", applyToolbarMargin=" + this.b + ", fallback=" + this.c + Extension.C_BRAKE;
    }
}
