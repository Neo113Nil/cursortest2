package com.ybsdk.feature.webview.internal.presentation;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.configs.DeeplinkAllowedHosts;
import com.ybsdk.rconfig.configs.WebViewAutoRetryConfig;
import defpackage.a0h;
import defpackage.ab1;
import defpackage.cv41;
import defpackage.ds31;
import defpackage.dv41;
import defpackage.e331;
import defpackage.eg01;
import defpackage.eh51;
import defpackage.el11;
import defpackage.g8e;
import defpackage.gff;
import defpackage.gv41;
import defpackage.gw41;
import defpackage.h791;
import defpackage.hay;
import defpackage.hv41;
import defpackage.if8;
import defpackage.iu41;
import defpackage.j3h;
import defpackage.ku01;
import defpackage.lu41;
import defpackage.lv41;
import defpackage.mj31;
import defpackage.mqp0;
import defpackage.mr41;
import defpackage.mu41;
import defpackage.nl91;
import defpackage.nu41;
import defpackage.ny61;
import defpackage.ou41;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rje;
import defpackage.rp41;
import defpackage.sd90;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.um41;
import defpackage.v0h;
import defpackage.w0h;
import defpackage.w511;
import defpackage.x0h;
import defpackage.y0h;
import defpackage.yl41;
import defpackage.yqp0;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends gv41 {
    public final String B;
    public final WebViewScreenParams C;
    public final tfl0 D;
    public final com.ybsdk.feature.webview.internal.domain.a E;
    public final com.ybsdk.feature.webview.internal.domain.b F;
    public final mj31 G;
    public final j3h H;
    public final eg01 I;
    public final um41 J;
    public final com.ybsdk.feature.webview.internal.utils.b K;
    public final rp41 L;
    public final AppAnalyticsReporter M;
    public final ku01 N;
    public final hay O;
    public final mr41 P;
    public pzt0 Q;

    public c(j3h j3hVar, hay hayVar, tfl0 tfl0Var, eg01 eg01Var, ku01 ku01Var, mj31 mj31Var, um41 um41Var, rp41 rp41Var, mr41 mr41Var, AppAnalyticsReporter appAnalyticsReporter, WebViewScreenParams webViewScreenParams, com.ybsdk.feature.webview.internal.domain.a aVar, com.ybsdk.feature.webview.internal.domain.b bVar, com.ybsdk.feature.webview.internal.utils.b bVar2, String str) {
        super(new hv41(webViewScreenParams, 1), new el11(21, webViewScreenParams.getPrimaryErrorButtonGravity()));
        this.B = str;
        this.C = webViewScreenParams;
        this.D = tfl0Var;
        this.E = aVar;
        this.F = bVar;
        this.G = mj31Var;
        this.H = j3hVar;
        this.I = eg01Var;
        this.J = um41Var;
        this.K = bVar2;
        this.L = rp41Var;
        this.M = appAnalyticsReporter;
        this.N = ku01Var;
        this.O = hayVar;
        this.P = mr41Var;
    }

    public static /* synthetic */ void y0(c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        cVar.x0(z, (i & 2) == 0, null);
    }

    @Override // defpackage.gv41
    public final void b0(String str, Throwable th, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        r0 r0Var;
        Object value;
        iu41 iu41Var;
        r0 r0Var2;
        Object value2;
        iu41 iu41Var2;
        boolean z = num != null && num.intValue() == 401;
        if8 if8Var = (if8) this.J;
        if (if8Var.f() && z) {
            int i = ((iu41) X()).b;
            Integer maxAutoRetryCount = ((WebViewAutoRetryConfig) if8Var.a.d(yl41.a).getData()).getMaxAutoRetryCount();
            if (i < (maxAutoRetryCount != null ? maxAutoRetryCount.intValue() : 1)) {
                this.M.v0.a.a("tech.webview.load.autoretry", g8e.w(1, "stage", "errorReceived"));
                pz40 Y = Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                    iu41Var2 = (iu41) value2;
                } while (!r0Var2.k(value2, iu41.a(iu41Var2, iu41Var2.a.d(true, z), iu41Var2.b + 1, true, null, 52)));
                return;
            }
        }
        com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
        bVar.d();
        bVar.e(str, th.getMessage(), true);
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
            iu41Var = (iu41) value;
        } while (!r0Var.k(value, iu41.a(iu41Var, iu41Var.a.b(th, num), 0, false, null, 62)));
    }

    @Override // defpackage.gv41
    public final void d0(String str) {
        h791.e(this.H, str, false, null, 14);
    }

    @Override // defpackage.gv41
    public final void e0(String str) {
        this.G.y(str);
    }

    @Override // defpackage.gv41
    public final void f0() {
        r0 r0Var;
        Object value;
        iu41 iu41Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            iu41Var = (iu41) value;
        } while (!r0Var.k(value, iu41.a(iu41Var, iu41Var.a.a(), 0, false, null, 62)));
    }

    @Override // defpackage.gv41
    public final void g0() {
        gff gffVar = this.L.a;
        gffVar.a.m0.a.a("tech.session.cache_reset", null);
        gffVar.c.f();
    }

    @Override // defpackage.gv41
    public final void h0() {
        this.O.getClass();
    }

    @Override // defpackage.gv41
    public final void i0() {
        this.D.e();
    }

    @Override // defpackage.gv41
    public final void j0(boolean z) {
        tje.N(ds31.a(this), null, null, new WebViewViewModelImpl$onDownloadStarted$1(z, this, null), 3);
    }

    @Override // defpackage.gv41
    public final void k0(String str) {
        this.E.getClass();
        if (com.ybsdk.feature.webview.internal.domain.a.g(str)) {
            this.M.v0.a.a("tech.webview.set_session_loading.initiated", null);
        }
    }

    @Override // defpackage.gv41
    public final void l0(boolean z) {
        if (z) {
            this.D.e();
        }
    }

    @Override // defpackage.gv41
    public final void m0() {
        Integer num;
        ou41 ou41Var = ((iu41) X()).a;
        lu41 lu41Var = ou41Var instanceof lu41 ? (lu41) ou41Var : null;
        boolean z = false;
        if (lu41Var != null && (num = lu41Var.b) != null && num.intValue() == 401) {
            z = true;
        }
        y0(this, z, 4);
    }

    @Override // defpackage.gv41
    public final void n0(boolean z) {
        if (z && this.C.getShouldReloadWhenShownInViewPager() && !(((iu41) X()).a instanceof mu41)) {
            y0(this, false, 7);
        }
    }

    @Override // defpackage.gv41
    public final void o0(Throwable th) {
        r0 r0Var;
        Object value;
        iu41 iu41Var;
        nl91.g(this.B, null, "WebView is missing", null, th, null, null, null, null, null, 2024);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            iu41Var = (iu41) value;
        } while (!r0Var.k(value, iu41.a(iu41Var, iu41Var.a.b(th, null), 0, false, null, 62)));
    }

    @Override // defpackage.gv41
    public final void p0() {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (!((iu41) X()).e) {
            y0(this, false, 7);
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, iu41.a((iu41) value2, null, 0, false, null, 47)));
            return;
        }
        Long l = ((iu41) X()).f;
        if (l != null) {
            tje.N(ds31.a(this), null, null, new WebViewViewModelImpl$onWebViewReady$2$1(l.longValue(), this, null), 3);
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, iu41.a((iu41) value, null, 0, false, null, 31)));
    }

    @Override // defpackage.gv41
    public final void q0(String str) {
        r0 r0Var;
        Object value;
        iu41 iu41Var;
        this.E.getClass();
        boolean g = com.ybsdk.feature.webview.internal.domain.a.g(str);
        AppAnalyticsReporter appAnalyticsReporter = this.M;
        if (g) {
            appAnalyticsReporter.v0.a.a("tech.webview.set_session_loading.finished", null);
        }
        ou41 ou41Var = ((iu41) X()).a;
        if (ou41Var instanceof lu41) {
            return;
        }
        int i = 0;
        if (ou41Var instanceof mu41) {
            if (((if8) this.J).f() && ((mu41) ou41Var).b) {
                gw41 gw41Var = appAnalyticsReporter.v0;
                gw41Var.a.a("tech.webview.load.autoretry", g8e.w(1, "stage", "pageFinished"));
                x0(true, true, new lv41(this, i));
                return;
            }
            if (g) {
                return;
            }
        } else if (!ou41Var.equals(nu41.a)) {
            w511.b();
            return;
        }
        com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
        bVar.d();
        bVar.e(str, null, false);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            iu41Var = (iu41) value;
        } while (!r0Var.k(value, iu41.a(iu41Var, iu41Var.a.c(), 0, false, null, 62)));
        Z(dv41.a);
    }

    @Override // defpackage.gv41
    public final void r0(String str) {
        r0 r0Var;
        Object value;
        AppAnalyticsReporter appAnalyticsReporter = this.M;
        gw41.d(appAnalyticsReporter.v0, "pageUpdated", str, null, null, 12);
        if (((iu41) X()).d) {
            appAnalyticsReporter.v0.b("pageUpdated");
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, iu41.a((iu41) value, null, 0, false, null, 55)));
            Z(cv41.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.gv41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(Uri uri, List list, ContinuationImpl continuationImpl) {
        WebViewViewModelImpl$reportDataOnEveryMainRequest$1 webViewViewModelImpl$reportDataOnEveryMainRequest$1;
        int i;
        gw41 gw41Var;
        String str;
        if (continuationImpl instanceof WebViewViewModelImpl$reportDataOnEveryMainRequest$1) {
            webViewViewModelImpl$reportDataOnEveryMainRequest$1 = (WebViewViewModelImpl$reportDataOnEveryMainRequest$1) continuationImpl;
            int i2 = webViewViewModelImpl$reportDataOnEveryMainRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewViewModelImpl$reportDataOnEveryMainRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewViewModelImpl$reportDataOnEveryMainRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewViewModelImpl$reportDataOnEveryMainRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gw41 gw41Var2 = this.M.v0;
                    String m = sd90.m(uri);
                    String uri2 = uri.toString();
                    webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$0 = list;
                    webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$1 = gw41Var2;
                    webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$2 = m;
                    webViewViewModelImpl$reportDataOnEveryMainRequest$1.label = 1;
                    Object a = this.K.a(uri2, webViewViewModelImpl$reportDataOnEveryMainRequest$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gw41Var = gw41Var2;
                    obj = a;
                    str = m;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$2;
                    gw41Var = (gw41) webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$1;
                    list = (List) webViewViewModelImpl$reportDataOnEveryMainRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                gw41Var.a(str, (List) obj, list);
                return zy11.a;
            }
        }
        webViewViewModelImpl$reportDataOnEveryMainRequest$1 = new WebViewViewModelImpl$reportDataOnEveryMainRequest$1(this, continuationImpl);
        Object obj2 = webViewViewModelImpl$reportDataOnEveryMainRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewViewModelImpl$reportDataOnEveryMainRequest$1.label;
        if (i != 0) {
        }
        gw41Var.a(str, (List) obj2, list);
        return zy11.a;
    }

    @Override // defpackage.gv41
    public final void t0(String str) {
        ((ab1) this.I.a).a(str);
    }

    @Override // defpackage.gv41
    public final void u0(String str, Map map) {
        this.M.b(str, map);
    }

    @Override // defpackage.gv41
    public final void v0(String str) {
        this.N.a.f(new eh51(str));
    }

    @Override // defpackage.gv41
    public final boolean w0(FragmentActivity fragmentActivity, String str, boolean z) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        iu41 iu41Var;
        if (fragmentActivity == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0("shouldOverrideUrlLoading() activity is null", null, str));
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                iu41Var = (iu41) value2;
            } while (!r0Var2.k(value2, iu41.a(iu41Var, iu41Var.a.b(new Throwable("shouldOverrideUrlLoading() activity is null"), null), 0, false, null, 62)));
        } else {
            WebViewScreenParams.Auth auth = this.C.getAuth();
            WebViewScreenParams.Auth auth2 = WebViewScreenParams.Auth.BNK;
            com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
            if (auth == auth2) {
                bVar.f();
            }
            com.ybsdk.feature.webview.internal.domain.a aVar = this.E;
            if (aVar.f(str)) {
                bVar.h();
            } else {
                bVar.c();
            }
            String str2 = this.B;
            if (str.equals(str2)) {
                bVar.i(str, Boolean.TRUE);
            } else if (sd90.m(Uri.parse(str)).equals(sd90.m(Uri.parse(str2)))) {
                bVar.i(str, Boolean.FALSE);
            }
            y0h e = h791.e(this.H, str, false, DeeplinkSource.WEB_VIEW, 10);
            if (e instanceof v0h) {
                pz40 Y2 = Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, iu41.a((iu41) value, null, 0, false, ((v0h) e).b, 31)));
            } else if (!(e instanceof w0h)) {
                if (!(e instanceof x0h)) {
                    w511.b();
                    return false;
                }
                boolean G = kotlin.collections.a.G(((DeeplinkAllowedHosts) ((if8) this.J).a.d(a0h.a).getData()).getHosts(), Uri.parse(str).getHost());
                boolean f = aVar.f(str);
                if (G || f) {
                    return false;
                }
                trp0 trp0Var2 = trp0.a;
                trp0.e(new yqp0(str, 1));
                rje.i(fragmentActivity, str);
                if (!z) {
                    this.D.e();
                }
            }
        }
        return true;
    }

    public final void x0(boolean z, boolean z2, lv41 lv41Var) {
        pzt0 pzt0Var = this.Q;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 N = tje.N(ds31.a(this), null, null, new WebViewViewModelImpl$loadWithAuth$1(this, z, z2, null), 3);
        N.w(new e331(16, this, lv41Var));
        this.Q = N;
    }
}
