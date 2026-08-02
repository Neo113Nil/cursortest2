package ru.ok.android.commons.http;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.zcl;

/* compiled from: HttpResponse.kt */
/* loaded from: classes9.dex */
public final class HttpResponse implements Closeable {
    public static final Companion Companion = new Companion(null);
    private final HttpResponseBody body;
    private final HttpHeaders headers;
    private final int statusCode;

    /* compiled from: HttpResponse.kt */
    public static final class Builder {
        private HttpResponseBody body;
        private int code = 200;
        private final ArrayList<HttpHeader> headers = new ArrayList<>();

        public final Builder body(HttpResponseBody httpResponseBody) {
            this.body = httpResponseBody;
            return this;
        }

        public final HttpResponse build() {
            return new HttpResponse(this.code, HttpHeaders.Companion.create(this.headers), this.body, null);
        }

        public final Builder header(String str, String str2) {
            this.headers.add(new HttpHeader(str, str2));
            return this;
        }

        public final Builder headers(Iterable<HttpHeader> iterable) {
            Iterator<HttpHeader> it = iterable.iterator();
            while (it.hasNext()) {
                this.headers.add(it.next());
            }
            return this;
        }

        public final Builder statusCode(int i) {
            this.code = i;
            return this;
        }
    }

    /* compiled from: HttpResponse.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public /* synthetic */ HttpResponse(int i, HttpHeaders httpHeaders, HttpResponseBody httpResponseBody, zcl zclVar) {
        this(i, httpHeaders, httpResponseBody);
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        HttpResponseBody httpResponseBody = this.body;
        if (httpResponseBody != null) {
            httpResponseBody.close();
        }
    }

    public final HttpResponseBody getBody() {
        return this.body;
    }

    public final HttpHeaders getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int getStatusCodeClass() {
        return (this.statusCode / 100) * 100;
    }

    private HttpResponse(int i, HttpHeaders httpHeaders, HttpResponseBody httpResponseBody) {
        this.statusCode = i;
        this.headers = httpHeaders;
        this.body = httpResponseBody;
    }
}
