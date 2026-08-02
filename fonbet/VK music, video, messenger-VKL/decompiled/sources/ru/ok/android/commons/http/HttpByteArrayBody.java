package ru.ok.android.commons.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import xsna.jw5;

/* compiled from: HttpByteArrayBody.kt */
/* loaded from: classes9.dex */
public final class HttpByteArrayBody implements HttpRequestBody, HttpResponseBody {
    private final byte[] buf;
    private final int len;
    private final int off;

    public HttpByteArrayBody(byte[] bArr, int i, int i2) {
        this.buf = bArr;
        this.off = i;
        this.len = i2;
    }

    @Override // ru.ok.android.commons.http.HttpRequestBody, ru.ok.android.commons.http.HttpResponseBody
    public byte[] getBytes() {
        int i = this.off;
        if (i == 0) {
            int i2 = this.len;
            byte[] bArr = this.buf;
            if (i2 == bArr.length) {
                return bArr;
            }
        }
        return jw5.l(i, this.len + i, this.buf);
    }

    @Override // ru.ok.android.commons.http.HttpRequestBody, ru.ok.android.commons.http.HttpResponseBody
    public long getContentLength() {
        return this.len;
    }

    @Override // ru.ok.android.commons.http.HttpRequestBody, ru.ok.android.commons.http.HttpResponseBody
    public boolean getRepeatable() {
        return true;
    }

    @Override // ru.ok.android.commons.http.HttpRequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buf, this.off, this.len);
    }

    @Override // ru.ok.android.commons.http.HttpResponseBody
    public ByteArrayInputStream getStream() {
        return new ByteArrayInputStream(this.buf, this.off, this.len);
    }

    public HttpByteArrayBody(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
