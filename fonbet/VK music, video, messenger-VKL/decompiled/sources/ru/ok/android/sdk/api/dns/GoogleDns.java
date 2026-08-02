package ru.ok.android.sdk.api.dns;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class GoogleDns {
    private static final int CONNECT_TIMEOUT = 3000;
    private static final int READ_TIMEOUT = 3000;

    public static final class Answer {

        @NonNull
        public final String data;

        @NonNull
        public final String name;
        public final int ttl;
        public final int type;

        public Answer(@NonNull String str, int i, int i2, @NonNull String str2) {
            this.name = str;
            this.type = i;
            this.ttl = i2;
            this.data = str2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        public static final int TXT = 16;
    }

    @NonNull
    private static String fetch(@NonNull String str) throws IOException {
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.setConnectTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        openConnection.setReadTimeout(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return read(new BufferedInputStream(openConnection.getInputStream()));
    }

    @NonNull
    private static Answer parse(@NonNull String str) throws IOException {
        try {
            return parse(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    private static String read(@NonNull InputStream inputStream) throws IOException {
        return Utils.inputStreamToString(inputStream);
    }

    @NonNull
    public static Answer resolve(@NonNull String str, int i) throws IOException {
        return resolve(str, i, null);
    }

    @NonNull
    public static Answer resolve(@NonNull String str, int i, @Nullable String str2) throws IOException {
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("dns.google.com").appendPath("resolve");
        appendPath.appendQueryParameter("name", str);
        appendPath.appendQueryParameter("type", Integer.toString(i));
        if (str2 != null) {
            appendPath.appendQueryParameter("edns_client_subnet", str2);
        }
        return parse(fetch(appendPath.toString()));
    }

    @NonNull
    private static Answer parse(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray("Answer").getJSONObject(0);
        return new Answer(jSONObject2.getString("name"), jSONObject2.getInt("type"), jSONObject2.getInt("TTL"), jSONObject2.getString("data"));
    }
}
