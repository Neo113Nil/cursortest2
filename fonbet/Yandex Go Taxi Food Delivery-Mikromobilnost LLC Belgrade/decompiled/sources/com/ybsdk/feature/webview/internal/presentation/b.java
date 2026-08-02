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
import defpackage.dy31;
import defpackage.ec31;
import defpackage.eg01;
import defpackage.eh51;
import defpackage.eu41;
import defpackage.ev41;
import defpackage.fu41;
import defpackage.g8e;
import defpackage.gff;
import defpackage.gu41;
import defpackage.gv41;
import defpackage.gw41;
import defpackage.h791;
import defpackage.hay;
import defpackage.hu41;
import defpackage.hv41;
import defpackage.if8;
import defpackage.j3h;
import defpackage.ku01;
import defpackage.mj31;
import defpackage.mm91;
import defpackage.mqp0;
import defpackage.mr41;
import defpackage.nl91;
import defpackage.ny61;
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
import defpackage.x4e;
import defpackage.y0h;
import defpackage.yl41;
import defpackage.yqp0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes3.dex */
public final class b extends gv41 {
    public final String B;
    public final WebViewScreenParams C;
    public final tfl0 D;
    public final com.ybsdk.feature.webview.internal.domain.a E;
    public final com.ybsdk.feature.webview.internal.domain.b F;
    public final mj31 G;
    public final j3h H;
    public final AppAnalyticsReporter I;
    public final eg01 J;
    public final um41 K;
    public final com.ybsdk.feature.webview.internal.utils.b L;
    public final rp41 M;
    public final ku01 N;
    public final hay O;
    public final mr41 P;
    public boolean Q;
    public Long R;
    public pzt0 S;
    public boolean T;
    public ev41 U;
    public boolean V;
    public boolean W;

    public b(j3h j3hVar, hay hayVar, tfl0 tfl0Var, eg01 eg01Var, ku01 ku01Var, mj31 mj31Var, um41 um41Var, rp41 rp41Var, mr41 mr41Var, AppAnalyticsReporter appAnalyticsReporter, WebViewScreenParams webViewScreenParams, com.ybsdk.feature.webview.internal.domain.a aVar, com.ybsdk.feature.webview.internal.domain.b bVar, com.ybsdk.feature.webview.internal.utils.b bVar2, String str) {
        super(new hv41(webViewScreenParams, 0), new dy31(5));
        this.B = str;
        this.C = webViewScreenParams;
        this.D = tfl0Var;
        this.E = aVar;
        this.F = bVar;
        this.G = mj31Var;
        this.H = j3hVar;
        this.I = appAnalyticsReporter;
        this.J = eg01Var;
        this.K = um41Var;
        this.L = bVar2;
        this.M = rp41Var;
        this.N = ku01Var;
        this.O = hayVar;
        this.P = mr41Var;
    }

    public static void y0(b bVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.getClass();
        tje.N(ds31.a(bVar), null, null, new WebViewViewModelDeprecatedImpl$loadWithAuth$1(bVar, z, false, null), 3);
    }

