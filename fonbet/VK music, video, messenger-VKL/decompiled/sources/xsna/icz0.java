package xsna;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.r3y0;

/* loaded from: classes11.dex */
public final class icz0 {
    public final gau a;
    public final bpn0 b = new bpn0(new ru.rustore.sdk.metrics.internal.p(this));

    public icz0(gau gauVar, zle0 zle0Var, r3y0.a aVar) {
        this.a = gauVar;
    }

    public final String a(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l690 l690Var = (l690) it.next();
            String str = l690Var.c;
            jl20 jl20Var = l690Var.e;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", jl20Var.a);
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", l690Var.a);
            String str2 = l690Var.d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put("appVersion", str2);
            jSONObject3.put("userIdSdk", str);
            jSONObject3.put("time", String.valueOf(jl20Var.c));
            for (Map.Entry<String, String> entry : jl20Var.b.entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            jSONArray.put(new JSONObject(jSONObject2.toString()));
        }
        jSONObject.put("events", jSONArray);
        return jSONObject.toString();
    }

    public final HttpsURLConnection b() {
        bpn0 bpn0Var = this.b;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URL) bpn0Var.getValue()).openConnection();
        final URL url = (URL) bpn0Var.getValue();
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: xsna.ccz0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return str.equals(url.getHost());
            }
        });
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
