package ru.ok.android.onelog;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: ExperimentalOneLogApiRequest.kt */
/* loaded from: classes9.dex */
public abstract class ExperimentalOneLogApiRequest implements ApiExecutableRequest<Void> {
    private final String application;
    private final String collector;
    private final String platform;
    private final JsonParser<Void> okParser = JsonParsers.voidParser();
    private final Uri uri = ApiUris.methodUri("log.externalLog");
    private final ApiScope scope = ApiScope.OPT_SESSION;
    private final int priority = 2;

    public ExperimentalOneLogApiRequest(String str, String str2, String str3) {
        this.collector = str;
        this.application = str2;
        this.platform = str3;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return super.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    /* renamed from: getConfigExtractor */
    public ApiConfigExtractor<Void> getConfigExtractor2() {
        return super.getConfigExtractor2();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends ApiInvocationException> getFailParser() {
        return super.getFailParser();
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

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return super.getScopeAfter();
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
    public boolean shouldNeverGzip() {
        return super.shouldNeverGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverJson() {
        return super.shouldNeverJson();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverPost() {
        return super.shouldNeverPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldPost() {
        return true;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteParams() {
        return super.willWriteParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteSupplyParams() {
        return super.willWriteSupplyParams();
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

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeSupplyParams(JsonWriter jsonWriter) {
        super.writeSupplyParams(jsonWriter);
    }
}
