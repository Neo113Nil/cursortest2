package xsna;

import java.nio.ByteBuffer;

/* compiled from: BitWriterBuffer.java */
/* loaded from: classes13.dex */
public final class mb7 {
    public final int a;
    public int b = 0;
    public final ByteBuffer c;

    public mb7(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public final void a(int i, int i2) {
        int i3 = this.b;
        int i4 = 8 - (i3 % 8);
        int i5 = this.a;
        ByteBuffer byteBuffer = this.c;
        if (i2 <= i4) {
            int i6 = byteBuffer.get((i3 / 8) + i5);
            if (i6 < 0) {
                i6 += 256;
            }
            int i7 = i6 + (i << (i4 - i2));
            int i8 = (this.b / 8) + i5;
            if (i7 > 127) {
                i7 -= 256;
            }
            byteBuffer.put(i8, (byte) i7);
            this.b += i2;
        } else {
            int i9 = i2 - i4;
            a(i >> i9, i4);
            a(i & ((1 << i9) - 1), i9);
        }
        int i10 = this.b;
        byteBuffer.position((i10 / 8) + i5 + (i10 % 8 <= 0 ? 0 : 1));
    }
}
