package ru.ok.tracer.base.http;

import java.io.Closeable;

/* compiled from: HttpResponse.kt */
/* loaded from: classes9.dex */
public final class HttpResponse implements Closeable {
    private final HttpResponseBody body;
    private final String message;
    private final int statusCode;

    public HttpResponse(int i, String str, HttpResponseBody httpResponseBody) {
        this.statusCode = i;
        this.message = str;
        this.body = httpResponseBody;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HttpResponseBody httpResponseBody = this.body;
        if (httpResponseBody != null) {
            httpResponseBody.close();
        }
    }

    public final HttpResponseBody getBody() {
        return this.body;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
