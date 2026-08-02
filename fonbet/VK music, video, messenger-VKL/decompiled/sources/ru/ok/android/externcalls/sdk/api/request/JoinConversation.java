package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.c0y;
import xsna.ozl;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: JoinConversation.kt */
/* loaded from: classes9.dex */
public final class JoinConversation {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "JoinConversation";
    public static final String METHOD_NAME = "vchat.joinConversation";

    /* compiled from: JoinConversation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: JoinConversation.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<Response> {
        private final /* synthetic */ BasicApiRequest<Response> $$delegate_0;

        public Request(String str, long j, StartCallApiParams startCallApiParams, wzs<? super StartCallApiParams, ? super BasicApiRequest.Builder, s3q0> wzsVar) {
            BasicApiRequest.Builder param = BasicApiRequest.Companion.methodBuilder(JoinConversation.METHOD_NAME).scope(ApiScope.OPT_SESSION).param("conversationId", str).param("peerId", j).param(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo()).param("capabilities", startCallApiParams.getHexCapability());
            Long chatId = startCallApiParams.getChatId();
            if (chatId != null) {
                param.param("chatId", chatId.longValue());
            }
            if (startCallApiParams.isMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(JoinConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                param.param(ApiProtocol.PARAM_PROTOCOL_VERSION, 6);
            }
            wzsVar.invoke(startCallApiParams, param);
            this.$$delegate_0 = param.build(Response.Companion.getPARSER());
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public ApiConfigExtractor<Response> getConfigExtractor() {
            return this.$$delegate_0.getConfigExtractor();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends Response> getOkParser() {
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
            return new Response(false, "", "", 0);
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

    /* compiled from: JoinConversation.kt */
    public static final class Response {
        public static final Companion Companion = new Companion(null);
        private static final JsonParser<Response> PARSER = new c0y();
        private final int deviceIndex;
        private final String endpoint;
        private final boolean p2pForbidden;
        private final String wtEndpoint;

        /* compiled from: JoinConversation.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final JsonParser<Response> getPARSER() {
                return Response.PARSER;
            }

            private Companion() {
            }
        }

        public Response(boolean z, String str, String str2, int i) {
            this.p2pForbidden = z;
            this.endpoint = str;
            this.wtEndpoint = str2;
            this.deviceIndex = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Response PARSER$lambda$0(JsonReader jsonReader) {
            jsonReader.beginObject();
            boolean z = false;
            String str = "";
            String str2 = str;
            int i = 0;
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                switch (name.hashCode()) {
                    case -17633304:
                        if (!name.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            jsonReader.stringValue();
                            break;
                        } else {
                            z = jsonReader.booleanValue();
                            s3q0 s3q0Var = s3q0.a;
                            break;
                        }
                    case 781502804:
                        if (!name.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            jsonReader.stringValue();
                            break;
                        } else {
                            i = jsonReader.intValue();
                            s3q0 s3q0Var2 = s3q0.a;
                            break;
                        }
                    case 1422043319:
                        if (!name.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            jsonReader.stringValue();
                            break;
                        } else {
                            str2 = jsonReader.stringValue();
                            s3q0 s3q0Var3 = s3q0.a;
                            break;
                        }
                    case 1741102485:
                        if (!name.equals("endpoint")) {
                            jsonReader.stringValue();
                            break;
                        } else {
                            str = jsonReader.stringValue();
                            s3q0 s3q0Var4 = s3q0.a;
                            break;
                        }
                    default:
                        jsonReader.stringValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new Response(z, str, str2, i);
        }

        public final int getDeviceIndex() {
            return this.deviceIndex;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final boolean getP2pForbidden() {
            return this.p2pForbidden;
        }

        public final String getWtEndpoint() {
            return this.wtEndpoint;
        }
    }
}
