package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import java.io.IOException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.json.org.OrgJsonReaders;
import ru.ok.android.api.json.org.OrgJsonWriters;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import xsna.qlc;
import xsna.zcl;

/* compiled from: ClientSupportedCodecs.kt */
/* loaded from: classes9.dex */
public final class ClientSupportedCodecs {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.clientSupportedCodecs";

    /* compiled from: ClientSupportedCodecs.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ClientSupportedCodecs.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<Response> {
        private final JSONObject json;

        public Request(JSONObject jSONObject) {
            this.json = jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Response _get_okParser_$lambda$0(JsonReader jsonReader) {
            return new Response(OrgJsonReaders.orgJsonObjectValue(jsonReader).optBoolean("success", false));
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return true;
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        public JsonParser<? extends Response> getOkParser() {
            return new qlc();
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public int getPriority() {
            return 2;
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public ApiScope getScope() {
            return ApiScope.OPT_SESSION;
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public Uri getUri() {
            return ApiUris.methodUri(ClientSupportedCodecs.METHOD_NAME);
        }

        @Override // ru.ok.android.sdk.api.OkApiInterruptedIOHandler
        public Object handleInterruptedIO() {
            return new Response(false);
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean shouldGzip() {
            return true;
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean shouldPost() {
            return true;
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean shouldReport() {
            return false;
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
            jsonWriter.name("data");
            OrgJsonWriters.orgJsonValue(jsonWriter, this.json);
        }
    }

    /* compiled from: ClientSupportedCodecs.kt */
    public static final class Response {
        private final boolean success;

        public Response(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }
}
