package xsna;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import xsna.buk;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes12.dex */
public final class ykv implements buk<InputStream> {
    public final e1u b;
    public final int c;
    public HttpURLConnection d;
    public InputStream e;
    public volatile boolean f;

    /* compiled from: HttpUrlFetcher.java */
    public static class a {
    }

    public ykv(e1u e1uVar, int i) {
        this.b = e1uVar;
        this.c = i;
    }

    @Override // xsna.buk
    public final void a() {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.d = null;
    }

    @Override // xsna.buk
    @NonNull
    public final Class<InputStream> b() {
        return InputStream.class;
    }

    public final InputStream c(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        int i2;
        int i3 = -1;
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", null, -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", null, -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i4 = this.c;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.e = this.d.getInputStream();
                if (this.f) {
                    return null;
                }
                try {
                    i2 = this.d.getResponseCode();
                } catch (IOException unused2) {
                    i2 = -1;
                }
                int i5 = i2 / 100;
                if (i5 == 2) {
                    HttpURLConnection httpURLConnection2 = this.d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.e = new aij(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.e = httpURLConnection2.getInputStream();
                        }
                        return this.e;
                    } catch (IOException e) {
                        try {
                            i3 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new HttpException("Failed to obtain InputStream", e, i3);
                    }
                }
                if (i5 != 3) {
                    if (i2 == -1) {
                        throw new HttpException("Http request failed", null, i2);
                    }
                    try {
                        throw new HttpException(this.d.getResponseMessage(), null, i2);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", e2, i2);
                    }
                }
                String headerField = this.d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", null, i2);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    a();
                    return c(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(go9.b("Bad redirect url: ", headerField), e3, i2);
                }
            } catch (IOException e4) {
                try {
                    i3 = this.d.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new HttpException("Failed to connect or obtain data", e4, i3);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", e5, 0);
        }
    }

    @Override // xsna.buk
    public final void cancel() {
        this.f = true;
    }

    @Override // xsna.buk
    public final void d(@NonNull Priority priority, @NonNull buk.a<? super InputStream> aVar) {
        e1u e1uVar = this.b;
        int i = w000.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.c(c(e1uVar.d(), 0, null, e1uVar.b.j()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                aVar.f(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // xsna.buk
    @NonNull
    public final DataSource e() {
        return DataSource.REMOTE;
    }
}
