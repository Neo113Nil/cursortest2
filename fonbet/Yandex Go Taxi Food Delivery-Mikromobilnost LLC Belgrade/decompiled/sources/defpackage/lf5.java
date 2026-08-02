package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class lf5 {
    public final boolean a;
    public final int b;
    public final long c;

    public lf5(boolean z, int i, long j) {
        this.a = z;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf5)) {
            return false;
        }
        lf5 lf5Var = (lf5) obj;
        return this.a == lf5Var.a && this.b == lf5Var.b && e3n.d(this.c, lf5Var.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
        o430 o430Var = e3n.b;
        return Long.hashCode(this.c) + b;
    }

    public final String toString() {
        return oyr.t(xvz.p("BatchedRealtimeSignalServiceConfig(enabled=", this.b, ", maxBufferSize=", ", commitInterval=", this.a), e3n.p(this.c), Extension.C_BRAKE);
    }
}
