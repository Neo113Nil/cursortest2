package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f2w {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f2w(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2w)) {
            return false;
        }
        f2w f2wVar = (f2w) obj;
        return this.a == f2wVar.a && this.b == f2wVar.b && this.c == f2wVar.c && this.d == f2wVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", bottom=", Extension.C_BRAKE, b64.s(this.a, this.b, "InsetsModel(start=", ", top=", ", end="));
    }
}
