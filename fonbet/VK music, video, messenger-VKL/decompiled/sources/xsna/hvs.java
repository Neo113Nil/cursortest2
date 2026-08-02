package xsna;

import android.content.Context;
import android.webkit.WebStorage;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.ShortcutManagerWrapper;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: FullLogoutDelegate.kt */
/* loaded from: classes7.dex */
public final class hvs {
    public static final String[] c = {"api_error", "phone_validation_declined", "multiaccount_logout", "invalid_refresh_token", "empty_refresh_token"};
    public final bpn0 a;
    public final mxi0 b;

    public hvs(bpn0 bpn0Var, mxi0 mxi0Var) {
        this.a = bpn0Var;
        this.b = mxi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        Object failure;
        Object failure2;
        String[] strArr = c;
        SakFeatures.b.getClass();
        boolean a = p1p0.a(SakFeatures.c.i(SakFeatures.Type.FEATURE_CORE_STAT_FLUSH_ON_CLEAR));
        if (!a) {
            try {
                fsk0 fsk0Var = qsk0.a;
                fsk0Var.e(null);
                fsk0Var.o = true;
            } catch (Throwable th) {
                th = th;
                z4 = z2;
                z5 = z3;
                Throwable th2 = th;
                if (!a) {
                    qsk0.a.o = false;
                }
                if (z) {
                    com.vk.metrics.eventtracking.b.a.m(str, "CRUCIAL.LOGOUT", "reason");
                    if (str.equals("empty_refresh_token")) {
                        r55 r55Var = r55.a;
                        ((l2q) r55.d()).h();
                    }
                }
                if (rl3.G(strArr, str)) {
                    throw th2;
                }
                c63 c63Var = c63.a;
                Context b = c63.b();
                if (b == null && (b = e43.a) == null) {
                    b = null;
                }
                try {
                    rwi.d().o(b);
                    failure = s3q0.a;
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
                Throwable a2 = Result.a(failure);
                if (a2 == null) {
                    throw th2;
                }
                xgx0.a.getClass();
                xgx0.c("[FullLogoutDelegate] Open auth error", a2);
                this.b.a(pn00.k(new Pair("key", "full_logout_delegate_crash"), new Pair("reason", str), new Pair("awaitCleanup", String.valueOf(z4)), new Pair("shouldLoadUserExchangeData", String.valueOf(z5)), new Pair("stacktrace", erm0.D0(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, mnh0.A(a2)))));
                throw th2;
            }
        }
        ShortcutManagerWrapper shortcutManagerWrapper = ShortcutManagerWrapper.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ShortcutManagerWrapper.k(context);
        z4 = z2;
        z5 = z3;
        try {
            b(z4, z5);
            if (!a) {
                qsk0.a.o = false;
            }
            if (z) {
                com.vk.metrics.eventtracking.b.a.m(str, "CRUCIAL.LOGOUT", "reason");
                if (str.equals("empty_refresh_token")) {
                    r55 r55Var2 = r55.a;
                    ((l2q) r55.d()).h();
                }
            }
            if (rl3.G(strArr, str)) {
                c63 c63Var2 = c63.a;
                Context b2 = c63.b();
                if (b2 == null && (b2 = e43.a) == null) {
                    b2 = null;
                }
                try {
                    rwi.d().o(b2);
                    failure2 = s3q0.a;
                } catch (Throwable th4) {
                    failure2 = new Result.Failure(th4);
                }
                Throwable a3 = Result.a(failure2);
                if (a3 != null) {
                    xgx0.a.getClass();
                    xgx0.c("[FullLogoutDelegate] Open auth error", a3);
                    this.b.a(pn00.k(new Pair("key", "full_logout_delegate_crash"), new Pair("reason", str), new Pair("awaitCleanup", String.valueOf(z4)), new Pair("shouldLoadUserExchangeData", String.valueOf(z5)), new Pair("stacktrace", erm0.D0(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, mnh0.A(a3)))));
                }
            }
        } catch (Throwable th5) {
            th = th5;
            Throwable th22 = th;
            if (!a) {
            }
            if (z) {
            }
            if (rl3.G(strArr, str)) {
            }
        }
    }

    public final void b(boolean z, boolean z2) {
        m6r0 f = q6r0.f();
        UserId y = f.y();
        String k = f.k();
        String str = k == null ? "" : k;
        String v = f.v();
        int l = f.l();
        long x = f.x();
        m6r0 f2 = q6r0.f();
        xgx0.a.getClass();
        xgx0.f("[FullLogoutDelegate] Full logout started, cleared internal storage");
        SaFeatures saFeatures = SaFeatures.SA_CLEAR_CACHE_ON_SWITCH_ACCOUNT;
        saFeatures.getClass();
        if (!com.vk.toggle.b.A.a(saFeatures)) {
            wgn0.a();
        }
        WebStorage.getInstance().deleteAllData();
        asu0 asu0Var = asu0.a;
        v860 A = asu0Var.A(10, "vk-full-logout-thread");
        String str2 = str;
        io.reactivex.rxjava3.internal.operators.completable.l l2 = io.reactivex.rxjava3.core.a.l(new lhc(new xe8(this.a), y.b, str2, v == null ? "" : v));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        io.reactivex.rxjava3.internal.operators.completable.w i = new io.reactivex.rxjava3.internal.operators.completable.z(l2, fb20.b(timeUnit, "unit is null", "scheduler is null")).i(new n1r(new wq3(25), 2));
        bi3 bi3Var = new bi3(A, 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.completable.w wVar = new io.reactivex.rxjava3.internal.operators.completable.w(i, lVar, lVar, kVar, kVar, bi3Var, kVar);
        a.x xVar = io.reactivex.rxjava3.internal.functions.a.g;
        io.reactivex.rxjava3.internal.operators.completable.y q = new io.reactivex.rxjava3.internal.operators.completable.v(wVar, xVar).q(A);
        UtilityTokens.CREATOR.getClass();
        h7r0 h7r0Var = new h7r0(l, x, UtilityTokens.c, y, str2, v);
        int i2 = 1;
        io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.q(new ox2("AuthGetExchangeLoginData", new o35(h7r0Var), dgn0.c(), null, new sdx0())).s0(new pa(new oa(27), 19)).F(new bqs(new c4r(3), 1)).E(new el6(new srg(h7r0Var, 15), 26), lVar, kVar, kVar));
        r55 r55Var = r55.a;
        c2r0 j = r55.j();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        io.reactivex.rxjava3.internal.operators.completable.w g = (z2 ? io.reactivex.rxjava3.core.a.n(new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.z(new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.o(((yui) j).c(context, false), new fsq(new udo(h7r0Var, 9), 2)), new ai3(new v74(14, b1Var, h7r0Var), 21)), fb20.b(timeUnit, "unit is null", "scheduler is null")).i(new ubq(new gvs(0), 3)), xVar).q(asu0Var.c()), q) : q).g(new vdq(f2, i2));
        if (!z) {
            hg1.g(g, new ek(29));
            return;
        }
        sf sfVar = new sf(new qpj(f2, 12), 27);
        io.reactivex.rxjava3.internal.observers.d dVar = new io.reactivex.rxjava3.internal.observers.d(1);
        g.subscribe(dVar);
        dVar.a(lVar, sfVar);
    }
}
