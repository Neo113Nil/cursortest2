package xsna;

import android.net.TrafficStats;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class v8z0 extends s770 {
    public static final Charset d = StandardCharsets.UTF_8;
    public final udz0 c;

    public v8z0(udz0 udz0Var) {
        this.c = udz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01a5  */
    @Override // xsna.s770
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qez0 d(String str, String str2, Map map) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        String str3;
        udz0 udz0Var = this.c;
        qez0 qez0Var = new qez0();
        try {
            gu8.c(null, "HttpAdRequest: Send ad request - " + str);
            TrafficStats.setThreadStatsTag(98543098);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            fqa.b(httpURLConnection);
            if (map != null) {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (str2 != null) {
                str3 = "body - " + str2;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-mtrgdata-v1");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(str2.getBytes());
                    outputStream.close();
                } finally {
                }
            } else {
                str3 = "url - " + str;
                httpURLConnection.connect();
            }
            gu8.c(null, "HttpAdRequest: Send ad request, " + str3);
            int responseCode = httpURLConnection.getResponseCode();
            qez0Var.b = responseCode;
            if (responseCode == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), d));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    qez0Var.c = sb.toString();
                    bufferedReader.close();
                } finally {
                }
            } else if (responseCode != 204) {
                udz0Var.a(0, 1, 2001, "code=" + httpURLConnection.getResponseCode(), null);
                qez0Var.a = false;
                qez0Var.d = "Ad request error - response code " + responseCode;
                gu8.c(null, "HttpAdRequest: " + qez0Var.d);
            }
        } catch (Throwable th3) {
            th = th3;
            udz0Var.d(2001, "message=" + th.getMessage() + "\nexception=" + gu8.b(th));
            if (th instanceof SocketTimeoutException) {
                qez0Var.b = InterfaceC4413l1.a.b.h;
            }
            qez0Var.a = false;
            qez0Var.d = th.getMessage();
            qjk0.a(new StringBuilder("HttpAdRequest: Ad request error - "), qez0Var.d, null);
            if (httpURLConnection != null) {
            }
            return qez0Var;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return qez0Var;
    }
}
