package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.live.DebugInfo;
import one.video.player.live.media.utils.DecoderInterface$FrameAction;

/* compiled from: DecoderBase.java */
/* loaded from: classes8.dex */
public class c8l {
    public final boolean a;
    public volatile MediaCodec b;
    public int c;
    public b8l f;
    public byte[] i;
    public i8l j;
    public final DebugInfo k;
    public long d = -1;
    public long e = -1;
    public final LinkedList<a> g = new LinkedList<>();
    public final AtomicBoolean h = new AtomicBoolean(true);

    /* compiled from: DecoderBase.java */
    public static class a {
        public final long a;
        public final int b;
        public final long c;

        public a(long j, int i, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    public c8l(boolean z, @Nullable DebugInfo debugInfo) {
        this.k = debugInfo;
        this.a = z;
    }

    public final void a() {
        if (this.b != null) {
            d();
            try {
                this.b.stop();
            } catch (RuntimeException unused) {
                q();
            }
            try {
                this.b.release();
            } catch (RuntimeException unused2) {
                q();
            }
        }
        this.b = null;
    }

    public final boolean b() {
        boolean z = false;
        if (!this.h.getAndSet(false)) {
            return true;
        }
        if (this.i != null) {
            a();
            try {
                this.b = c();
            } catch (Exception e) {
                Log.e("DecoderBase", "Failed to start decoder", e);
                q();
            }
            if (this.b != null) {
                this.b.start();
                z = true;
                i8l i8lVar = this.j;
                if (i8lVar != null) {
                    i8lVar.c();
                }
                j();
                return z;
            }
        }
        return false;
    }

    public MediaCodec c() {
        throw null;
    }

    public final void d() {
        b8l b8lVar = this.f;
        if (b8lVar != null) {
            b8lVar.removeMessages(123456);
        }
        if (this.b == null) {
            this.g.clear();
        } else {
            while (!this.g.isEmpty()) {
                n(this.g.pop().b, false);
            }
        }
    }

    public final boolean e(int i, long j, DecoderInterface$FrameAction decoderInterface$FrameAction) {
        if (!b()) {
            return false;
        }
        try {
            this.b.queueInputBuffer(this.c, 0, i, j, 0);
            DebugInfo debugInfo = this.k;
            if (debugInfo != null) {
                if (this.a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    AtomicLong atomicLong = debugInfo.q;
                    long j2 = currentTimeMillis - atomicLong.get();
                    int i2 = debugInfo.p + 1;
                    debugInfo.p = i2;
                    if (j2 >= 1000) {
                        debugInfo.r.set((int) ((i2 * 1000.0f) / j2));
                        atomicLong.set(currentTimeMillis);
                        debugInfo.p = 0;
                    }
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    AtomicLong atomicLong2 = debugInfo.D;
                    long j3 = currentTimeMillis2 - atomicLong2.get();
                    int i3 = debugInfo.C + 1;
                    debugInfo.C = i3;
                    if (j3 >= 1000) {
                        debugInfo.E.set((int) ((i3 * 1000.0f) / j3));
                        atomicLong2.set(currentTimeMillis2);
                        debugInfo.C = 0;
                    }
                }
            }
            boolean l = l(decoderInterface$FrameAction);
            if (this.a) {
                o();
            }
            return l;
        } catch (Exception e) {
            Log.e("DecoderBase", "Failed to decode frame (enqueueDataBuffer)", e);
            q();
            return false;
        }
    }

    public final ByteBuffer f(int i) {
        if (!b()) {
            return null;
        }
        try {
            int dequeueInputBuffer = this.b.dequeueInputBuffer(10000L);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            ByteBuffer byteBuffer = this.b.getInputBuffers()[dequeueInputBuffer];
            byteBuffer.clear();
            this.c = dequeueInputBuffer;
            if (byteBuffer.capacity() >= i) {
                byteBuffer.limit(i);
                return byteBuffer;
            }
            this.b.queueInputBuffer(this.c, 0, 0, 0L, 0);
            byteBuffer.capacity();
            return null;
        } catch (Exception unused) {
            q();
            return null;
        }
    }

    @Nullable
    public final MediaFormat g() {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            try {
                return mediaCodec.getInputFormat();
            } catch (Exception e) {
                Log.e("DecoderBase", "DecoderBase.getInputMediaFormat() exception caught", e);
            }
        }
        return null;
    }

