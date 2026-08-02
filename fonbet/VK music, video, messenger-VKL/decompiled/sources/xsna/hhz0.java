package xsna;

import android.content.Context;
import android.net.TrafficStats;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hhz0 extends s770 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    @Override // xsna.s770
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qez0 d(String str, String str2, Map map) {
        HttpURLConnection httpURLConnection;
        qez0 qez0Var = new qez0();
        Context context = idy0.b;
        j0z0 g = context == null ? null : j0z0.g(context);
        if (g == null) {
            wga0.b("HttpVideoRequest: Unable to open disk cache and load/save video ", str, null);
            qez0Var.a = false;
            return qez0Var;
        }
        String f = g.f(str, ".mp4");
        qez0Var.c = f;
        if (f == null) {
            try {
                gu8.c(null, "HttpVideoRequest: Send video request - " + str);
                TrafficStats.setThreadStatsTag(98543098);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                fqa.b(httpURLConnection);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                qez0Var.b = responseCode;
                if (responseCode == 200) {
                    File h = g.h(httpURLConnection.getInputStream(), str);
                    if (h != null) {
                        qez0Var.c = h.getAbsolutePath();
                    } else {
                        qez0Var.a = false;
                        qez0Var.d = "Video request error - can't save video to disk cache";
                        gu8.c(null, "HttpVideoRequest: " + qez0Var.d);
                    }
                } else {
                    qez0Var.a = false;
                    qez0Var.d = "Video request error - response code " + responseCode;
                    gu8.c(null, "HttpVideoRequest: " + qez0Var.d);
                }
            } catch (Throwable th2) {
                th = th2;
                qez0Var.a = false;
                qez0Var.d = th.getMessage();
                qjk0.a(new StringBuilder("HttpVideoRequest: Video request error - "), qez0Var.d, null);
                if (httpURLConnection != null) {
                }
                return qez0Var;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return qez0Var;
    }
}
