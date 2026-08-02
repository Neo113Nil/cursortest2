package defpackage;

import com.ybsdk.utils.poller.PollerScopeType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class myd0 {
    public final PollerScopeType a;
    public final vy91 b;
    public final vy91 c;
    public final q6c0 d;
    public final bzd0 e;
    public final az91 f;
    public final n27 g;

    public myd0(PollerScopeType pollerScopeType, vy91 vy91Var, vy91 vy91Var2, q6c0 q6c0Var, bzd0 bzd0Var, az91 az91Var, n27 n27Var) {
        this.a = pollerScopeType;
        this.b = vy91Var;
        this.c = vy91Var2;
        this.d = q6c0Var;
        this.e = bzd0Var;
        this.f = az91Var;
        this.g = n27Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myd0)) {
            return false;
        }
        myd0 myd0Var = (myd0) obj;
        return this.a == myd0Var.a && jl40.l(this.b, myd0Var.b) && jl40.l(this.c, myd0Var.c) && jl40.l(this.d, myd0Var.d) && jl40.l(this.e, myd0Var.e) && this.f.equals(myd0Var.f) && this.g.equals(myd0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PollerConfig(scopeType=" + this.a + ", pollerSuccessDelayPolicy=" + this.b + ", pollerErrorDelayPolicy=" + this.c + ", pollerAnalyticsReporter=" + this.d + ", timeout=" + this.e + ", reportLongPollingStrategy=" + this.f + ", errorHandlingStrategy=" + this.g + Extension.C_BRAKE;
    }
}
