package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class nf1 extends p200 {
    public final int a;
    public final int b;
    public final mf1 c;

    public nf1(int i, int i2, mf1 mf1Var) {
        this.a = i;
        this.b = i2;
        this.c = mf1Var;
    }

    public final int a() {
        mf1 mf1Var = mf1.y;
        int i = this.b;
        mf1 mf1Var2 = this.c;
        if (mf1Var2 == mf1Var) {
            return i;
        }
        if (mf1Var2 != mf1.c && mf1Var2 != mf1.w && mf1Var2 != mf1.x) {
            ny61.r("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nf1)) {
            return false;
        }
        nf1 nf1Var = (nf1) obj;
        return nf1Var.a == this.a && nf1Var.a() == a() && nf1Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(nf1.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append("-byte tags, and ");
        return oyr.m(this.a, "-byte key)", sb);
    }
}
