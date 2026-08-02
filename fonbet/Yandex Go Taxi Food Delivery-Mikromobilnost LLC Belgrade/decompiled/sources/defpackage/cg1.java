package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class cg1 extends ye1 {
    public final int a;
    public final int b;
    public final int c;
    public final bg1 d;
    public final ag1 e;

    public cg1(int i, int i2, int i3, bg1 bg1Var, ag1 ag1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bg1Var;
        this.e = ag1Var;
    }

    public final int a() {
        bg1 bg1Var = bg1.x;
        int i = this.c;
        bg1 bg1Var2 = this.d;
        if (bg1Var2 == bg1Var) {
            return i + 16;
        }
        if (bg1Var2 == bg1.c || bg1Var2 == bg1.w) {
            return i + 21;
        }
        ny61.r("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cg1)) {
            return false;
        }
        cg1 cg1Var = (cg1) obj;
        return cg1Var.a == this.a && cg1Var.b == this.b && cg1Var.a() == a() && cg1Var.d == this.d && cg1Var.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(cg1.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.d);
        sb.append(", hashType: ");
        sb.append(this.e);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.c);
        sb.append("-byte tags, and ");
        sb.append(this.a);
        sb.append("-byte AES key, and ");
        return oyr.m(this.b, "-byte HMAC key)", sb);
    }
}
