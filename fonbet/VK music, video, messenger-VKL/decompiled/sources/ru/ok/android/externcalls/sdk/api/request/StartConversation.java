package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import java.util.List;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;
import xsna.zzs;

/* compiled from: StartConversation.kt */
/* loaded from: classes9.dex */
public final class StartConversation {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "StartConversation";
    public static final String METHOD_NAME = "vchat.startConversation";

    /* compiled from: StartConversation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: StartConversation.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<CallInfo> {
        private final /* synthetic */ BasicApiRequest<CallInfo> $$delegate_0;

        public Request(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, zzs<? super ConversationParticipant, ? super List<String>, ? super StartCallApiParams, ? super BasicApiRequest.Builder, s3q0> zzsVar) {
            BasicApiRequest.Builder param = BasicApiRequest.Companion.methodBuilder(StartConversation.METHOD_NAME).scope(ApiScope.OPT_SESSION).param(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo()).param(ApiProtocol.PARAM_TURN_SERVERS, str).param("conversationId", str2).param(ApiProtocol.PARAM_CREATE_JOIN_LINK, z).param(ApiProtocol.PARAM_WAIT_FOR_ADMIN, startCallApiParams.isWaitForAdminEnabled()).param("capabilities", startCallApiParams.getHexCapability());
            if (startCallApiParams.isMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(StartConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                param.param(ApiProtocol.PARAM_PROTOCOL_VERSION, 6);
            }
            String domainId = startCallApiParams.getDomainId();
            if (domainId != null) {
                param.param(ApiProtocol.PARAM_DOMAIN_ID, domainId);
            }
            String payload = startCallApiParams.getPayload();
            if (payload != null) {
                param.param("payload", payload);
            }
            zzsVar.invoke(conversationParticipant, list, startCallApiParams, param);
            this.$$delegate_0 = param.param(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !startCallApiParams.isWatchTogetherEnabledForAll()).build(CallInfo.Companion.getPARSER());
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<CallInfo> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends CallInfo> getOkParser() {
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
            return new CallInfo(null, null, null, null, null, null, null, null, false, null, null, false, 0, 8191, null);
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
