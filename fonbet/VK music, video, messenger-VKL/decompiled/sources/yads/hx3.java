package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class hx3 extends ka {
    public WebView g;
    public Long h;
    public final Map i;
    public final String j;

    public hx3(String str, String str2, Map map) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    @Override // yads.ka
    public final void b() {
        this.b.clear();
        new Handler().postDelayed(new dx3(this), Math.max(4000 - (this.h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // yads.ka
    public final void c() {
        WebView webView = new WebView(jy3.b.a);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(new cx3(this));
        this.b = new lx3(this.g);
        my3.a(this.g, this.j);
        for (String str : this.i.keySet()) {
            String externalForm = ((qe3) this.i.get(str)).b.toExternalForm();
            WebView webView2 = this.g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                my3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.h = Long.valueOf(System.nanoTime());
    }

    @Override // yads.ka
    public final void a(ax3 ax3Var, ia iaVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(iaVar.d);
        for (String str : unmodifiableMap.keySet()) {
            qe3 qe3Var = (qe3) unmodifiableMap.get(str);
            qe3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            px3.a(jSONObject2, "vendorKey", qe3Var.a);
            px3.a(jSONObject2, "resourceUrl", qe3Var.b.toString());
            px3.a(jSONObject2, "verificationParameters", qe3Var.c);
            px3.a(jSONObject, str, jSONObject2);
        }
        a(ax3Var, iaVar, jSONObject);
    }
}
