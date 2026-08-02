package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.fi1;

/* loaded from: classes7.dex */
public final class b471 {
    public final int a;
    public final fi1 b;

    public b471(int i, fi1 fi1Var) {
        this.a = i;
        this.b = fi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b471)) {
            return false;
        }
        b471 b471Var = (b471) obj;
        return this.a == b471Var.a && this.b == b471Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.a + ", mode=" + this.b + Extension.C_BRAKE;
    }
}
