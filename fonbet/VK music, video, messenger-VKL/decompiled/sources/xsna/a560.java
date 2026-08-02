package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;

/* compiled from: NetworkRequest.java */
/* loaded from: classes13.dex */
public abstract class a560 {
    public static final Uri j = Uri.parse("https://firebasestorage.googleapis.com/v0");
    public static final jgz k = new jgz(15);
    public static String l;
    public Exception a;
    public nhl0 b;
    public Context c;
    public Map<String, List<String>> d;
    public int e;
    public String f;
    public InputStream g;
    public HttpURLConnection h;
    public HashMap i;

    public final void a(@NonNull HttpURLConnection httpURLConnection, @Nullable String str) throws IOException {
        byte[] d;
        int e;
        exc0.i(httpURLConnection);
        if (!TextUtils.isEmpty(null)) {
            httpURLConnection.setRequestProperty(Http.Header.AUTHORIZATION, "Firebase null");
        }
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str);
        }
        StringBuilder sb = new StringBuilder("Android/");
        Context context = this.c;
        if (l == null) {
            try {
                l = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("NetworkRequest", "Unable to find gmscore in package manager", e2);
            }
            if (l == null) {
                l = "[No Gmscore]";
            }
        }
        String str2 = l;
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb.toString());
        for (Map.Entry entry : this.i.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject c = c();
        if (c != null) {
            d = c.toString().getBytes(C.UTF8_NAME);
            e = d.length;
        } else {
            d = d();
            e = e();
            if (e == 0 && d != null) {
                e = d.length;
            }
        }
        if (d == null || d.length <= 0) {
            httpURLConnection.setRequestProperty(Http.Header.CONTENT_LENGTH, "0");
        } else {
            if (c != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(Http.Header.CONTENT_LENGTH, Integer.toString(e));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (d == null || d.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(d, 0, e);
        } finally {
            bufferedOutputStream.close();
        }
    }

    public final HttpURLConnection b() throws IOException {
        Uri i = i();
        Map<String, String> f = f();
        if (f != null) {
            Uri.Builder buildUpon = i.buildUpon();
            for (Map.Entry entry : ((HashMap) f).entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            i = buildUpon.build();
        }
        URL url = new URL(i.toString());
        k.getClass();
        return (HttpURLConnection) url.openConnection();
    }

    @Nullable
    public JSONObject c() {
        return null;
    }

    @Nullable
    public byte[] d() {
        return null;
    }

    public int e() {
        return 0;
    }

    @Nullable
    public Map<String, String> f() {
        return null;
    }

    public final JSONObject g() {
        if (TextUtils.isEmpty(this.f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f);
        } catch (JSONException e) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f, e);
            return new JSONObject();
        }
    }

    @Nullable
    public final String h(String str) {
        List<String> list;
        Map<String, List<String>> map = this.d;
        if (map == null || (list = map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @NonNull
    public abstract Uri i();

    public final boolean j() {
        int i = this.e;
        return i >= 200 && i < 300;
    }

    public final void k(@Nullable InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f = sb.toString();
        if (j()) {
            return;
        }
        this.a = new IOException(this.f);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:8:0x0095). Please report as a decompilation issue!!! */
    public final void l(@NonNull Context context, @Nullable String str) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.a = new SocketException("Network subsystem is unavailable");
            this.e = -2;
            return;
        }
        if (this.a != null) {
            this.e = -1;
        } else {
            if (Log.isLoggable("NetworkRequest", 3)) {
                Objects.toString(i());
            }
            NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) this.c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected()) {
                this.e = -2;
                this.a = new SocketException("Network subsystem is unavailable");
            } else {
                try {
                    HttpURLConnection b = b();
                    this.h = b;
                    b.setRequestMethod("POST");
                    a(this.h, str);
                    HttpURLConnection httpURLConnection = this.h;
                    exc0.i(httpURLConnection);
                    this.e = httpURLConnection.getResponseCode();
                    this.d = httpURLConnection.getHeaderFields();
                    httpURLConnection.getContentLength();
                    if (j()) {
                        this.g = httpURLConnection.getInputStream();
                    } else {
                        this.g = httpURLConnection.getErrorStream();
                    }
                } catch (IOException e) {
                    Objects.toString(i());
                    this.a = e;
                    this.e = -2;
                }
            }
        }
        try {
            if (j()) {
                k(this.g);
            } else {
                k(this.g);
            }
        } catch (IOException e2) {
            Objects.toString(i());
            this.a = e2;
            this.e = -2;
        }
        HttpURLConnection httpURLConnection2 = this.h;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
        }
    }

    public final void m(String str, String str2) {
        this.i.put(str, str2);
    }
}
