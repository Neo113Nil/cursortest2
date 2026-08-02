package yads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* loaded from: classes10.dex */
public final class e21 extends FilterInputStream {
    public final HttpURLConnection a;

    public e21(HttpURLConnection httpURLConnection) {
        super(f21.a(httpURLConnection));
        this.a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.disconnect();
    }
}
