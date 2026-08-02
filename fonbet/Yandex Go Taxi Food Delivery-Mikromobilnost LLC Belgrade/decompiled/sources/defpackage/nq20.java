package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;

/* loaded from: classes8.dex */
public final class nq20 {
    public final h3y a;
    public final hs50 b;

    public nq20(h3y h3yVar, hs50 hs50Var) {
        this.a = h3yVar;
        this.b = hs50Var;
    }

    public final String a() {
        pr20 pr20Var;
        lq20 lq20Var;
        String str = this.b.a().a;
        kl20 kl20Var = (kl20) this.a.get();
        HostMobSupportedApiNames hostMobSupportedApiNames = HostMobSupportedApiNames.XIVA_PUSH;
        iq20 iq20Var = (iq20) kl20Var.e(str, hostMobSupportedApiNames.getApiName()).b.get(vng.b(str, hostMobSupportedApiNames.getApiName()).b);
        if (iq20Var == null || (pr20Var = iq20Var.a) == null || (lq20Var = pr20Var.a) == null) {
            return null;
        }
        return lq20Var.d;
    }
}
