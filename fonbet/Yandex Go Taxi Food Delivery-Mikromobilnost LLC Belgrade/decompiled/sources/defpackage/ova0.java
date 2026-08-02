package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ova0 extends cj3 {
    public final long c;
    public final boolean d;
    public final boolean e;

    public ova0(long j, boolean z, boolean z2) {
        super(5, "Время получения токена из Passport (общее)", "passport_token_performance", b.i(new Pair("duration_ms", String.valueOf(j)), new Pair("is_drop_token_forced", String.valueOf(z)), new Pair("is_success", String.valueOf(z2))), false);
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ova0)) {
            return false;
        }
        ova0 ova0Var = (ova0) obj;
        return this.c == ova0Var.c && this.d == ova0Var.d && this.e == ova0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(Long.hashCode(this.c) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportTokenLoading(durationMs=");
        sb.append(this.c);
        sb.append(", isDropTokenForced=");
        sb.append(this.d);
        return xra1.a(sb, ", isSuccess=", this.e, Extension.C_BRAKE);
    }
}
