package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gd6 {
    public final String a;
    public final int b;
    public final int c;

    public gd6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd6)) {
            return false;
        }
        gd6 gd6Var = (gd6) obj;
        return this.a.equals(gd6Var.a) && this.b == gd6Var.b && this.c == gd6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "Title(text=", this.a, ", topMargin=", ", bottomMargin="));
    }
}
