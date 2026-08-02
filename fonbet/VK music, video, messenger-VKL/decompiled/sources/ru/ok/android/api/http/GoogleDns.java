package ru.ok.android.api.http;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.commons.os.AutoTraceCompat;
import xsna.a0a;
import xsna.brm0;
import xsna.drm0;
import xsna.emb;

/* compiled from: GoogleDns.kt */
/* loaded from: classes9.dex */
public final class GoogleDns {
    private static final int CONNECT_TIMEOUT = 3000;
    public static final GoogleDns INSTANCE = new GoogleDns();
    private static final int READ_TIMEOUT = 3000;

    /* compiled from: GoogleDns.kt */
    public static final class Answer {
        private final String data;
        private final String name;
        private final int ttl;
        private final int type;

        public Answer(String str, int i, int i2, String str2) {
            this.name = str;
            this.type = i;
            this.ttl = i2;
            this.data = str2;
        }

        public final String getData() {
            return this.data;
        }

        public final String getDataUnquoted() {
            String str = this.data;
            if (drm0.d0(str, '\"') && drm0.G(str, '\"')) {
                str = str.substring(1, drm0.H(str));
            }
            return drm0.D(str, "\"\"", false) ? brm0.y(str, "\"\"", "") : str;
        }

        public final String getName() {
            return this.name;
        }

        public final int getTtlMillis() {
            return this.ttl * 1000;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* compiled from: GoogleDns.kt */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int TXT = 16;

        /* compiled from: GoogleDns.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int TXT = 16;

            private Companion() {
            }
        }
    }

    private GoogleDns() {
    }

    @AutoTraceCompat
    private final String fetch(String str) throws IOException {
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.setConnectTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        openConnection.setReadTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openConnection.getInputStream(), emb.b), 8192);
        try {
            String b = a0a.b(bufferedReader);
            bufferedReader.close();
            return b;
        } finally {
        }
    }

    @AutoTraceCompat
    private final Answer parse(String str) throws IOException {
        try {
            return parse(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static /* synthetic */ Answer resolve$default(GoogleDns googleDns, String str, int i, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return googleDns.resolve(str, i, str2);
    }

    @AutoTraceCompat
    public final Answer resolve(String str, int i) throws IOException {
        return resolve$default(this, str, i, null, 4, null);
    }

    @AutoTraceCompat
    public final Answer resolve(String str, int i, String str2) throws IOException {
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("dns.google.com").appendPath("resolve");
        appendPath.appendQueryParameter("name", str);
        appendPath.appendQueryParameter("type", String.valueOf(i));
        if (str2 != null) {
            appendPath.appendQueryParameter("edns_client_subnet", str2);
        }
        return parse(fetch(appendPath.toString()));
    }

    private final Answer parse(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray("Answer").getJSONObject(0);
        return new Answer(jSONObject2.getString("name"), jSONObject2.getInt("type"), jSONObject2.getInt("TTL"), jSONObject2.getString("data"));
    }
}
