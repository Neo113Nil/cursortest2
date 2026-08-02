package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.common.StringApiParam;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.j5g;
import xsna.ozl;
import xsna.xht;
import xsna.zcl;

/* compiled from: GetExternalIdsByOkIds.kt */
/* loaded from: classes9.dex */
public final class GetExternalIdsByOkIds {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.getExternalIdsByOkIds";

    /* compiled from: GetExternalIdsByOkIds.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StringApiParam mapToStringApiParam(List<CallParticipant.ParticipantId> list) {
            return new StringApiParam(ApiProtocol.PARAM_UIDS, j5g.g0(list, StringUtils.COMMA, null, null, 0, new xht(1), 30));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence mapToStringApiParam$lambda$0(CallParticipant.ParticipantId participantId) {
            return String.valueOf(participantId.id);
        }

        private Companion() {
        }
    }

    /* compiled from: GetExternalIdsByOkIds.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<ExternalIdsResponse> {
        private final /* synthetic */ BasicApiRequest<ExternalIdsResponse> $$delegate_0;

        public Request(List<CallParticipant.ParticipantId> list) {
            this.$$delegate_0 = BasicApiRequest.Companion.methodBuilder(GetExternalIdsByOkIds.METHOD_NAME).scope(ApiScope.OPT_SESSION).param(GetExternalIdsByOkIds.Companion.mapToStringApiParam(list)).build(ExternalIdsResponse.INSTANCE);
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<ExternalIdsResponse> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ExternalIdsResponse> getOkParser() {
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
            return new ExternalIdsResponse(new LinkedHashMap());
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
