package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class prb implements uni {
    public final long a;

    public prb() {
        this(10000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prb) && this.a == ((prb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "ChooseProfileArgs(dashboardLoadingTimeoutMs=", Extension.C_BRAKE);
    }

    public prb(long j) {
        this.a = j;
    }
}
