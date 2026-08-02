package ru.ok.tracer.base.http;

import java.io.OutputStream;
import xsna.jh;
import xsna.zcl;

/* compiled from: HttpMultipartBody.kt */
/* loaded from: classes9.dex */
public final class HttpPart {
    private final HttpRequestBody body;
    private final String headers;

    public HttpPart(String str, String str2, String str3, HttpRequestBody httpRequestBody) {
        this.body = httpRequestBody;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        HttpMultipartBodyKt.appendQuoted(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            HttpMultipartBodyKt.appendQuoted(sb, str2);
        }
        sb.append("\r\n");
        if (str3 != null) {
            jh.f(sb, "Content-Type: ", str3, "\r\n");
        }
        this.headers = sb.toString();
    }

    public final HttpRequestBody getBody() {
        return this.body;
    }

    public final long getLength$tracer_base_release() {
        int utf8Length;
        byte[] bArr;
        byte[] bArr2;
        if (this.body.getContentLength() < 0) {
            return -1L;
        }
        utf8Length = HttpMultipartBodyKt.getUtf8Length(this.headers);
        bArr = HttpMultipartBodyKt.CRLF;
        long contentLength = this.body.getContentLength() + utf8Length + bArr.length;
        bArr2 = HttpMultipartBodyKt.CRLF;
        return contentLength + bArr2.length;
    }

    public final void writeTo(OutputStream outputStream) {
        byte[] bArr;
        byte[] bArr2;
        HttpMultipartBodyKt.writeUtf8(outputStream, this.headers);
        bArr = HttpMultipartBodyKt.CRLF;
        outputStream.write(bArr);
        this.body.writeTo(outputStream);
        bArr2 = HttpMultipartBodyKt.CRLF;
        outputStream.write(bArr2);
    }

    public /* synthetic */ HttpPart(String str, String str2, String str3, HttpRequestBody httpRequestBody, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, httpRequestBody);
    }
}
