package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ho01 {
    public final boolean a;
    public final do01 b;
    public final fo01 c;
    public final eo01 d;
    public final int e;

    public ho01(boolean z, do01 do01Var, fo01 fo01Var, eo01 eo01Var, int i) {
        this.a = z;
        this.b = do01Var;
        this.c = fo01Var;
        this.d = eo01Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho01)) {
            return false;
        }
        ho01 ho01Var = (ho01) obj;
        return this.a == ho01Var.a && this.b.equals(ho01Var.b) && this.c.equals(ho01Var.c) && this.d.equals(ho01Var.d) && this.e == ho01Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsFuzzySearchEntity(isEnabled=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", normalization=");
        sb.append(this.d);
        sb.append(", swapCost=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
