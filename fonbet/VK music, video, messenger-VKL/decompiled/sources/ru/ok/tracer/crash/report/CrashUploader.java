package ru.ok.tracer.crash.report;

import android.net.Uri;
import android.util.Log;
import com.ironsource.X3;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.drop.DropRecord;
import ru.ok.tracer.base.drop.DropRecordSerializer;
import ru.ok.tracer.base.http.HttpMultipartBodyBuilder;
import ru.ok.tracer.base.http.HttpRequest;
import ru.ok.tracer.base.http.HttpRequestBody;
import ru.ok.tracer.base.http.HttpResponse;
import ru.ok.tracer.base.http.HttpResponseBody;
import ru.ok.tracer.base.io.GZIPUtils;
import ru.ok.tracer.upload.NetworkResponseHandler;
import ru.ok.tracer.utils.Logger;
import xsna.brm0;
import xsna.emb;
import xsna.nbr;
import xsna.s3q0;

/* compiled from: CrashUploader.kt */
/* loaded from: classes9.dex */
public final class CrashUploader {

    /* compiled from: CrashUploader.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReportType.values().length];
            try {
                iArr[ReportType.MINIDUMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReportType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final DropManager getDropManager() {
        return Tracer.INSTANCE.getDropManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void upload$default(CrashUploader crashUploader, CrashDescription crashDescription, Collection collection, int i, Object obj) {
        if ((i & 2) != 0) {
            collection = null;
        }
        crashUploader.upload(crashDescription, collection);
    }

    public final void upload(List<CrashDescription> list) {
        list.size();
        int size = list.size();
        int i = 0;
        while (i < size) {
            CrashDescription crashDescription = list.get(i);
            Collection<DropRecord> take = i == 0 ? getDropManager().take() : null;
            try {
                upload(crashDescription, take);
                crashDescription.delete();
            } catch (Throwable unused) {
                if (take != null) {
                    getDropManager().drop(take);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:56:0x0190, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:63:0x01b4, B:64:0x01bb, B:66:0x01d0, B:69:0x01ea), top: B:55:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:56:0x0190, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:63:0x01b4, B:64:0x01bb, B:66:0x01d0, B:69:0x01ea), top: B:55:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #1 {all -> 0x01a4, blocks: (B:56:0x0190, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:63:0x01b4, B:64:0x01bb, B:66:0x01d0, B:69:0x01ea), top: B:55:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void upload(CrashDescription crashDescription, Collection<DropRecord> collection) {
        String str;
        ReportType type;
        int i;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        int statusCode;
        byte[] bytes;
        JSONArray jsonArray;
        Tracer tracer = Tracer.INSTANCE;
        String appToken = tracer.getAppToken();
        if (appToken == null) {
            Logger.w$default("No app token", null, 2, null);
            return;
        }
        File file = new File(crashDescription.getSystemStatePath());
        if (!file.exists()) {
            Logger.e$default("System info not exists", null, 2, null);
            return;
        }
        Charset charset = emb.b;
        String r = nbr.r(file, charset);
        File file2 = new File(crashDescription.getTagsPath());
        if (!file2.exists()) {
            file2 = null;
        }
        String r2 = file2 != null ? nbr.r(file2, charset) : null;
        JSONObject jSONObject = new JSONObject(r);
        if (r2 != null) {
            jSONObject.put("tags", new JSONArray(r2));
        }
        String jSONObject2 = jSONObject.toString();
        byte[] readBytesToGzippedByteArray = GZIPUtils.readBytesToGzippedByteArray(new File(crashDescription.getStacktracePath()));
        File file3 = new File(crashDescription.getAllStacktracesPath());
        byte[] readBytesToGzippedByteArray2 = file3.exists() ? GZIPUtils.readBytesToGzippedByteArray(file3) : null;
        File file4 = new File(crashDescription.getLogsPath());
        byte[] readBytesToGzippedByteArray3 = file4.exists() ? GZIPUtils.readBytesToGzippedByteArray(file4) : null;
        try {
            if (collection != null) {
                Collection<DropRecord> collection2 = !collection.isEmpty() ? collection : null;
                if (collection2 != null && (jsonArray = DropRecordSerializer.INSTANCE.toJsonArray(collection2)) != null) {
                    str = jsonArray.toString();
                    type = crashDescription.getType();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    i = iArr[type.ordinal()];
                    if (i == 1 && i != 2) {
                        str2 = "stackTrace";
                    } else {
                        str2 = X3.i.b;
                    }
                    i2 = iArr[type.ordinal()];
                    if (i2 == 1 && i2 != 2) {
                        str3 = "stack.gzip";
                    } else {
                        str3 = "file.gzip";
                    }
                    i3 = iArr[type.ordinal()];
                    if (i3 != 1) {
                        str4 = "api/crash/uploadNative";
                    } else if (i3 != 2) {
                        str4 = "api/crash/upload";
                    } else {
                        str4 = "api/crash/uploadAnr";
                    }
                    String builder = Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath(str4).appendQueryParameter("crashToken", appToken).toString();
                    HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
                    httpMultipartBodyBuilder.addString("type", type.getType());
                    httpMultipartBodyBuilder.addString("format", type.getFormat());
                    if (type.getSeverity() != null) {
                        httpMultipartBodyBuilder.addString("severity", type.getSeverity());
                    }
                    HttpRequestBody.Companion companion = HttpRequestBody.Companion;
                    httpMultipartBodyBuilder.add(str2, str3, companion.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, readBytesToGzippedByteArray));
                    HttpMultipartBodyBuilder.add$default(httpMultipartBodyBuilder, "uploadBean", null, HttpRequestBody.Companion.fromString$default(companion, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jSONObject2, null, 4, null), 2, null);
                    if (readBytesToGzippedByteArray2 != null) {
                        httpMultipartBodyBuilder.add("threadDump", "threads.gzip", companion.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, readBytesToGzippedByteArray2));
                    }
                    if (readBytesToGzippedByteArray3 != null) {
                        httpMultipartBodyBuilder.add("logs", "logs.gzip", companion.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, readBytesToGzippedByteArray3));
                    }
                    if (str != null) {
                        httpMultipartBodyBuilder.add("drops", "drops.json", HttpRequestBody.Companion.fromString$default(companion, "application/json", str, null, 4, null));
                    }
                    HttpRequest httpRequest = new HttpRequest(builder, httpMultipartBodyBuilder.build());
                    httpRequest.getUrl();
                    HttpResponse execute = tracer.getHttpClient().execute(httpRequest);
                    statusCode = execute.getStatusCode();
                    String message = execute.getMessage();
                    HttpResponseBody body = execute.getBody();
                    String contentType = body == null ? body.getContentType() : null;
                    HttpResponseBody body2 = execute.getBody();
                    String u = (body2 != null || (bytes = body2.getBytes()) == null) ? null : brm0.u(bytes);
                    NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, u, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT().getName(), null, 8, null);
                    if (statusCode == 200) {
                        Log.e("Tracer", message + " , " + u);
                    } else {
                        Logger.d$default("Result: " + u, null, 2, null);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    execute.close();
                    return;
                }
            }
            statusCode = execute.getStatusCode();
            String message2 = execute.getMessage();
            HttpResponseBody body3 = execute.getBody();
            if (body3 == null) {
            }
            HttpResponseBody body22 = execute.getBody();
            if (body22 != null) {
            }
            NetworkResponseHandler.universalHandleResponse$default(NetworkResponseHandler.INSTANCE, contentType, u, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT().getName(), null, 8, null);
            if (statusCode == 200) {
            }
            execute.close();
            return;
        } finally {
        }
        str = null;
        type = crashDescription.getType();
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        i = iArr2[type.ordinal()];
        if (i == 1) {
        }
        str2 = X3.i.b;
        i2 = iArr2[type.ordinal()];
        if (i2 == 1) {
        }
        str3 = "file.gzip";
        i3 = iArr2[type.ordinal()];
        if (i3 != 1) {
        }
        String builder2 = Uri.parse(CoreTracerConfiguration.Companion.get().getApiUrl()).buildUpon().appendEncodedPath(str4).appendQueryParameter("crashToken", appToken).toString();
        HttpMultipartBodyBuilder httpMultipartBodyBuilder2 = new HttpMultipartBodyBuilder();
        httpMultipartBodyBuilder2.addString("type", type.getType());
        httpMultipartBodyBuilder2.addString("format", type.getFormat());
        if (type.getSeverity() != null) {
        }
        HttpRequestBody.Companion companion2 = HttpRequestBody.Companion;
        httpMultipartBodyBuilder2.add(str2, str3, companion2.fromBytes(Http.ContentType.APPLICATION_OCTET_STREAM, readBytesToGzippedByteArray));
        HttpMultipartBodyBuilder.add$default(httpMultipartBodyBuilder2, "uploadBean", null, HttpRequestBody.Companion.fromString$default(companion2, BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jSONObject2, null, 4, null), 2, null);
        if (readBytesToGzippedByteArray2 != null) {
        }
        if (readBytesToGzippedByteArray3 != null) {
        }
        if (str != null) {
        }
        HttpRequest httpRequest2 = new HttpRequest(builder2, httpMultipartBodyBuilder2.build());
        httpRequest2.getUrl();
        HttpResponse execute2 = tracer.getHttpClient().execute(httpRequest2);
    }
}
