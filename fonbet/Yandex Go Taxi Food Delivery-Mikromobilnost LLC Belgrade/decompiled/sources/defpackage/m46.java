package defpackage;

import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class m46 {
    public final p36 a;
    public final BlockedReason b;
    public final String c;

    public m46(p36 p36Var, BlockedReason blockedReason, String str) {
        this.a = p36Var;
        this.b = blockedReason;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m46)) {
            return false;
        }
        m46 m46Var = (m46) obj;
        return this.a.equals(m46Var.a) && this.b == m46Var.b && jl40.l(this.c, m46Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockedUserWithReason(blockedUser=");
        sb.append(this.a);
        sb.append(", blockedReason=");
        sb.append(this.b);
        sb.append(", apiEndpoint=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
