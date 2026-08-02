package ru.ok.android.commons.http;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import xsna.i7o0;
import xsna.ro;

/* compiled from: HttpResponseBody.kt */
/* loaded from: classes9.dex */
public interface HttpResponseBody extends Closeable {
    default byte[] getBytes() throws IOException {
        HttpBufferOutputStream withContentLength = HttpBufferOutputStream.Companion.withContentLength(getContentLength());
        InputStream stream = getStream();
        try {
            i7o0.b(stream, withContentLength, 8192);
            ro.e(stream, null);
            return withContentLength.getBytes();
        } finally {
        }
    }

    default long getContentLength() {
        return -1L;
    }

    default boolean getRepeatable() {
        return false;
    }

    InputStream getStream() throws IOException;
}
