package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: CloseWebtransportSessionCapsule.java */
/* loaded from: classes8.dex */
public final class wpy0 implements uqy0 {
    public final int a;
    public final String b;

    public wpy0(InputStream inputStream) throws IOException {
        alk.h(inputStream);
        int h = alk.h(inputStream);
        byte[] bArr = new byte[h];
        if (bhu.a(inputStream, bArr, h) != h) {
            throw new EOFException("Unexpected end of stream");
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.a = wrap.getInt();
        this.b = new String(wrap.array(), wrap.position(), wrap.remaining());
    }

    @Override // xsna.uqy0
    public final long a() {
        return 10307L;
    }

    public final String toString() {
        return String.format("CloseWebtransportSessionCapsule[%d,%s]", Integer.valueOf(this.a), this.b);
    }
}
