package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ebv {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final long d;

    public ebv(int i, boolean z, long j, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebv)) {
            return false;
        }
        ebv ebvVar = (ebv) obj;
        return this.a == ebvVar.a && this.b == ebvVar.b && this.c == ebvVar.c && this.d == ebvVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + oyr.b(this.c, unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ImageMeta(tintable=", ", autoMirror=", ", originalSizeHint=", this.a, this.b);
        u.append(this.c);
        u.append(", originalContentSize=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
