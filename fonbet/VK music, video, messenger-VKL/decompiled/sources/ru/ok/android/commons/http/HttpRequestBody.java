package ru.ok.android.commons.http;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: HttpRequestBody.kt */
/* loaded from: classes9.dex */
public interface HttpRequestBody {
    default byte[] getBytes() throws IOException {
        HttpBufferOutputStream withContentLength = HttpBufferOutputStream.Companion.withContentLength(getContentLength());
        writeTo(withContentLength);
        return withContentLength.getBytes();
    }

    default long getContentLength() {
        return -1L;
    }

    default boolean getRepeatable() {
        return false;
    }

    void writeTo(OutputStream outputStream) throws IOException;
}
