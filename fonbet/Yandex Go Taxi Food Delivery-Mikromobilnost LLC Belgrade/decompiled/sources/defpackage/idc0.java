package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class idc0 extends zm91 {
    public final long g;

    public idc0(long j) {
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idc0) && this.g == ((idc0) obj).g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return qv10.k(this.g, "DeferredWithTimeout(timeoutMs=", Extension.C_BRAKE);
    }
}
