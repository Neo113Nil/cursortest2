package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: BaseDescriptor.java */
@x2m(tags = {0})
/* loaded from: classes13.dex */
public abstract class sc6 {
    public int a;
    public int b;
    public int c;

    public abstract int a();

    public final int b() {
        return c() + a() + 1;
    }

    public final int c() {
        int a = a();
        int i = 0;
        while (true) {
            if (a <= 0 && i >= this.c) {
                return i;
            }
            a >>>= 7;
            i++;
        }
    }

    public abstract void d(ByteBuffer byteBuffer) throws IOException;

    public final void e(int i, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i2 = 0;
        while (true) {
            if (i <= 0 && i2 >= this.c) {
                byteBuffer.position(c() + position);
                return;
            }
            i2++;
            if (i > 0) {
                byteBuffer.put((c() + position) - i2, (byte) (i & 127));
            } else {
                byteBuffer.put((c() + position) - i2, Byte.MIN_VALUE);
            }
            i >>>= 7;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseDescriptor{tag=");
        sb.append(this.a);
        sb.append(", sizeOfInstance=");
        return vu5.b(sb, this.b, '}');
    }
}
