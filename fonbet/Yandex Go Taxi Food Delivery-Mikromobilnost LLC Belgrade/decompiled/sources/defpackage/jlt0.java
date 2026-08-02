package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jlt0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jlt0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlt0)) {
            return false;
        }
        jlt0 jlt0Var = (jlt0) obj;
        return this.a == jlt0Var.a && this.b == jlt0Var.b && this.c == jlt0Var.c && this.d == jlt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", height=", Extension.C_BRAKE, b64.s(this.a, this.b, "Span(column=", ", row=", ", width="));
    }
}
