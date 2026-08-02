package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b6d0 extends ye0 {
    public final long b;

    public b6d0(long j) {
        super("auto");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6d0) && this.b == ((b6d0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final long p() {
        return this.b;
    }

    public final String toString() {
        return qv10.k(this.b, "Auto(delay=", Extension.C_BRAKE);
    }
}
