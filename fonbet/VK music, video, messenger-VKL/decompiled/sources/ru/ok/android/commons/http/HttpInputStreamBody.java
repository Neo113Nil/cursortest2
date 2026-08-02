package ru.ok.android.commons.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import xsna.i7o0;
import xsna.zcl;

/* compiled from: HttpInputStreamBody.kt */
/* loaded from: classes9.dex */
public final class HttpInputStreamBody implements HttpResponseBody, HttpRequestBody {
    private final AtomicReference<InputStream> atomicStream;
    private final long contentLength;
    private final InputStream rawStream;

    public HttpInputStreamBody(InputStream inputStream) {
        this(inputStream, 0L, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.rawStream.close();
    }

    @Override // ru.ok.android.commons.http.HttpResponseBody
    public byte[] getBytes() {
        return super.getBytes();
    }

    @Override // ru.ok.android.commons.http.HttpResponseBody
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // ru.ok.android.commons.http.HttpResponseBody
    public boolean getRepeatable() {
        return false;
    }

    @Override // ru.ok.android.commons.http.HttpResponseBody
    public InputStream getStream() {
        InputStream andSet = this.atomicStream.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        throw new IllegalStateException("Already open");
    }

    @Override // ru.ok.android.commons.http.HttpRequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        i7o0.b(getStream(), outputStream, 8192);
    }

    public HttpInputStreamBody(InputStream inputStream, long j) {
        this.rawStream = inputStream;
        this.contentLength = j;
        this.atomicStream = new AtomicReference<>(inputStream);
    }

    public /* synthetic */ HttpInputStreamBody(InputStream inputStream, long j, int i, zcl zclVar) {
        this(inputStream, (i & 2) != 0 ? -1L : j);
    }
}
