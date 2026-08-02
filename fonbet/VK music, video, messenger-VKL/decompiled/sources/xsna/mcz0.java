package xsna;

import android.net.TrafficStats;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mcz0 extends s770 {
    public static mcz0 s() {
        return new mcz0();
    }

    @Override // xsna.s770
    public final qez0 d(String str, String str2, Map map) {
        HttpURLConnection httpURLConnection;
        qez0 qez0Var = new qez0();
        if (str2 == null) {
            gu8.c(null, "HttpLogRequest: Can't send log request - body is null");
            qez0Var.a = false;
            return qez0Var;
        }
        gu8.c(null, "HttpLogRequest: Send log request");
        try {
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                fqa.b(httpURLConnection);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
                return qez0Var;
            } catch (Throwable th) {
                th = th;
                try {
                    qez0Var.a = false;
                    qez0Var.d = th.getMessage();
                    gu8.c(null, "HttpLogRequest: Log request error - " + qez0Var.d);
                    return qez0Var;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }
}
