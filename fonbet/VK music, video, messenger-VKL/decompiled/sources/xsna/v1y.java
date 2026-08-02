package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.bridges.MethodScope;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;
import xsna.bex0;
import xsna.pgn0;
import xsna.wwu0;

/* compiled from: JsAndroidBridge.kt */
/* loaded from: classes6.dex */
public class v1y extends bt6 implements f7y {
    public Context l;
    public Context m;
    public fgx0 n;
    public final x8 o;

    public v1y(MethodScope methodScope) {
        super(methodScope);
        this.o = new x8(this, 28);
    }

    public w25 D() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        return wdx0Var.c();
    }

    public VkAuthCredentials E() {
        return null;
    }

    public final void F() {
        xgx0.a.getClass();
        xgx0.b("Not available for internal apps");
        bex0.a.a(this, JsApiMethodType.GET_SILENT_TOKEN, VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, null, 60);
    }

    public final void G(fgx0 fgx0Var) {
        this.n = fgx0Var;
        Context context = fgx0Var != null ? fgx0Var.a.getContext() : null;
        this.l = context;
        if (context != null) {
            this.m = context.getApplicationContext();
        }
        WebViewClient webViewClient = fgx0Var != null ? fgx0Var.b : null;
        if (webViewClient instanceof dir0) {
            this.e = ((dir0) webViewClient).b.a;
        }
    }

    @JavascriptInterface
    @SuppressLint({"CheckResult"})
    public void VKWebAppGetAuthToken(String str) {
        if (u(JsApiMethodType.GET_AUTH_TOKEN, str)) {
            JSONObject jSONObject = new JSONObject(str);
            final long optLong = jSONObject.optLong("app_id", 0L);
            final String optString = jSONObject.optString(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "");
            final String optString2 = jSONObject.optString("redirect_url", "https://" + "oauth.".concat(a0a.d) + "/blank.html");
            qro0.c(new gzs() { // from class: xsna.u1y
                @Override // xsna.gzs
                public final Object invoke() {
                    v1y v1yVar = v1y.this;
                    w25 D = v1yVar.D();
                    String str2 = D.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    String str4 = D.c;
                    WebView r = v1yVar.r();
                    String url = r != null ? r.getUrl() : null;
                    long j = optLong;
                    String str5 = optString;
                    wwu0 a = wwu0.a.a(str3, str4, j, str5, optString2, url, null, false, 1984);
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    vdx0Var.a().d(a, null).subscribe(new zm6(1, str5, v1yVar), v1yVar.o);
                    return s3q0.a;
                }
            });
        }
    }

    @JavascriptInterface
    public void VKWebAppGetSilentToken(String str) {
        F();
    }

    @JavascriptInterface
    public void VKWebAppOAuthActivate(String str) {
        F();
    }

    @JavascriptInterface
    public void VKWebAppOAuthDeactivate(String str) {
        F();
    }

    @Override // xsna.bt6
    public final fgx0 s() {
        return this.n;
    }
}
