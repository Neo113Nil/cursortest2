package ru.ok.tracer.base.http;

import java.io.OutputStream;

/* compiled from: HttpByteArrayBody.kt */
/* loaded from: classes9.dex */
public final class HttpByteArrayBody implements HttpRequestBody, HttpResponseBody {
    private final byte[] bytes;
    private final String contentType;

    public HttpByteArrayBody(String str, byte[] bArr) {
        this.contentType = str;
        this.bytes = bArr;
    }

    @Override // ru.ok.tracer.base.http.HttpResponseBody
    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public long getContentLength() {
        return getBytes().length;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody, ru.ok.tracer.base.http.HttpResponseBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public void writeTo(OutputStream outputStream) {
        outputStream.write(getBytes());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
