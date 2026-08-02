package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lva0 extends cj3 {
    public final long c;

    public lva0(long j) {
        super(4, "Время дропа старого токена", "passport_token_drop_performance", g8e.z("duration_ms", String.valueOf(j)), false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lva0) && this.c == ((lva0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "PassportTokenDrop(durationMs=", Extension.C_BRAKE);
    }
}
