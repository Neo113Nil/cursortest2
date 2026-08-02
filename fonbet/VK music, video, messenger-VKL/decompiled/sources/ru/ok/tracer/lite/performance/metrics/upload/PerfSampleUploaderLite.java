package ru.ok.tracer.lite.performance.metrics.upload;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Log;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tracer.BuildConfig;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.commands.CommandsHandler;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.base.time.PrecisionClock;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.performance.metrics.PerfSampleLite;
import ru.ok.tracer.lite.performance.metrics.TracerPerformanceMetricsLiteKt;
import ru.ok.tracer.lite.upload.TracerLiteHttpClientHolder;
import ru.ok.tracer.lite.upload.UploadBeanUtilsLite;
import xsna.brm0;
import xsna.j5g;
import xsna.ro;
import xsna.s3q0;
import xsna.s5a;

/* compiled from: PerfSampleUploaderLite.kt */
/* loaded from: classes9.dex */
public final class PerfSampleUploaderLite {
    private final CommandsHandler commandHandler;
    private final TracerLiteHttpClientHolder httpClientHolder;
    private final TracerLiteLimits limits;
    private final String packageName;
    private final TracerLite tracer;
    private final long versionCode;
    private final String versionName;

    public PerfSampleUploaderLite(TracerLite tracerLite) {
        this.tracer = tracerLite;
        Context context = tracerLite.getContext();
        PackageInfo packageInfoCompat = PackageManagerCompat.getPackageInfoCompat(context.getPackageManager(), context.getPackageName(), 0);
        this.versionName = packageInfoCompat.versionName;
        this.versionCode = PackageInfoCompat.getLongVersionCodeCompat(packageInfoCompat);
        this.packageName = packageInfoCompat.packageName;
        this.httpClientHolder = TracerLiteHttpClientHolder.Companion.get(tracerLite);
        TracerLiteLimits tracerLiteLimits = TracerLiteLimits.Companion.get(tracerLite);
        this.limits = tracerLiteLimits;
        this.commandHandler = new CommandsHandler.Builder().setLimitsHandler(tracerLiteLimits).setFeatureName(TracerPerformanceMetricsLiteKt.FEATURE_PERFORMANCE_METRICS).build();
    }

    private final JSONObject attributesToJson(Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(key, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Long) {
                jSONObject.put(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                jSONObject.put(key, ((Number) value).doubleValue());
            } else if (value instanceof Byte) {
                jSONObject.put(key, value);
            } else if (value instanceof Short) {
                jSONObject.put(key, value);
            } else if (value instanceof Integer) {
                jSONObject.put(key, ((Number) value).intValue());
            } else if (value instanceof Float) {
                jSONObject.put(key, value);
            } else {
                jSONObject.put(key, value.toString());
            }
        }
        return jSONObject;
    }

    private final JSONObject nullableAttributesToJson(Map<String, ? extends Object> map) {
        if (map != null) {
            return attributesToJson(map);
        }
        return null;
    }

    private final JSONArray toJson(List<PerfSampleLite> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<PerfSampleLite> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(toJson(it.next()));
        }
        return jSONArray;
    }

    private final void uploadSingleSession(List<PerfSampleLite> list) {
        byte[] bytes;
        if (list.isEmpty()) {
            return;
        }
        try {
            String libToken = this.tracer.getLibToken();
            if (libToken == null) {
                throw new IllegalStateException("No lib token");
            }
            String hostAppToken = AppTokenUtils.getHostAppToken(this.tracer.getContext());
            JSONObject composeLibUploadBean$default = UploadBeanUtilsLite.composeLibUploadBean$default(this.tracer.getContext(), this.tracer.getLibraryInfo(), ((PerfSampleLite) j5g.Y(list)).getSessionUuid(), null, null, null, 56, null);
            composeLibUploadBean$default.put("clientTimeUnixNano", PrecisionClock.currentTimeNanos());
            composeLibUploadBean$default.put("samples", toJson(list));
            Uri.Builder appendQueryParameter = Uri.parse(this.tracer.getConfiguration().getApiUrl()).buildUpon().appendEncodedPath("api/perf/upload").appendQueryParameter("crashToken", libToken);
            if (hostAppToken != null) {
                appendQueryParameter.appendQueryParameter("crashHostAppToken", hostAppToken);
            }
            try {
                HttpResponse execute = this.httpClientHolder.getHttpClient().execute(new HttpRequest(appendQueryParameter.toString(), HttpRequestBody.Companion.fromString$default(HttpRequestBody.Companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, composeLibUploadBean$default.toString(), null, 4, null)));
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
                    } else {
                        throw new IOException("HTTP " + statusCode + " " + message);
                    }
                } finally {
                }
            } catch (IOException e) {
                Log.e(BuildConfig.LIBRARY_PACKAGE_NAME, "Tracer crash report failed", e);
            }
        } catch (Exception unused) {
            Log.e("Tracer", "No lib token");
        }
    }

    public final void upload(List<PerfSampleLite> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String sessionUuid = ((PerfSampleLite) obj).getSessionUuid();
            Object obj2 = linkedHashMap.get(sessionUuid);
            if (obj2 == null) {
                obj2 = s5a.a(sessionUuid, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            uploadSingleSession((List) ((Map.Entry) it.next()).getValue());
        }
    }

    private final JSONObject toJson(PerfSampleLite perfSampleLite) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeUnixNano", perfSampleLite.getTimeUnixNano());
        jSONObject.put("name", perfSampleLite.getName());
        jSONObject.put("value", perfSampleLite.getValue());
        jSONObject.put("unit", perfSampleLite.getUnit());
        Map<String, Object> attributes = perfSampleLite.getAttributes();
        if (attributes.isEmpty()) {
            attributes = null;
        }
        jSONObject.put("attributes", nullableAttributesToJson(attributes));
        return jSONObject;
    }
}
