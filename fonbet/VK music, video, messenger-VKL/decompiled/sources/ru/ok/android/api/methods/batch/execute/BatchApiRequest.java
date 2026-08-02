package ru.ok.android.api.methods.batch.execute;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.debug.ApiDebug;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import xsna.ozl;
import xsna.rl3;
import xsna.zcl;

/* compiled from: BatchApiRequest.kt */
/* loaded from: classes9.dex */
public final class BatchApiRequest implements ApiExecutableRequest<BatchApiResult> {
    public static final String FIELD_NAME_CONDITION = "condition";
    public static final String FIELD_NAME_ON_ERROR = "onError";
    public static final String FIELD_NAME_PARAMS = "params";
    public static final String FIELD_NAME_SUPPLY_PARAMS = "supplyParams";
    public static final String FIELD_VALUE_ON_ERROR_SKIP = "SKIP";
    public static final String PARAM_NAME_ID = "id";
    public static final String PARAM_NAME_METHODS = "methods";
    private final int explicitPriority;
    private final String id;
    private final JsonParser<BatchApiResult> okParser;
    private final ApiRequestRecord<?>[] records;
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "batch.executeV2";
    private static final Uri URI = ApiUris.methodUri(METHOD_NAME);

    /* compiled from: BatchApiRequest.kt */
    public static final class Builder {
        private int explicitPriority;
        private String id;
        private final ArrayList<ApiRequestRecord<?>> records;

        public Builder() {
            this(null, null, 0, 7, null);
        }

        public final Builder add(ApiExecutableRequest<?> apiExecutableRequest) {
            return add(apiExecutableRequest, apiExecutableRequest, false, null);
        }

        public final Builder addConditional(ApiExecutableRequest<?> apiExecutableRequest, String str) {
            return add(apiExecutableRequest, apiExecutableRequest, false, str);
        }

        public final Builder addSkipOnError(ApiExecutableRequest<?> apiExecutableRequest) {
            return add(apiExecutableRequest, apiExecutableRequest, true, null);
        }

        public final BatchApiRequest build() {
            return new BatchApiRequest(this.id, (ApiRequestRecord[]) this.records.toArray(new ApiRequestRecord[0]), this.explicitPriority, null);
        }

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder priority(int i) {
            this.explicitPriority = i;
            return this;
        }

        public final Builder remove(ApiRequest apiRequest) {
            int size = this.records.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (this.records.get(size).handle == apiRequest) {
                        this.records.remove(size);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            return this;
        }

        public Builder(String str, ArrayList<ApiRequestRecord<?>> arrayList, int i) {
            this.id = str;
            this.records = arrayList;
            this.explicitPriority = i;
        }

        @ozl
        public final <R extends ApiRequest & JsonParser<?>> Builder add(R r) {
            return add(r, ApiExecutableRequest.Companion.from(r, (JsonParser) r), false, null);
        }

        @ozl
        public final <R extends ApiRequest & JsonParser<?>> Builder addConditional(R r, String str) {
            return add(r, ApiExecutableRequest.Companion.from(r, (JsonParser) r), false, str);
        }

        @ozl
        public final <R extends ApiRequest & JsonParser<?>> Builder addSkipOnError(R r) {
            return add(r, ApiExecutableRequest.Companion.from(r, (JsonParser) r), true, null);
        }

        @ozl
        public final Builder add(ApiRequest apiRequest, JsonParser<?> jsonParser) {
            return add(apiRequest, ApiExecutableRequest.Companion.from(apiRequest, jsonParser), false, null);
        }

        @ozl
        public final Builder addConditional(ApiRequest apiRequest, JsonParser<?> jsonParser, String str) {
            return add(apiRequest, ApiExecutableRequest.Companion.from(apiRequest, jsonParser), false, str);
        }

        @ozl
        public final Builder addSkipOnError(ApiRequest apiRequest, JsonParser<?> jsonParser) {
            return add(apiRequest, ApiExecutableRequest.Companion.from(apiRequest, jsonParser), true, null);
        }

        private final Builder add(ApiRequest apiRequest, ApiExecutableRequest<?> apiExecutableRequest, boolean z, String str) {
            this.records.add(new ApiRequestRecord<>(apiRequest, apiExecutableRequest, z, str));
            return this;
        }

        public final Builder addSkipOnError(int i, ApiExecutableRequest<?> apiExecutableRequest) {
            return add(i, apiExecutableRequest, apiExecutableRequest, true, null);
        }

        public final Builder add(int i, ApiExecutableRequest<?> apiExecutableRequest) {
            return add(i, apiExecutableRequest, apiExecutableRequest, false, null);
        }

        @ozl
        public final <R extends ApiRequest & JsonParser<?>> Builder addSkipOnError(int i, R r) {
            return add(i, r, ApiExecutableRequest.Companion.from(r, (JsonParser) r), true, null);
        }

        public /* synthetic */ Builder(String str, ArrayList arrayList, int i, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? new ArrayList() : arrayList, (i2 & 4) != 0 ? 0 : i);
        }

        @ozl
        public final <R extends ApiRequest & JsonParser<?>> Builder add(int i, R r) {
            return add(i, r, ApiExecutableRequest.Companion.from(r, (JsonParser) r), false, null);
        }

        @ozl
        public final Builder addSkipOnError(int i, ApiRequest apiRequest, JsonParser<?> jsonParser) {
            return add(i, apiRequest, ApiExecutableRequest.Companion.from(apiRequest, jsonParser), true, null);
        }

        @ozl
        public final Builder add(int i, ApiRequest apiRequest, JsonParser<?> jsonParser) {
            return add(i, apiRequest, ApiExecutableRequest.Companion.from(apiRequest, jsonParser), false, null);
        }

