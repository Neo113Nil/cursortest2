package ru.ok.tracer.base.http;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: HttpResponse.kt */
/* loaded from: classes9.dex */
public interface HttpResponseBody extends Closeable {
    byte[] getBytes() throws IOException;

    String getContentType();
}
