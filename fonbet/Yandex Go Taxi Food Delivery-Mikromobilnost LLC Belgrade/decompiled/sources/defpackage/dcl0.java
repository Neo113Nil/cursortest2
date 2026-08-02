package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dcl0 {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public dcl0(int i, String str, boolean z, int i2) {
        boolean z2 = (i2 & 4) != 0;
        z = (i2 & 8) != 0 ? true : z;
        this.a = i;
        this.b = str;
        this.c = z2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcl0)) {
            return false;
        }
        dcl0 dcl0Var = (dcl0) obj;
        return this.a == dcl0Var.a && this.b.equals(dcl0Var.b) && this.c == dcl0Var.c && this.d == dcl0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isDraggable=", Extension.C_BRAKE, unr0.v(this.a, "RouteStop(id=", ", title=", this.b, ", isCorrect="), this.c, this.d);
    }
}
