package xsna;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonWriter;

/* compiled from: OneLogApiRequest.kt */
/* loaded from: classes8.dex */
public abstract class vi80 implements ApiExecutableRequest<Void> {
    private final String application;
    private final String collector;
    private final String platform;
    private final JsonParser<Void> okParser = JsonParsers.voidParser();
    private final Uri uri = ApiUris.methodUri("log.externalLog");
    private final ApiScope scope = ApiScope.OPT_SESSION;
    private final int priority = 2;

    public vi80(String str, String str2, String str3) {
        this.collector = str;
        this.application = str2;
        this.platform = str3;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends Void> getOkParser() {
        return this.okParser;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        return this.priority;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return this.scope;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return this.uri;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldGzip() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return false;
    }

    public abstract void writeItems(JsonWriter jsonWriter) throws IOException;

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        jsonWriter.name("collector");
        jsonWriter.value(this.collector);
        jsonWriter.name("data");
        jsonWriter.beginObject();
        jsonWriter.name("application");
        jsonWriter.value(this.application);
        jsonWriter.name("platform");
        jsonWriter.value(this.platform);
        jsonWriter.name("items");
        writeItems(jsonWriter);
        jsonWriter.endObject();
    }
}
