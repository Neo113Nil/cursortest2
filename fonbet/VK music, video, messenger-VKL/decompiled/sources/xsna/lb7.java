package xsna;

import java.nio.ByteBuffer;

/* compiled from: BitReaderBuffer.java */
/* loaded from: classes13.dex */
public final class lb7 {
    public final int a;
    public int b;
    public final ByteBuffer c;

    public lb7(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public final int a(int i) {
        int a;
        int i2 = this.b / 8;
        int i3 = this.a;
        ByteBuffer byteBuffer = this.c;
        int i4 = byteBuffer.get(i2 + i3);
        if (i4 < 0) {
            i4 += 256;
        }
        int i5 = this.b;
        int i6 = 8 - (i5 % 8);
        if (i <= i6) {
            a = ((i4 << (i5 % 8)) & 255) >> ((i6 - i) + (i5 % 8));
            this.b = i5 + i;
        } else {
            int i7 = i - i6;
            a = (a(i6) << i7) + a(i7);
        }
        byteBuffer.position(i3 + ((int) Math.ceil(this.b / 8.0d)));
        return a;
    }

    public final boolean b() {
        return a(1) == 1;
    }
}
