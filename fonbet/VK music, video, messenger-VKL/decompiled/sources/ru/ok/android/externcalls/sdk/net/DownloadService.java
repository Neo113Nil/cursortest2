package ru.ok.android.externcalls.sdk.net;

import android.util.Patterns;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.internal.operators.single.b;
import io.reactivex.rxjava3.schedulers.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import kotlin.io.FileAlreadyExistsException;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;
import ru.ok.android.util.FileUtilKt;
import ru.ok.android.util.Files;
import ru.ok.android.util.IOUtil;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.hash.DigestOutputStream;
import ru.ok.android.webrtc.hash.HashUtilKt;
import xsna.epx;
import xsna.s3q0;
import xsna.wje;
import xsna.xe9;
import xsna.zcl;

/* compiled from: DownloadService.kt */
/* loaded from: classes9.dex */
public interface DownloadService {

    /* compiled from: DownloadService.kt */
    public static final class Impl implements DownloadService {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String LOG_TAG = "DownloadService.Impl";
        private final RTCLog logger;

        /* compiled from: DownloadService.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private Companion() {
            }
        }

        public Impl(RTCLog rTCLog) {
            this.logger = rTCLog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void download$lambda$0(String str, File file, FileValidationConfig fileValidationConfig, Impl impl, y yVar) {
            String str2;
            File file2;
            Impl impl2;
            Exception exc;
            File file3;
            long j;
            try {
            } catch (Exception e) {
                e = e;
                str2 = str;
                file2 = file;
                impl2 = impl;
            }
            try {
                if (!Patterns.WEB_URL.matcher(str).matches()) {
                    throw new IllegalArgumentException("Url is invalid " + str);
                }
                if (file.exists()) {
                    try {
                        if (yVar.h()) {
                            return;
                        }
                        yVar.onError(new FileAlreadyExistsException(file, null, null));
                        return;
                    } catch (Exception e2) {
                        exc = e2;
                        str2 = str;
                        file2 = file;
                        impl2 = impl;
                        RTCLog rTCLog = impl2.logger;
                        StringBuilder a = xe9.a("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
                        a.append(exc);
                        rTCLog.log(LOG_TAG, a.toString());
                        FileUtilKt.deleteSafely(file2, new wje(impl2, 16));
                        if (yVar.h()) {
                            yVar.onError(exc);
                            return;
                        }
                        return;
                    }
                }
                FileUtilKt.ensureDirExist(file);
                if (fileValidationConfig == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    file3 = file;
                    downloadInner$default(impl, str, file3, null, 4, null);
                    j = System.currentTimeMillis() - currentTimeMillis;
                } else {
                    file3 = file;
                    MessageDigest messageDigest = MessageDigest.getInstance(fileValidationConfig.getHashAlgorithm().getStringValue());
                    long currentTimeMillis2 = System.currentTimeMillis();
                    impl.downloadInner(str, file3, messageDigest);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    if (!epx.f(HashUtilKt.checksum(messageDigest), fileValidationConfig.getExpectedChecksum())) {
                        throw new RuntimeException("Downloaded model is corrupted");
                    }
                    j = currentTimeMillis3;
                }
                if (yVar.h()) {
                    return;
                }
                yVar.onSuccess(new DownloadResult(file3, j));
            } catch (Exception e3) {
                e = e3;
                exc = e;
                RTCLog rTCLog2 = impl2.logger;
                StringBuilder a2 = xe9.a("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
                a2.append(exc);
                rTCLog2.log(LOG_TAG, a2.toString());
                FileUtilKt.deleteSafely(file2, new wje(impl2, 16));
                if (yVar.h()) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s3q0 download$lambda$0$3(Impl impl, String str) {
            impl.logger.log(LOG_TAG, str);
            return s3q0.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.io.OutputStream[]] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void downloadInner(String str, File file, MessageDigest messageDigest) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            Closeable closeable;
            HttpURLConnection httpURLConnection2;
            DigestOutputStream digestOutputStream = messageDigest != null ? new DigestOutputStream(messageDigest) : null;
            try {
                httpURLConnection = new URL(str).openConnection();
                try {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        closeable = new FileOutputStream(file);
                        try {
                            Files.streamCopy(inputStream, (OutputStream[]) new OutputStream[]{closeable, digestOutputStream});
                            IOUtil.INSTANCE.close(inputStream, closeable, digestOutputStream);
                            httpURLConnection2 = httpURLConnection instanceof HttpURLConnection ? (HttpURLConnection) httpURLConnection : null;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            IOUtil.INSTANCE.close(inputStream, closeable, digestOutputStream);
                            httpURLConnection2 = httpURLConnection instanceof HttpURLConnection ? httpURLConnection : null;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    httpURLConnection = httpURLConnection;
                    closeable = inputStream;
                    IOUtil.INSTANCE.close(inputStream, closeable, digestOutputStream);
                    if (httpURLConnection instanceof HttpURLConnection) {
                    }
                    if (httpURLConnection2 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = 0;
                inputStream = null;
            }
        }

        public static /* synthetic */ void downloadInner$default(Impl impl, String str, File file, MessageDigest messageDigest, int i, Object obj) {
            if ((i & 4) != 0) {
                messageDigest = null;
            }
            impl.downloadInner(str, file, messageDigest);
        }

        @Override // ru.ok.android.externcalls.sdk.net.DownloadService
        public x<DownloadResult> download(final String str, final File file, final FileValidationConfig fileValidationConfig) {
            return new b(new a0() { // from class: xsna.s9o
                @Override // io.reactivex.rxjava3.core.a0
                public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                    DownloadService.Impl.download$lambda$0(str, file, fileValidationConfig, this, yVar);
                }
            }).q(a.b());
        }
    }

    static /* synthetic */ x download$default(DownloadService downloadService, String str, File file, FileValidationConfig fileValidationConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i & 4) != 0) {
            fileValidationConfig = null;
        }
        return downloadService.download(str, file, fileValidationConfig);
    }

    x<DownloadResult> download(String str, File file, FileValidationConfig fileValidationConfig);
}
