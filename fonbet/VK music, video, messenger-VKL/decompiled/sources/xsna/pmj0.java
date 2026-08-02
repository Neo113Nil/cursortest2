package xsna;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SilentAudioGenerator.java */
/* loaded from: classes12.dex */
public final class pmj0 {
    public final AudioProcessor.a a;
    public final ByteBuffer b;
    public final AtomicLong c;

    public pmj0(AudioProcessor.a aVar) {
        this.a = aVar;
        ByteBuffer order = ByteBuffer.allocateDirect(aVar.d * 1024).order(ByteOrder.nativeOrder());
        this.b = order;
        order.flip();
        this.c = new AtomicLong();
    }

    public final ByteBuffer a() {
        AtomicLong atomicLong = this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < byteBuffer.capacity()) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet(-byteBuffer.remaining());
        }
        return byteBuffer;
    }

    public final boolean b() {
        return this.b.hasRemaining() || this.c.get() > 0;
    }
}
