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
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.OkApiInterruptedIOHandler;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ozl;
import xsna.zcl;

/* compiled from: GetOkIdByExternalId.kt */
/* loaded from: classes9.dex */
public final class GetOkIdByExternalId {
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_NAME = "vchat.getOkIdByExternalId";

    /* compiled from: GetOkIdByExternalId.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GetOkIdByExternalId.kt */
    public static final class Response {
        public static final Companion Companion;
        private static final JsonParser<Response> PARSER;
        private final String error;
        private final String name;
        private final long okId;

        /* compiled from: GetOkIdByExternalId.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final JsonParser<Response> getPARSER() {
                return Response.PARSER;
            }

            public final Response parse(JsonReader jsonReader) {
                jsonReader.beginObject();
                long j = 0;
                String str = null;
                String str2 = null;
                while (jsonReader.hasNext()) {
                    String name = jsonReader.name();
                    int hashCode = name.hashCode();
                    if (hashCode != 3373707) {
                        if (hashCode != 96784904) {
                            if (hashCode == 105793118 && name.equals("ok_id")) {
                                j = jsonReader.longValue();
                            }
                            jsonReader.skipValue();
                        } else if (name.equals("error")) {
                            str2 = jsonReader.stringValue();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (name.equals("name")) {
                        str = jsonReader.stringValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return new Response(j, str, str2);
            }

            private Companion() {
            }
        }

        static {
            final Companion companion = new Companion(null);
            Companion = companion;
            PARSER = new JsonParser() { // from class: xsna.ett
                @Override // ru.ok.android.api.json.JsonParser
                public final Object parse(JsonReader jsonReader) {
                    return GetOkIdByExternalId.Response.Companion.this.parse(jsonReader);
                }
            };
        }

        public Response() {
            this(0L, null, null, 7, null);
        }

        public final String getError() {
            return this.error;
        }

        public final String getName() {
            return this.name;
        }

        public final long getOkId() {
            return this.okId;
        }

        public Response(long j, String str, String str2) {
            this.okId = j;
            this.name = str;
            this.error = str2;
        }

        public /* synthetic */ Response(long j, String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* compiled from: GetOkIdByExternalId.kt */
    public static final class Request implements ApiRequestLoggable, OkApiInterruptedIOHandler, ApiExecutableRequest<Response> {
        private final /* synthetic */ BasicApiRequest<Response> $$delegate_0;

        public Request(String str, boolean z) {
            this.$$delegate_0 = BasicApiRequest.Companion.methodBuilder(GetOkIdByExternalId.METHOD_NAME).scope(ApiScope.OPT_SESSION).param(SignalingProtocol.KEY_EXTERNAL_ID, str).param("anonym", z).build(Response.Companion.getPARSER());
        }

        @Override // ru.ok.android.api.core.ApiRequest
        public boolean canRepeat() {
            return this.$$delegate_0.canRepeat();
        }

        @Override // ru.ok.android.api.core.ApiExecutableRequest
        /* renamed from: getConfigExtractor */
        public ApiConfigExtractor<Response> getConfigExtractor2() {
            return this.$$delegate_0.getConfigExtractor2();
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
            return new Response(0L, null, null, 7, null);
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

        public /* synthetic */ Request(String str, boolean z, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }
}
