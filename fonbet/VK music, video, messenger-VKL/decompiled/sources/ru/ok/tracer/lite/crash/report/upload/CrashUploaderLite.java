package ru.ok.tracer.lite.crash.report.upload;

import android.net.Uri;
import android.util.Log;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import ru.ok.android.commons.http.Http;
import ru.ok.tracer.BuildConfig;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.commands.CommandsHandler;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.drop.DropRecord;
import ru.ok.tracer.base.drop.DropRecordSerializer;
import ru.ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.base.io.GZIPUtils;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.LogEntryLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLiteKt;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.upload.TracerDropHolder;
import ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder;
import ru.ok.tracer.lite.upload.UploadBeanUtilsLite;
import xsna.brm0;
import xsna.ro;
import xsna.s3q0;

/* compiled from: CrashUploaderLite.kt */
/* loaded from: classes11.dex */
public final class CrashUploaderLite {
    private final CommandsHandler commandHandler;
    private final TracerLiteHttpClientHolder httpClientHolder;
    private final TracerLite tracer;

    public CrashUploaderLite(TracerLite tracerLite, TracerLiteLimits tracerLiteLimits) {
        this.tracer = tracerLite;
        this.httpClientHolder = TracerLiteHttpClientHolder.Companion.get(tracerLite);
        this.commandHandler = new CommandsHandler.Builder().setFeatureName(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT).setLimitsHandler(tracerLiteLimits).build();
    }

    private final DropManager getDropManager() {
        return TracerDropHolder.Companion.get(this.tracer);
    }

    public static void upload$default(CrashUploaderLite crashUploaderLite, String str, Throwable th, String str2, List list, List list2, int i, Object obj) {
        if ((i & 8) != 0) {
            list = EmptyList.b;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = EmptyList.b;
        }
        crashUploaderLite.upload(str, th, str2, list3, list2);
    }

    public final void upload(String str, Throwable th, String str2, List<LogEntryLite> list, List<String> list2) {
        String sb;
        byte[] bytes;
        JSONArray jsonArray;
        try {
            String libToken = this.tracer.getLibToken();
            if (libToken == null) {
                throw new IllegalStateException("No lib token");
            }
            String hostAppToken = AppTokenUtils.getHostAppToken(this.tracer.getContext());
            String jSONObject = UploadBeanUtilsLite.composeLibUploadBean(this.tracer.getContext(), this.tracer.getLibraryInfo(), this.tracer.getSessionUuid(), new Date(), str2, !list2.isEmpty() ? list2 : null).toString();
            StringBuilder sb2 = new StringBuilder();
            ThrowableUtils.appendStackTraceTo(th, sb2);
            byte[] gzippedByteArray = GZIPUtils.toGzippedByteArray(sb2.toString());
            if (list.isEmpty()) {
                sb = null;
            } else {
                StringBuilder sb3 = new StringBuilder();
                Iterator<LogEntryLite> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    it.next().appendToApi(sb3, i);
                    i++;
                }
                sb = sb3.toString();
            }
            byte[] gzippedByteArray2 = sb != null ? GZIPUtils.toGzippedByteArray(sb) : null;
            Collection<DropRecord> take = getDropManager().take();
            Collection<DropRecord> collection = !take.isEmpty() ? take : null;
            String jSONArray = (collection == null || (jsonArray = DropRecordSerializer.INSTANCE.toJsonArray(collection)) == null) ? null : jsonArray.toString();
            Uri.Builder appendQueryParameter = Uri.parse(this.tracer.getConfiguration().getApiUrl()).buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", libToken);
            if (hostAppToken != null) {
                appendQueryParameter.appendQueryParameter("crashHostAppToken", hostAppToken);
            }
            String builder = appendQueryParameter.toString();
            HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
            httpMultipartBodyBuilder.addString("type", CrashUploaderLiteKt.SEVERITY_NON_FATAL);
            httpMultipartBodyBuilder.addString("format", "JVM_STACKTRACE");
            httpMultipartBodyBuilder.addString("severity", str);
            HttpRequestBody.Companion companion = HttpRequestBody.Companion;
            httpMultipartBodyBuilder.add("stackTrace", "stack.gzip", companion.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, gzippedByteArray));
            HttpMultipartBodyBuilder.add$default(httpMultipartBodyBuilder, "uploadBean", null, HttpRequestBody.Companion.fromString$default(companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jSONObject, null, 4, null), 2, null);
            if (gzippedByteArray2 != null) {
                httpMultipartBodyBuilder.add("logs", "logs.gzip", companion.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, gzippedByteArray2));
            }
            if (jSONArray != null) {
                httpMultipartBodyBuilder.add("drops", "drops.json", HttpRequestBody.Companion.fromString$default(companion, "application/json", jSONArray, null, 4, null));
            }
            try {
                HttpResponse execute = this.httpClientHolder.getHttpClient().execute(new HttpRequest(builder, httpMultipartBodyBuilder.build()));
                try {
                    int statusCode = execute.getStatusCode();
                    String message = execute.getMessage();
                    HttpResponseBody body = execute.getBody();
                    String contentType = body != null ? body.getContentType() : null;
                    HttpResponseBody body2 = execute.getBody();
                    this.commandHandler.handleResponse(contentType, (body2 == null || (bytes = body2.getBytes()) == null) ? null : brm0.u(bytes));
                    if (statusCode == 200) {
                        s3q0 s3q0Var = s3q0.a;
                        ro.e(execute, null);
                        return;
                    }
                    throw new IOException("HTTP " + statusCode + " " + message);
                } finally {
                }
            } catch (IOException e) {
                Log.e(BuildConfig.LIBRARY_PACKAGE_NAME, "Tracer crash report failed", e);
                getDropManager().drop(take);
            }
        } catch (Exception unused) {
            Log.e("Tracer", "No lib token");
        }
    }
}
