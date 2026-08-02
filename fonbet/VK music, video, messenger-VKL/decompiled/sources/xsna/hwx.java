package xsna;

import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: classes13.dex */
public final class hwx extends InputStream {
    public final Iterator<ByteBuffer> b;
    public ByteBuffer c;
    public final int d = 0;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public int i;
    public long j;

    public hwx(Iterable<ByteBuffer> iterable) {
        this.b = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.d++;
        }
        this.e = -1;
        if (m()) {
            return;
        }
        this.c = Internal.EMPTY_BYTE_BUFFER;
        this.e = 0;
        this.f = 0;
        this.j = 0L;
    }

    public final boolean m() {
        this.e++;
        Iterator<ByteBuffer> it = this.b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer next = it.next();
        this.c = next;
        this.f = next.position();
        if (this.c.hasArray()) {
            this.g = true;
            this.h = this.c.array();
            this.i = this.c.arrayOffset();
        } else {
            this.g = false;
            this.j = v5q0.b(this.c);
            this.h = null;
        }
        return true;
    }

    public final void n(int i) {
        int i2 = this.f + i;
        this.f = i2;
        if (i2 == this.c.limit()) {
            m();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.e == this.d) {
            return -1;
        }
        if (this.g) {
            int i = this.h[this.f + this.i] & 255;
            n(1);
            return i;
        }
        int f = v5q0.c.f(this.f + this.j) & 255;
        n(1);
        return f;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == this.d) {
            return -1;
        }
        int limit = this.c.limit();
        int i3 = this.f;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.g) {
            System.arraycopy(this.h, i3 + this.i, bArr, i, i2);
            n(i2);
            return i2;
        }
        int position = this.c.position();
        this.c.position(this.f);
        this.c.get(bArr, i, i2);
        this.c.position(position);
        n(i2);
        return i2;
    }
}
