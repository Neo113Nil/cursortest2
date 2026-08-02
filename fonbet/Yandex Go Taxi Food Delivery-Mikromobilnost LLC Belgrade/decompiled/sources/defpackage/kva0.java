package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kva0 extends cj3 {
    public final long c;
    public final String d;

    public kva0(long j) {
        super(5, "Время операции с AuthRepository", "auth_repository_performance", b.i(new Pair("duration_ms", String.valueOf(j)), new Pair("operation", "save_auth_token")), false);
        this.c = j;
        this.d = "save_auth_token";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva0)) {
            return false;
        }
        kva0 kva0Var = (kva0) obj;
        return this.c == kva0Var.c && jl40.l(this.d, kva0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder k = x4e.k("AuthRepositoryOperation(durationMs=", this.c, ", operation=", this.d);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
