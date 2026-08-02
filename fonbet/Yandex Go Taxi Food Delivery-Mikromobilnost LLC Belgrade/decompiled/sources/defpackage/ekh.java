package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes9.dex */
public final class ekh implements ktq0 {
    @Override // defpackage.ktq0
    public final utq0 a(String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(30000);
            byte[] bytes = str2.getBytes(uza.a);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bytes);
                outputStream.close();
                return new utq0(httpURLConnection.getResponseCode(), new dkh(httpURLConnection));
            } finally {
            }
        } catch (Exception e) {
            httpURLConnection.disconnect();
            throw e;
        }
    }
}
