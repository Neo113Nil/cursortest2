package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import kotlin.collections.EmptyList;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.common.PostApiValue;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.ozl;
import xsna.zcl;

/* compiled from: JoinConversationByLink.kt */
/* loaded from: classes9.dex */
public final class JoinConversationByLink {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.joinConversationByLink";

    /* compiled from: JoinConversationByLink.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: JoinConversationByLink.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<JoinByLinkResponse> {
        private final /* synthetic */ BasicApiRequest<JoinByLinkResponse> $$delegate_0;

        public Request(String str, String str2, long j, StartCallApiParams startCallApiParams) {
            BasicApiRequest.Builder param = BasicApiRequest.Companion.methodBuilder(JoinConversationByLink.METHOD_NAME).scope(ApiScope.OPT_SESSION).param("joinLink", str).param(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo()).param("peerId", j).param(ApiProtocol.PARAM_ANONYM_TOKEN, str2).param("capabilities", startCallApiParams.getHexCapability());
            if (startCallApiParams.getPayload() != null) {
                param.param("payload", new PostApiValue(startCallApiParams.getPayload()));
            }
            if (startCallApiParams.isMultipleDevicesEnabled()) {
                param.param(ApiProtocol.PARAM_PROTOCOL_VERSION, 6);
            }
            this.$$delegate_0 = param.build(JoinByLinkResponse.PARSER);
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<JoinByLinkResponse> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends JoinByLinkResponse> getOkParser() {
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
            EmptyList emptyList = EmptyList.b;
            return new JoinByLinkResponse("", emptyList, emptyList, "", "", "", "", false, 0);
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
