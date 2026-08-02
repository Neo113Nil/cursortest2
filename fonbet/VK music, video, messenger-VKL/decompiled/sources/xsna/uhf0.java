package xsna;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecordingInputStream.kt */
/* loaded from: classes8.dex */
public final class uhf0 extends InputStream {
    public final bvk b;
    public final ByteArrayOutputStream c = new ByteArrayOutputStream();

    public uhf0(bvk bvkVar) {
        this.b = bvkVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int read = this.b.read();
        if (read != -1) {
            this.c.write(read);
        }
        return read;
    }
}
