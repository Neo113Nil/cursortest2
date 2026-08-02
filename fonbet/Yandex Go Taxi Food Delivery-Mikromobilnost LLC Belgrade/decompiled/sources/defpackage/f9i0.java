package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class f9i0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public f9i0(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9i0)) {
            return false;
        }
        f9i0 f9i0Var = (f9i0) obj;
        return this.a == f9i0Var.a && this.b == f9i0Var.b && this.c == f9i0Var.c && this.d == f9i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "RawGifThemedImageStableKey(rawResIdDark=", ", rawResIdLight=", ", repeatCount=");
        s.append(this.c);
        s.append(", autoStart=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
