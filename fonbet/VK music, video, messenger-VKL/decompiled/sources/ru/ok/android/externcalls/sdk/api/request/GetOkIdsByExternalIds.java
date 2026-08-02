package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.common.StringApiParam;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.ozl;
import xsna.zcl;

/* compiled from: GetOkIdsByExternalIds.kt */
/* loaded from: classes9.dex */
public final class GetOkIdsByExternalIds {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.getOkIdsByExternalIds";

    /* compiled from: GetOkIdsByExternalIds.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String constructRequestIdsParameter(List<ParticipantId> list) {
            JSONArray jSONArray = new JSONArray();
            for (ParticipantId participantId : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", participantId.id);
                jSONObject.put("ok_anonym", participantId.isAnon);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        }

        private Companion() {
        }
    }

    /* compiled from: GetOkIdsByExternalIds.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<BatchInternalIdResponse> {
        private final /* synthetic */ BasicApiRequest<BatchInternalIdResponse> $$delegate_0;

        public Request(List<ParticipantId> list) {
            this.$$delegate_0 = BasicApiRequest.Companion.methodBuilder(GetOkIdsByExternalIds.METHOD_NAME).scope(ApiScope.OPT_SESSION).param(new StringApiParam("externalIds", GetOkIdsByExternalIds.Companion.constructRequestIdsParameter(list))).build(BatchInternalIdResponse.PARSER);
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<BatchInternalIdResponse> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends BatchInternalIdResponse> getOkParser() {
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
            return this.$$delegate_0.getUri();
        }

        @Override // ru.ok.android.sdk.api.OkApiInterruptedIOHandler
        public Object handleInterruptedIO() {
            return new BatchInternalIdResponse(new LinkedHashMap());
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
}
