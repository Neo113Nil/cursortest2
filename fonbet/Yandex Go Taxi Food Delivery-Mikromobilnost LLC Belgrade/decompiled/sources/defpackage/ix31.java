package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ix31 {
    public final int a;
    public final long b;
    public final int c;
    public final sls d;

    public ix31(int i, long j, int i2, sls slsVar) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix31)) {
            return false;
        }
        ix31 ix31Var = (ix31) obj;
        return this.a == ix31Var.a && this.b == ix31Var.b && this.c == ix31Var.c && this.d.equals(ix31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, qv10.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "VisibilityParams(percentage=" + this.a + ", duration=" + this.b + ", limit=" + this.c + ", onAction=" + this.d + Extension.C_BRAKE;
    }
}
