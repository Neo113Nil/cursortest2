package org.chromium.net.impl;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes8.dex */
class AndroidUrlResponseInfoWrapper extends UrlResponseInfo {
    private final android.net.http.UrlResponseInfo mBackend;
    private final String mProxyServerCompat;

    private AndroidUrlResponseInfoWrapper(android.net.http.UrlResponseInfo urlResponseInfo, String str) {
        this.mBackend = urlResponseInfo;
        this.mProxyServerCompat = str;
    }

    public static AndroidUrlResponseInfoWrapper createForBidirectionalStream(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (isResponseInfoNull(urlResponseInfo)) {
            return null;
        }
        return new AndroidUrlResponseInfoWrapper(urlResponseInfo, null);
    }

    public static AndroidUrlResponseInfoWrapper createForUrlRequest(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (isResponseInfoNull(urlResponseInfo)) {
            return null;
        }
        return new AndroidUrlResponseInfoWrapper(urlResponseInfo, ":0");
    }

    private static boolean isResponseInfoNull(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return true;
        }
        try {
            urlResponseInfo.getUrl();
            return false;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public Map<String, List<String>> getAllHeaders() {
        HeaderBlock headers;
        Map<String, List<String>> asMap;
        headers = this.mBackend.getHeaders();
        asMap = headers.getAsMap();
        return asMap;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<Map.Entry<String, String>> getAllHeadersAsList() {
        HeaderBlock headers;
        List<Map.Entry<String, String>> asList;
        headers = this.mBackend.getHeaders();
        asList = headers.getAsList();
        return asList;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        int httpStatusCode;
        httpStatusCode = this.mBackend.getHttpStatusCode();
        return httpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getHttpStatusText() {
        String httpStatusText;
        httpStatusText = this.mBackend.getHttpStatusText();
        return httpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getNegotiatedProtocol() {
        String negotiatedProtocol;
        negotiatedProtocol = this.mBackend.getNegotiatedProtocol();
        return negotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getProxyServer() {
        return this.mProxyServerCompat;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        long receivedByteCount;
        receivedByteCount = this.mBackend.getReceivedByteCount();
        return receivedByteCount;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getUrl() {
        String url;
        url = this.mBackend.getUrl();
        return url;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<String> getUrlChain() {
        List<String> urlChain;
        urlChain = this.mBackend.getUrlChain();
        return urlChain;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        boolean wasCached;
        wasCached = this.mBackend.wasCached();
        return wasCached;
    }
}
