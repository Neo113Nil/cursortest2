package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.ironsource.X3;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.SystemStateSerializer;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import xsna.brm0;
import xsna.ozl;
import xsna.ro;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SampleUploadWorker.kt */
/* loaded from: classes9.dex */
public final class SampleUploadWorker extends Worker {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_ATTR1 = "tracer_attr1";
    private static final String PARAM_ATTR2 = "tracer_attr2";
    private static final String PARAM_CUSTOM_PROPERTIES_KEYS = "tracer_custom_properties_keys";
    private static final String PARAM_FEATURE_NAME = "tracer_feature_name";
    private static final String PARAM_FEATURE_TAG = "tracer_feature_tag";
    private static final String PARAM_FEATURE_USE_GZIP = "tracer_feature_uze_gzip";
    private static final String PARAM_HAS_ATTR1 = "tracer_has_attr1";
    private static final String PARAM_HAS_ATTR2 = "tracer_has_attr2";
    private static final String PARAM_SAMPLE_FILE_NAME = "tracer_sample_file_name";
    private static final String PARAM_SAMPLE_FILE_PATH = "tracer_sample_file_path";
    private static final String PARAM_SAMPLE_FILE_SIZE = "tracer_sample_file_size";
    private static final String PARAM_VERSION_CODE = "tracer_version_code";

