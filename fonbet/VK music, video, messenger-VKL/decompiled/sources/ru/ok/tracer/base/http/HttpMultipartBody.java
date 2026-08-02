package ru.ok.tracer.base.http;

import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.go9;

/* compiled from: HttpMultipartBody.kt */
/* loaded from: classes9.dex */
public final class HttpMultipartBody implements HttpRequestBody {
    private final String boundary;
    private final long contentLength;
    private final String contentType;
    private final List<HttpPart> parts;

    public HttpMultipartBody(String str, List<HttpPart> list) {
        long j;
        byte[] bArr;
        int utf8Length;
        byte[] bArr2;
        byte[] bArr3;
        int utf8Length2;
        byte[] bArr4;
        this.boundary = str;
        this.parts = list;
        this.contentType = go9.b("multipart/form-data; boundary=", str);
        List<HttpPart> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((HttpPart) it.next()).getBody().getContentLength() < 0) {
                    j = -1;
                    break;
                }
            }
        }
        List<HttpPart> list3 = this.parts;
        bArr = HttpMultipartBodyKt.DASHDASH;
        long length = bArr.length;
        utf8Length = HttpMultipartBodyKt.getUtf8Length(this.boundary);
        long j2 = length + utf8Length;
        bArr2 = HttpMultipartBodyKt.CRLF;
        long length2 = j2 + bArr2.length;
        for (HttpPart httpPart : list3) {
            bArr3 = HttpMultipartBodyKt.DASHDASH;
            long length3 = length2 + bArr3.length;
            utf8Length2 = HttpMultipartBodyKt.getUtf8Length(this.boundary);
            long j3 = length3 + utf8Length2;
            bArr4 = HttpMultipartBodyKt.CRLF;
            length2 = j3 + bArr4.length + httpPart.getLength$tracer_base_release();
        }
        j = length2;
        this.contentLength = j;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody, ru.ok.tracer.base.http.HttpResponseBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public void writeTo(OutputStream outputStream) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        for (HttpPart httpPart : this.parts) {
            bArr3 = HttpMultipartBodyKt.DASHDASH;
            outputStream.write(bArr3);
            HttpMultipartBodyKt.writeUtf8(outputStream, this.boundary);
            bArr4 = HttpMultipartBodyKt.CRLF;
            outputStream.write(bArr4);
            httpPart.writeTo(outputStream);
        }
        bArr = HttpMultipartBodyKt.DASHDASH;
        outputStream.write(bArr);
        HttpMultipartBodyKt.writeUtf8(outputStream, this.boundary);
        bArr2 = HttpMultipartBodyKt.DASHDASH;
        outputStream.write(bArr2);
    }
}
