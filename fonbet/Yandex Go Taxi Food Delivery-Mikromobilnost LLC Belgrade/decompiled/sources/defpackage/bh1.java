package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class bh1 extends ye1 {
    public final int a;
    public final int b;
    public final int c;
    public final mf1 d;

    public bh1(int i, int i2, int i3, mf1 mf1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = mf1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        return bh1Var.a == this.a && bh1Var.b == this.b && bh1Var.c == this.c && bh1Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(bh1.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.d);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append("-byte IV, ");
        sb.append(this.c);
        sb.append("-byte tag, and ");
        return oyr.m(this.a, "-byte key)", sb);
    }
}
