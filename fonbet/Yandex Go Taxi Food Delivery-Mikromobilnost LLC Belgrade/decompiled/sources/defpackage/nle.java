package defpackage;

import com.yandex.go.analytics.b;
import com.yandex.go.mob.HostMobSupportedApiNames;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class nle {
    public final h3y a;
    public final b b;
    public final hs50 c;

    public nle(h3y h3yVar, b bVar, hs50 hs50Var) {
        this.a = h3yVar;
        this.b = bVar;
        this.c = hs50Var;
    }

    public final iq20 a(HostMobSupportedApiNames hostMobSupportedApiNames) {
        kl20 kl20Var = (kl20) this.a.get();
        String str = this.c.a().a;
        iq20 J = s8o.J(kl20Var, hostMobSupportedApiNames, str);
        if (J == null) {
            this.b.b("SwitchNetworkEnvironment.Mob.ApiName.Missed", kotlin.collections.b.i(new Pair("api_name", hostMobSupportedApiNames.getApiName().a), new Pair("contour", str)));
        }
        return J == null ? s8o.J(kl20Var, hostMobSupportedApiNames, "default") : J;
    }

    public final iq20 b(String str) {
        kl20 kl20Var = (kl20) this.a.get();
        String str2 = this.c.a().a;
        ol20 ol20Var = new ol20(str);
        iq20 iq20Var = (iq20) kl20Var.e(str2, ol20Var).b.get(vng.b(str2, ol20Var).b);
        if (iq20Var == null) {
            this.b.b("SwitchNetworkEnvironment.Mob.ApiName.Missed", kotlin.collections.b.i(new Pair("api_name", str), new Pair("contour", str2)));
        }
        if (iq20Var != null) {
            return iq20Var;
        }
        ol20 ol20Var2 = new ol20(str);
        return (iq20) kl20Var.e("default", ol20Var2).b.get(vng.b("default", ol20Var2).b);
    }
}
