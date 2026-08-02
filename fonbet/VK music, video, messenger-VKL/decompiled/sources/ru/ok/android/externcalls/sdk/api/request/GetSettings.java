package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.Set;
import ru.ok.android.api.common.BasicApiRequest;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.session.ApiConfigExtractor;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.j5g;
import xsna.jgp;
import xsna.ozl;
import xsna.zcl;

/* compiled from: GetSettings.kt */
/* loaded from: classes9.dex */
public final class GetSettings {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "settings.get";

    /* compiled from: GetSettings.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GetSettings.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<Map<String, ? extends String>> {
        private final /* synthetic */ BasicApiRequest<Map<String, String>> $$delegate_0;

        public Request(Set<String> set) {
            this.$$delegate_0 = BasicApiRequest.Companion.methodBuilder(GetSettings.METHOD_NAME).scope(ApiScope.OPT_SESSION).param(ApiProtocol.PARAM_KEYS, j5g.g0(set, StringUtils.COMMA, null, null, 0, null, 62)).param("version", "1.1.1").build(JsonParsers.stringMapParser());
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<Map<String, ? extends String>> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends ApiInvocationException> getFailParser() {
            return this.$$delegate_0.getFailParser();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends Map<String, ? extends String>> getOkParser() {
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
            return jgp.b;
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
