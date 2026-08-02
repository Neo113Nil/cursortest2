package ru.ok.tracer.crash.report;

import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import android.util.Log;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.drop.DropRecord;
import ru.ok.tracer.base.drop.DropRecordSerializer;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.SessionStatesSerializer;
import ru.ok.tracer.upload.NetworkResponseHandler;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.brm0;
import xsna.l5p;
import xsna.ro;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SessionStateUploader.kt */
/* loaded from: classes9.dex */
public final class SessionStateUploader {
    private static final int MAX_SESSIONS_TO_UPLOAD = 4;
    private final Context context;
    private volatile ConditionVariable sessionUploadCondition;
    private final SessionStateStorage storage;
    private static final Companion Companion = new Companion(null);
    private static final long MAX_SESSION_TIME_SPAN_TO_UPLOAD = TimeUnit.MINUTES.toMillis(30);

    /* compiled from: SessionStateUploader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SessionStateUploader(SessionStateStorage sessionStateStorage, Context context) {
        this.storage = sessionStateStorage;
        this.context = context;
    }

    private final List<SessionState> collectSessionStatesToUpload() {
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE(), null, 2, null)) {
            return EmptyList.b;
        }
        List<SessionState> sessionStates = this.storage.getSessionStates();
        if (!sessionStates.isEmpty() && sessionStates.size() < 4) {
            long sessionStateUploadTs = this.storage.getSessionStateUploadTs();
            if (sessionStateUploadTs + MAX_SESSION_TIME_SPAN_TO_UPLOAD > System.currentTimeMillis()) {
                return EmptyList.b;
            }
        }
        return sessionStates;
    }

    private final DropManager getDropManager() {
        return Tracer.INSTANCE.getDropManager();
    }

    private final void upload(List<SessionState> list) {
        Logger.d$default("Upload session", null, 2, null);
        String appToken = Tracer.INSTANCE.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return;
        }
        Collection<DropRecord> take = getDropManager().take();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, DeviceIdUtils.getDeviceId(this.context));
        jSONObject.put("sessions", SessionStatesSerializer.INSTANCE.toJsonArray(list));
        if (!take.isEmpty()) {
            jSONObject.put("drops", DropRecordSerializer.INSTANCE.toJsonArray(take));
        }
        HttpRequest httpRequest = new HttpRequest(Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", appToken).toString(), HttpRequestBody.Companion.fromString$default(HttpRequestBody.Companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jSONObject.toString(), null, 4, null));
        httpRequest.getUrl();
        ConditionVariable conditionVariable = new ConditionVariable();
        this.sessionUploadCondition = conditionVariable;
        TracerThreads.INSTANCE.runOnIo(new l5p(httpRequest, this, take, conditionVariable, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upload$lambda$4(HttpRequest httpRequest, SessionStateUploader sessionStateUploader, Collection collection, ConditionVariable conditionVariable) {
        byte[] bytes;
        try {
            try {
                HttpResponse execute = Tracer.INSTANCE.getHttpClient().execute(httpRequest);
                try {
                    int statusCode = execute.getStatusCode();
                    HttpResponseBody body = execute.getBody();
                    String contentType = body != null ? body.getContentType() : null;
                    HttpResponseBody body2 = execute.getBody();
                    String u = (body2 == null || (bytes = body2.getBytes()) == null) ? null : brm0.u(bytes);
                    NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, u, FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE().getName(), null, 8, null);
                    if (statusCode != 200) {
                        Log.e("Tracer", "HTTP " + statusCode + ", " + u);
                    } else {
                        Logger.d$default("Result: " + u, null, 2, null);
                        sessionStateUploader.storage.consumePrevSessionStates();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    ro.e(execute, null);
                    conditionVariable.open();
                } finally {
                }
            } catch (Exception unused) {
                sessionStateUploader.getDropManager().drop(collection);
                conditionVariable.open();
            }
        } catch (Throwable th) {
            conditionVariable.open();
            throw th;
        }
    }

    public final void collectAndUpload() {
        List<SessionState> collectSessionStatesToUpload = collectSessionStatesToUpload();
        if (collectSessionStatesToUpload.isEmpty()) {
            return;
        }
        try {
            upload(collectSessionStatesToUpload);
        } catch (Exception unused) {
        }
    }

    public final boolean waitSessionUpload(long j) {
        try {
            ConditionVariable conditionVariable = this.sessionUploadCondition;
            if (conditionVariable == null) {
                return true;
            }
            conditionVariable.block(j);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
