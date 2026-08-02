package xsna;

import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: FileLogUVStatRequest.kt */
/* loaded from: classes8.dex */
public final class k9r implements ApiExecutableRequest {
    public final String a;
    public final String b;
    public final String c;
    public final JsonParser d = JsonParsers.voidParser();
    public final Uri e = Uri.parse("https://api.okcdn.ru/fb.do");
    public final ApiScope f = ApiScope.OPT_SESSION;
    public final int g = 2;
    public final mbr h;

    public k9r(String str, String str2, String str3, mbr mbrVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.h = mbrVar;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public final JsonParser getOkParser() {
        return this.d;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final int getPriority() {
        return this.g;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final ApiScope getScope() {
        return this.f;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final Uri getUri() {
        return this.e;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldGzip() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final boolean shouldReport() {
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public final void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.name("method");
        jsonWriter.value("log.logUvStat");
        jsonWriter.name("uv_stat_data");
        jsonWriter.beginObject();
        jsonWriter.name("application");
        jsonWriter.value(this.a);
        jsonWriter.name("platform");
        jsonWriter.value(this.b);
        jsonWriter.name("product");
        jsonWriter.value(this.c);
        jsonWriter.name("events");
        jsonWriter.beginArray();
        try {
            Iterator it = this.h.b.iterator();
            while (it.hasNext()) {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(((dbq0) it.next()).a), emb.b);
                try {
                    jsonWriter.jsonValue(inputStreamReader);
                    s3q0 s3q0Var = s3q0.a;
                    inputStreamReader.close();
                } finally {
                }
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
        } catch (JsonSyntaxException e) {
            throw new JsonSerializeException(e);
        }
    }
}
