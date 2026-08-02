package yads;

import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class ka {
    public final String a;
    public lx3 b;
    public e4 c;
    public jm1 d;
    public int e;
    public long f;

    public ka(String str) {
        a();
        this.a = str;
        this.b = new lx3(null);
    }

    public final void a(WebView webView) {
        this.b = new lx3(webView);
    }

    public void b() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        my3.a.a((WebView) this.b.get(), "publishMediaEvent", str, jSONObject, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ha haVar) {
        my3 my3Var = my3.a;
        WebView webView = (WebView) this.b.get();
        String str = this.a;
        JSONObject jSONObject = new JSONObject();
        px3.a(jSONObject, "impressionOwner", haVar.a);
        px3.a(jSONObject, "mediaEventsOwner", haVar.b);
        px3.a(jSONObject, "creativeType", haVar.d);
        px3.a(jSONObject, "impressionType", haVar.e);
        px3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(haVar.c));
        my3Var.a(webView, "init", jSONObject, str);
    }

    public void a(ax3 ax3Var, ia iaVar) {
        a(ax3Var, iaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ax3 ax3Var, ia iaVar, JSONObject jSONObject) {
        String str = ax3Var.h;
        JSONObject jSONObject2 = new JSONObject();
        px3.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        px3.a(jSONObject2, "adSessionType", iaVar.h);
        px3.a(jSONObject2, "deviceInfo", ix3.a());
        px3.a(jSONObject2, "deviceCategory", gg0.a(ww3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        px3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        px3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, iaVar.a.a);
        px3.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, iaVar.a.b);
        px3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        px3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        px3.a(jSONObject4, "appId", jy3.b.a.getApplicationContext().getPackageName());
        px3.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        String str2 = iaVar.g;
        if (str2 != null) {
            px3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = iaVar.f;
        if (str3 != null) {
            px3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (qe3 qe3Var : Collections.unmodifiableList(iaVar.c)) {
            px3.a(jSONObject5, qe3Var.a, qe3Var.c);
        }
        my3.a.a((WebView) this.b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a() {
        this.f = System.nanoTime();
        this.e = 1;
    }

    public void c() {
    }
}
