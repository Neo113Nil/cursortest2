package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.mob.api.model.MobEnvironment;

/* loaded from: classes8.dex */
public final class not implements ju6 {
    public final MobEnvironment a;
    public final h3y b;
    public final qsu c;
    public final v0p d;
    public final hs50 e;

    public not(MobEnvironment mobEnvironment, h3y h3yVar, qsu qsuVar, v0p v0pVar, hs50 hs50Var) {
        this.a = mobEnvironment;
        this.b = h3yVar;
        this.c = qsuVar;
        this.d = v0pVar;
        this.e = hs50Var;
    }

    public final String a(HostMobSupportedApiNames hostMobSupportedApiNames) {
        pr20 pr20Var;
        pr20 pr20Var2;
        String str = this.e.a().a;
        h3y h3yVar = this.b;
        iq20 J = s8o.J((ur20) h3yVar.get(), hostMobSupportedApiNames, str);
        lq20 lq20Var = (J == null || (pr20Var2 = J.a) == null) ? null : pr20Var2.a;
        String str2 = lq20Var != null ? lq20Var.c : null;
        if (str2 == null) {
            xby.l(jst.e, "SwitchNetworkEnvironment.Mob.ApiName.Missed", null, new IllegalStateException(b64.l("Failed to get baseUrl ", hostMobSupportedApiNames.getApiName().a, " in contour ", str)), null, 10);
        }
        if (str2 != null) {
            return str2;
        }
        iq20 J2 = s8o.J((ur20) h3yVar.get(), hostMobSupportedApiNames, str);
        lq20 lq20Var2 = (J2 == null || (pr20Var = J2.a) == null) ? null : pr20Var.a;
        if (lq20Var2 != null) {
            return lq20Var2.c;
        }
        return null;
    }

    public final String b(HostMobSupportedApiNames hostMobSupportedApiNames) {
        String str = this.e.a().a;
        h3y h3yVar = this.b;
        lq20 K = s8o.K((ur20) h3yVar.get(), hostMobSupportedApiNames, str);
        String str2 = K != null ? K.c : null;
        if (str2 == null) {
            xby.l(jst.e, "SwitchNetworkEnvironment.Mob.ApiName.Missed", null, new IllegalStateException(b64.l("Failed to get baseUrl ", hostMobSupportedApiNames.getApiName().a, " in contour ", str)), null, 10);
        }
        if (str2 != null) {
            return str2;
        }
        lq20 K2 = s8o.K((ur20) h3yVar.get(), hostMobSupportedApiNames, "default");
        if (K2 != null) {
            return K2.c;
        }
        return null;
    }

    public final String c() {
        return g(HostMobSupportedApiNames.TAXI, this.c.a());
    }

    public final String d() {
        return g(HostMobSupportedApiNames.TAXI_V4, this.c.b());
    }

    public final String e() {
        String b = b(HostMobSupportedApiNames.TC);
        if (b != null) {
            return b;
        }
        this.c.getClass();
        String str = d6z.d;
        if (str == null || evu0.J(str)) {
            jst.e.w(new IllegalStateException("no taxiHost defined"));
            str = "tc.mobile.yandex.net";
        }
        return "https://".concat(str);
    }

    public final String f(HostMobSupportedApiNames hostMobSupportedApiNames, String str) {
        String a = a(hostMobSupportedApiNames);
        return a != null ? g8e.p(a, q5z.f0(hostMobSupportedApiNames, this.a), "/") : str;
    }

    public final String g(HostMobSupportedApiNames hostMobSupportedApiNames, String str) {
        String b = b(hostMobSupportedApiNames);
        return b != null ? g8e.p(b, q5z.f0(hostMobSupportedApiNames, this.a), "/") : str;
    }
}
