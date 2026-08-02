package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class kzl extends lzl {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kzl(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzl)) {
            return false;
        }
        kzl kzlVar = (kzl) obj;
        return this.a == kzlVar.a && this.b == kzlVar.b && this.c == kzlVar.c && this.d == kzlVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", dy=", Extension.C_BRAKE, b64.s(this.a, this.b, "OnScrolled(verticalOffset=", ", horizontalOffset=", ", dx="));
    }
}
