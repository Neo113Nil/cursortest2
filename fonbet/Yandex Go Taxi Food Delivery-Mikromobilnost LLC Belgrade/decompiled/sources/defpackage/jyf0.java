package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jyf0 extends lyf0 {
    public final int a;
    public final long b;
    public final ReducedUserInfo c;

    public jyf0(int i, long j, ReducedUserInfo reducedUserInfo) {
        this.a = i;
        this.b = j;
        this.c = reducedUserInfo;
    }

    @Override // defpackage.lyf0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.lyf0
    public final ReducedUserInfo b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyf0)) {
            return false;
        }
        jyf0 jyf0Var = (jyf0) obj;
        return this.a == jyf0Var.a && this.b == jyf0Var.b && jl40.l(this.c, jyf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Reaction(type=" + this.a + ", timestamp=" + this.b + ", userInfo=" + this.c + Extension.C_BRAKE;
    }
}
