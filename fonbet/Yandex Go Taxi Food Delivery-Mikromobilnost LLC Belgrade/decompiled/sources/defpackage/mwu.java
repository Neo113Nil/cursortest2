package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
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

/* loaded from: classes10.dex */
public final class mwu implements gog {
    public final cit a;
    public final int b;
    public HttpURLConnection c;
    public InputStream w;
    public volatile boolean x;

    public mwu(cit citVar, int i) {
        this.a = citVar;
        this.b = i;
    }

    @Override // defpackage.gog
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        cit citVar = this.a;
        int i = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (citVar.f == null) {
                    citVar.f = new URL(citVar.d());
                }
                fogVar.d(d(citVar.f, 0, null, citVar.b.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                fogVar.e(e);
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

    @Override // defpackage.gog
    public final DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // defpackage.gog
    public final void cancel() {
        this.x = true;
    }

    @Override // defpackage.gog
    public final void cleanup() {
        InputStream inputStream = this.w;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    public final InputStream d(URL url, int i, URL url2, Map map) {
        int i2;
        int i3 = -1;
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i4 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.w = this.c.getInputStream();
                if (this.x) {
                    return null;
                }
                try {
                    i2 = this.c.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    i2 = -1;
                }
                int i5 = i2 / 100;
                if (i5 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.w = new wge(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.w = httpURLConnection2.getInputStream();
                        }
                        return this.w;
                    } catch (IOException e) {
                        try {
                            i3 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new HttpException(i3, e, "Failed to obtain InputStream");
                    }
                }
                if (i5 != 3) {
                    if (i2 == -1) {
                        throw new HttpException(i2, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(i2, null, this.c.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(i2, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(i2, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return d(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(i2, e3, g8e.o("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                try {
                    i3 = this.c.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new HttpException(i3, e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }
}
