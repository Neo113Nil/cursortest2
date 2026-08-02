package defpackage;

import androidx.media3.common.a;
import defpackage.b64;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class nyg extends zp6 {
    public final int A;
    public a b;
    public final ucf c = new ucf();
    public ByteBuffer w;
    public boolean x;
    public long y;
    public ByteBuffer z;

    static {
        ge10.a("media3.decoder");
    }

    public nyg(int i) {
        this.A = i;
    }

    public void d() {
        this.a = 0;
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.x = false;
    }

    public final ByteBuffer e(final int i) {
        int i2 = this.A;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.w;
        final int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException(capacity, i) { // from class: androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException
            public final int currentCapacity;
            public final int requiredCapacity;

            {
                super(b64.d(capacity, i, "Buffer too small (", " < ", Extension.C_BRAKE));
                this.currentCapacity = capacity;
                this.requiredCapacity = i;
            }
        };
    }

    public final void f(int i) {
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer == null) {
            this.w = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.w = byteBuffer;
            return;
        }
        ByteBuffer e = e(i2);
        e.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            e.put(byteBuffer);
        }
        this.w = e;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
