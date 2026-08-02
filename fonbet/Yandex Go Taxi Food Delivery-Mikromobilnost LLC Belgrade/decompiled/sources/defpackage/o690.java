package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o690 {
    public static final o690 e = new o690(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public o690(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o690)) {
            return false;
        }
        o690 o690Var = (o690) obj;
        return this.a == o690Var.a && this.b == o690Var.b && this.c == o690Var.c && this.d == o690Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", bottom=", Extension.C_BRAKE, b64.s(this.a, this.b, "PaddingsModel(lead=", ", trail=", ", top="));
    }
}
