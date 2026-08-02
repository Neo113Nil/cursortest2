package com.monetization.ads.network.core.toolbox;

import com.monetization.ads.network.core.Header;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class HttpResponse {
    private final InputStream mContent;
    private final byte[] mContentBytes;
    private final int mContentLength;
    private final List<Header> mHeaders;
    private final int mStatusCode;

    public HttpResponse(int i, List<Header> list, byte[] bArr) {
        this.mStatusCode = i;
        this.mHeaders = list;
        this.mContentLength = bArr.length;
        this.mContentBytes = bArr;
        this.mContent = null;
    }

    public final InputStream getContent() {
        InputStream inputStream = this.mContent;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.mContentBytes != null) {
            return new ByteArrayInputStream(this.mContentBytes);
        }
        return null;
    }

    public final byte[] getContentBytes() {
        return this.mContentBytes;
    }

    public final int getContentLength() {
        return this.mContentLength;
    }

    public final List<Header> getHeaders() {
        return Collections.unmodifiableList(this.mHeaders);
    }

    public final int getStatusCode() {
        return this.mStatusCode;
    }

    public HttpResponse(int i, List<Header> list, int i2, InputStream inputStream) {
        this.mStatusCode = i;
        this.mHeaders = list;
        this.mContentLength = i2;
        this.mContent = inputStream;
        this.mContentBytes = null;
    }

    public HttpResponse(int i, List<Header> list) {
        this(i, list, -1, null);
    }
}
