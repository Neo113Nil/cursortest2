package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gq31 {
    public static final gq31 e = new gq31(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gq31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq31)) {
            return false;
        }
        gq31 gq31Var = (gq31) obj;
        return this.a == gq31Var.a && this.b == gq31Var.b && this.c == gq31Var.c && this.d == gq31Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", bottom=", Extension.C_BRAKE, b64.s(this.a, this.b, "ViewDimensions(left=", ", top=", ", right="));
    }
}
