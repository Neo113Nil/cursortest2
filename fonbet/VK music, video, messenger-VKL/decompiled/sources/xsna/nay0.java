package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.push.RegisterForPushesResult;

/* loaded from: classes9.dex */
public final class nay0 {
    public final RegisterForPushesResult a;
    public final AppInfo b;

    public nay0(RegisterForPushesResult registerForPushesResult, AppInfo appInfo) {
        this.a = registerForPushesResult;
        this.b = appInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nay0)) {
            return false;
        }
        nay0 nay0Var = (nay0) obj;
        return this.a == nay0Var.a && epx.f(this.b, nay0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterResult(innerResult=" + this.a + ", host=" + this.b + ')';
    }
}