    @Nullable
    public final String h() {
        try {
            MediaCodec mediaCodec = this.b;
            if (mediaCodec != null) {
                return mediaCodec.getName();
            }
            return null;
        } catch (Exception e) {
            Log.e("DecoderBase", "Exception caught and ignored: " + e);
            return null;
        }
    }

    public final void j() {
        if (this.k != null) {
            MediaCodec mediaCodec = this.b;
            MediaFormat mediaFormat = null;
            if (mediaCodec != null) {
                try {
                    mediaFormat = mediaCodec.getOutputFormat();
                } catch (Exception e) {
                    Log.e("DecoderBase", "DecoderBase.getOutputMediaFormat() exception caught", e);
                }
            }
            if (mediaFormat != null) {
                if (this.a) {
                    DebugInfo debugInfo = this.k;
                    h();
                    Boolean k = k();
                    debugInfo.getClass();
                    Objects.toString(mediaFormat);
                    debugInfo.h = new DebugInfo.d(debugInfo.g.incrementAndGet(), mediaFormat, k);
                } else {
                    DebugInfo debugInfo2 = this.k;
                    h();
                    Boolean k2 = k();
                    debugInfo2.getClass();
                    Objects.toString(mediaFormat);
                    debugInfo2.u = new DebugInfo.a(debugInfo2.t.incrementAndGet(), mediaFormat, k2);
                }
            }
        }
        i8l i8lVar = this.j;
        if (i8lVar != null) {
            i8lVar.f();
        }
    }

    @Nullable
    public final Boolean k() {
        try {
            MediaCodec mediaCodec = this.b;
            if (mediaCodec != null) {
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 29 ? mediaCodec.getCodecInfo().isHardwareAccelerated() : false);
            }
            return null;
        } catch (Exception e) {
            Log.e("DecoderBase", "Exception caught and ignored: " + e);
            return null;
        }
    }

