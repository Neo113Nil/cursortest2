package ru.ok.android.api.common;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiParam;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import xsna.zcl;

/* compiled from: BasicApiRequest.kt */
/* loaded from: classes9.dex */
public final class BasicApiRequest<T> implements ApiExecutableRequest<T> {
    public static final Companion Companion = new Companion(null);
    private final JsonParser<T> okParser;
    private final ApiParamList params;
    private final int priority;
    private final ApiScope scope;
    private final Uri uri;

    /* compiled from: BasicApiRequest.kt */
    public static final class Builder {
        private final Uri uri;
        private ApiScope scope = ApiScope.SESSION;
        private int priority = 16;
        private final ApiParamList params = new ApiParamList();

        public Builder(Uri uri) {
            this.uri = uri;
        }

        public final BasicApiRequest<Void> build() {
            return build(JsonParsers.voidParser());
        }

        public final Builder etagParam(String str) {
            return param(new EtagApiParam(str));
        }

        public final Builder param(ApiParam apiParam) {
            this.params.add(apiParam);
            return this;
        }

        public final void plusAssign(ApiParam apiParam) {
            this.params.plusAssign(apiParam);
        }

        public final Builder scope(ApiScope apiScope) {
            this.scope = apiScope;
            return this;
        }

        public final Builder vectorParam(String str, String... strArr) {
            return param(new VectorApiParam(str, (String[]) Arrays.copyOf(strArr, strArr.length)));
        }

        public final <T> BasicApiRequest<T> build(JsonParser<T> jsonParser) {
            return new BasicApiRequest<>(this.uri, this.scope, this.priority, this.params, jsonParser, null);
        }

        public final Builder param(String str, String str2) {
            return param(new StringApiParam(str, str2));
        }

        public final Builder vectorParam(String str, Collection<String> collection) {
            return param(new VectorApiParam(str, collection));
        }

        public final Builder param(String str, boolean z) {
            return param(new BooleanApiParam(str, z));
        }

        public final Builder param(String str, int i) {
            return param(new IntegralApiParam(str, i));
        }

        public final Builder param(String str, long j) {
            return param(new IntegralApiParam(str, j));
        }

        public final Builder param(String str, float f) {
            return param(new FloatingApiParam(str, f));
        }

        public final Builder param(String str, double d) {
            return param(new FloatingApiParam(str, d));
        }

        public final Builder param(String str, BoxedApiValue boxedApiValue) {
            return param(boxedApiValue.intoParam(str));
        }

        public final Builder param(BoxedApiName boxedApiName, String str) {
            return param(boxedApiName.intoParam(str));
        }
    }

    /* compiled from: BasicApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Builder methodBuilder(String str) {
            return requestBuilder(ApiUris.methodUri(str));
        }

        public final Builder requestBuilder(Uri uri) {
            return new Builder(uri);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BasicApiRequest(Uri uri, ApiScope apiScope, int i, ApiParamList apiParamList, JsonParser jsonParser, zcl zclVar) {
        this(uri, apiScope, i, apiParamList, jsonParser);
    }

    public static final Builder methodBuilder(String str) {
        return Companion.methodBuilder(str);
    }

    public static final Builder requestBuilder(Uri uri) {
        return Companion.requestBuilder(uri);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return this.params.canRepeat$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<T> getOkParser() {
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
    public boolean shouldPost() {
        return this.params.shouldPost$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteParams() {
        return this.params.willWrite$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean willWriteSupplyParams() {
        return this.params.willWriteSupplied$odnoklassniki_android_api_release();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        this.params.write$odnoklassniki_android_api_release(jsonWriter);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeSupplyParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        this.params.writeSupplied$odnoklassniki_android_api_release(jsonWriter);
    }

    private BasicApiRequest(Uri uri, ApiScope apiScope, int i, ApiParamList apiParamList, JsonParser<T> jsonParser) {
        this.uri = uri;
        this.scope = apiScope;
        this.priority = i;
        this.params = apiParamList;
        this.okParser = jsonParser;
    }
}
