package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ma2 {
    public final long a;
    public final long b;

    public ma2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma2)) {
            return false;
        }
        ma2 ma2Var = (ma2) obj;
        return e3n.d(this.a, ma2Var.a) && e3n.d(this.b, ma2Var.b);
    }

    public final int hashCode() {
        o430 o430Var = e3n.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("RestartOnTimeout(timeout=", e3n.p(this.a), ", delay=", e3n.p(this.b), Extension.C_BRAKE);
    }
}
