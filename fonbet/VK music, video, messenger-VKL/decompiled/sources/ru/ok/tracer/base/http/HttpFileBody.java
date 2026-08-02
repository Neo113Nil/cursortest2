package ru.ok.tracer.base.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import xsna.i7o0;

/* compiled from: HttpFileBody.kt */
/* loaded from: classes9.dex */
public final class HttpFileBody implements HttpRequestBody {
    private final String contentType;
    private final File file;

    public HttpFileBody(String str, File file) {
        this.contentType = str;
        this.file = file;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public long getContentLength() {
        return this.file.length();
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody, ru.ok.tracer.base.http.HttpResponseBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // ru.ok.tracer.base.http.HttpRequestBody
    public void writeTo(OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            i7o0.b(fileInputStream, outputStream, 8192);
            fileInputStream.close();
        } finally {
        }
    }
}
