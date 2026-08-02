package ru.ok.android.sdk.util;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;

/* loaded from: classes9.dex */
public class OkRequestUtil {
    private static final String ENCODING = "UTF-8";

    public static class Request {
        private int timeout = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        private final List<Pair<String, String>> params = new ArrayList();

        public Request(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.params.add(new Pair<>(entry.getKey(), entry.getValue()));
            }
        }

        public String execute() throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.ok.ru/fb.do").openConnection();
            httpURLConnection.setReadTimeout(this.timeout);
            httpURLConnection.setConnectTimeout(this.timeout + 5000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            ArrayList arrayList = new ArrayList(this.params.size());
            for (Pair<String, String> pair : this.params) {
                Object obj = pair.first;
                if (obj != null && pair.second != null) {
                    arrayList.add(URLEncoder.encode((String) obj, "UTF-8") + "=" + URLEncoder.encode((String) pair.second, "UTF-8"));
                }
            }
            String join = TextUtils.join("&", arrayList);
            if (join.length() > 0) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(join);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
            }
            return OkRequestUtil.inputStreamToString(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        }
    }

    private static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(SharedKt.LOG_TAG, e.getLocalizedMessage());
            return null;
        }
    }

    public static String executeRequest(Map<String, String> map) throws IOException {
        if (map != null && map.containsKey("method") && map.containsKey("application_key")) {
            return new Request(map).execute();
        }
        return null;
    }

    public static Bundle getUrlParameters(String str) {
        Bundle bundle = new Bundle();
        String[] split = str.split("\\?");
        if (split.length > 1) {
            for (String str2 : split[1].split("[&#]")) {
                String[] split2 = str2.split("=");
                bundle.putString(URLDecoder.decode(split2[0]), split2.length > 1 ? URLDecoder.decode(split2[1]) : null);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream, int i) throws IOException {
        int read;
        StringBuilder sb = new StringBuilder(Math.max(i, 128));
        char[] cArr = new char[4096];
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        do {
            try {
                read = inputStreamReader.read(cArr, 0, 4096);
                if (read > 0) {
                    sb.append(cArr, 0, read);
                }
            } catch (Throwable th) {
                closeSilently(inputStreamReader);
                throw th;
            }
        } while (read >= 0);
        closeSilently(inputStreamReader);
        return sb.toString();
    }
}
