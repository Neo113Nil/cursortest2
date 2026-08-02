package defpackage;

import com.yandex.go.user_profile.ui.am.AmActions$Command;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.t0;

/* loaded from: classes15.dex */
public abstract class jjo {
    public static final AmActions$Command a = new AmActions$Command("action.close");
    public static final AmActions$Command b = new AmActions$Command("action.change_account");
    public static final AmActions$Command c = new AmActions$Command("action.change_email");
    public static final AmActions$Command d = new AmActions$Command("action.change_name");
    public static final AmActions$Command e = new AmActions$Command("action.change_phone");
    public static final AmActions$Command f = new AmActions$Command("action.create_name");
    public static final AmActions$Command g = new AmActions$Command("action.upload_photo");
    public static final AmActions$Command h = new AmActions$Command("action.logout");

    public static final hs31 a(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1774921927);
        qwd qwdVar = e5z.a;
        btsVar.e0(-1336684776);
        hs31 hs31Var = (hs31) btsVar.m(e5z.a);
        btsVar.t(false);
        if (hs31Var != null) {
            btsVar.t(false);
            return hs31Var;
        }
        ny61.r("No MessengerViewModelFactory was provided via LocalViewModelFactoryProvider");
        return null;
    }

    public static final rs31 b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-56625651);
        rs31 a2 = f5z.a(btsVar);
        if (a2 != null) {
            btsVar.t(false);
            return a2;
        }
        ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        return null;
    }

    public static final void c(a5g a5gVar, Object obj, boolean z) {
        lg80 lg80Var = obj instanceof dm80 ? ((dm80) obj).b : obj instanceof te80 ? ((te80) obj).d : obj instanceof sn80 ? ((sn80) obj).g : null;
        if (lg80Var != null) {
            mg80 mg80Var = (mg80) a5gVar.s0.get();
            synchronized (mg80Var.a) {
                if (z) {
                    try {
                        mg80Var.b.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mg80Var.b.addLast(lg80Var);
            }
        }
    }

    public static final void d(a5g a5gVar, Object obj, boolean z) {
        svj svjVar = obj instanceof dm80 ? ((dm80) obj).a : obj instanceof te80 ? ((te80) obj).b : obj instanceof sn80 ? ((sn80) obj).f : null;
        if (svjVar != null) {
            wbc0 wbc0Var = (wbc0) a5gVar.m.get();
            synchronized (wbc0Var.a) {
                if (z) {
                    try {
                        wbc0Var.b.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                wbc0Var.b.addLast(svjVar);
            }
        }
    }

    public static final wl3 e(k2 k2Var) {
        AuthEnvironment authEnvironment;
        t0 environment = k2Var.getEnvironment();
        if (environment.equals(h.a) || environment == KPassportEnvironment.PRODUCTION) {
            authEnvironment = AuthEnvironment.Production;
        } else if (environment.equals(h.e) || environment == KPassportEnvironment.RC) {
            authEnvironment = AuthEnvironment.Rc;
        } else if (environment.equals(h.c) || environment == KPassportEnvironment.TESTING) {
            authEnvironment = AuthEnvironment.Testing;
        } else if (environment.equals(h.b) || environment == KPassportEnvironment.TEAM_PRODUCTION) {
            authEnvironment = AuthEnvironment.TeamProduction;
        } else {
            if (!environment.equals(h.d) && environment != KPassportEnvironment.TEAM_TESTING) {
                ny61.r(qv10.g(environment.getInteger(), "Unknown environment: "));
                return null;
            }
            authEnvironment = AuthEnvironment.TeamTesting;
        }
        return new wl3(authEnvironment, k2Var.getValue());
    }

    public static final PassportUidImpl f(wl3 wl3Var) {
        KPassportEnvironment d2 = q8a1.d(wl3Var.a);
        return new PassportUidImpl(PassportEnvironmentImpl.from(d2), wl3Var.b);
    }
}
