package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import yads.rt3;

/* loaded from: classes7.dex */
public final class gq81 extends o971 {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public gq81(String str, Map map, String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // defpackage.o971
    public final void a() {
        this.b.clear();
        new Handler().postDelayed(new fst(this), Math.max(4000 - (this.h == null ? 4000L : (System.nanoTime() - this.h.longValue()) / 1000000), 2000L));
        this.g = null;
    }

    @Override // defpackage.o971
    public final void c(j681 j681Var, hlx0 hlx0Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) hlx0Var.w);
        for (String str : unmodifiableMap.keySet()) {
            s181 s181Var = (s181) unmodifiableMap.get(str);
            s181Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            y471.c(jSONObject2, "vendorKey", s181Var.a);
            y471.c(jSONObject2, "resourceUrl", s181Var.b.toString());
            y471.c(jSONObject2, "verificationParameters", s181Var.c);
            y471.c(jSONObject, str, jSONObject2);
        }
        d(j681Var, hlx0Var, jSONObject);
    }

    @Override // defpackage.o971
    public final void e() {
        WebView webView = new WebView(lt81.b.a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new rt3(this));
        this.b = new pj61(this.g);
        vj61.a(this.g, this.j);
        Map map = this.i;
        for (String str : map.keySet()) {
            String externalForm = ((s181) map.get(str)).b.toExternalForm();
            WebView webView2 = this.g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                vj61.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.h = Long.valueOf(System.nanoTime());
    }
}
