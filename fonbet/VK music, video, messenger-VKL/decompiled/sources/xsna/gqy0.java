package xsna;

import java.nio.ByteBuffer;

/* compiled from: BitBuffer.java */
/* loaded from: classes8.dex */
public final class gqy0 {
    public final ByteBuffer a;
    public int b;
    public int c;
    public int d;

    public gqy0(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
        for (int i = 0; i < 4; i++) {
            if (i < bArr.length) {
                this.b = (this.b << 8) | (this.a.get() & 255);
                this.c += 8;
            } else {
                this.b = (this.b << 8) | 255;
            }
        }
    }

    public final void a(int i) {
        int i2 = this.d;
        if (i2 + i < 8) {
            this.b <<= i;
            this.c -= i;
            this.d = i2 + i;
            return;
        }
        this.b <<= 8 - i2;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() > 0) {
            this.b = (byteBuffer.get() & 255) | this.b;
            this.c += 8;
        } else {
            this.b |= 255;
        }
        int i3 = i - (8 - this.d);
        this.b <<= i3;
        this.c -= i;
        this.d = i3;
    }
}
