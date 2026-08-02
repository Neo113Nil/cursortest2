package ru.ok.android.api.core;

import android.net.Uri;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import xsna.zcl;

/* compiled from: ApiExecutableRequest.kt */
/* loaded from: classes9.dex */
final class ApiExecutableRequestAdapter<T> implements ApiExecutableRequest<T> {
    private final ApiRequest delegate;
    private final JsonParser<? extends ApiInvocationException> failParser;
    private final JsonParser<? extends T> okParser;

    public ApiExecutableRequestAdapter(ApiRequest apiRequest, JsonParser<? extends T> jsonParser, JsonParser<? extends ApiInvocationException> jsonParser2) {
        this.delegate = apiRequest;
        this.okParser = jsonParser;
        this.failParser = jsonParser2;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return this.delegate.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends ApiInvocationException> getFailParser() {
        return this.failParser;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends T> getOkParser() {
        return this.okParser;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        return this.delegate.getPriority();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return this.delegate.getScope();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return this.delegate.getUri();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldGzip() {
        return this.delegate.shouldGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverGzip() {
        return this.delegate.shouldNeverGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverJson() {
        return this.delegate.shouldNeverJson();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverPost() {
        return this.delegate.shouldNeverPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldPost() {
        return this.delegate.shouldPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return this.delegate.shouldReport();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteParams() {
        return this.delegate.willWriteParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteSupplyParams() {
        return this.delegate.willWriteSupplyParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        this.delegate.writeParams(jsonWriter);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeSupplyParams(JsonWriter jsonWriter) {
        this.delegate.writeSupplyParams(jsonWriter);
    }

    public /* synthetic */ ApiExecutableRequestAdapter(ApiRequest apiRequest, JsonParser jsonParser, JsonParser jsonParser2, int i, zcl zclVar) {
        this(apiRequest, jsonParser, (i & 4) != 0 ? ApiInvocationExceptionParser.INSTANCE : jsonParser2);
    }
}
