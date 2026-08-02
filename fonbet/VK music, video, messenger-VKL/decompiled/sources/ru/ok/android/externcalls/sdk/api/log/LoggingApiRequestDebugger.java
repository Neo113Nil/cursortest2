package ru.ok.android.externcalls.sdk.api.log;

import android.net.Uri;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Pair;
import org.json.JSONException;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiRequest;
import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonReaderJackson;
import ru.ok.android.api.json.PlainJsonWriter;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.sdk.api.ApiRequestLoggable;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import ru.ok.android.webrtc.RTCLog;
import xsna.go9;
import xsna.rl3;
import xsna.y57;
import xsna.zcl;
import xsna.zr;

/* compiled from: LoggingApiRequestDebugger.kt */
/* loaded from: classes9.dex */
public final class LoggingApiRequestDebugger implements ApiRequestDebugger {
    private static final Companion Companion = new Companion(null);
    private static final String ERASED_SECRET = "<ERASED_SECRET>";
    private static final String TAG = "CallsApiDebug";
    private final RTCLog log;
    private final RequestSecretEraser secretEraser = new RequestSecretEraser(rl3.y0(new String[]{"token", "auth_data", "credential", LoginApiConstants.RESULT_NAME_AUTH_TOKEN, "session_data"}), ERASED_SECRET);
    private final ApiSessionStore sessionStore;

    /* compiled from: LoggingApiRequestDebugger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LoggingApiRequestDebugger(RTCLog rTCLog, ApiSessionStore apiSessionStore) {
        this.log = rTCLog;
        this.sessionStore = apiSessionStore;
    }

    private final String eraseSecrets(String str) {
        try {
            return this.secretEraser.eraseSecrets(str);
        } catch (JSONException e) {
            this.log.logException(TAG, "can't erase secrets from json", e);
            return ERASED_SECRET;
        }
    }

    private final Pair<String, String> extractHostAndScheme(String str) {
        Uri parse = Uri.parse(str);
        return new Pair<>(parse.getScheme(), parse.getHost());
    }

    private final String getParams(ApiRequest apiRequest) {
        return eraseSecrets(getRawParams(apiRequest));
    }

    private final String getRawParams(ApiRequest apiRequest) {
        StringWriter stringWriter = new StringWriter();
        PlainJsonWriter plainJsonWriter = new PlainJsonWriter(stringWriter);
        try {
            plainJsonWriter.beginObject();
            apiRequest.writeParams(plainJsonWriter);
            plainJsonWriter.endObject();
            plainJsonWriter.flush();
        } catch (Exception unused) {
            this.log.log(TAG, "failed to log request params");
        }
        return stringWriter.toString();
    }

    private final String transformUriForLog(Uri uri) {
        ApiSessionStore.SessionInfo sessionInfo;
        ApiSessionStore apiSessionStore = this.sessionStore;
        String apiEndpoint = (apiSessionStore == null || (sessionInfo = apiSessionStore.getSessionInfo()) == null) ? null : sessionInfo.getApiEndpoint();
        if (apiEndpoint == null) {
            return uri.toString();
        }
        Pair<String, String> extractHostAndScheme = extractHostAndScheme(apiEndpoint);
        String d = extractHostAndScheme.d();
        String g = extractHostAndScheme.g();
        return (d == null || g == null) ? uri.toString() : uri.buildUpon().scheme(d).authority(g).build().toString();
    }

    @Override // ru.ok.android.api.debug.ApiRequestDebugger
    public void debugApiRequest(ApiClientEngine apiClientEngine, ApiRequest apiRequest, ApiConfig apiConfig) throws IOException {
        this.log.log(TAG, y57.a("API request ", transformUriForLog(apiRequest.getUri()), " ", apiRequest instanceof ApiRequestLoggable ? go9.b("start with params ", getParams(apiRequest)) : ""));
    }

    @Override // ru.ok.android.api.debug.ApiRequestDebugger
    public JsonReader debugApiResponseFail(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
        String jsonValue = jsonReader.jsonValue();
        this.log.log(TAG, y57.a("API request ", transformUriForLog(apiRequest.getUri()), " failed with response ", eraseSecrets(jsonValue)));
        return JsonReaderJackson.create(jsonValue);
    }

    @Override // ru.ok.android.api.debug.ApiRequestDebugger
    public JsonReader debugApiResponseOk(ApiClientEngine apiClientEngine, ApiRequest apiRequest, JsonReader jsonReader) throws IOException {
        String jsonValue = jsonReader.jsonValue();
        this.log.log(TAG, y57.a("API request ", transformUriForLog(apiRequest.getUri()), " success ", apiRequest instanceof ApiRequestLoggable ? go9.b("with response ", eraseSecrets(jsonValue)) : ""));
        return JsonReaderJackson.create(jsonValue);
    }

    @Override // ru.ok.android.api.debug.ApiRequestDebugger
    public void debugIoException(ApiClientEngine apiClientEngine, ApiRequest apiRequest, IOException iOException) throws IOException {
        this.log.logException(TAG, zr.a("API request ", transformUriForLog(apiRequest.getUri()), " failed with IO Exception"), iOException);
    }
}