    public final boolean l(DecoderInterface$FrameAction decoderInterface$FrameAction) {
        DecoderInterface$FrameAction decoderInterface$FrameAction2;
        DecoderInterface$FrameAction decoderInterface$FrameAction3;
        long j;
        boolean z;
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                long j2 = 0;
                int dequeueOutputBuffer = this.b.dequeueOutputBuffer(bufferInfo, 0L);
                if (dequeueOutputBuffer >= 0) {
                    long j3 = 100000000;
                    try {
                        ByteBuffer byteBuffer = this.b.getOutputBuffers()[dequeueOutputBuffer];
                        if (this.j != null && decoderInterface$FrameAction != DecoderInterface$FrameAction.DROP) {
                            byteBuffer.position(0);
                            byteBuffer.limit(bufferInfo.size);
                            i8l i8lVar = this.j;
                            if (i8lVar != null) {
                                i8lVar.handleDecodedData(byteBuffer);
                            }
                        }
                        long j4 = bufferInfo.presentationTimeUs;
                        if (decoderInterface$FrameAction == DecoderInterface$FrameAction.DROP) {
                            n(dequeueOutputBuffer, false);
                        } else if (decoderInterface$FrameAction == DecoderInterface$FrameAction.PLAY_IMMEDIATELY) {
                            d();
                            n(dequeueOutputBuffer, this.a);
                            DebugInfo debugInfo = this.k;
                            if (debugInfo != null) {
                                if (this.a) {
                                    long j5 = this.e + ((1000 * j4) - this.d);
                                    System.nanoTime();
                                    debugInfo.b(j4, j5);
                                } else {
                                    debugInfo.a(j4);
                                }
                            }
                        } else {
                            if (this.d < 0) {
                                r(j4);
                            }
                            while (true) {
                                long j6 = j2;
                                long j7 = ((j4 * 1000) - this.d) + this.e;
                                long nanoTime = j7 - System.nanoTime();
                                if (nanoTime >= j6) {
                                    boolean z2 = this.a;
                                    if (z2) {
                                        p(dequeueOutputBuffer, j7, j4);
                                        break;
                                    }
                                    if (nanoTime < 100000000) {
                                        if (z2) {
                                            m(dequeueOutputBuffer, j7);
                                            DebugInfo debugInfo2 = this.k;
                                            if (debugInfo2 != null) {
                                                System.nanoTime();
                                                debugInfo2.b(j4, j7);
                                            }
                                        } else {
                                            n(dequeueOutputBuffer, false);
                                            DebugInfo debugInfo3 = this.k;
                                            if (debugInfo3 != null) {
                                                debugInfo3.a(j4);
                                            }
                                        }
                                    }
                                }
                                r(j4);
                                j2 = j6;
                            }
                        }
                    } finally {
                        if (decoderInterface$FrameAction != decoderInterface$FrameAction2) {
                            if (decoderInterface$FrameAction != decoderInterface$FrameAction3) {
                                while (true) {
                                    if ((j > j2 ? 1 : (j == j2 ? 0 : -1)) >= 0) {
                                        if (z) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (dequeueOutputBuffer == -2) {
                    j();
                } else {
                    if (dequeueOutputBuffer == -1) {
                        return true;
                    }
                    if (dequeueOutputBuffer == -3) {
                        d();
                    } else {
                        Log.e("DecoderBase", "Unexpected MediaCodec.dequeueOutputBuffer() result " + dequeueOutputBuffer);
                    }
                }
            }
        } catch (Exception e) {
            Log.e("DecoderBase", "Failed to decode frame (processOutputBuffers)", e);
            q();
            return false;
        }
    }

    public final void m(int i, long j) {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            try {
                mediaCodec.releaseOutputBuffer(i, j);
                i();
            } catch (Exception e) {
                Log.e("DecoderBase", "failed to release output buffer, ignored", e);
            }
        }
    }

    public final void n(int i, boolean z) {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            try {
                mediaCodec.releaseOutputBuffer(i, z);
                if (z) {
                    i();
                }
            } catch (Exception e) {
                Log.e("DecoderBase", "failed to release output buffer, ignored", e);
            }
        }
    }

    public final void o() {
        LinkedList<a> linkedList = this.g;
        DebugInfo debugInfo = this.k;
        if (debugInfo != null) {
            linkedList.size();
        }
        this.f.removeMessages(123456);
        l(DecoderInterface$FrameAction.PLAY);
        while (!linkedList.isEmpty()) {
            a first = linkedList.getFirst();
            long j = first.a;
            long nanoTime = j - System.nanoTime();
            long j2 = nanoTime / 1000000;
            if (nanoTime > 100000000) {
                r(j);
            } else if (j2 > 0) {
                this.f.sendEmptyMessageDelayed(123456, j2);
                return;
            }
            m(first.b, j);
            if (debugInfo != null) {
                long j3 = first.c;
                long j4 = first.a;
                System.nanoTime();
                debugInfo.b(j3, j4);
            }
            linkedList.removeFirst();
        }
        this.f.sendEmptyMessageDelayed(123456, 10L);
    }

    public final void p(int i, long j, long j2) {
        LinkedList<a> linkedList;
        while (true) {
            linkedList = this.g;
            if (!linkedList.isEmpty()) {
                a last = linkedList.getLast();
                if (last.a <= j) {
                    break;
                }
                n(last.b, false);
                linkedList.removeLast();
            } else {
                break;
            }
        }
        linkedList.addLast(new a(j, i, j2));
    }

    public final void q() {
        DebugInfo debugInfo = this.k;
        if (debugInfo != null) {
            if (this.a) {
                debugInfo.i.incrementAndGet();
            } else {
                debugInfo.v.incrementAndGet();
            }
        }
    }

    public final void r(long j) {
        this.d = j * 1000;
        this.e = System.nanoTime() + 1000000;
    }

    public void i() {
    }
}
