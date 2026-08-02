package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ase {
    public int a;
    public int b;
    public int c;
    public int d;

    public ase(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final ase a() {
        return new ase(this.b, this.a, this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ase)) {
            return false;
        }
        ase aseVar = (ase) obj;
        return this.a == aseVar.a && this.b == aseVar.b && this.c == aseVar.c && this.d == aseVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", bottomLeft=", Extension.C_BRAKE, b64.s(this.a, this.b, "Corners(topLeft=", ", topRight=", ", bottomRight="));
    }
}
