package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bs71 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public bs71(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs71)) {
            return false;
        }
        bs71 bs71Var = (bs71) obj;
        return this.a.equals(bs71Var.a) && this.b.equals(bs71Var.b) && this.c == bs71Var.c && this.d == bs71Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fia1.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b));
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", width=", Extension.C_BRAKE, b64.v("InteractiveCreativeFile(html=", this.a, ", mimeType=", this.b, ", height="));
    }
}
