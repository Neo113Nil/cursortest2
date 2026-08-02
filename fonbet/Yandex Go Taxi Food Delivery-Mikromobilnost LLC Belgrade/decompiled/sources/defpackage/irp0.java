package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class irp0 extends jnl {
    public final long c;

    public irp0(long j) {
        super("PinScreenLoading", Long.valueOf(j));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irp0) && this.c == ((irp0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "PinScreenLoading(duration=", Extension.C_BRAKE);
    }
}
