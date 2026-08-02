package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ibz0 extends s770 {
    public final qez0 c = new qez0();

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[Catch: all -> 0x010a, TryCatch #4 {all -> 0x010a, blocks: (B:21:0x00df, B:23:0x0100, B:25:0x0106, B:32:0x010c, B:37:0x011e, B:38:0x0134, B:34:0x0119), top: B:20:0x00df, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #4 {all -> 0x010a, blocks: (B:21:0x00df, B:23:0x0100, B:25:0x0106, B:32:0x010c, B:37:0x011e, B:38:0x0134, B:34:0x0119), top: B:20:0x00df, inners: #5 }] */
    @Override // xsna.s770
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qez0 d(String str, String str2, Map map) {
        qez0 qez0Var;
        HttpURLConnection httpURLConnection;
        int responseCode;
        Bitmap decodeFile;
        qez0 qez0Var2;
        Context context = idy0.b;
        j0z0 g = context == null ? null : j0z0.g(context);
        if (g != null) {
            qez0 qez0Var3 = this.c;
            synchronized (g) {
                try {
                    g.n();
                    File d = g.d(str, ".img");
                    if (d.exists()) {
                        gu8.c(null, "DiskCache: Get image - " + d.getPath());
                        try {
                            if (d.exists()) {
                                decodeFile = BitmapFactory.decodeFile(d.getAbsolutePath());
                            } else {
                                gu8.c(null, "DiskCache: File disappeared before reading: " + d.getPath());
                            }
                        } catch (OutOfMemoryError e) {
                            System.gc();
                            gu8.d("DiskCache: OutOfMemoryError, trying once again");
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inSampleSize = 2;
                                decodeFile = BitmapFactory.decodeFile(d.getAbsolutePath(), options);
                            } catch (OutOfMemoryError unused) {
                                gu8.d("DiskCache: OutOfMemoryError, called twice - " + e);
                                decodeFile = null;
                                qez0Var3.c = decodeFile;
                                qez0Var2 = this.c;
                                if (qez0Var2.c != null) {
                                }
                                qez0Var = this.c;
                                gu8.c(null, "HttpImageRequest: Send image request - " + str);
                                TrafficStats.setThreadStatsTag(98543098);
                                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                                httpURLConnection.setReadTimeout(10000);
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                                fqa.b(httpURLConnection);
                                httpURLConnection.connect();
                                responseCode = httpURLConnection.getResponseCode();
                                qez0Var.b = responseCode;
                                if (responseCode != 200) {
                                }
                                if (httpURLConnection != null) {
                                }
                                return this.c;
                            }
                        } catch (Throwable th) {
                            gu8.d("DiskCache: exception - " + th);
                            decodeFile = null;
                        }
                    }
                    decodeFile = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qez0Var3.c = decodeFile;
            qez0Var2 = this.c;
            if (qez0Var2.c != null) {
                return qez0Var2;
            }
        } else {
            wga0.b("HttpImageRequest: Unable to open disk cache and get image - ", str, null);
        }
        qez0Var = this.c;
        try {
            gu8.c(null, "HttpImageRequest: Send image request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            fqa.b(httpURLConnection);
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
            qez0Var.b = responseCode;
            if (responseCode != 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (g != null) {
                    s(g, inputStream, str);
                } else {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
                    qez0Var.c = BitmapFactory.decodeStream(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th4) {
                        gu8.c(null, "HttpImageRequest: Load in memory error - " + th4.getMessage());
                    }
                }
            } else {
                qez0Var.a = false;
                qez0Var.d = "Image request error - response code " + responseCode;
                gu8.c(null, "HttpImageRequest: " + qez0Var.d);
            }
        } catch (Throwable th5) {
            th = th5;
            qez0Var.a = false;
            qez0Var.d = th.getMessage();
            qjk0.a(new StringBuilder("HttpImageRequest: Image request error - "), qez0Var.d, null);
            if (httpURLConnection != null) {
            }
            return this.c;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return this.c;
    }

    public final void s(j0z0 j0z0Var, InputStream inputStream, String str) {
        File b;
        synchronized (j0z0Var) {
            j0z0Var.n();
            File d = j0z0Var.d(str, ".img");
            gu8.c(null, "DiskCache: Save image - " + d.getPath());
            b = j0z0.b(inputStream, d);
        }
        if (b != null) {
            this.c.c = BitmapFactory.decodeFile(b.getAbsolutePath());
        } else {
            qez0 qez0Var = this.c;
            qez0Var.a = false;
            qez0Var.d = "Image request error - can't save image to disk cache";
            qjk0.a(new StringBuilder("HttpImageRequest: Load in cache error - "), this.c.d, null);
        }
    }
}
