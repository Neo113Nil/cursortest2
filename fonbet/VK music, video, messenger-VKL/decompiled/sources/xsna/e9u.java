package xsna;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GoogleDns.kt */
/* loaded from: classes6.dex */
public final class e9u {

    /* compiled from: GoogleDns.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final String a() {
            String str = this.b;
            if (drm0.d0(str, '\"') && drm0.G(str, '\"')) {
                str = str.substring(1, drm0.H(str));
            }
            return drm0.D(str, "\"\"", false) ? brm0.y(str, "\"\"", "") : str;
        }

        public final int b() {
            return this.a * 1000;
        }
    }

    public static a a() throws IOException {
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("dns.google.com").appendPath("resolve");
        appendPath.appendQueryParameter("name", "api._endpoint.mycdn.me.");
        appendPath.appendQueryParameter("type", String.valueOf(16));
        URLConnection openConnection = new URL(appendPath.toString()).openConnection();
        openConnection.setConnectTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        openConnection.setReadTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openConnection.getInputStream(), emb.b), 8192);
        try {
            String b = a0a.b(bufferedReader);
            bufferedReader.close();
            try {
                JSONObject jSONObject = new JSONObject(b).getJSONArray("Answer").getJSONObject(0);
                jSONObject.getString("name");
                jSONObject.getInt("type");
                return new a(jSONObject.getInt("TTL"), jSONObject.getString("data"));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
        }
    }
}
