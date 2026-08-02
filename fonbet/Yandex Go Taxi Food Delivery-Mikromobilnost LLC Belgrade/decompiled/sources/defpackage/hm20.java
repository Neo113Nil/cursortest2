package defpackage;

import com.yandex.mob.network.MobNetworkErrorType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hm20 {
    public final boolean a;
    public final boolean b;
    public final MobNetworkErrorType c;

    public hm20(boolean z, boolean z2, MobNetworkErrorType mobNetworkErrorType) {
        this.a = z;
        this.b = z2;
        this.c = mobNetworkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm20)) {
            return false;
        }
        hm20 hm20Var = (hm20) obj;
        return this.a == hm20Var.a && this.b == hm20Var.b && this.c == hm20Var.c;
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        MobNetworkErrorType mobNetworkErrorType = this.c;
        return e + (mobNetworkErrorType == null ? 0 : mobNetworkErrorType.hashCode());
    }

    public final String toString() {
        StringBuilder u = qv10.u("MobCheckResult(ok=", ", ignoreDns=", ", errorType=", this.a, this.b);
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
