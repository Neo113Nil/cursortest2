package ru.ok.tracer.opentelemetry.export;

import android.net.Uri;
import android.util.Log;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.opentelemetry.FEATURE_OPEN_TELEMETRYKt;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryExporter;
import ru.ok.tracer.upload.NetworkResponseHandler;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import xsna.brm0;
import xsna.ro;
import xsna.s3q0;
import xsna.v7i;

/* compiled from: TracerOpenTelemetryExporter.kt */
/* loaded from: classes9.dex */
public final class TracerOpenTelemetryExporter {
    public static final TracerOpenTelemetryExporter INSTANCE = new TracerOpenTelemetryExporter();

    private TracerOpenTelemetryExporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upload$lambda$0(String str, long j, String str2, v7i v7iVar) {
        try {
            INSTANCE.performUpload$tracer_opentelemetry_release(str, j, str2);
            v7iVar.e();
        } catch (Exception unused) {
            v7iVar.a(null);
        }
    }

    public final void performUpload$tracer_opentelemetry_release(String str, long j, String str2) {
        byte[] bytes;
        Tracer tracer = Tracer.INSTANCE;
        String appToken = tracer.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return;
        }
        HttpResponse execute = tracer.getHttpClient().execute(new HttpRequest(Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath(str).appendQueryParameter("crashToken", appToken).appendQueryParameter("clientTimeUnixNano", String.valueOf(j)).toString(), HttpRequestBody.Companion.fromString$default(HttpRequestBody.Companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, str2, null, 4, null)));
        try {
            int statusCode = execute.getStatusCode();
            HttpResponseBody body = execute.getBody();
            String contentType = body != null ? body.getContentType() : null;
            HttpResponseBody body2 = execute.getBody();
            String u = (body2 == null || (bytes = body2.getBytes()) == null) ? null : brm0.u(bytes);
            NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, u, FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY().getName(), null, 8, null);
            if (statusCode != 200) {
                Log.e("Tracer", "HTTP " + statusCode + ", " + u);
            } else {
                Logger.d$default("Result: " + u, null, 2, null);
                s3q0 s3q0Var = s3q0.a;
            }
            ro.e(execute, null);
        } finally {
        }
    }

    public final void upload$tracer_opentelemetry_release(final String str, final String str2, final long j, final v7i v7iVar) {
        TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: xsna.lep0
            @Override // java.lang.Runnable
            public final void run() {
                TracerOpenTelemetryExporter.upload$lambda$0(str, j, str2, v7iVar);
            }
        });
    }
}
