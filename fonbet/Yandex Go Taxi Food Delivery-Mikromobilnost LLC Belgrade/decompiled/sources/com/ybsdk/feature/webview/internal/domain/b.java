package com.ybsdk.feature.webview.internal.domain;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewLoadingResultResult;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewStatusCheckResultResult;
import defpackage.awa0;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.ev41;
import defpackage.g8e;
import defpackage.gw41;
import defpackage.if8;
import defpackage.lu41;
import defpackage.lv41;
import defpackage.ly3;
import defpackage.mgr0;
import defpackage.mu41;
import defpackage.nl91;
import defpackage.nu41;
import defpackage.ny61;
import defpackage.ou41;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.um41;
import defpackage.uza;
import defpackage.w511;
import defpackage.x4e;
import defpackage.y5e;
import defpackage.zva0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b {
    public final awa0 a;
    public final Map b;
    public final AppAnalyticsReporter c;
    public final um41 d;
    public zva0 e;
    public zva0 f;
    public zva0 g;
    public Long h;
    public pzt0 i;

    public b(awa0 awa0Var, Map map, AppAnalyticsReporter appAnalyticsReporter, um41 um41Var) {
        this.a = awa0Var;
        this.b = map;
        this.c = appAnalyticsReporter;
        this.d = um41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, tse tseVar, String str, String str2, String str3, long j, long j2, sls slsVar, sls slsVar2, ContinuationImpl continuationImpl) {
        WebPerformanceReporter$runStatusCheckAfterLoad$1 webPerformanceReporter$runStatusCheckAfterLoad$1;
        int i;
        String str4;
        String str5;
        long j3;
        long j4;
        sls slsVar3;
        String str6;
        sls slsVar4;
        ou41 ou41Var;
        boolean z;
        WebviewEvents$TechWebviewStatusCheckResultResult webviewEvents$TechWebviewStatusCheckResultResult;
        lu41 lu41Var;
        Object message;
        Throwable th;
        bVar.getClass();
        if (continuationImpl instanceof WebPerformanceReporter$runStatusCheckAfterLoad$1) {
            webPerformanceReporter$runStatusCheckAfterLoad$1 = (WebPerformanceReporter$runStatusCheckAfterLoad$1) continuationImpl;
            int i2 = webPerformanceReporter$runStatusCheckAfterLoad$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webPerformanceReporter$runStatusCheckAfterLoad$1.label = i2 - Integer.MIN_VALUE;
                WebPerformanceReporter$runStatusCheckAfterLoad$1 webPerformanceReporter$runStatusCheckAfterLoad$12 = webPerformanceReporter$runStatusCheckAfterLoad$1;
                Object obj = webPerformanceReporter$runStatusCheckAfterLoad$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webPerformanceReporter$runStatusCheckAfterLoad$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webPerformanceReporter$runStatusCheckAfterLoad$12.L$0 = str;
                    str4 = str2;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.L$1 = str4;
                    str5 = str3;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.L$2 = str5;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.L$3 = slsVar;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.L$4 = slsVar2;
                    j3 = j;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.J$0 = j3;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.J$1 = j2;
                    webPerformanceReporter$runStatusCheckAfterLoad$12.label = 1;
                    if (bVar.l(tseVar, j2, slsVar, webPerformanceReporter$runStatusCheckAfterLoad$12) == obj2) {
                        return obj2;
                    }
                    j4 = j2;
                    slsVar3 = slsVar;
                    str6 = str;
                    slsVar4 = slsVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = webPerformanceReporter$runStatusCheckAfterLoad$12.J$1;
                    long j5 = webPerformanceReporter$runStatusCheckAfterLoad$12.J$0;
                    slsVar4 = (sls) webPerformanceReporter$runStatusCheckAfterLoad$12.L$4;
                    slsVar3 = (sls) webPerformanceReporter$runStatusCheckAfterLoad$12.L$3;
                    str5 = (String) webPerformanceReporter$runStatusCheckAfterLoad$12.L$2;
                    String str7 = (String) webPerformanceReporter$runStatusCheckAfterLoad$12.L$1;
                    str6 = (String) webPerformanceReporter$runStatusCheckAfterLoad$12.L$0;
                    kotlin.b.b(obj);
                    j3 = j5;
                    str4 = str7;
                }
                ou41Var = (ou41) slsVar3.invoke();
                long currentTimeMillis = System.currentTimeMillis();
                z = ou41Var instanceof nu41;
                if (!z) {
                    webviewEvents$TechWebviewStatusCheckResultResult = WebviewEvents$TechWebviewStatusCheckResultResult.OK;
                } else if (ou41Var instanceof mu41) {
                    webviewEvents$TechWebviewStatusCheckResultResult = WebviewEvents$TechWebviewStatusCheckResultResult.LOADING;
                } else {
                    if (!(ou41Var instanceof lu41)) {
                        w511.b();
                        return null;
                    }
                    webviewEvents$TechWebviewStatusCheckResultResult = WebviewEvents$TechWebviewStatusCheckResultResult.ERROR;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("retpath=");
                    sb.append(str5);
                    sb.append(" ; resultStatus=");
                    sb.append(webviewEvents$TechWebviewStatusCheckResultResult);
                    sb.append(" ; urlSource=");
                    ly3.y(j3, str4, " ; startTimeMs=", sb);
                    lu41Var = null;
                    x4e.A(currentTimeMillis, " ; endTimeMs=", " ; statusCheckTimeoutMs=", sb);
                    sb.append(j4);
                    nl91.g(str6, null, "Problems with WebView loading", null, null, sb.toString(), null, null, null, null, 2008);
                } else {
                    lu41Var = null;
                }
                gw41 gw41Var = bVar.c.v0;
                String valueOf = String.valueOf(j3);
                String valueOf2 = String.valueOf(currentTimeMillis);
                lu41 lu41Var2 = !(ou41Var instanceof lu41) ? (lu41) ou41Var : lu41Var;
                message = (lu41Var2 != null || (th = lu41Var2.a) == null) ? lu41Var : th.getMessage();
                LinkedHashMap t = x4e.t(7, "url", str6, "url_source", str4);
                if (str5 != null) {
                    t.put("retpath", str5);
                }
                t.put("start_time_ms", valueOf);
                t.put("end_time_ms", valueOf2);
                t.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechWebviewStatusCheckResultResult.getOriginalValue());
                if (message != null) {
                    t.put("error", message);
                }
                gw41Var.a.a("tech.webview.status_check.result", t);
                if ((ou41Var instanceof mu41) && slsVar4 != null) {
                    slsVar4.invoke();
                }
                return zy11.a;
            }
        }
        webPerformanceReporter$runStatusCheckAfterLoad$1 = new WebPerformanceReporter$runStatusCheckAfterLoad$1(bVar, continuationImpl);
        WebPerformanceReporter$runStatusCheckAfterLoad$1 webPerformanceReporter$runStatusCheckAfterLoad$122 = webPerformanceReporter$runStatusCheckAfterLoad$1;
        Object obj3 = webPerformanceReporter$runStatusCheckAfterLoad$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webPerformanceReporter$runStatusCheckAfterLoad$122.label;
        if (i != 0) {
        }
        ou41Var = (ou41) slsVar3.invoke();
        long currentTimeMillis2 = System.currentTimeMillis();
        z = ou41Var instanceof nu41;
        if (!z) {
        }
        if (z) {
        }
        gw41 gw41Var2 = bVar.c.v0;
        String valueOf3 = String.valueOf(j3);
        String valueOf22 = String.valueOf(currentTimeMillis2);
        if (!(ou41Var instanceof lu41)) {
        }
        if (lu41Var2 != null) {
        }
        LinkedHashMap t2 = x4e.t(7, "url", str6, "url_source", str4);
        if (str5 != null) {
        }
        t2.put("start_time_ms", valueOf3);
        t2.put("end_time_ms", valueOf22);
        t2.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechWebviewStatusCheckResultResult.getOriginalValue());
        if (message != null) {
        }
        gw41Var2.a.a("tech.webview.status_check.result", t2);
        if (ou41Var instanceof mu41) {
            slsVar4.invoke();
        }
        return zy11.a;
    }

    public final String b(String str, String str2) {
        if (str2 == null) {
            return "Data.LoadTime.WebView.".concat(str);
        }
        for (Map.Entry entry : this.b.entrySet()) {
            Regex regex = (Regex) entry.getKey();
            String str3 = (String) entry.getValue();
            if (regex.a(str2)) {
                return b64.l("Data.LoadTime.WebView.", str, Extension.DOT_CHAR, str3);
            }
        }
        return oyr.p("Data.LoadTime.WebView.", str, ".default");
    }

    public final void c() {
        zva0 zva0Var = this.f;
        Long valueOf = zva0Var != null ? Long.valueOf(zva0Var.a()) : null;
        this.f = null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            this.c.v0.a.a("tech.webview.passport_loading.finished", g8e.w(1, "duration", String.valueOf(longValue)));
        }
    }

    public final void d() {
        zva0 zva0Var = this.g;
        Long valueOf = zva0Var != null ? Long.valueOf(zva0Var.a()) : null;
        this.g = null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            this.c.v0.a.a("tech.webview.target_page_loading.finished", g8e.w(1, "duration", String.valueOf(longValue)));
        }
    }

    public final void e(String str, String str2, boolean z) {
        Long l = this.h;
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            awa0 awa0Var = this.a;
            if (z) {
                awa0Var.a(currentTimeMillis, b("Error", str));
            } else {
                awa0Var.a(currentTimeMillis, b("FullTime", str));
            }
            gw41 gw41Var = this.c.v0;
            String valueOf = String.valueOf(currentTimeMillis);
            WebviewEvents$TechWebviewLoadingResultResult webviewEvents$TechWebviewLoadingResultResult = z ? WebviewEvents$TechWebviewLoadingResultResult.ERROR : WebviewEvents$TechWebviewLoadingResultResult.OK;
            LinkedHashMap t = x4e.t(5, "duration", valueOf, "url", str);
            t.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechWebviewLoadingResultResult.getOriginalValue());
            if (str2 != null) {
                t.put("error", str2);
            }
            gw41Var.a.a("tech.webview.loading.result", t);
        }
        this.h = null;
    }

    public final void f() {
        zva0 zva0Var = this.e;
        Long valueOf = zva0Var != null ? Long.valueOf(zva0Var.a()) : null;
        this.e = null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            gw41 gw41Var = this.c.v0;
            LinkedHashMap w = g8e.w(1, "duration", String.valueOf(longValue));
            com.ybsdk.core.analytics.a aVar = gw41Var.a;
            byte[] bArr = y5e.U;
            byte[] bArr2 = new byte[45];
            for (int i = 0; i < 45; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            aVar.a(new String(bArr2, uza.a), w);
        }
    }

    public final void g() {
        if (this.e == null) {
            this.e = new zva0(this.a, "Data.LoadTime.WebView.".concat("BankAuthProxy"));
            com.ybsdk.core.analytics.a aVar = this.c.v0.a;
            byte[] bArr = y5e.p;
            byte[] bArr2 = new byte[46];
            for (int i = 0; i < 46; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            aVar.a(new String(bArr2, uza.a), null);
        }
    }

    public final void h() {
        if (this.f == null) {
            this.f = new zva0(this.a, "Data.LoadTime.WebView.".concat("PassportLoading"));
            this.c.v0.a.a("tech.webview.passport_loading.initiated", null);
        }
    }

    public final void i(String str, Boolean bool) {
        if (this.g == null) {
            this.g = new zva0(this.a, b("Loading", str));
            gw41 gw41Var = this.c.v0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("identical_query_params", bool);
            gw41Var.a.a("tech.webview.target_page_loading.initiated", linkedHashMap);
        }
    }

    public final void j(String str) {
        this.h = Long.valueOf(System.currentTimeMillis());
        gw41 gw41Var = this.c.v0;
        gw41Var.a.a("tech.webview.loading.initiated", g8e.w(1, "url", str));
    }

    public final void k(tse tseVar, sls slsVar, ev41 ev41Var, String str, lv41 lv41Var) {
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        Long statusCheckTimeoutMs = ((if8) this.d).a.p().getStatusCheckTimeoutMs();
        long longValue = statusCheckTimeoutMs != null ? statusCheckTimeoutMs.longValue() : 15000L;
        String str2 = ev41Var.a;
        if (longValue <= 0) {
            nl91.g(str2, null, "WebView has no statusCheckTimeoutMs", null, null, null, null, null, null, null, 2040);
            return;
        }
        String str3 = (String) ev41Var.b.get("x-retpath");
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = str == null ? "NO_URL_SOURCE" : str;
        gw41 gw41Var = this.c.v0;
        String valueOf = String.valueOf(currentTimeMillis);
        LinkedHashMap t = x4e.t(4, "url", str2, "url_source", str4);
        if (str3 != null) {
            t.put("retpath", str3);
        }
        t.put("start_time_ms", valueOf);
        gw41Var.a.a("tech.webview.status_check.start", t);
        pzt0 N = tje.N(tseVar, null, null, new WebPerformanceReporter$startWebViewStatusCheck$1(this, str2, str4, str3, currentTimeMillis, longValue, slsVar, lv41Var, null), 3);
        N.w(new mgr0(this, str2, str4, str3, currentTimeMillis, 2));
        this.i = N;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:11:0x005e->B:22:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(tse tseVar, long j, sls slsVar, ContinuationImpl continuationImpl) {
        WebPerformanceReporter$waitUntilNonLoadingOrTimeout$1 webPerformanceReporter$waitUntilNonLoadingOrTimeout$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long currentTimeMillis;
        tse tseVar2;
        long longValue;
        if (continuationImpl instanceof WebPerformanceReporter$waitUntilNonLoadingOrTimeout$1) {
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1 = (WebPerformanceReporter$waitUntilNonLoadingOrTimeout$1) continuationImpl;
            int i2 = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    currentTimeMillis = System.currentTimeMillis() + j;
                    Long statusCheckPollIntervalMs = ((if8) this.d).a.p().getStatusCheckPollIntervalMs();
                    tseVar2 = tseVar;
                    longValue = statusCheckPollIntervalMs != null ? statusCheckPollIntervalMs.longValue() : 16L;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    longValue = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$1;
                    long j2 = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$0;
                    slsVar = (sls) webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$1;
                    tse tseVar3 = (tse) webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$0;
                    kotlin.b.b(obj);
                    currentTimeMillis = j2;
                    tseVar2 = tseVar3;
                }
                while (bvf0.D(tseVar2) && (slsVar.invoke() instanceof mu41) && System.currentTimeMillis() < currentTimeMillis) {
                    webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$0 = tseVar2;
                    webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$1 = slsVar;
                    webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$0 = currentTimeMillis;
                    webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$1 = longValue;
                    webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label = 1;
                    if (kotlinx.coroutines.a.i(longValue, webPerformanceReporter$waitUntilNonLoadingOrTimeout$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        webPerformanceReporter$waitUntilNonLoadingOrTimeout$1 = new WebPerformanceReporter$waitUntilNonLoadingOrTimeout$1(this, continuationImpl);
        Object obj2 = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label;
        if (i != 0) {
        }
        while (bvf0.D(tseVar2)) {
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$0 = tseVar2;
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.L$1 = slsVar;
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$0 = currentTimeMillis;
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.J$1 = longValue;
            webPerformanceReporter$waitUntilNonLoadingOrTimeout$1.label = 1;
            if (kotlinx.coroutines.a.i(longValue, webPerformanceReporter$waitUntilNonLoadingOrTimeout$1) != coroutineSingletons) {
            }
        }
        return zy11.a;
    }
}
