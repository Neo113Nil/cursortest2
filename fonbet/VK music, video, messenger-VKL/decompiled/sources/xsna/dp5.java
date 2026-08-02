package xsna;

import java.nio.ByteBuffer;
import xsna.rs70;

/* compiled from: Av1ConfigUtil.java */
/* loaded from: classes12.dex */
public final class dp5 {
    public static ByteBuffer a(rs70.c cVar) {
        ByteBuffer byteBuffer = cVar.b;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        allocate.put((byte) ((cVar.a << 3) | 2));
        int remaining = byteBuffer.remaining();
        fxc0.p(remaining > 0);
        int i = remaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
        fxc0.z(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (remaining & 127);
            remaining >>= 7;
            if (remaining != 0) {
                i4 |= 128;
            }
            allocate2.put((byte) i4);
        }
        allocate2.flip();
        allocate.put(allocate2);
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }
}
