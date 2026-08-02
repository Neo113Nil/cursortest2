package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mbv implements rbv {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public mbv(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        v4b1.f(i);
        v4b1.f(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbv)) {
            return false;
        }
        mbv mbvVar = (mbv) obj;
        return this.a == mbvVar.a && this.b == mbvVar.b && this.c == mbvVar.c && this.d == mbvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "RawGifThemed(rawResIdDark=", ", rawResIdLight=", ", repeatCount=");
        s.append(this.c);
        s.append(", autoStart=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
