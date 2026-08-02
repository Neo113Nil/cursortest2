package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ni1 extends z9j {
    public final int a;
    public final mi1 b;

    public ni1(int i, mi1 mi1Var) {
        this.a = i;
        this.b = mi1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ni1)) {
            return false;
        }
        ni1 ni1Var = (ni1) obj;
        return ni1Var.a == this.a && ni1Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(ni1.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return oyr.m(this.a, "-byte key)", sb);
    }
}
