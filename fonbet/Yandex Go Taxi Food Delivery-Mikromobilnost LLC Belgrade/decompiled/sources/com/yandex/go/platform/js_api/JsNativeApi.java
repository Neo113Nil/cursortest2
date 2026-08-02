package com.yandex.go.platform.js_api;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.yandex.go.platform.js_api.models.JsError;
import defpackage.blv;
import defpackage.ccp0;
import defpackage.ci41;
import defpackage.d5c;
import defpackage.fk;
import defpackage.fp41;
import defpackage.g73;
import defpackage.gw00;
import defpackage.hrv;
import defpackage.i32;
import defpackage.irv;
import defpackage.ivc0;
import defpackage.iyw;
import defpackage.kb;
import defpackage.kob1;
import defpackage.lb20;
import defpackage.mb20;
import defpackage.mdh;
import defpackage.mt71;
import defpackage.n790;
import defpackage.obx;
import defpackage.oyr;
import defpackage.pbx;
import defpackage.qqt;
import defpackage.r7v;
import defpackage.rbh;
import defpackage.sbx;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.ss2;
import defpackage.tax;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uab1;
import defpackage.uax;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.zch;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/platform/js_api/JsNativeApi;", "Lci41;", "", "function", "promiseId", "param1", "param2", "Lzy11;", "invokeCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsNativeApi implements ci41 {
    public final Activity a;
    public final tse b;
    public final com.yandex.go.platform.js_api.contact.b c;
    public final g d;
    public final fk e;
    public final f f;
    public final pbx g;
    public final uax h;
    public final obx i;
    public final h j;
    public final c k;
    public final WebView l;
    public final zch m;
    public final i32 n;
    public final kb o;
    public final ss2 p;
    public final com.yandex.taxi.go_platform.delegates.c q;
    public final lb20 r;
    public final blv s;
    public final ivc0 t;
    public final d5c u;
    public final ccp0 v;
    public final b w;

    public JsNativeApi(Activity activity, tse tseVar, com.yandex.go.platform.js_api.contact.b bVar, g gVar, fk fkVar, f fVar, pbx pbxVar, uax uaxVar, obx obxVar, h hVar, c cVar, WebView webView, zch zchVar, i32 i32Var, kb kbVar, ss2 ss2Var, com.yandex.taxi.go_platform.delegates.c cVar2, lb20 lb20Var, blv blvVar, com.yandex.go.platform.sdk.models.a aVar, ivc0 ivc0Var, d5c d5cVar, ccp0 ccp0Var, List list) {
        this.a = activity;
        this.b = tseVar;
        this.c = bVar;
        this.d = gVar;
        this.e = fkVar;
        this.f = fVar;
        this.g = pbxVar;
        this.h = uaxVar;
        this.i = obxVar;
        this.j = hVar;
        this.k = cVar;
        this.l = webView;
        this.m = zchVar;
        this.n = i32Var;
        this.o = kbVar;
        this.p = ss2Var;
        this.q = cVar2;
        this.r = lb20Var;
        this.s = blvVar;
        this.t = ivc0Var;
        this.u = d5cVar;
        this.v = ccp0Var;
        int i = 0;
        b bVar2 = new b(0);
        this.w = bVar2;
        uab1.a(bVar2, "goplatform.private.systemPermissions.request", new e(this, 10), "permission");
        int i2 = 3;
        uab1.a(bVar2, "goplatform.private.systemPermissions.query", new tax(i2, this), "permission");
        uab1.a(bVar2, "goplatform.private.portalAuth.login", new e(this, 23), new String[0]);
        uab1.a(bVar2, "goplatform.private.portalAuth.getAccountType", new e(this, 24), new String[0]);
        uab1.a(bVar2, "goplatform.private.portalAuth.upgradePhonishAccount", new e(this, 25), "params");
        uab1.a(bVar2, "goplatform.private.portalAuth.logout", new e(this, 26), new String[0]);
        uab1.a(bVar2, "goplatform.private.portalAuth.bindPhone", new e(this, 27), "params");
        int i3 = 7;
        uab1.a(bVar2, "goplatform.app.reportGoalReached", new tax(i3, this), "goal", "attributes");
        uab1.a(bVar2, "goplatform.app.onWebViewReady", new e(this, 28), new String[0]);
        uab1.a(bVar2, "goplatform.app.openLinkInNewWindow", new e(this, i), "url");
        int i4 = 1;
        uab1.a(bVar2, "goplatform.app.navigateToFeature", new e(this, i4), "url");
        int i5 = 2;
        uab1.a(bVar2, "goplatform.app.openLinkInBrowser", new e(this, i5), "url");
        uab1.a(bVar2, "goplatform.app.popToMainWindow", new e(this, i2), new String[0]);
        int i6 = 4;
        uab1.a(bVar2, "goplatform.private.portalAuth.getUserInfo", new e(this, i6), new String[0]);
        int i7 = 5;
        uab1.a(bVar2, "goplatform.private.user.getDeviceId", new e(this, i7), new String[0]);
        int i8 = 6;
        uab1.a(bVar2, "goplatform.private.user.getUUID", new e(this, i8), new String[0]);
        uab1.a(bVar2, "goplatform.private.portalAuth.updateSession", new e(this, i3), new String[0]);
        uab1.a(bVar2, "goplatform.private.payments.supportsProfiles", new e(this, 8), new String[0]);
        uab1.a(bVar2, "goplatform.private.payments.bind", new e(this, 9), "params");
        uab1.a(bVar2, "goplatform.private.payments.unbind", new e(this, 11), "params");
        uab1.a(bVar2, "goplatform.private.payments.verify", new e(this, 12), "params");
        uab1.a(bVar2, "goplatform.private.payments.googlePayCanMakePayment", new tax(i, this), "params");
        uab1.a(bVar2, "goplatform.private.storage.read", new e(this, 13), "key");
        uab1.a(bVar2, "goplatform.private.storage.save", new e(this, 14), "key", "value");
        uab1.a(bVar2, "goplatform.app.sendAdjustEvent", new tax(i4, this), "param1", "param2");
        uab1.a(bVar2, "goplatform.app.contacts.choose", new e(this, 15), "params");
        uab1.a(bVar2, "goplatform.app.requestUserRating", new e(this, 16), new String[0]);
        uab1.a(bVar2, "goplatform.app.sendPerformanceEvent", new tax(i5, this), "param1", "param2");
        uab1.a(bVar2, "goplatform.app.forceUpdate", new e(this, 17), new String[0]);
        uab1.a(bVar2, "goplatform.app.requestOpenSettingsMenu", new e(this, 18), new String[0]);
        uab1.a(bVar2, "goplatform.private.push.getPushToken", new e(this, 19), new String[0]);
        uab1.a(bVar2, "goplatform.app.shareContent", new tax(i6, this), "param1", "param2");
        uab1.a(bVar2, "goplatform.app.saveContent", new tax(i7, this), "params");
        uab1.a(bVar2, "goplatform.private.setGeoPoint", new e(this, 20), "params");
        uab1.a(bVar2, "goplatform.app.requestShareMethod", new tax(i8, this), "param1");
        for (final qqt qqtVar : kotlin.collections.a.J0(aVar.a)) {
            iyw iywVar = new iyw() { // from class: com.yandex.go.platform.js_api.d
                @Override // defpackage.iyw
                public final void a(String str, String[] strArr) {
                    JsNativeApi jsNativeApi = JsNativeApi.this;
                    tse tseVar2 = jsNativeApi.b;
                    sjh sjhVar = uyj.a;
                    tje.N(tseVar2, mdh.b, null, new JsNativeApi$36$consumer$1$1(qqtVar, strArr, jsNativeApi, str, null), 2);
                }
            };
            b bVar3 = this.w;
            qqtVar.getClass();
            String[] strArr = qqtVar.a;
            uab1.a(bVar3, "goplatform.app.disableGPModeInTaxiApp", iywVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        this.e.getClass();
        uab1.a(this.w, "goplatform.private.portalAuth.getAuthToken", new e(this, 21), new String[0]);
        uab1.a(this.w, "goplatform.app.close", new e(this, 22), new String[0]);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    public static final void a(JsNativeApi jsNativeApi, String str, String str2, JsError jsError) {
        jsNativeApi.getClass();
        String a = i.a(str2, sbx.d.c(jsError, JsError.Companion.serializer()), false);
        Pair pair = new Pair("name", str);
        String message = jsError.getMessage();
        if (message == null) {
            message = "";
        }
        jsNativeApi.n.a("Transport.ScriptFunctionResult", kotlin.collections.b.i(pair, new Pair("error_msg", message)));
        jsNativeApi.g(a);
    }

    public static final JsError c(JsNativeApi jsNativeApi, Throwable th) {
        jsNativeApi.getClass();
        if (th instanceof JsError) {
            return (JsError) th;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return new JsError("UnknownError", message);
    }

    @Override // defpackage.ci41
    public final void b(n790 n790Var) {
    }

    public final void d() {
        kb kbVar = this.o;
        rbh[] rbhVarArr = {new rbh("--app-main-color", kob1.c(kbVar.a), 4), new rbh("--app-button-text-color", kob1.c(kbVar.b), 4), new rbh("--app-pin-color", kob1.c(kbVar.c), 4)};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            rbh rbhVar = rbhVarArr[i];
            sb.append("document.documentElement.style.setProperty(\"" + rbhVar.b + "\", \"" + rbhVar.c + "\");");
        }
        String sb2 = sb.toString();
        g(sb2);
        tje.N(this.b, null, null, new JsNativeApi$applyJsPageStyle$1(this, sb2, null), 3);
    }

    public final void e(String str, String str2, Object obj, KSerializer kSerializer, boolean z) {
        String p;
        String c = obj != null ? sbx.d.c(obj, kSerializer) : null;
        if (c == null) {
            c = "";
        }
        if (c.length() > 0) {
            p = "handlePromiseResult(\"" + str2 + "\", " + c + ')';
        } else {
            p = oyr.p("handlePromiseResult(\"", str2, "\")");
        }
        this.n.a("Transport.ScriptFunctionResult", kotlin.collections.b.i(new Pair("name", str), new Pair("params", z ? kotlin.collections.b.f() : obj instanceof String ? com.yandex.go.platform.utils.b.a((String) obj) : c.length() > 0 ? com.yandex.go.platform.utils.b.a(c) : kotlin.collections.b.f())));
        g(p);
    }

    public final void f(String str, String str2, String str3) {
        this.n.a("Transport.ScriptFunctionResult", kotlin.collections.b.s(scc.i(new Pair("name", str), new Pair("error_msg", str3))));
        g(i.a(str2, str3, true));
    }

    public final void g(String str) {
        this.l.post(new r7v(15, this, str));
    }

    @JavascriptInterface
    public final void invokeCode(String function, String promiseId, String param1, String param2) {
        String[] strArr;
        iyw c = this.w.c(function);
        if (param2 != null) {
            if (param1 == null) {
                param1 = "";
            }
            strArr = new String[]{param1, param2};
        } else {
            strArr = param1 != null ? new String[]{param1} : new String[0];
        }
        Pair pair = new Pair("name", function);
        i32 i32Var = this.n;
        i32Var.getClass();
        Objects.toString(pair);
        Arrays.asList(strArr).toString();
        g73 O0 = kotlin.collections.a.O0(Arrays.asList(strArr));
        int d = gw00.d(tcc.n(O0, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = O0.iterator();
        while (true) {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(pair.c(), pair.f());
                linkedHashMap2.toString();
                ((mb20) i32Var.a).b("Transport.ScriptFunctionCall", linkedHashMap2);
                c.a(promiseId, strArr);
                return;
            }
            hrv hrvVar = (hrv) irvVar.next();
            Pair pair2 = new Pair("param" + (hrvVar.a + 1), hrvVar.b);
            linkedHashMap.put(pair2.c(), pair2.f());
        }
    }

    @Override // defpackage.ci41
    public final void onPageFinished(String str) {
        lb20 lb20Var = this.r;
        WebView webView = this.l;
        webView.evaluateJavascript("window.goPlatformPromises", new fp41(lb20Var, webView, this.w, "PageFinished"));
        d();
    }

    @Override // defpackage.ci41
    public final void onPageStarted(String str) {
        if (mt71.l(str).equals(this.p.c)) {
            lb20 lb20Var = this.r;
            WebView webView = this.l;
            webView.evaluateJavascript("window.goPlatformPromises", new fp41(lb20Var, webView, this.w, "PageStarted"));
            final sls slsVar = new sls() { // from class: com.yandex.go.platform.js_api.JsNativeApi$onPageStarted$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    JsNativeApi jsNativeApi = JsNativeApi.this;
                    WebView webView2 = jsNativeApi.l;
                    webView2.evaluateJavascript("window.goPlatformPromises", new fp41(jsNativeApi.r, webView2, jsNativeApi.w, "PageReadyToRender"));
                    return zy11.a;
                }
            };
            final long j = 43;
            webView.postVisualStateCallback(43L, new WebView.VisualStateCallback() { // from class: com.yandex.go.platform.utils.WebViewExtKt$doOnReadyToRender$1
                @Override // android.webkit.WebView.VisualStateCallback
                public void onComplete(long completeRequestId) {
                    if (j == completeRequestId) {
                        slsVar.invoke();
                    }
                }
            });
            final sls slsVar2 = new sls() { // from class: com.yandex.go.platform.js_api.JsNativeApi$onPageStarted$2
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    JsNativeApi.this.d();
                    return zy11.a;
                }
            };
            final long j2 = 42;
            webView.postVisualStateCallback(42L, new WebView.VisualStateCallback() { // from class: com.yandex.go.platform.utils.WebViewExtKt$doOnReadyToRender$1
                @Override // android.webkit.WebView.VisualStateCallback
                public void onComplete(long completeRequestId) {
                    if (j2 == completeRequestId) {
                        slsVar2.invoke();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2, String str3) {
        invokeCode(str, str2, str3, null);
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2) {
        invokeCode(str, str2, null, null);
    }
}
