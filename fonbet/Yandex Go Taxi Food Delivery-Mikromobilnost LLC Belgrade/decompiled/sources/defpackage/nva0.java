package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nva0 extends cj3 {
    public final long c;
    public final boolean d;

    public nva0(long j, boolean z) {
        super(4, "Время получения токена из Passport (общее)", "passport_token_performance", b.i(new Pair("duration_ms", String.valueOf(j)), new Pair("is_drop_token_forced", String.valueOf(false)), new Pair("is_success", String.valueOf(z))), false);
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nva0)) {
            return false;
        }
        nva0 nva0Var = (nva0) obj;
        return this.c == nva0Var.c && this.d == nva0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(Long.hashCode(this.c) * 31, 31, false);
    }

    public final String toString() {
        return "PassportTokenLoading(durationMs=" + this.c + ", isDropTokenForced=false, isSuccess=" + this.d + Extension.C_BRAKE;
    }
}
