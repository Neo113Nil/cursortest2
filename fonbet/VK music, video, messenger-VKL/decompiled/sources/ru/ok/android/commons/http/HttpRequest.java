package ru.ok.android.commons.http;

import java.util.ArrayList;
import xsna.zcl;

/* compiled from: HttpRequest.kt */
/* loaded from: classes9.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private final HttpRequestBody body;
    private final HttpHeaders headers;
    private final String logContext;
    private final String method;
    private final int priority;
    private final boolean repeatable;
    private final String url;

    /* compiled from: HttpRequest.kt */
    public static final class Builder {
        private HttpRequestBody body;
        private String logContext;
        private boolean repeatable;
        private String url;
        private int priority = 16;
        private String method = "GET";
        private final ArrayList<HttpHeader> headers = new ArrayList<>();

        public final Builder body(HttpRequestBody httpRequestBody) {
            this.body = httpRequestBody;
            return this;
        }

        public final HttpRequest build() {
            int i = this.priority;
            String str = this.method;
            String str2 = this.url;
            if (str2 != null) {
                return new HttpRequest(i, str, str2, HttpHeaders.Companion.create(this.headers), this.body, this.logContext, this.repeatable);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final Builder canRepeat(boolean z) {
            this.repeatable = z;
            return this;
        }

        public final Builder header(String str, String str2) {
            this.headers.add(new HttpHeader(str, str2));
            return this;
        }

        public final Builder logContext(String str) {
            this.logContext = str;
            return this;
        }

        public final Builder method(String str) {
            this.method = str;
            return this;
        }

        public final Builder priority(int i) {
            this.priority = i;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* compiled from: HttpRequest.kt */
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

    public HttpRequest(int i, String str, String str2, HttpHeaders httpHeaders, HttpRequestBody httpRequestBody, String str3, boolean z) {
        this.priority = i;
        this.method = str;
        this.url = str2;
        this.headers = httpHeaders;
        this.body = httpRequestBody;
        this.logContext = str3;
        this.repeatable = z;
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public final boolean canRepeat() {
        HttpRequestBody httpRequestBody = this.body;
        return httpRequestBody != null && httpRequestBody.getRepeatable() && this.repeatable;
    }

    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final HttpHeaders getHeaders() {
        return this.headers;
    }

    public final String getLogContext() {
        return this.logContext;
    }

    public final String getMethod() {
        return this.method;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final boolean getRepeatable() {
        return this.repeatable;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ HttpRequest(int i, String str, String str2, HttpHeaders httpHeaders, HttpRequestBody httpRequestBody, String str3, boolean z, int i2, zcl zclVar) {
        this(i, str, str2, httpHeaders, httpRequestBody, str3, (i2 & 64) != 0 ? false : z);
    }
}
