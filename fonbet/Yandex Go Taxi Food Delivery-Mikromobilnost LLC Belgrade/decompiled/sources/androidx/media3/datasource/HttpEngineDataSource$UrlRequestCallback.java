package androidx.media3.datasource;

import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import defpackage.cvu;
import defpackage.lk91;
import defpackage.p6u;
import java.net.CookieHandler;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
final class HttpEngineDataSource$UrlRequestCallback implements UrlRequest$Callback {
    private volatile boolean isClosed = false;
    final /* synthetic */ cvu this$0;

    public HttpEngineDataSource$UrlRequestCallback(cvu cvuVar) {
    }

    public void close() {
        this.isClosed = true;
    }

    public synchronized void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
    }

    public synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        int errorCode;
        try {
            if (!this.isClosed) {
                if (!p6u.D(httpException)) {
                    throw null;
                }
                errorCode = p6u.k(httpException).getErrorCode();
                if (errorCode != 1) {
                    throw null;
                }
                new UnknownHostException();
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (!this.isClosed) {
            throw null;
        }
    }

    public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (!this.isClosed) {
            throw null;
        }
    }

    public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        String url;
        HeaderBlock headers;
        Map<String, List<String>> asMap;
        if (!this.isClosed) {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                try {
                    url = urlResponseInfo.getUrl();
                    URI uri = new URI(url);
                    headers = urlResponseInfo.getHeaders();
                    asMap = headers.getAsMap();
                    cookieHandler.put(uri, asMap);
                } catch (Exception e) {
                    lk91.k("Failed to store cookies in CookieHandler", e);
                }
            }
            throw null;
        }
    }

    public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!this.isClosed) {
            throw null;
        }
    }
}
