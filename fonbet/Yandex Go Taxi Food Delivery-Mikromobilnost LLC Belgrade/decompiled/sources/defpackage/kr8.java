package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class kr8 extends ye0 {
    public final long b;

    public kr8(long j) {
        super("care.webAppDidLoad");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr8) && this.b == ((kr8) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return qv10.k(this.b, "WebAppDidLoad(webAppLoadedTime=", Extension.C_BRAKE);
    }
}
