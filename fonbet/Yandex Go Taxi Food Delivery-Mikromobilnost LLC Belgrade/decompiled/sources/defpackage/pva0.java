package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pva0 extends cj3 {
    public final long c;

    public pva0(long j) {
        super(4, "Время получения нового токена", "passport_token_request_performance", g8e.z("duration_ms", String.valueOf(j)), false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pva0) && this.c == ((pva0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return qv10.k(this.c, "PassportTokenRequest(durationMs=", Extension.C_BRAKE);
    }
}
