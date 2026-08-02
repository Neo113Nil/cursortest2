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
public final class caz0 extends s770 {
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
            wga0.b("HttpAudioRequest: Unable to open disk cache and load/save audio ", str, null);
            qez0Var.a = false;
            return qez0Var;
        }
        String f = g.f(str, ".mp3");
        qez0Var.c = f;
        if (f == null) {
            try {
                gu8.c(null, "HttpAudioRequest: Send audio request - " + str);
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
                    File c = g.c(httpURLConnection.getInputStream(), str);
                    if (c != null) {
                        qez0Var.c = c.getAbsolutePath();
                    } else {
                        qez0Var.a = false;
                        qez0Var.d = "Audio request error - can't save audio to disk cache";
                        gu8.c(null, "HttpAudioRequest: " + qez0Var.d);
                    }
                } else {
                    qez0Var.a = false;
                    qez0Var.d = "Audio request error - response code " + responseCode;
                    gu8.c(null, "HttpAudioRequest: " + qez0Var.d);
                }
            } catch (Throwable th2) {
                th = th2;
                qez0Var.a = false;
                qez0Var.d = th.getMessage();
                qjk0.a(new StringBuilder("HttpAudioRequest: Audio request error - "), qez0Var.d, null);
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
