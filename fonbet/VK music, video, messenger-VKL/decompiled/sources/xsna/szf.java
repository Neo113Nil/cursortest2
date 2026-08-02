package xsna;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.ScaledTime;

/* compiled from: CodecSession.java */
/* loaded from: classes3.dex */
public final class szf implements Runnable {
    public final Consumer<b> b;
    public final u2s0 c;
    public final t2s0 d;
    public final gzf e;
    public final ScaledTime f;
    public boolean g = true;

    /* compiled from: CodecSession.java */
    public static final class a {
        public final gzf a;
        public Consumer<b> b;
        public u2s0 c;
        public t2s0 d;
        public ScaledTime e;

        public a(@NonNull gzf gzfVar) {
            this.a = gzfVar;
        }
    }

    /* compiled from: CodecSession.java */
    public static final class b {
        public final MediaCodec.BufferInfo a = new MediaCodec.BufferInfo();
        public final szf b;
        public ByteBuffer c;

        public b(szf szfVar) {
            this.b = szfVar;
        }
    }

    public szf(a aVar) {
        this.e = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.f = aVar.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long nanos;
        b bVar = new b(this);
        gzf gzfVar = this.e;
        MediaCodec mediaCodec = gzfVar.a;
        MediaCodec mediaCodec2 = gzfVar.a;
        ScaledTime scaledTime = gzfVar.g;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(scaledTime != null ? scaledTime.toMicros() : 0L);
        while (this.g) {
            if (dequeueInputBuffer == -1) {
                ScaledTime scaledTime2 = gzfVar.g;
                dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(scaledTime2 != null ? scaledTime2.toMicros() : 0L);
                if (dequeueInputBuffer == -1) {
                    continue;
                }
            }
            int i = dequeueInputBuffer;
            MediaCodec.BufferInfo bufferInfo = bVar.a;
            bufferInfo.presentationTimeUs = 0L;
            bufferInfo.flags = 0;
            bufferInfo.offset = 0;
            bufferInfo.size = 0;
            bVar.c = mediaCodec2.getInputBuffer(i);
            this.b.accept(bVar);
            int i2 = bufferInfo.size;
            if (i2 > 0 || (bufferInfo.flags & 4) != 0) {
                gzfVar.a.queueInputBuffer(i, bufferInfo.offset, i2, bufferInfo.presentationTimeUs, bufferInfo.flags);
                int i3 = bufferInfo.flags & 4;
                t2s0 t2s0Var = this.d;
                u2s0 u2s0Var = this.c;
                if (i3 != 0) {
                    ScaledTime scaledTime3 = this.f;
                    if (scaledTime3 != null) {
                        gzfVar.getClass();
                        nanos = scaledTime3.toNanos();
                    } else {
                        ScaledTime scaledTime4 = gzfVar.f;
                        nanos = scaledTime4 != null ? scaledTime4.toNanos() : TimeUnit.MILLISECONDS.toNanos(100L);
                    }
                    long nanoTime = System.nanoTime();
                    while (!gzfVar.b(u2s0Var, t2s0Var, true) && System.nanoTime() - nanoTime <= nanos) {
                    }
                    return;
                }
                gzfVar.b(u2s0Var, t2s0Var, false);
                dequeueInputBuffer = -1;
            } else {
                dequeueInputBuffer = i;
            }
        }
    }
}
