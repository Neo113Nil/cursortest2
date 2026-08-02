package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p920 {
    public final long a;
    public final xo3 b;

    public p920(long j, xo3 xo3Var) {
        this.a = j;
        this.b = xo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p920) {
            p920 p920Var = (p920) obj;
            return this.a == p920Var.a && this.b == p920Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VersionToRequest(version=" + this.a + ", request=" + this.b + Extension.C_BRAKE;
    }
}
