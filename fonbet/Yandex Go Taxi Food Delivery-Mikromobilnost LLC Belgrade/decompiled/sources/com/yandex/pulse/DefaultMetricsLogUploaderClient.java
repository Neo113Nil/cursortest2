package com.yandex.pulse;

import android.os.Build;
import android.os.Message;
import com.yandex.pulse.DefaultMetricsLogUploaderClient;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.ad20;
import defpackage.b64;
import defpackage.bfh;
import defpackage.cd20;
import defpackage.csq0;
import defpackage.dd20;
import defpackage.ny61;
import defpackage.od20;
import defpackage.u941;
import defpackage.xc20;
import defpackage.y0b0;
import defpackage.yc20;
import defpackage.zc20;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.network.Request;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient;", "Lad20;", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "", "uploadURL", "", "enableLogging", "<init>", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Z)V", "getMetricsServerUrl", "()Ljava/lang/String;", "serverUrl", "mimeType", "logHashHeader", "Lyc20;", "onUploadComplete", "Lzc20;", "createUploader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyc20;)Lzc20;", "Ljava/lang/String;", "Z", "Lcsq0;", "Lcsq0;", "LogUploader", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultMetricsLogUploaderClient implements ad20 {
    private final csq0 backgroundExecutor;
    private final boolean enableLogging;
    private final String uploadURL;

    public DefaultMetricsLogUploaderClient(Executor executor, String str, boolean z) {
        this.uploadURL = str;
        this.enableLogging = z;
        this.backgroundExecutor = new csq0(executor);
    }

    @Override // defpackage.ad20
    public zc20 createUploader(String serverUrl, String mimeType, String logHashHeader, yc20 onUploadComplete) {
        return new LogUploader(this.backgroundExecutor, serverUrl, mimeType, logHashHeader, onUploadComplete, this.enableLogging);
    }

    @Override // defpackage.ad20
    /* renamed from: getMetricsServerUrl, reason: from getter */
    public String getUploadURL() {
        return this.uploadURL;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient$LogUploader;", "Lzc20;", "Lu941;", "handlerCallback", "Lu941;", "Companion", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LogUploader implements zc20 {
        public static final Companion h = new Companion(null);
        public final Executor a;
        public final String b;
        public final String c;
        public final String d;
        public final yc20 e;
        public final String f = h.getUserAgent();
        public final WeakHandler g;
        private final u941 handlerCallback;

        public LogUploader(Executor executor, String str, String str2, String str3, yc20 yc20Var, boolean z) {
            LogUploader logUploader;
            Object defaultMetricsLogUploaderClient$LogUploader$handlerCallback$2;
            this.a = executor;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = yc20Var;
            if (z) {
                defaultMetricsLogUploaderClient$LogUploader$handlerCallback$2 = new DefaultMetricsLogUploaderClient$LogUploader$handlerCallback$1(this);
                logUploader = this;
            } else {
                logUploader = this;
                defaultMetricsLogUploaderClient$LogUploader$handlerCallback$2 = new DefaultMetricsLogUploaderClient$LogUploader$handlerCallback$2(1, logUploader, LogUploader.class, "onUploadComplete", "onUploadComplete(Landroid/os/Message;)V", 0);
            }
            bfh bfhVar = new bfh(0, defaultMetricsLogUploaderClient$LogUploader$handlerCallback$2);
            logUploader.handlerCallback = bfhVar;
            logUploader.g = new WeakHandler(bfhVar);
        }

        @Override // defpackage.zc20
        public final void a(final String str, final byte[] bArr) {
            this.a.execute(new Runnable() { // from class: com.yandex.pulse.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    URLConnection openConnection;
                    OutputStream outputStream;
                    DefaultMetricsLogUploaderClient.LogUploader logUploader = DefaultMetricsLogUploaderClient.LogUploader.this;
                    byte[] bArr2 = bArr;
                    String str2 = str;
                    DefaultMetricsLogUploaderClient.LogUploader.Companion companion = DefaultMetricsLogUploaderClient.LogUploader.h;
                    HttpURLConnection httpURLConnection = null;
                    try {
                        openConnection = new URL(logUploader.b).openConnection();
                    } catch (Throwable unused) {
                    }
                    if (openConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setRequestProperty("Content-Type", logUploader.c);
                        httpURLConnection2.setRequestProperty("Content-Encoding", Request.PARAM_GZIP);
                        httpURLConnection2.setRequestProperty(ExtFunctionsKt.HEADER_USER_AGENT, logUploader.f);
                        httpURLConnection2.setRequestProperty(logUploader.d, str2);
                        httpURLConnection2.setFixedLengthStreamingMode(bArr2.length);
                        httpURLConnection2.setDoOutput(true);
                        outputStream = httpURLConnection2.getOutputStream();
                    } catch (Throwable unused2) {
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        i = -1;
                        logUploader.g.obtainMessage(0, i, 0).sendToTarget();
                    }
                    try {
                        outputStream.write(bArr2);
                        outputStream.close();
                        i = httpURLConnection2.getResponseCode();
                        httpURLConnection2.disconnect();
                        logUploader.g.obtainMessage(0, i, 0).sendToTarget();
                    } finally {
                    }
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        
            if (r11 == 400) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(Message message) {
            ArrayList arrayList;
            int i;
            boolean z;
            int i2 = message.arg1;
            dd20 dd20Var = ((cd20) this.e).a;
            xc20 xc20Var = dd20Var.b;
            boolean z2 = true;
            dd20.h.a(i2, 1);
            boolean z3 = i2 == 200;
            boolean a = xc20Var.a();
            y0b0 y0b0Var = xc20Var.b;
            y0b0 y0b0Var2 = xc20Var.a;
            if (a) {
                if (y0b0Var2.a()) {
                    arrayList = y0b0Var2.e;
                    i = y0b0Var2.f;
                } else {
                    arrayList = y0b0Var.e;
                    i = y0b0Var.f;
                }
                int length = ((od20) arrayList.get(i)).getCompressedLogData().p().length;
                if (z3) {
                    dd20.i.b(length / 1024);
                } else {
                    if (length > 102400) {
                        dd20.j.b(length);
                    }
                    z = true;
                    if (!z3 || z) {
                        xc20Var.a();
                        if (y0b0Var2.a()) {
                            if (!y0b0Var.a()) {
                                ny61.r("No staged log to discard");
                                return;
                            } else {
                                y0b0Var.e.remove(y0b0Var.f);
                                y0b0Var.f = -1;
                            }
                        } else if (!y0b0Var2.a()) {
                            ny61.r("No staged log to discard");
                            return;
                        } else {
                            y0b0Var2.e.remove(y0b0Var2.f);
                            y0b0Var2.f = -1;
                        }
                        xc20Var.a();
                        if (xc20Var.c) {
                            y0b0Var2.c();
                            y0b0Var.c();
                        }
                    }
                }
                z = false;
                if (!z3) {
                }
                xc20Var.a();
                if (y0b0Var2.a()) {
                }
                xc20Var.a();
                if (xc20Var.c) {
                }
            }
            if (!z3 && i2 != 400) {
                z2 = false;
            }
            if (!xc20Var.b()) {
                dd20Var.e.stop();
            }
            dd20Var.e.a(z2);
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/pulse/DefaultMetricsLogUploaderClient$LogUploader$Companion;", "", "()V", "TAG", "", "UPLOAD_COMPLETE_MESSAGE_ID", "", "getUserAgent", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getUserAgent() {
                StringBuilder sb = new StringBuilder("com.yandex.pulse/5.2.0 (");
                sb.append(Build.MODEL);
                sb.append("; Android ");
                return b64.p(sb, Build.VERSION.RELEASE, ')');
            }

            private Companion() {
            }
        }
    }
}
