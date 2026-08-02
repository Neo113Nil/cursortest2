package ru.ok.android.onelog.uv.composite;

import android.net.Uri;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.ozl;

/* compiled from: UriOverridingRequest.kt */
/* loaded from: classes9.dex */
public final class UriOverridingRequest<T> implements ApiExecutableRequest<T> {
    private final /* synthetic */ ApiExecutableRequest<T> $$delegate_0;
    private final Uri patchedUri;

    public UriOverridingRequest(ApiExecutableRequest<T> apiExecutableRequest, Uri uri) {
        this.$$delegate_0 = apiExecutableRequest;
        this.patchedUri = uri;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return this.$$delegate_0.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiConfigExtractor<T> getConfigExtractor() {
        return this.$$delegate_0.getConfigExtractor();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends ApiInvocationException> getFailParser() {
        return this.$$delegate_0.getFailParser();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends T> getOkParser() {
        return this.$$delegate_0.getOkParser();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        return this.$$delegate_0.getPriority();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        return this.$$delegate_0.getScope();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        return this.$$delegate_0.getScopeAfter();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return this.patchedUri;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @ozl
    public boolean shouldGzip() {
        return this.$$delegate_0.shouldGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverGzip() {
        return this.$$delegate_0.shouldNeverGzip();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverJson() {
        return this.$$delegate_0.shouldNeverJson();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverPost() {
        return this.$$delegate_0.shouldNeverPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @ozl
    public boolean shouldPost() {
        return this.$$delegate_0.shouldPost();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return this.$$delegate_0.shouldReport();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteParams() {
        return this.$$delegate_0.willWriteParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteSupplyParams() {
        return this.$$delegate_0.willWriteSupplyParams();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) {
        this.$$delegate_0.writeParams(jsonWriter);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeSupplyParams(JsonWriter jsonWriter) {
        this.$$delegate_0.writeSupplyParams(jsonWriter);
    }
}
