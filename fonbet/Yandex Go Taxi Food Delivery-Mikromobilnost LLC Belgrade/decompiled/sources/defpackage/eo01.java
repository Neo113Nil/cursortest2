package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eo01 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public eo01(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo01)) {
            return false;
        }
        eo01 eo01Var = (eo01) obj;
        return this.a == eo01Var.a && this.b == eo01Var.b && this.c == eo01Var.c && this.d == eo01Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "Normalization(neighborsSubstitutionCost=", ", regularSubstitutionCost=", ", digitSubstitutionCost=");
        s.append(this.c);
        s.append(", enableLatinCyrillicLookalikes=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
