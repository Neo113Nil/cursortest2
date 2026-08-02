package ru.ok.tracer.base.http;

/* compiled from: HttpRequest.kt */
/* loaded from: classes9.dex */
public final class HttpRequest {
    private final HttpRequestBody body;
    private final String method;
    private final String url;

    public HttpRequest(String str, String str2, HttpRequestBody httpRequestBody) {
        this.method = str;
        this.url = str2;
        this.body = httpRequestBody;
    }

    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public HttpRequest(String str, HttpRequestBody httpRequestBody) {
        this(httpRequestBody == null ? "GET" : "POST", str, httpRequestBody);
    }
}
