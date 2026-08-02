package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.ozl;
import xsna.zcl;

/* compiled from: GetConversationParams.kt */
/* loaded from: classes9.dex */
public final class GetConversationParams {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.getConversationParams";

    /* compiled from: GetConversationParams.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GetConversationParams.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<ConversationParams> {
        private final /* synthetic */ BasicApiRequest<ConversationParams> $$delegate_0;

        /* JADX WARN: Multi-variable type inference failed */
        public Request() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<ConversationParams> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ConversationParams> getOkParser() {
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
            return new ConversationParams();
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

        public Request(String str, String str2) {
            BasicApiRequest.Builder scope = BasicApiRequest.Companion.methodBuilder(GetConversationParams.METHOD_NAME).scope(ApiScope.OPT_SESSION);
            if (str != null) {
                scope.param(ApiProtocol.PARAM_ANONYM_TOKEN, str);
            }
            if (str2 != null) {
                scope.param("conversationId", str2);
            }
            this.$$delegate_0 = scope.build(ConversationParams.PARSER);
        }

        public /* synthetic */ Request(String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
