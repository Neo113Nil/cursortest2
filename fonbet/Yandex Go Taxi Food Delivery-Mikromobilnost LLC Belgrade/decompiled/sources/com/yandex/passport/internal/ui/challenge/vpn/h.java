package com.yandex.passport.internal.ui.challenge.vpn;

import android.content.SharedPreferences;
import android.webkit.CookieManager;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.report.cc;
import com.yandex.passport.internal.report.gc;
import com.yandex.passport.internal.report.hc;
import com.yandex.passport.internal.report.ic;
import com.yandex.passport.internal.report.jc;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.g1;
import defpackage.evu0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class h extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.usecase.vpn.b c;
    public final com.yandex.passport.internal.config.p d;
    public final g1 e;
    public pzt0 f;
    public pzt0 g;

    public h(com.yandex.passport.internal.usecase.vpn.b bVar, com.yandex.passport.internal.config.p pVar, g1 g1Var) {
        this.c = bVar;
        this.d = pVar;
        this.e = g1Var;
    }

    @Override // defpackage.ose
    public final void b() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        super.b();
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        g gVar = (g) obj;
        if (gVar == null) {
            w511.b();
            return null;
        }
        a(new l(gVar.a));
        pzt0 pzt0Var = this.f;
        ike ikeVar = this.b;
        if (pzt0Var == null) {
            this.f = tje.N(ikeVar, null, null, new VpnChallengeStoreFactory$ExecutorImpl$observeVpnStatus$1(this, null), 3);
        }
        if (this.g == null) {
            this.g = tje.N(ikeVar, null, null, new VpnChallengeStoreFactory$ExecutorImpl$observeForceFinish$1(this, null), 3);
        }
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        z zVar = (z) obj;
        boolean l = jl40.l(zVar, x.a);
        zy11 zy11Var = zy11.a;
        g1 g1Var = this.e;
        if (l) {
            g1Var.getClass();
            g1Var.h(jc.w);
            a(i.a);
            return zy11Var;
        }
        if (jl40.l(zVar, t.a)) {
            g1Var.getClass();
            g1Var.h(cc.w);
            k();
            Object f = this.c.f(continuation);
            if (f == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return f;
            }
        } else {
            if (jl40.l(zVar, v.a)) {
                g1Var.getClass();
                g1Var.h(ic.w);
                a(new j(true));
                return zy11Var;
            }
            if (jl40.l(zVar, y.a)) {
                a(new j(false));
                return zy11Var;
            }
            if (!jl40.l(zVar, u.a)) {
                if (!(zVar instanceof w)) {
                    w511.b();
                    return null;
                }
                String str = ((w) zVar).a;
                g1Var.getClass();
                g1Var.f(gc.w, new jd(str, 5));
                return zy11Var;
            }
            g1Var.getClass();
            g1Var.h(hc.w);
            Object l2 = l((ContinuationImpl) continuation);
            if (l2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return l2;
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
    }

    public final void k() {
        SharedPreferences b;
        SharedPreferences.Editor edit;
        String str = ((s) g()).b;
        if (str != null) {
            CookieManager.getInstance().flush();
            String cookie = CookieManager.getInstance().getCookie(str);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel = LogLevel.DEBUG;
                StringBuilder x = unr0.x("saveWebViewCookies url=", str, " hasCookies=");
                x.append(true ^ (cookie == null || evu0.J(cookie)));
                com.yandex.passport.common.logger.a.c(logLevel, null, x.toString(), 8);
            }
            Environment environment = Environment.PRODUCTION;
            com.yandex.passport.internal.config.p pVar = this.d;
            pVar.getClass();
            if (cookie != null && !evu0.J(cookie) && (b = pVar.a.b(environment)) != null && (edit = b.edit()) != null) {
                edit.putString("vpn_cookie", cookie);
                edit.apply();
            }
        }
        a(new k());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1 vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1;
        int i;
        VpnStatus vpnStatus;
        if (continuationImpl instanceof VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1) {
            vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1 = (VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1) continuationImpl;
            int i2 = vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.L$0 = this;
                    vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.label = 1;
                    obj = this.c.e("data_changed", vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (h) vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                vpnStatus = (VpnStatus) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "reloadVpnStatus: " + vpnStatus, 8);
                }
                if (jl40.l(vpnStatus, VpnStatus.Allowed.INSTANCE)) {
                    this.k();
                }
                return zy11.a;
            }
        }
        vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1 = new VpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1(this, continuationImpl);
        Object obj2 = vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vpnChallengeStoreFactory$ExecutorImpl$reloadVpnStatus$1.label;
        if (i != 0) {
        }
        vpnStatus = (VpnStatus) obj2;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        if (jl40.l(vpnStatus, VpnStatus.Allowed.INSTANCE)) {
        }
        return zy11.a;
    }
}