    @Override // defpackage.gv41
    public final void b0(String str, Throwable th, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
        bVar.d();
        bVar.e(str, th.getMessage(), true);
        int i = ((hu41) X()).a;
        if8 if8Var = (if8) this.K;
        Integer maxAutoRetryCount = ((WebViewAutoRetryConfig) if8Var.a.d(yl41.a).getData()).getMaxAutoRetryCount();
        if (i >= (maxAutoRetryCount != null ? maxAutoRetryCount.intValue() : 1) || !if8Var.f() || num == null || num.intValue() != 401) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, hu41.a((hu41) value, 0, new eu41(th, num), null, false, false, HProv.PP_DELETE_KEYSET)));
            if (if8Var.f()) {
                nl91.g(str, num, "Web view error after retry", null, th, null, bool, bool2, bool3, bool4, 1064);
                return;
            }
            return;
        }
        this.I.v0.a.a("tech.webview.load.autoretry", g8e.w(1, "stage", "errorReceived"));
        this.V = true;
        this.W = true;
        pz40 Y2 = Y();
        do {
            r0Var2 = (r0) Y2;
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, hu41.a((hu41) value2, ((hu41) X()).a + 1, new fu41(true), null, false, false, HProv.PP_SAME_MEDIA)));
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
        if (((hu41) X()).b instanceof eu41) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, hu41.a((hu41) value, 0, gu41.b, null, false, false, HProv.PP_DELETE_KEYSET)));
    }

    @Override // defpackage.gv41
    public final void g0() {
        gff gffVar = this.M.a;
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
        tje.N(ds31.a(this), null, null, new WebViewViewModelDeprecatedImpl$onDownloadStarted$1(z, this, null), 3);
    }

    @Override // defpackage.gv41
    public final void k0(String str) {
        this.E.getClass();
        if (com.ybsdk.feature.webview.internal.domain.a.g(str)) {
            return;
        }
        if (this.T) {
            gw41 gw41Var = this.I.v0;
            gw41Var.a.a("tech.webview.redirect_stall.retry_success", g8e.w(1, "url", str));
        }
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = null;
        this.T = false;
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
        mm91 mm91Var = ((hu41) X()).b;
        eu41 eu41Var = mm91Var instanceof eu41 ? (eu41) mm91Var : null;
        boolean z = false;
        if (eu41Var != null && (num = eu41Var.c) != null && num.intValue() == 401) {
            z = true;
        }
        y0(this, z, 2);
    }

    @Override // defpackage.gv41
    public final void n0(boolean z) {
        if (z && this.C.getShouldReloadWhenShownInViewPager() && !((hu41) X()).b.equals(new fu41(false))) {
            y0(this, false, 3);
        }
    }

    @Override // defpackage.gv41
    public final void o0(Throwable th) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, hu41.a((hu41) value, 0, new eu41(th, null), null, false, false, HProv.PP_DELETE_KEYSET)));
        nl91.g(this.B, null, "WebView is missing", null, th, null, null, null, null, null, 2024);
    }

    @Override // defpackage.gv41
    public final void p0() {
        if (!this.Q) {
            tje.N(ds31.a(this), null, null, new WebViewViewModelDeprecatedImpl$onWebViewReady$1(this, null), 3);
            this.Q = true;
            return;
        }
        Long l = this.R;
        if (l != null) {
            tje.N(ds31.a(this), null, null, new WebViewViewModelDeprecatedImpl$onWebViewReady$2$1(l.longValue(), this, null), 3);
        }
        this.R = null;
    }

    @Override // defpackage.gv41
    public final void q0(String str) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        boolean z;
        this.E.getClass();
        boolean g = com.ybsdk.feature.webview.internal.domain.a.g(str);
        if8 if8Var = (if8) this.K;
        if (if8Var.f() && this.W && !com.ybsdk.feature.webview.internal.domain.a.g(str)) {
            this.W = false;
            tje.N(ds31.a(this), null, null, new WebViewViewModelDeprecatedImpl$loadWithAuth$1(this, true, true, null), 3);
            return;
        }
        AppAnalyticsReporter appAnalyticsReporter = this.I;
        gw41 gw41Var = appAnalyticsReporter.v0;
        gw41 gw41Var2 = appAnalyticsReporter.v0;
        ev41 ev41Var = this.U;
        String str2 = ev41Var != null ? ev41Var.a : null;
        Boolean valueOf = Boolean.valueOf(this.T);
        LinkedHashMap t = x4e.t(5, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "page_finished", "url", str);
        if (str2 != null) {
            t.put("pending_redirect_url", str2);
        }
        t.put("is_retrying_with_delay", valueOf);
        gw41Var.a.a("tech.webview.redirect_stall", t);
        if (this.T && com.ybsdk.feature.webview.internal.domain.a.g(str)) {
            gw41Var2.a.a("tech.webview.redirect_stall.retry_failed", x4e.t(2, "url", str, CRLReasonCodeExtension.REASON, "pageFinished_still_setSession_after_retry"));
        }
        ev41 ev41Var2 = this.U;
        if (if8Var.a.p().isEnabled() && ev41Var2 != null && com.ybsdk.feature.webview.internal.domain.a.g(str) && !this.T) {
            this.T = true;
            this.U = null;
            pzt0 pzt0Var = this.S;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.S = null;
            nl91.g(str, null, "Redirect stall retry", null, null, "trigger=pageFinished", null, null, null, null, 2008);
            x0(ev41Var2, "pageFinished");
            return;
        }
        this.U = null;
        pzt0 pzt0Var2 = this.S;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.S = null;
        this.T = false;
        if (if8Var.f() && ((z = this.V) || g)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put("is_current_main_frame_failed", Boolean.valueOf(z));
            linkedHashMap.put("is_set_session", Boolean.valueOf(g));
            gw41Var2.a.a("tech.webview.page_finished.autoretry_skip", linkedHashMap);
            return;
        }
        if (((hu41) X()).b instanceof eu41) {
            return;
        }
        com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
        bVar.d();
        bVar.e(str, null, false);
        if (if8Var.f() && ((hu41) X()).f) {
            gw41Var2.b("pageFinished");
            pz40 Y = Y();
            do {
                r0Var3 = (r0) Y;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, hu41.a((hu41) value3, 0, null, null, false, false, 95)));
            Z(cv41.a);
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, hu41.a((hu41) value, 0, gu41.b, str, false, false, Constants.VPN_TRAFFIC)));
        if (((hu41) X()).e) {
            pz40 Y3 = Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, hu41.a((hu41) value2, 0, null, null, false, false, 111)));
        }
        Z(dv41.a);
    }

    @Override // defpackage.gv41
    public final void r0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        while (true) {
            r0 r0Var2 = (r0) Y;
            Object value2 = r0Var2.getValue();
            String str2 = str;
            if (r0Var2.k(value2, hu41.a((hu41) value2, 0, null, str2, false, false, HProv.PP_PASSWD_TERM))) {
                break;
            } else {
                str = str2;
            }
        }
        if (((hu41) X()).f) {
            this.I.v0.b("pageUpdated");
            pz40 Y2 = Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, hu41.a((hu41) value, 0, null, null, false, false, 95)));
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
        WebViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1 webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1;
        int i;
        gw41 gw41Var;
        String str;
        if (continuationImpl instanceof WebViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1) {
            webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1 = (WebViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1) continuationImpl;
            int i2 = webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gw41 gw41Var2 = this.I.v0;
                    String m = sd90.m(uri);
                    String uri2 = uri.toString();
                    webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$0 = list;
                    webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$1 = gw41Var2;
                    webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$2 = m;
                    webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.label = 1;
                    Object a = this.L.a(uri2, webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1);
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
                    str = (String) webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$2;
                    gw41Var = (gw41) webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$1;
                    list = (List) webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                gw41Var.a(str, (List) obj, list);
                return zy11.a;
            }
        }
        webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1 = new WebViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1(this, continuationImpl);
        Object obj2 = webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewViewModelDeprecatedImpl$reportDataOnEveryMainRequest$1.label;
        if (i != 0) {
        }
        gw41Var.a(str, (List) obj2, list);
        return zy11.a;
    }

    @Override // defpackage.gv41
    public final void t0(String str) {
        ((ab1) this.J.a).a(str);
    }

    @Override // defpackage.gv41
    public final void u0(String str, Map map) {
        this.I.b(str, map);
    }

    @Override // defpackage.gv41
    public final void v0(String str) {
        this.N.a.f(new eh51(str));
    }

    @Override // defpackage.gv41
    public final boolean w0(FragmentActivity fragmentActivity, String str, boolean z) {
        r0 r0Var;
        Object value;
        gw41 gw41Var = this.I.v0;
        ev41 ev41Var = this.U;
        gw41.d(gw41Var, "shouldOverrideUrlLoading", str, null, ev41Var != null ? ev41Var.a : null, 4);
        if (fragmentActivity == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0("shouldOverrideUrlLoading() activity is null", null, str));
            return true;
        }
        WebViewScreenParams.Auth auth = this.C.getAuth();
        WebViewScreenParams.Auth auth2 = WebViewScreenParams.Auth.BNK;
        com.ybsdk.feature.webview.internal.domain.b bVar = this.F;
        if (auth == auth2) {
            bVar.f();
        }
        com.ybsdk.feature.webview.internal.domain.a aVar = this.E;
        if (aVar.f(str)) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, hu41.a((hu41) value, 0, null, null, true, false, 111)));
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
            this.R = ((v0h) e).b;
            return true;
        }
        if (!(e instanceof w0h)) {
            if (!(e instanceof x0h)) {
                w511.b();
                return false;
            }
            boolean G = kotlin.collections.a.G(((DeeplinkAllowedHosts) ((if8) this.K).a.d(a0h.a).getData()).getHosts(), Uri.parse(str).getHost());
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
        return true;
    }

    public final void x0(ev41 ev41Var, String str) {
        this.V = false;
        this.F.k(ds31.a(this), new ec31(20, this), ev41Var, str, null);
        Z(ev41Var);
    }
}
