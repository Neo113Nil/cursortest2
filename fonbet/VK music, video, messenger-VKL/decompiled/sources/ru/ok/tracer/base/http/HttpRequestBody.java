package ru.ok.tracer.base.http;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import xsna.emb;

/* compiled from: HttpRequest.kt */
/* loaded from: classes9.dex */
public interface HttpRequestBody {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: HttpRequest.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ HttpRequestBody fromString$default(Companion companion, String str, String str2, Charset charset, int i, Object obj) {
            if ((i & 4) != 0) {
                charset = emb.b;
            }
            return companion.fromString(str, str2, charset);
        }

        public final HttpRequestBody fromBytes(String str, byte[] bArr) {
            return new HttpByteArrayBody(str, bArr);
        }

        public final HttpRequestBody fromFile(String str, File file) {
            return new HttpFileBody(str, file);
        }

        public final HttpRequestBody fromString(String str, String str2, Charset charset) {
            return new HttpByteArrayBody(str, str2.getBytes(charset));
        }
    }

    long getContentLength();

    String getContentType();

    void writeTo(OutputStream outputStream) throws IOException;
}
