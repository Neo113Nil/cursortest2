package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class sa0 extends sq {
    public final m20 c;
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final int i;

    static {
        io0.a("goog.exo.decoder");
    }

    public sa0(int i) {
        this(i, 0);
    }

    public static sa0 d() {
        return new sa0(0, 0);
    }

    public void b() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void c(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            int i3 = this.h;
            if (i3 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i2);
            } else {
                if (i3 != 2) {
                    throw new ra0(byteBuffer != null ? byteBuffer.capacity() : 0, i2);
                }
                allocateDirect2 = ByteBuffer.allocateDirect(i2);
            }
            this.d = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i2 + position;
        if (capacity >= i4) {
            this.d = byteBuffer;
            return;
        }
        int i5 = this.h;
        if (i5 == 1) {
            allocateDirect = ByteBuffer.allocate(i4);
        } else {
            if (i5 != 2) {
                ByteBuffer byteBuffer2 = this.d;
                throw new ra0(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i4);
            }
            allocateDirect = ByteBuffer.allocateDirect(i4);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.d = allocateDirect;
    }

    public sa0(int i, int i2) {
        this.c = new m20();
        this.h = i;
        this.i = 0;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