        private final Builder add(int i, ApiRequest apiRequest, ApiExecutableRequest<?> apiExecutableRequest, boolean z, String str) {
            this.records.add(i, new ApiRequestRecord<>(apiRequest, apiExecutableRequest, z, str));
            return this;
        }
    }

    /* compiled from: BatchApiRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Builder batchBuilder() {
            return new Builder(null, null, 0, 7, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BatchApiRequest(String str, ApiRequestRecord[] apiRequestRecordArr, int i, zcl zclVar) {
        this(str, apiRequestRecordArr, i);
    }

    public static final Builder batchBuilder() {
        return Companion.batchBuilder();
    }

    public final Builder buildUpon() {
        return new Builder(this.id, new ArrayList(rl3.u0(this.records)), this.explicitPriority);
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            if (!apiRequestRecord.request.canRepeat()) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains$odnoklassniki_android_api_release(Object obj) {
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            if (apiRequestRecord.handle == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiConfigExtractor<BatchApiResult> getConfigExtractor() {
        return BatchApiConfigExtractor.INSTANCE;
    }

    public final String getId() {
        return this.id;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public JsonParser<? extends BatchApiResult> getOkParser() {
        return this.okParser;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        int i = this.explicitPriority;
        int i2 = 1;
        if (1 <= i && i < 257) {
            return i;
        }
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            int priority = apiRequestRecord.request.getPriority();
            if (i2 < priority) {
                i2 = priority;
            }
        }
        return i2;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public ApiScope getScope() {
        ApiRequestRecord<?>[] apiRequestRecordArr = this.records;
        int length = apiRequestRecordArr.length;
        if (length == 0) {
            return ApiScope.NONE;
        }
        if (length == 1) {
            return apiRequestRecordArr[0].request.getScope();
        }
        ApiScope apiScope = ApiScope.NONE;
        for (ApiRequestRecord<?> apiRequestRecord : apiRequestRecordArr) {
            apiScope = apiScope.requireAtLeast(apiRequestRecord.request.getScope());
            if (apiRequestRecord.request.getScopeAfter() != ApiScopeAfter.SAME) {
                return apiScope;
            }
        }
        return apiScope;
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    public ApiScopeAfter getScopeAfter() {
        ApiRequestRecord<?>[] apiRequestRecordArr = this.records;
        int length = apiRequestRecordArr.length;
        if (length == 0) {
            return ApiScopeAfter.SAME;
        }
        if (length == 1) {
            return apiRequestRecordArr[0].request.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            ApiScopeAfter scopeAfter = this.records[i].request.getScopeAfter();
            if (scopeAfter != ApiScopeAfter.SAME) {
                return scopeAfter;
            }
        }
        return ApiScopeAfter.SAME;
    }

    public final List<ApiRequest> getSubRequests() {
        ApiRequestRecord<?>[] apiRequestRecordArr = this.records;
        ArrayList arrayList = new ArrayList(apiRequestRecordArr.length);
        for (ApiRequestRecord<?> apiRequestRecord : apiRequestRecordArr) {
            arrayList.add(apiRequestRecord.request);
        }
        return arrayList;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public Uri getUri() {
        return URI;
    }

    public final boolean isEmpty() {
        return this.records.length == 0;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldGzip() {
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            if (apiRequestRecord.request.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            if (apiRequestRecord.request.shouldReport()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        boolean isDebug = ApiDebug.isDebug(jsonWriter);
        if (this.id != null) {
            jsonWriter.name("id");
            jsonWriter.value(this.id);
        }
        jsonWriter.name(PARAM_NAME_METHODS);
        jsonWriter.beginArray();
        for (ApiRequestRecord<?> apiRequestRecord : this.records) {
            ApiExecutableRequest<?> apiExecutableRequest = apiRequestRecord.request;
            jsonWriter.beginObject();
            if (isDebug) {
                jsonWriter.comment("request %s", apiExecutableRequest);
                jsonWriter.comment("method = %s", apiRequestRecord.method);
                ApiScopeAfter scopeAfter = apiExecutableRequest.getScopeAfter();
                if (scopeAfter != ApiScopeAfter.SAME) {
                    jsonWriter.comment("scope = %s -> %s", getScope(), scopeAfter);
                }
            }
            jsonWriter.name(apiRequestRecord.method);
            jsonWriter.beginObject();
            if (apiExecutableRequest.willWriteParams()) {
                jsonWriter.name("params");
                jsonWriter.beginObject();
                apiExecutableRequest.writeParams(jsonWriter);
                jsonWriter.endObject();
            } else {
                jsonWriter.comment("no params provided");
            }
            if (apiExecutableRequest.willWriteSupplyParams()) {
                jsonWriter.name(FIELD_NAME_SUPPLY_PARAMS);
                jsonWriter.beginObject();
                apiExecutableRequest.writeSupplyParams(jsonWriter);
                jsonWriter.endObject();
            }
            if (apiRequestRecord.skipOnError) {
                jsonWriter.name(FIELD_NAME_ON_ERROR);
                jsonWriter.value(FIELD_VALUE_ON_ERROR_SKIP);
            }
            if (apiRequestRecord.condition != null) {
                jsonWriter.name(FIELD_NAME_CONDITION);
                jsonWriter.value(apiRequestRecord.condition);
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
    }

    private BatchApiRequest(String str, ApiRequestRecord<?>[] apiRequestRecordArr, int i) {
        this.id = str;
        this.records = apiRequestRecordArr;
        this.explicitPriority = i;
        this.okParser = new BatchApiParser(apiRequestRecordArr);
    }
}
