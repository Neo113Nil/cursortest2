package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kyf0 extends lyf0 {
    public final long a;
    public final ReducedUserInfo b;

    public kyf0(long j, ReducedUserInfo reducedUserInfo) {
        this.a = j;
        this.b = reducedUserInfo;
    }

    @Override // defpackage.lyf0
    public final long a() {
        return this.a;
    }

    @Override // defpackage.lyf0
    public final ReducedUserInfo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyf0)) {
            return false;
        }
        kyf0 kyf0Var = (kyf0) obj;
        return this.a == kyf0Var.a && jl40.l(this.b, kyf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Read(timestamp=" + this.a + ", userInfo=" + this.b + Extension.C_BRAKE;
    }
}
