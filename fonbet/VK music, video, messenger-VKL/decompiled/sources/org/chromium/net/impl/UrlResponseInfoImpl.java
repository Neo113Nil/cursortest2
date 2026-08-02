package org.chromium.net.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;
import xsna.ji;
import xsna.n6j;
import xsna.nyh0;
import xsna.xe9;

/* loaded from: classes8.dex */
public final class UrlResponseInfoImpl extends UrlResponseInfo {
    private final HeaderBlockImpl mHeaders;
    private final int mHttpStatusCode;
    private final String mHttpStatusText;
    private final String mNegotiatedProtocol;
    private final String mProxyServer;
    private final AtomicLong mReceivedByteCount;
    private final List<String> mResponseInfoUrlChain;
    private final boolean mWasCached;

    public static final class HeaderBlockImpl extends UrlResponseInfo.HeaderBlock {
        private final List<Map.Entry<String, String>> mAllHeadersList;
        private Map<String, List<String>> mHeadersMap;

        public HeaderBlockImpl(List<Map.Entry<String, String>> list) {
            this.mAllHeadersList = list;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public List<Map.Entry<String, String>> getAsList() {
            return this.mAllHeadersList;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public Map<String, List<String>> getAsMap() {
            Map<String, List<String>> map = this.mHeadersMap;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.mAllHeadersList) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.mHeadersMap = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.mResponseInfoUrlChain = Collections.unmodifiableList(list);
        this.mHttpStatusCode = i;
        this.mHttpStatusText = str;
        this.mHeaders = new HeaderBlockImpl(Collections.unmodifiableList(list2));
        this.mWasCached = z;
        this.mNegotiatedProtocol = str2;
        this.mProxyServer = str3;
        this.mReceivedByteCount = new AtomicLong(j);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public Map<String, List<String>> getAllHeaders() {
        return this.mHeaders.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<Map.Entry<String, String>> getAllHeadersAsList() {
        return this.mHeaders.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getProxyServer() {
        return this.mProxyServer;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        return this.mReceivedByteCount.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public String getUrl() {
        return (String) ji.a(1, this.mResponseInfoUrlChain);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public List<String> getUrlChain() {
        return this.mResponseInfoUrlChain;
    }

    public void setReceivedByteCount(long j) {
        this.mReceivedByteCount.set(j);
    }

    public String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String obj = getUrlChain().toString();
        int httpStatusCode = getHttpStatusCode();
        String httpStatusText = getHttpStatusText();
        String obj2 = getAllHeadersAsList().toString();
        boolean wasCached = wasCached();
        String negotiatedProtocol = getNegotiatedProtocol();
        String proxyServer = getProxyServer();
        long receivedByteCount = getReceivedByteCount();
        StringBuilder a = xe9.a("UrlResponseInfo@[", hexString, "][", url, "]: urlChain = ");
        nyh0.a(httpStatusCode, obj, ", httpStatus = ", " ", a);
        n6j.b(a, httpStatusText, ", headers = ", obj2, ", wasCached = ");
        a.append(wasCached);
        a.append(", negotiatedProtocol = ");
        a.append(negotiatedProtocol);
        a.append(", proxyServer= ");
        a.append(proxyServer);
        a.append(", receivedByteCount = ");
        a.append(receivedByteCount);
        return a.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        return this.mWasCached;
    }

    @Deprecated
    public UrlResponseInfoImpl(List<String> list, int i, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3) {
        this(list, i, str, list2, z, str2, str3, 0L);
    }
}
