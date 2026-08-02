package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ma6 {
    public final long a;
    public final float b;

    public ma6(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma6)) {
            return false;
        }
        ma6 ma6Var = (ma6) obj;
        return ldc.c(this.a, ma6Var.a) && y7m.b(this.b, ma6Var.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("Border(color=", ldc.i(this.a), ", width=", y7m.c(this.b), Extension.C_BRAKE);
    }
}
