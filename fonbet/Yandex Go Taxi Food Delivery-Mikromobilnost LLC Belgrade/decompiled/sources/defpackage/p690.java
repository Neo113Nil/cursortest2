package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class p690 {
    public final int a;
    public final int b;
    public final String c;

    public p690(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return p690.class.equals(obj != null ? obj.getClass() : null) && this.c.contentEquals(((p690) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.t(b64.s(this.a, this.b, "Data(width=", ", height=", ", path="), this.c, Extension.C_BRAKE);
    }
}
