package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class bi1 extends ye1 {
    public final int a;
    public final ag1 b;

    public bi1(int i, ag1 ag1Var) {
        this.a = i;
        this.b = ag1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bi1)) {
            return false;
        }
        bi1 bi1Var = (bi1) obj;
        return bi1Var.a == this.a && bi1Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(bi1.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return oyr.m(this.a, "-byte key)", sb);
    }
}