    /* compiled from: SampleUploadWorker.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        @ozl
        public final Data createData(TracerFeature tracerFeature, File file, boolean z, String str, Long l, long j, Map<String, String> map) {
            return createData$tracer_sample_upload_release(tracerFeature, file, Long.valueOf(file.length()), file.getName(), z, str, l, null, j, map);
        }

        public final Data createData$tracer_sample_upload_release(TracerFeature tracerFeature, File file, Long l, String str, boolean z, String str2, Long l2, Long l3, long j, Map<String, String> map) {
            Data.a aVar = new Data.a();
            aVar.d(SampleUploadWorker.PARAM_FEATURE_NAME, tracerFeature.getName());
            Boolean valueOf = Boolean.valueOf(z);
            LinkedHashMap linkedHashMap = aVar.a;
            linkedHashMap.put(SampleUploadWorker.PARAM_FEATURE_USE_GZIP, valueOf);
            aVar.d(SampleUploadWorker.PARAM_SAMPLE_FILE_PATH, file.getPath());
            linkedHashMap.put(SampleUploadWorker.PARAM_SAMPLE_FILE_SIZE, Long.valueOf(l != null ? l.longValue() : -1L));
            aVar.d(SampleUploadWorker.PARAM_SAMPLE_FILE_NAME, str);
            aVar.d(SampleUploadWorker.PARAM_FEATURE_TAG, str2);
            if (l2 != null) {
                linkedHashMap.put(SampleUploadWorker.PARAM_HAS_ATTR1, Boolean.TRUE);
                linkedHashMap.put(SampleUploadWorker.PARAM_ATTR1, l2);
            }
            if (l3 != null) {
                linkedHashMap.put(SampleUploadWorker.PARAM_HAS_ATTR2, Boolean.TRUE);
                linkedHashMap.put(SampleUploadWorker.PARAM_ATTR2, l3);
            }
            linkedHashMap.put(SampleUploadWorker.PARAM_CUSTOM_PROPERTIES_KEYS, (String[]) map.keySet().toArray(new String[0]));
            aVar.c(map);
            linkedHashMap.put(SampleUploadWorker.PARAM_VERSION_CODE, Long.valueOf(j));
            return aVar.a();
        }

        private Companion() {
        }
    }

    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private final String getFeatureName() {
        return getInputData().d(PARAM_FEATURE_NAME);
    }

    private final String getTag() {
        return getInputData().d(PARAM_FEATURE_TAG);
    }

    private final String getUploadToken(Long l, String str) {
        SystemState withCustomProperties;
        String appToken = Tracer.INSTANCE.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return null;
        }
        MapBuilder mapBuilder = new MapBuilder();
        String[] e = getInputData().e(PARAM_CUSTOM_PROPERTIES_KEYS);
        if (e == null) {
            e = new String[0];
        }
        for (String str2 : e) {
            String d = getInputData().d(str2);
            if (d != null) {
                mapBuilder.put(str2, d);
            }
        }
        MapBuilder h = mapBuilder.h();
        Tracer tracer = Tracer.INSTANCE;
        withCustomProperties = SampleUploadWorkerKt.withCustomProperties(tracer.getStateStorage().getCurrentSystemState(), h);
        JSONObject jsonObject = SystemStateSerializer.INSTANCE.toJsonObject(withCustomProperties.withCurrentDate());
        jsonObject.put(SignalingProtocol.KEY_FEATURE, getFeatureName());
        jsonObject.put("sampleSize", l);
        jsonObject.put("sampleFileName", str);
        if (getInputData().b(PARAM_HAS_ATTR1, false)) {
            jsonObject.put("attr1", getInputData().c(PARAM_ATTR1, 0L));
        }
        if (getInputData().b(PARAM_HAS_ATTR2, false)) {
            jsonObject.put("attr2", getInputData().c(PARAM_ATTR2, 0L));
        }
        if (getTag() != null) {
            jsonObject.put("tag", getTag());
        }
        HttpRequest httpRequest = new HttpRequest(Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath("api/sample/initUpload").appendQueryParameter("sampleToken", appToken).toString(), HttpRequestBody.Companion.fromString$default(HttpRequestBody.Companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jsonObject.toString(), null, 4, null));
        jsonObject.toString();
        HttpResponse execute = tracer.getHttpClient().execute(httpRequest);
        try {
            HttpResponseBody body = execute.getBody();
            if (body == null) {
                s3q0 s3q0Var = s3q0.a;
                execute.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject(brm0.u(body.getBytes()));
            NetworkResponseHandler.INSTANCE.universalHandleResponse(jSONObject, getFeatureName(), getTag());
            if (execute.getStatusCode() != 200) {
                execute.close();
                return null;
            }
            String string = jSONObject.getString("uploadToken");
            execute.close();
            return string;
        } finally {
        }
    }

    private final void uploadFile(String str, File file) {
        byte[] bytes;
        if (getInputData().b(PARAM_FEATURE_USE_GZIP, true)) {
            File createTempFile = TracerFiles.INSTANCE.createTempFile(getApplicationContext(), getId().toString());
            try {
                SampleUtils.gzipTo$default(file, createTempFile, 0, 2, null);
                file.length();
                createTempFile.length();
                file.delete();
                file = createTempFile;
            } catch (IOException e) {
                createTempFile.delete();
                throw e;
            }
        } else {
            file.length();
        }
        String builder = Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", str).toString();
        HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
        httpMultipartBodyBuilder.add(X3.i.b, "sample", HttpRequestBody.Companion.fromFile(Http.ContentType.APPLICATION_OCTET_STREAM, file));
        try {
            HttpResponse execute = Tracer.INSTANCE.getHttpClient().execute(new HttpRequest(builder, httpMultipartBodyBuilder.build()));
            try {
                int statusCode = execute.getStatusCode();
                String message = execute.getMessage();
                HttpResponseBody body = execute.getBody();
                String contentType = body != null ? body.getContentType() : null;
                HttpResponseBody body2 = execute.getBody();
                String u = (body2 == null || (bytes = body2.getBytes()) == null) ? null : brm0.u(bytes);
                NetworkResponseHandler.INSTANCE.universalHandleResponse(contentType, u, getFeatureName(), getTag());
                if (statusCode != 200) {
                    Log.e("Tracer", message + " , " + u);
                } else {
                    Logger.d$default("Result: " + u, null, 2, null);
                    s3q0 s3q0Var = s3q0.a;
                }
                ro.e(execute, null);
            } finally {
            }
        } catch (Exception unused) {
        } finally {
            file.delete();
        }
    }

    @Override // androidx.work.Worker
    public b.a doWork() {
        File file;
        File file2 = null;
        try {
            file = new File(getInputData().d(PARAM_SAMPLE_FILE_PATH));
        } catch (Exception unused) {
        }
        try {
        } catch (Exception unused2) {
            file2 = file;
            if (file2 != null && file2.exists()) {
                file2.delete();
            }
            return new b.a.c();
        }
        if (!file.exists()) {
            Logger.w$default("sample file not exists with path: " + file.getPath(), null, 2, null);
            return new b.a.c();
        }
        Long valueOf = Long.valueOf(getInputData().c(PARAM_SAMPLE_FILE_SIZE, -1L));
        Long l = valueOf.longValue() > 0 ? valueOf : null;
        String d = getInputData().d(PARAM_SAMPLE_FILE_NAME);
        if (PackageInfoCompat.getLongVersionCodeCompat(PackageManagerCompat.getPackageInfoCompat(getApplicationContext().getPackageManager(), getApplicationContext().getPackageName(), 0)) != getInputData().c(PARAM_VERSION_CODE, 0L)) {
            file.delete();
            return new b.a.c();
        }
        String uploadToken = getUploadToken(l, d);
        if (uploadToken != null) {
            uploadFile(uploadToken, file);
        }
        return new b.a.c();
    }
}
